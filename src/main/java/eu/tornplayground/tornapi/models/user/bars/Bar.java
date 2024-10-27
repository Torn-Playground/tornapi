package eu.tornplayground.tornapi.models.user.bars;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import eu.tornplayground.tornapi.models.converters.SecondDurationConverter;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.Duration;
import java.util.Objects;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Bar {


    @JsonProperty("current")
    private long current;

    @JsonProperty("maximum")
    private long maximum;

    @JsonProperty("increment")
    private long increment;

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
        if (!(o instanceof Bar)) return false;
        Bar bar = (Bar) o;
        return current == bar.current && maximum == bar.maximum && increment == bar.increment && Objects.equals(interval, bar.interval) && Objects.equals(tickTime, bar.tickTime) && Objects.equals(fullTime, bar.fullTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(current, maximum, increment, interval, tickTime, fullTime);
    }
}
