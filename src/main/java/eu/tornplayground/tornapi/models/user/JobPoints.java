package eu.tornplayground.tornapi.models.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.user.jobpoints.CompanyPoints;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Map;
import java.util.Objects;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class JobPoints extends Model {

    @JsonProperty("jobs")
    private Map<String, Long> jobs;

    @JsonProperty("companies")
    private Map<Long, CompanyPoints> companies;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobPoints jobPoints = (JobPoints) o;
        return Objects.equals(jobs, jobPoints.jobs) && Objects.equals(companies, jobPoints.companies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobs, companies);
    }
}
