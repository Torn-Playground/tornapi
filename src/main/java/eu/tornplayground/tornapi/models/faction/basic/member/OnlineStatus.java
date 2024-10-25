package eu.tornplayground.tornapi.models.faction.basic.member;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.io.Serializable;

public enum OnlineStatus implements Serializable {
    OFFLINE("Offline"),
    ONLINE("Online"),
    IDLE("Idle");

    private final String status;

    OnlineStatus(String status) {
        this.status = status;
    }

    @JsonCreator
    public static OnlineStatus fromString(String status) {
        for (OnlineStatus state : OnlineStatus.values()) {
            if (state.status.equalsIgnoreCase(status)) {
                return state;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return this.status;
    }
}
