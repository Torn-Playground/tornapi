package eu.tornplayground.tornapi.models.user.profile;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.converters.DayDurationConverter;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.Duration;
import java.util.Objects;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Marriage extends Model {

    @JsonProperty("spouse_id")
    private long spouseId;

    @JsonProperty("spouse_name")
    private String spouseName;

    @JsonProperty("duration")
    @JsonDeserialize(converter = DayDurationConverter.class)
    private Duration duration;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Marriage)) return false;
        Marriage marriage = (Marriage) o;
        return spouseId == marriage.spouseId && Objects.equals(spouseName, marriage.spouseName) && Objects.equals(duration, marriage.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(spouseId, spouseName, duration);
    }
}
