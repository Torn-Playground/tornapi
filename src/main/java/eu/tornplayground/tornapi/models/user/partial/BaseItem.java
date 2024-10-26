package eu.tornplayground.tornapi.models.user.partial;

import eu.tornplayground.tornapi.models.Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Getter
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
public abstract class BaseItem extends Model {

    @JsonProperty("ID")
    private long id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("type")
    private String type;

    @JsonProperty("quantity")
    private long quantity;

    @JsonProperty("market_price")
    private long marketPrice;

    @JsonProperty("UID")
    private Integer uid;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseItem baseItem = (BaseItem) o;
        return id == baseItem.id && quantity == baseItem.quantity && marketPrice == baseItem.marketPrice && Objects.equals(name, baseItem.name) && Objects.equals(type, baseItem.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, quantity, marketPrice);
    }

}
