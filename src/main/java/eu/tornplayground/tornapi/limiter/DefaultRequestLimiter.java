package eu.tornplayground.tornapi.limiter;

/**
 * Default implementation of {@link RequestLimiter} with a limit of 100 requests per minute per API key.
 * That's the default limit for the Torn API.
 */
public class DefaultRequestLimiter extends RequestLimiter {
    public DefaultRequestLimiter() {
        super((short) 100, 60);
    }
}
