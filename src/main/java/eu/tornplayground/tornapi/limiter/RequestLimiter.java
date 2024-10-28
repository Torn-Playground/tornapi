package eu.tornplayground.tornapi.limiter;

import java.lang.Thread;
import java.util.Deque;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Limits the number of requests per given time frame per API key.
 */
public class RequestLimiter {

    private final Map<String, Lock> keyLockMap = new ConcurrentHashMap<>();
    private final Map<String, Deque<Long>> keyTimestampMap = new ConcurrentHashMap<>();
    private final short maxRequests;
    private final int timeFrameInMilliseconds;

    private boolean withException = false;

    /**
     * @param maxRequests Max requests for given timeframe
     * @param seconds     Timeframe in seconds
     */
    public RequestLimiter(short maxRequests, int seconds) {
        this.maxRequests = maxRequests;
        this.timeFrameInMilliseconds = seconds * 1000;

        if (maxRequests / seconds > 100 / 60) {
            throw new IllegalArgumentException("The rate limit is too high. The maximum rate limit is 100 requests per minute. Due to torn limitations.");
        }
    }

    /**
     * @param maxRequests   Max requests for given timeframe
     * @param seconds       Timeframe in seconds
     * @param withException If true, throws an exception when the limit is reached. If false, sleeps until the limit is reset.
     */
    public RequestLimiter(short maxRequests, int seconds, boolean withException) {
        this(maxRequests, seconds);
        this.withException = withException;
    }

    public void handleRequest(String apiKey) throws RequestLimitReachedException {
        final Lock keySpecificLock = keyLockMap.computeIfAbsent(apiKey, k -> new ReentrantLock());
        keySpecificLock.lock();

        try {
            long currentMilliseconds = System.currentTimeMillis();
            final Deque<Long> timestamps = keyTimestampMap.computeIfAbsent(apiKey, k -> new ConcurrentLinkedDeque<>());
            timestamps.removeIf(timestamp -> timestamp + timeFrameInMilliseconds < currentMilliseconds);

            if (timestamps.size() < maxRequests) {
                timestamps.add(currentMilliseconds);
                return;
            }

            long nextAvailableTimestamp = timestamps.peek() + timeFrameInMilliseconds;
            long millisecondsUntilNextRequest = nextAvailableTimestamp - currentMilliseconds;

            if (millisecondsUntilNextRequest > 0) {
                if (withException) {
                    throw new RequestLimitReachedException("Rate limit reached. Please wait " + millisecondsUntilNextRequest + " milliseconds.");
                } else {
                    try {
                        Thread.sleep(millisecondsUntilNextRequest);
                        timestamps.add(System.currentTimeMillis());
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        throw new RuntimeException("Interrupted while waiting for the request limited API call", e);
                    }
                }
            }
        } finally {
            keySpecificLock.unlock();
        }
    }
}
