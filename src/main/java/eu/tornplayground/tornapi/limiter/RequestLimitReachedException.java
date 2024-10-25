package eu.tornplayground.tornapi.limiter;

public class RequestLimitReachedException extends RuntimeException {
    public RequestLimitReachedException(String message) {
        super(message);
    }
}
