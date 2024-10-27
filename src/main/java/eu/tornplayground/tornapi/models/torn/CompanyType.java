package eu.tornplayground.tornapi.models.torn;

import eu.tornplayground.tornapi.models.Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.torn.companytype.CompanyPosition;
import eu.tornplayground.tornapi.models.torn.companytype.CompanySpecial;
import eu.tornplayground.tornapi.models.torn.companytype.CompanyStock;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Map;
import java.util.Objects;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CompanyType extends Model {

    @JsonProperty("name")
    private String name;

    @JsonProperty("cost")
    private long cost;

    @JsonProperty("default_employees")
    private int defaultEmployees;

    @JsonProperty("positions")
    private Map<String, CompanyPosition> positions;

    @JsonProperty("stock")
    private Map<String, CompanyStock> stock;

    @JsonProperty("specials")
    private Map<String, CompanySpecial> specials;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompanyType that = (CompanyType) o;
        return cost == that.cost && defaultEmployees == that.defaultEmployees && Objects.equals(name, that.name) && Objects.equals(positions, that.positions) && Objects.equals(stock, that.stock) && Objects.equals(specials, that.specials);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost, defaultEmployees, positions, stock, specials);
    }

}
