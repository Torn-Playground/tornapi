package eu.tornplayground.tornapi.models.user.profile;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.converters.DayDurationConverter;
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
public class Marriage extends Model {

    @JsonProperty("spouse_id")
    private long spouseId;

    @JsonProperty("spouse_name")
    private String spouseName;

    @JsonProperty("duration")
    @JsonDeserialize(converter = DayDurationConverter.class)
    private Duration duration;

}
