package eu.tornplayground.tornapi.models.torn.companytype;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Getter
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
public class CompanyStock {

    @JsonProperty("cost")
    private Object cost;

    @JsonProperty("rrp")
    private long rrp;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompanyStock that = (CompanyStock) o;
        return rrp == that.rrp && Objects.equals(cost, that.cost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cost, rrp);
    }

}
