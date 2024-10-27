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
public class ChainBar {

    @JsonProperty("current")
    private long current;

    @JsonProperty("maximum")
    private long maximum;

    @JsonProperty("timeout")
    @JsonDeserialize(converter = SecondDurationConverter.class)
    private Duration timeout;

    @JsonProperty("modifier")
    private float modifier;

    @JsonProperty("cooldown")
    @JsonDeserialize(converter = SecondDurationConverter.class)
    private Duration cooldown;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ChainBar)) return false;
        ChainBar chainBar = (ChainBar) o;
        return current == chainBar.current && maximum == chainBar.maximum && timeout == chainBar.timeout && Float.compare(modifier, chainBar.modifier) == 0 && cooldown == chainBar.cooldown;
    }

    @Override
    public int hashCode() {
        return Objects.hash(current, maximum, timeout, modifier, cooldown);
    }
}

