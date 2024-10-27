package eu.tornplayground.tornapi.models.common;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;

@Getter
public enum AttackResult {
    ARRESTED("Arrested"),
    ASSIST("Assist"),
    ATTACKED("Attacked"),
    ESCAPE("Escape"),
    HOSPITALIZED("Hospitalized"),
    INTERRUPTED("Interrupted"),
    LOOTED("Looted"),
    LOST("Lost"),
    MUGGED("Mugged"),
    SPECIAL("Special"),
    STALEMATE("Stalemate"),
    TIMEOUT("Timeout");

    private final String result;

    AttackResult(String result) {
        this.result = result;
    }

    @JsonCreator
    public static AttackResult fromString(String result) {
        for (AttackResult attackResult : AttackResult.values()) {
            if (attackResult.result.equalsIgnoreCase(result)) {
                return attackResult;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return result;
    }
}
