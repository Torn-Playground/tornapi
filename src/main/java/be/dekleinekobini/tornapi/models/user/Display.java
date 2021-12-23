package be.dekleinekobini.tornapi.models.user;

import be.dekleinekobini.tornapi.models.Model;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Display extends Model {

    @JsonProperty("ID")
    private long id;
    private String name;
    private String type;
    private long quantity;
    private long circulation;
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

    public long getCirculation() {
        return circulation;
    }

    public void setCirculation(long circulation) {
        this.circulation = circulation;
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
        Display display = (Display) o;
        return id == display.id && quantity == display.quantity && circulation == display.circulation && marketPrice == display.marketPrice && name.equals(display.name) && type.equals(display.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, quantity, circulation, marketPrice);
    }

}
