package eu.tornplayground.tornapi.models.user.partial;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import eu.tornplayground.tornapi.models.converters.EpochLocalDateTimeConverter;

import java.time.LocalDateTime;
import java.util.Objects;

public class Status {

    private String description;
    private String details;
    private State state;
    private String color;
    @JsonDeserialize(converter = EpochLocalDateTimeConverter.class)
    private LocalDateTime until;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDateTime getUntil() {
        return until;
    }

    public void setUntil(LocalDateTime until) {
        this.until = until;
    }

    public enum State {
        OKAY, JAIL, HOSPITAL, TRAVELING, FEDERAL, ABROAD, FALLEN
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Status status = (Status) o;
        return Objects.equals(description, status.description) && Objects.equals(details, status.details) && state == status.state && Objects.equals(color, status.color) && Objects.equals(until, status.until);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, details, state, color, until);
    }
}
