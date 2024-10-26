package eu.tornplayground.tornapi.models.user.jobpoints;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Getter
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
public class CompanyPoints {

    @JsonProperty("name")
    private String name;

    @JsonProperty("jobpoints")
    private long jobPoints;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CompanyPoints)) return false;
        CompanyPoints that = (CompanyPoints) o;
        return jobPoints == that.jobPoints && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, jobPoints);
    }
}
