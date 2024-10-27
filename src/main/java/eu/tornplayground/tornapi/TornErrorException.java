package eu.tornplayground.tornapi;

import eu.tornplayground.tornapi.models.TornError;
import lombok.Getter;

@Getter
public class TornErrorException extends Exception {

    private final transient TornError tornError;

    public TornErrorException(TornError tornError) {
        super(tornError.getError().getMessage());
        this.tornError = tornError;
    }
}
