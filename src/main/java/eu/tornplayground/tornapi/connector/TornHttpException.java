package eu.tornplayground.tornapi.connector;

import lombok.Getter;

@Getter
public class TornHttpException extends Exception {

    private final int statusCode;
    private final String body;

    public TornHttpException(int statusCode, String body) {
        super(String.format("Torn HTTP error with code %s", statusCode));

        this.statusCode = statusCode;
        this.body = body;
    }

}
