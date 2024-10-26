package eu.tornplayground.tornapi.models.info.keyinfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Getter
public enum AccessType {
    CUSTOM("custom"),
    FULL_ACCESS("full access"),
    LIMITED_ACCESS("limited access"),
    MINIMAL_ACCESS("minimal access"),
    PUBLIC_ONLY("public only");

    private final String name;

    AccessType(String name) {
        this.name = name;
    }

    @JsonCreator
    public AccessType fromName(String name) {
        for (AccessType value : AccessType.values()) {
            if (value.name.equals(name)) {
                return value;
            }
        }
        return null;
    }
}
