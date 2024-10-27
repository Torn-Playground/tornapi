package eu.tornplayground.tornapi.models.torn;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.torn.stock.Benefit;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = false)
public class Stock extends Model {

    @JsonProperty("stock_id")
    private long id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("acronym")
    private String acronym;

    @JsonProperty("current_price")
    private float currentPrice;

    @JsonProperty("market_cap")
    private long marketCap;

    @JsonProperty("total_shares")
    private long totalShares;

    @JsonProperty("benefit")
    private Benefit benefit;

}
