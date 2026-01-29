package eu.tornplayground.tornapi.models.user.bars;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.converters.SecondDurationConverter;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import tools.jackson.databind.annotation.JsonDeserialize;

import java.time.Duration;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = false)
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

}

