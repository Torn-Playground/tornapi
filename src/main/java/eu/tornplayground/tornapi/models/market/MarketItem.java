package eu.tornplayground.tornapi.models.market;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Objects;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MarketItem {

    @JsonProperty("ID")
    private long id;

    @JsonProperty("cost")
    private long cost;

    @JsonProperty("quantity")
    private long quantity;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MarketItem bazaar = (MarketItem) o;
        return id == bazaar.id && cost == bazaar.cost && quantity == bazaar.quantity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cost, quantity);
    }

}
