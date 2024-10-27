package eu.tornplayground.tornapi.models.user.revive;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;

@Getter
public enum ReviveResult {

    SUCCESS("Success"),
    FAILURE("Failure");

    private final String result;

    ReviveResult(String result) {
        this.result = result;
    }

    @JsonCreator
    public static ReviveResult fromString(String result) {
        for (ReviveResult reviveResult : ReviveResult.values()) {
            if (reviveResult.result.equalsIgnoreCase(result)) {
                return reviveResult;
            }
        }
        return null;
    }

}
