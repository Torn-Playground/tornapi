package eu.tornplayground.tornapi.models.user;

import eu.tornplayground.tornapi.models.Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Getter
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
public class WorkStats extends Model {

    @JsonProperty("manual_labor")
    private long manualLabor;

    @JsonProperty("intelligence")
    private long intelligence;

    @JsonProperty("endurance")
    private long endurance;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkStats workStats = (WorkStats) o;
        return manualLabor == workStats.manualLabor && intelligence == workStats.intelligence && endurance == workStats.endurance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(manualLabor, intelligence, endurance);
    }
}
