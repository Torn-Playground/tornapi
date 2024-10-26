package eu.tornplayground.tornapi.models.user.ammo;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;

@Getter
public enum AmmoSize {
    ACP_25_ROUND(".25 ACP Round"),
    ACP_380_ROUND(".380 ACP Round"),
    SPECIAL_44_ROUND(".44 Special Round"),
    ACP_45_ROUND(".45 ACP Round"),
    GAUGE_12_CARTRIDGE("12 Gauge Cartridge"),
    GRENADE_40MM("40mm Grenade"),
    RIFLE_545MM_ROUND("5.45mm Rifle Round"),
    RIFLE_556MM_ROUND("5.56mm Rifle Round"),
    HIGH_VELOCITY_57MM_ROUND("5.7mm High Vel. Round"),
    RIFLE_762MM_ROUND("7.62 mm Rifle Round"),
    PARABELLUM_9MM_ROUND("9mm Parabellum Round"),
    BOLT("Bolt"),
    DART("Dart"),
    FLARE("Flare"),
    FUEL_LITER("Liter of Fuel"),
    RPG("RPG"),
    SNOW_BALL("Snow Ball"),
    STONE("Stone"),
    WARHEAD("Warhead");

    private final String name;

    AmmoSize(String name) {
        this.name = name;
    }

    @JsonCreator
    public static AmmoSize fromName(String name) {
        for (AmmoSize ammoSize : values()) {
            if (ammoSize.getName().equalsIgnoreCase(name)) {
                return ammoSize;
            }
        }
        return null;
    }
}
