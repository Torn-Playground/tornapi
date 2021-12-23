package be.dekleinekobini.tornapi.models.user;

import be.dekleinekobini.tornapi.models.Model;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Inventory extends Model {

    @JsonProperty("ID")
    private long id;
    private String name;
    private String type;
    private long quantity;
    private long equipped;
    @JsonProperty("market_price")
    private long marketPrice;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public long getEquipped() {
        return equipped;
    }

    public void setEquipped(long equipped) {
        this.equipped = equipped;
    }

    public boolean isEquipped() {
        return getEquipped() > 0;
    }

    public long getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(long marketPrice) {
        this.marketPrice = marketPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inventory inventory = (Inventory) o;
        return id == inventory.id && quantity == inventory.quantity && equipped == inventory.equipped && marketPrice == inventory.marketPrice && name.equals(inventory.name) && type.equals(inventory.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, quantity, equipped, marketPrice);
    }

}
