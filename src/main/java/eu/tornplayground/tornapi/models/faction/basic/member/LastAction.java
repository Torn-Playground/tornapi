package eu.tornplayground.tornapi.models.faction.basic.member;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.converters.EpochLocalDateTimeConverter;
import eu.tornplayground.tornapi.models.converters.RelativeConverter;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Objects;

public class LastAction extends Model {

    @JsonProperty("status")
    private String status;

    @JsonProperty("timestamp")
    @JsonDeserialize(converter = EpochLocalDateTimeConverter.class)
    private LocalDateTime timestamp;

    @JsonProperty("relative")
    @JsonDeserialize(converter = RelativeConverter.class)
    private Duration relative;

    protected LastAction() {
    }

    public String getStatus() {
        return status;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public Duration getRelative() {
        return relative;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LastAction that = (LastAction) o;
        return Objects.equals(status, that.status) && Objects.equals(timestamp, that.timestamp) && Objects.equals(relative, that.relative);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, timestamp, relative);
    }
}
