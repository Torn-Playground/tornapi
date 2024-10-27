package eu.tornplayground.tornapi.models.user.ammo;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;

@Getter
public enum AmmoType {
    HOLLOW_POINT("Hollow Point"),
    INCENDIARY("Incendiary"),
    PIERCING("Piercing"),
    STANDARD("Standard"),
    TRACER("Tracer");

    private final String name;

    AmmoType(String name) {
        this.name = name;
    }

    @JsonCreator
    public static AmmoType fromName(String name) {
        for (AmmoType ammo : values()) {
            if (ammo.getName().equalsIgnoreCase(name)) {
                return ammo;
            }
        }
        return null;
    }
}
