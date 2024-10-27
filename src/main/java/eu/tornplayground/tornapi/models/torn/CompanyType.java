package eu.tornplayground.tornapi.models.torn;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.torn.companytype.CompanyPosition;
import eu.tornplayground.tornapi.models.torn.companytype.CompanySpecial;
import eu.tornplayground.tornapi.models.torn.companytype.CompanyStock;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Map;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = false)
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

}
