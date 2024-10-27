package eu.tornplayground.tornapi.models.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.user.money.Bank;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = false)
public class Money extends Model {

    @JsonProperty("points")
    private long points;

    @JsonProperty("cayman_bank")
    private long caymanBank;

    @JsonProperty("vault_amount")
    private long vault;

    @JsonProperty("company_funds")
    private long companyFunds;

    @JsonProperty("daily_networth")
    private long dailyNetworth;

    @JsonProperty("money_onhand")
    private long moneyOnHand;

    @JsonProperty("city_bank")
    private Bank cityBank;

}
