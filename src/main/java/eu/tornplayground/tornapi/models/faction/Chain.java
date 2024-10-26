package eu.tornplayground.tornapi.models.faction;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.converters.EpochLocalDateTimeConverter;
import eu.tornplayground.tornapi.models.converters.SecondDurationConverter;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Objects;

public class Chain extends Model {
    @JsonProperty("current")
    private int current;

    @JsonProperty("max")
    private int max;

    @JsonProperty("timeout")
    @JsonDeserialize(converter = SecondDurationConverter.class)
    private Duration timeout;

    @JsonProperty("modifier")
    private float modifier;

    @JsonProperty("cooldown")
    @JsonDeserialize(converter = SecondDurationConverter.class)
    private Duration cooldown;

    @JsonProperty("start")
    @JsonDeserialize(converter = EpochLocalDateTimeConverter.class)
    private LocalDateTime start;

    @JsonProperty("end")
    @JsonDeserialize(converter = EpochLocalDateTimeConverter.class)
    private LocalDateTime end;

    protected Chain() {
    }

    public int getCurrent() {
        return current;
    }

    public int getMax() {
        return max;
    }

    public Duration getTimeout() {
        return timeout;
    }

    public float getModifier() {
        return modifier;
    }

    public Duration getCooldown() {
        return cooldown;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Chain)) return false;
        Chain chain = (Chain) o;
        return current == chain.current && max == chain.max && Float.compare(modifier, chain.modifier) == 0 && Objects.equals(timeout, chain.timeout) && Objects.equals(cooldown, chain.cooldown) && Objects.equals(start, chain.start) && Objects.equals(end, chain.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(current, max, timeout, modifier, cooldown, start, end);
    }
}
