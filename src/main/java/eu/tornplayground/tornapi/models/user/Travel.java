package eu.tornplayground.tornapi.models.user;

import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.converters.EpochLocalDateTimeConverter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import eu.tornplayground.tornapi.models.user.travel.TravelMethod;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
public class Travel extends Model {

    @JsonProperty("destination")
    private String destination;

    @JsonProperty("method")
    private TravelMethod method;

    @JsonProperty("timestamp")
    @JsonDeserialize(converter = EpochLocalDateTimeConverter.class)
    private LocalDateTime timestamp;

    @JsonProperty("departed")
    @JsonDeserialize(converter = EpochLocalDateTimeConverter.class)
    private LocalDateTime departed;

    @JsonProperty("time_left")
    private Duration timeLeft;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Travel)) return false;
        Travel travel = (Travel) o;
        return Objects.equals(destination, travel.destination) && method == travel.method && Objects.equals(timestamp, travel.timestamp) && Objects.equals(departed, travel.departed) && Objects.equals(timeLeft, travel.timeLeft);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, method, timestamp, departed, timeLeft);
    }
}
