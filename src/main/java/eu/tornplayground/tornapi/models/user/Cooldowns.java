package eu.tornplayground.tornapi.models.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.Model;
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
public class Cooldowns extends Model {

    @JsonProperty("drug")
    @JsonDeserialize(converter = SecondDurationConverter.class)
    private Duration drug;

    @JsonProperty("medical")
    @JsonDeserialize(converter = SecondDurationConverter.class)
    private Duration medical;

    @JsonProperty("booster")
    @JsonDeserialize(converter = SecondDurationConverter.class)
    private Duration booster;

}
