package be.dekleinekobini.tornapi.models;

import be.dekleinekobini.tornapi.models.converters.EpochLocalDateTimeConverter;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.time.LocalDateTime;
import java.util.Objects;

public class Timestamp extends Model {

    @JsonDeserialize(converter = EpochLocalDateTimeConverter.class)
    private LocalDateTime timestamp;

    public static Timestamp of(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json, Timestamp.class);
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Timestamp timestamp1 = (Timestamp) o;
        return Objects.equals(timestamp, timestamp1.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestamp);
    }

}
