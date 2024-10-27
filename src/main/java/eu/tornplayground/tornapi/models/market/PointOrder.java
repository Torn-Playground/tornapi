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
public class PointOrder {

    @JsonProperty("cost")
    private long cost;

    @JsonProperty("quantity")
    private long quantity;

    @JsonProperty("total_cost")
    private long totalCost;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PointOrder that = (PointOrder) o;
        return cost == that.cost && quantity == that.quantity && totalCost == that.totalCost;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cost, quantity, totalCost);
    }

}
