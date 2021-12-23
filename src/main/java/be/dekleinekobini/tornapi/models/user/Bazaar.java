package be.dekleinekobini.tornapi.models.user;

import be.dekleinekobini.tornapi.models.Model;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Bazaar extends Model {

    @JsonProperty("ID")
    private long id;
    private String name;
    private String type;
    private int quantity;
    private long price;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
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
        Bazaar bazaar = (Bazaar) o;
        return id == bazaar.id && quantity == bazaar.quantity && price == bazaar.price && marketPrice == bazaar.marketPrice && Objects.equals(name, bazaar.name) && Objects.equals(type, bazaar.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, quantity, price, marketPrice);
    }

}
