package eu.tornplayground.tornapi.models.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.Model;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Objects;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Notifications extends Model {

    @JsonProperty("messages")
    private long messages;

    @JsonProperty("events")
    private long events;

    @JsonProperty("awards")
    private long awards;

    @JsonProperty("competition")
    private long competition;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notifications that = (Notifications) o;
        return messages == that.messages && events == that.events && awards == that.awards && competition == that.competition;
    }

    @Override
    public int hashCode() {
        return Objects.hash(messages, events, awards, competition);
    }
}
