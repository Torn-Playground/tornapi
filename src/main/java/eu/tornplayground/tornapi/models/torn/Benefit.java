package eu.tornplayground.tornapi.models.torn;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.Objects;

public class Benefit {

    private Type type;
    private int frequency;
    private long requirement;
    private String description;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public long getRequirement() {
        return requirement;
    }

    public void setRequirement(long requirement) {
        this.requirement = requirement;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public enum Type {

        ACTIVE, PASSIVE;

        @JsonCreator
        public static Type forValue(String value) {
            return valueOf(value.toUpperCase());
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Benefit benefit = (Benefit) o;
        return frequency == benefit.frequency && requirement == benefit.requirement && type == benefit.type && Objects.equals(description, benefit.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, frequency, requirement, description);
    }

}
