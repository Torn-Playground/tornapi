package eu.tornplayground.tornapi.limiter;

public class RequestLimitReachedException extends Exception {

    public RequestLimitReachedException(String message) {
        super(message);
    }

}
