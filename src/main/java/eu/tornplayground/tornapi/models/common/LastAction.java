package eu.tornplayground.tornapi.models.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.converters.EpochLocalDateTimeConverter;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
public class LastAction extends Model {

    @JsonProperty("status")
    private OnlineStatus status;

    @JsonProperty("timestamp")
    @JsonDeserialize(converter = EpochLocalDateTimeConverter.class)
    private LocalDateTime timestamp;

    @JsonProperty("relative")
    private String relative;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LastAction)) return false;
        LastAction that = (LastAction) o;
        return status == that.status && Objects.equals(timestamp, that.timestamp) && Objects.equals(relative, that.relative);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, timestamp, relative);
    }
}
