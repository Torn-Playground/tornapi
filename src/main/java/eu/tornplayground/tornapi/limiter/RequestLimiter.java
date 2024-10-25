package eu.tornplayground.tornapi.limiter;

import java.util.Deque;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.TimeUnit;

/**
 * Limits the number of requests per given time frame per API key.
 */
public class RequestLimiter {
    private final Map<String, Deque<Long>> keyTimestampMap = new ConcurrentHashMap<>();

    private final short maxRequests;
    private final int timeFrameInMilliseconds;
    private boolean withException = false;
    private int requestsQueuedCount = 0;

    /**
     * @param maxRequests Max requests for given timeframe
     * @param seconds Timeframe in seconds
     */
    public RequestLimiter(short maxRequests, int seconds) {
        this.maxRequests = maxRequests;
        this.timeFrameInMilliseconds = seconds * 1000;

        if (maxRequests / seconds > 100 / 60) {
            throw new IllegalArgumentException("The rate limit is too high. The maximum rate limit is 100 requests per minute. Due to torn limitations.");
        }
    }

    /**
     * @param maxRequests Max requests for given timeframe
     * @param seconds Timeframe in seconds
     * @param withException If true, throws an exception when the limit is reached. If false, sleeps until the limit is reset.
     */
    public RequestLimiter(short maxRequests, int seconds, boolean withException) {
        this(maxRequests, seconds);
        this.withException = withException;
    }

    public synchronized void handleRequest(String apiKey) throws RequestLimitReachedException, InterruptedException {
        long currentMilliseconds = System.currentTimeMillis();
        Deque<Long> timestamps = keyTimestampMap.computeIfAbsent(apiKey, k -> new ConcurrentLinkedDeque<>());
        timestamps.removeIf(timestamp -> timestamp + timeFrameInMilliseconds < currentMilliseconds);

        if (timestamps.size() < maxRequests) {
            registerRequest(apiKey, currentMilliseconds);
            return;
        }

        long timestamp = timestamps.stream().skip(requestsQueuedCount).findFirst().orElse(0L);
        long millisecondsUntilNextRequest = timeFrameInMilliseconds - (currentMilliseconds - timestamp);

        if (millisecondsUntilNextRequest > 0) {
            if (withException) {
                throw new RequestLimitReachedException("Rate limit reached. Please wait " + millisecondsUntilNextRequest + " milliseconds.");
            } else {
                requestsQueuedCount++;
                registerRequest(apiKey, currentMilliseconds + millisecondsUntilNextRequest);
                TimeUnit.MILLISECONDS.sleep(millisecondsUntilNextRequest);
                requestsQueuedCount--;
            }
        }
    }

    public synchronized void registerRequest(String apiKey, long timestamp) {
        keyTimestampMap.computeIfAbsent(apiKey, k -> new ConcurrentLinkedDeque<>()).add(timestamp);
    }
}
