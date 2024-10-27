package eu.tornplayground.tornapi.models.common;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;

import java.io.Serializable;

@Getter
public enum PlayerState implements Serializable {
    OKAY("Okay"),
    JAIL("Jail"),
    HOSPITAL("Hospital"),
    TRAVELING("Traveling"),
    FEDERAL("Federal"),
    ABROAD("Abroad"),
    FALLEN("Fallen");

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
