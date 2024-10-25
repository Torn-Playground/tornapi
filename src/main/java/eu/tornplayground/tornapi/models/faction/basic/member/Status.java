package eu.tornplayground.tornapi.models.faction.basic.member;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.common.PlayerState;
import eu.tornplayground.tornapi.models.converters.EpochLocalDateTimeConverter;

import java.time.LocalDateTime;
import java.util.Objects;

public class Status extends Model {

    @JsonProperty("description")
    private String description;

    @JsonProperty("details")
    private String details;

    @JsonProperty("state")
    private PlayerState state;

    @JsonProperty("until")
    @JsonDeserialize(converter = EpochLocalDateTimeConverter.class)
    private LocalDateTime until;

    @JsonProperty("color")
    private Color color;


    protected Status() {
    }

    public String getDescription() {
        return description;
    }

    public String getDetails() {
        return details;
    }

    public PlayerState getState() {
        return state;
    }

    public LocalDateTime getUntil() {
        return until;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Status)) return false;
        Status status = (Status) o;
        return Objects.equals(description, status.description) && Objects.equals(details, status.details) && state == status.state && Objects.equals(until, status.until) && color == status.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, details, state, until, color);
    }
}
