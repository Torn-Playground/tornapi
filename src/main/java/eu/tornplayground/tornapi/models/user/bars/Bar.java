package eu.tornplayground.tornapi.models.user.bars;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import eu.tornplayground.tornapi.models.converters.SecondDurationConverter;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.Duration;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = false)
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

}
