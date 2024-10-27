package eu.tornplayground.tornapi.models.torn.benefit;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum Type {

    ACTIVE, PASSIVE;

    @JsonCreator
    public static Type forValue(String value) {
        return valueOf(value.toUpperCase());
    }

}
