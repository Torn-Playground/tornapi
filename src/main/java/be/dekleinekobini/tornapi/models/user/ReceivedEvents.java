package be.dekleinekobini.tornapi.models.user;

import be.dekleinekobini.tornapi.models.Model;
import be.dekleinekobini.tornapi.models.converters.EpochLocalDateTimeConverter;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.Objects;

public class ReceivedEvents extends Model {

    private long owner;
    @JsonDeserialize(converter = EpochLocalDateTimeConverter.class)
    private LocalDateTime timestamp;
    private String event;

    public static Map<Long, ReceivedEvents> of(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("receivedevents"), new TypeReference<>() {
        });
    }

    public long getOwner() {
        return owner;
    }

    public void setOwner(long owner) {
        this.owner = owner;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReceivedEvents that = (ReceivedEvents) o;
        return owner == that.owner && timestamp.equals(that.timestamp) && event.equals(that.event);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner, timestamp, event);
    }

}
