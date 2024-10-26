package eu.tornplayground.tornapi.models.user;

import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.converters.EpochLocalDateTimeConverter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import eu.tornplayground.tornapi.models.user.stock.Benefit;
import eu.tornplayground.tornapi.models.user.stock.Dividend;
import eu.tornplayground.tornapi.models.user.stock.Transaction;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.Objects;

@Getter
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stock stocks = (Stock) o;
        return stockId == stocks.stockId && totalShares == stocks.totalShares && Objects.equals(dividend, stocks.dividend) && Objects.equals(benefit, stocks.benefit) && transactions.equals(stocks.transactions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stockId, totalShares, dividend, benefit, transactions);
    }


}
