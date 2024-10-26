package eu.tornplayground.tornapi.models.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.converters.EpochLocalDateTimeConverter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
public class Event extends Model {

    @JsonProperty("timestamp")
    @JsonDeserialize(converter = EpochLocalDateTimeConverter.class)
    private LocalDateTime timestamp;

    @JsonProperty("event")
    private String eventMessage;

    @JsonProperty("seen")
    @Getter(value = lombok.AccessLevel.NONE)
    private boolean seen;

    public boolean hasBeenSeen() {
        return seen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return seen == event.seen && timestamp.equals(event.timestamp) && this.eventMessage.equals(event.eventMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestamp, eventMessage, seen);
    }

}
