package eu.tornplayground.tornapi.models.faction.basic.member;


import com.fasterxml.jackson.annotation.JsonCreator;

import java.io.Serializable;

public enum ReviveSettings implements Serializable {
    EVERYONE("Everyone"),
    FRIENDS_AND_FACTION("Friends & faction"),
    NO_ONE("No one");

    private final String name;

    ReviveSettings(String name) {
        this.name = name;
    }

    @JsonCreator
    public static ReviveSettings fromString(String name) {
        for (ReviveSettings reviveSettings : ReviveSettings.values()) {
            if (reviveSettings.name.equalsIgnoreCase(name)) {
                return reviveSettings;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
