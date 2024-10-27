package eu.tornplayground.tornapi.models.user.battlestats.statinfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;

@Getter
public enum BattleStat {
    STRENGTH("Strength"),
    DEFENSE("Defense"),
    SPEED("Speed"),
    DEXTERITY("Dexterity");

    private final String name;

    BattleStat(String name) {
        this.name = name;
    }

    @JsonCreator
    public static BattleStat fromName(String name) {
        for (BattleStat stat : values()) {
            if (stat.getName().equalsIgnoreCase(name)) {
                return stat;
            }
        }
        return null;
    }
}
