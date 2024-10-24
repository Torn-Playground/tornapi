package eu.tornplayground.tornapi.limiter;

import java.util.Deque;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * Limits the number of requests per given time frame per API key.
 */
public class RequestLimiter {
    private final Map<String, Deque<Long>> keyTimestampMap = new ConcurrentHashMap<>();

    private final short maxRequests;
    private final int timeFrameInMilliseconds;

    public RequestLimiter(short maxRequests, int seconds) {
        this.maxRequests = maxRequests;
        this.timeFrameInMilliseconds = seconds * 1000;

        if (maxRequests / seconds > 100 / 60) {
            throw new IllegalArgumentException("The rate limit is too high. The maximum rate limit is 100 requests per minute. Due to torn limitations.");
        }
    }

    public long getMillisecondsUntilNextRequest(String apiKey) {
        if (hasLimitReached(apiKey)) {
            return 0;
        }

        long currentMilliseconds = System.currentTimeMillis();
        Deque<Long> timestamps = keyTimestampMap.computeIfAbsent(apiKey, k -> new ConcurrentLinkedDeque<>());

        @SuppressWarnings("ConstantConditions")
        long oldestTimestamp = timestamps.peekFirst(); // should actually never be null
        long timeUntilTimestampExpires = timeFrameInMilliseconds - (currentMilliseconds - oldestTimestamp);
        return Math.max(timeUntilTimestampExpires, 0);
    }

    public boolean hasLimitReached(String apiKey) {
        Deque<Long> timestamps = keyTimestampMap.computeIfAbsent(apiKey, k -> new ConcurrentLinkedDeque<>());
        timestamps.removeIf(timestamp -> timestamp + timeFrameInMilliseconds < System.currentTimeMillis());
        return timestamps.size() >= maxRequests;
    }

    public void registerRequest(String apiKey, long timestamp) {
        keyTimestampMap.computeIfAbsent(apiKey, k -> new ConcurrentLinkedDeque<>()).add(timestamp);
    }
}
