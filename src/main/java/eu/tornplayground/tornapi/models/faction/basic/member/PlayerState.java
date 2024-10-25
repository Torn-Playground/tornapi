package eu.tornplayground.tornapi.models.faction.basic.member;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.io.Serializable;

public enum PlayerState implements Serializable {
    OKAY("Okay"),
    TRAVELING("Traveling"),
    ABROAD("Abroad"),
    HOSPITAL("Hospital");

    private final String state;

    PlayerState(String state) {
        this.state = state;
    }

    @JsonCreator
    public static PlayerState fromString(String state) {
        for (PlayerState playerState : PlayerState.values()) {
            if (playerState.state.equalsIgnoreCase(state)) {
                return playerState;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return this.state;
    }
}
