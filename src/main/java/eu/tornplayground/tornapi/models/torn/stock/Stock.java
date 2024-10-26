package eu.tornplayground.tornapi.models.torn.stock;

import eu.tornplayground.tornapi.models.Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.torn.Benefit;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Getter
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stock stock = (Stock) o;
        return id == stock.id && Float.compare(stock.currentPrice, currentPrice) == 0 && marketCap == stock.marketCap && totalShares == stock.totalShares && Objects.equals(name, stock.name) && Objects.equals(acronym, stock.acronym) && Objects.equals(benefit, stock.benefit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, acronym, currentPrice, marketCap, totalShares, benefit);
    }

}
