package eu.tornplayground.tornapi.models.user.attacks;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;

@Getter
public enum AttackResult {
    ATTACKED("Attacked"),
    HOSPITALIZED("Hospitalized"),
    MUGGED("Mugged"),
    LOST("Lost"),
    SPECIAL("Special"),
    ARRESTED("Arrested"),
    ASSIST("Assist"),
    STALEMATE("Stalemate");

    private final String value;

    AttackResult(String value) {
        this.value = value;
    }

    @JsonCreator
    public static AttackResult fromString(String text) {
        for (AttackResult b : AttackResult.values()) {
            if (b.value.equalsIgnoreCase(text)) {
                return b;
            }
        }
        return null;
    }
}
