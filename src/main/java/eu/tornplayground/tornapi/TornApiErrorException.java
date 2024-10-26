package eu.tornplayground.tornapi;

import eu.tornplayground.tornapi.models.TornError;

public class TornApiErrorException extends Exception{

    private final TornError tornError;

    public TornApiErrorException(TornError tornError) {
        super(tornError.getError());
        this.tornError = tornError;
    }

    public TornError getTornError() {
        return tornError;
    }
}
