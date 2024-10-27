package eu.tornplayground.tornapi.models.user.report;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public enum ReportType {
    
    ANONYMOUS_BOUNTIES("anonymousbounties"),
    FRIEND_OR_FOE("friendorfoe"),
    INVESTMENT("investment"),
    MONEY("money"),
    MOST_WANTED("mostwanted"),
    REFERENCES("references"),
    STATS("stats"),
    TRUE_LEVEL("truelevel");

    private final String type;

    ReportType(String type) {
        this.type = type;
    }

    @JsonProperty
    public static ReportType fromString(String type) {
        for (ReportType reportType : ReportType.values()) {
            if (reportType.type.equalsIgnoreCase(type)) {
                return reportType;
            }
        }
        return null;
    }

}
