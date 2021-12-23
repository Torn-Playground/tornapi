package be.dekleinekobini.tornapi.models.user;

import be.dekleinekobini.tornapi.models.Model;
import be.dekleinekobini.tornapi.models.converters.EpochLocalDateTimeConverter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Objects;

public class Travel extends Model {

    private String destination;
    private TravelMethod method;
    @JsonDeserialize(converter = EpochLocalDateTimeConverter.class)
    private LocalDateTime timestamp;
    @JsonDeserialize(converter = EpochLocalDateTimeConverter.class)
    private LocalDateTime departed;
    @JsonProperty("time_left")
    private Duration timeLeft;

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public TravelMethod getMethod() {
        return method;
    }

    public void setMethod(TravelMethod method) {
        this.method = method;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public LocalDateTime getDeparted() {
        return departed;
    }

    public void setDeparted(LocalDateTime departed) {
        this.departed = departed;
    }

    public Duration getTimeLeft() {
        return timeLeft;
    }

    public void setTimeLeft(Duration timeLeft) {
        this.timeLeft = timeLeft;
    }

    public enum TravelMethod {
        STANDARD, AIRSTRIP,
        PRIVATE, // TODO - Verify, should be name of WLT
        BUSINESS // TODO - Verify, should be name of business
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Travel travel = (Travel) o;
        return timeLeft == travel.timeLeft && Objects.equals(destination, travel.destination) && method == travel.method && Objects.equals(timestamp, travel.timestamp) && Objects.equals(departed, travel.departed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, method, timestamp, departed, timeLeft);
    }
}
