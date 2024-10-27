package eu.tornplayground.tornapi.models.user.profile;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import eu.tornplayground.tornapi.models.Model;
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

}
