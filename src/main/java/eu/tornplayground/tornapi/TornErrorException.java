package eu.tornplayground.tornapi;

import eu.tornplayground.tornapi.models.TornError;

public class TornErrorException extends Exception{

    private final TornError tornError;

    public TornErrorException(TornError tornError) {
        super(tornError.getError());
        this.tornError = tornError;
    }

    public TornError getTornError() {
        return tornError;
    }
}
