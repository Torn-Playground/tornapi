package eu.tornplayground.tornapi.models.user.revive;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum ReviveResult {
    SUCCESS("Success"),
    FAILURE("Failure");

    private final String result;

    ReviveResult(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
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
