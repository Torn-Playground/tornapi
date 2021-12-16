package be.dekleinekobini.tornapi.models.market;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class PointOrder {

    private long cost;
    private long quantity;
    @JsonProperty("total_cost")
    private long totalCost;

    public long getCost() {
        return cost;
    }

    public void setCost(long cost) {
        this.cost = cost;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public long getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(long totalCost) {
        this.totalCost = totalCost;
    }

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
