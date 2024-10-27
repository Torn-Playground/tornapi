package eu.tornplayground.tornapi.models.info.keyinfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;

@Getter
public enum AccessType {

    CUSTOM("Custom"),
    FULL_ACCESS("Full Access"),
    LIMITED_ACCESS("Limited Access"),
    MINIMAL_ACCESS("Minimal Access"),
    PUBLIC_ONLY("Public Only");

    private final String name;

    AccessType(String name) {
        this.name = name;
    }

    @JsonCreator
    public static AccessType fromName(String name) {
        for (AccessType value : AccessType.values()) {
            if (value.name.equals(name)) {
                return value;
            }
        }
        return null;
    }

}
