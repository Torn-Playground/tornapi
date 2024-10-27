package eu.tornplayground.tornapi.models.user;

import eu.tornplayground.tornapi.models.Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Objects;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CriminalRecord extends Model {

    @JsonProperty("auto_theft")
    private int autoTheft;

    @JsonProperty("computer_crimes")
    private int computerCrimes;

    @JsonProperty("counterfeiting")
    private int counterfeiting;

    @JsonProperty("cybercrime")
    private int cybercrime;

    @JsonProperty("drug_deals")
    private int drugDeals;

    @JsonProperty("extortion")
    private int extortion;

    @JsonProperty("fraud")
    private int fraud;

    @JsonProperty("fraud_crimes")
    private int fraudCrimes;

    @JsonProperty("illegalproduction")
    private int illegalProduction;

    @JsonProperty("illicitservices")
    private int illicitServices;

    @JsonProperty("murder")
    private int murder;

    @JsonProperty("other")
    private int other;

    @JsonProperty("selling_illegal_products")
    private int sellingIllegalProducts;

    @JsonProperty("theft")
    private int theft;

    @JsonProperty("total")
    private int total;

    @JsonProperty("vandalism")
    private int vandalism;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CriminalRecord)) return false;
        CriminalRecord that = (CriminalRecord) o;
        return sellingIllegalProducts == that.sellingIllegalProducts && theft == that.theft && autoTheft == that.autoTheft && drugDeals == that.drugDeals && computerCrimes == that.computerCrimes && murder == that.murder && fraudCrimes == that.fraudCrimes && other == that.other && total == that.total;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sellingIllegalProducts, theft, autoTheft, drugDeals, computerCrimes, murder, fraudCrimes, other, total);
    }
}
