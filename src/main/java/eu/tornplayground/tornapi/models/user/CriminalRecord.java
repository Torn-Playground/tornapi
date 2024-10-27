package eu.tornplayground.tornapi.models.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.Model;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = false)
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

}
