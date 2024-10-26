package eu.tornplayground.tornapi.models.user.profile;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.Model;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Getter
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
public class Job extends Model {
    @JsonProperty("position")
    private String position;

    @JsonProperty("company_id")
    private long companyId;

    @JsonProperty("company_name")
    private String companyName;

    @JsonProperty("company_type")
    private long companyType;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return companyId == job.companyId && companyType == job.companyType && Objects.equals(position, job.position) && Objects.equals(companyName, job.companyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, companyId, companyName, companyType);
    }
}
