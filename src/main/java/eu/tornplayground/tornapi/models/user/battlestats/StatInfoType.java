package eu.tornplayground.tornapi.models.user.battlestats;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public enum StatInfoType {
    MERITS("Merits"),
    FACTION("Faction"),
    EDUCATION("Education"),
    DRUG("Drug"),
    UNKNOWN("Unknown");

    private final String name;

    StatInfoType(String name) {
        this.name = name;
    }

    @JsonProperty
    public static StatInfoType fromName(String name) {
        for (StatInfoType type : values()) {
            if (type.getName().equalsIgnoreCase(name)) {
                return type;
            }
        }
        return UNKNOWN;
    }
}
