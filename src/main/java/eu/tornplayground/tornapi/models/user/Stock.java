package eu.tornplayground.tornapi.models.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.user.stock.Benefit;
import eu.tornplayground.tornapi.models.user.stock.Dividend;
import eu.tornplayground.tornapi.models.user.stock.Transaction;
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
public class Stock extends Model {

    @JsonProperty("stock_id")
    private long stockId;
    @JsonProperty("total_shares")
    private long totalShares;

    @JsonProperty("dividend")
    private Dividend dividend;

    @JsonProperty("benefit")
    private Benefit benefit;

    @JsonProperty("transactions")
    private Map<Long, Transaction> transactions;

}
