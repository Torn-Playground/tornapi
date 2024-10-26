package eu.tornplayground.tornapi.models.user;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import eu.tornplayground.tornapi.models.Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.converters.SecondDurationConverter;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.Duration;
import java.util.List;
import java.util.Objects;

@Getter
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
public class Education extends Model {

    @JsonProperty("education_current")
    private long current;

    @JsonProperty("education_timeleft")
    @JsonDeserialize(converter = SecondDurationConverter.class)
    private Duration timeLeft;

    @JsonProperty("education_completed")
    private List<Long> completed;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Education education = (Education) o;
        return current == education.current && Objects.equals(timeLeft, education.timeLeft) && Objects.equals(completed, education.completed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(current, timeLeft, completed);
    }

}
