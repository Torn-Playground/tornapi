package eu.tornplayground.tornapi.models.user.profile;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.converters.SecondDurationConverter;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.Duration;
import java.util.Objects;

@Getter
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
public class Life extends Model {

    @JsonProperty("current")
    private int current;

    @JsonProperty("maximum")
    private int maximum;

    @JsonProperty("increment")
    private int increment;

    @JsonProperty("interval")
    @JsonDeserialize(converter = SecondDurationConverter.class)
    private Duration interval;

    @JsonProperty("ticktime")
    @JsonDeserialize(converter = SecondDurationConverter.class)
    private Duration tickTime;

    @JsonProperty("fulltime")
    @JsonDeserialize(converter = SecondDurationConverter.class)
    private Duration fullTime;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Life)) return false;
        Life life = (Life) o;
        return current == life.current && maximum == life.maximum && increment == life.increment && Objects.equals(interval, life.interval) && Objects.equals(tickTime, life.tickTime) && Objects.equals(fullTime, life.fullTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(current, maximum, increment, interval, tickTime, fullTime);
    }
}
