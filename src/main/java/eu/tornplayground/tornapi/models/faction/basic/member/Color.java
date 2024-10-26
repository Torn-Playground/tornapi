package eu.tornplayground.tornapi.models.faction.basic.member;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum Color {
    BLUE("blue"),
    GREEN("green"),
    RED("red");

    private final String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @JsonCreator
    public static Color fromString(String color) {
        for (Color c : Color.values()) {
            if (c.color.equalsIgnoreCase(color)) {
                return c;
            }
        }
        return null;
    }
}
