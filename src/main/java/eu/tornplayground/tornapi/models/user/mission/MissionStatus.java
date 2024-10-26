package eu.tornplayground.tornapi.models.user.mission;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;

@Getter
public enum MissionStatus {
    COMPLETED("completed"),
    FAILED("failed"),
    ACCEPTED("accepted"),
    NOT_ACCEPTED("notAccepted");

    private final String status;

    MissionStatus(String status) {
        this.status = status;
    }

    @JsonCreator
    public static MissionStatus fromString(String status) {
        for (MissionStatus s : MissionStatus.values()) {
            if (s.status.equalsIgnoreCase(status)) {
                return s;
            }
        }
        return null;
    }
}
