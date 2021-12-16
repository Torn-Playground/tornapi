package be.dekleinekobini.tornapi.models.market;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class MarketItem {

    @JsonProperty("ID")
    private long id;
    private long cost;
    private long quantity;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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
