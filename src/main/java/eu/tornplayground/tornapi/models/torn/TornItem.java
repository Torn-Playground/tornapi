package eu.tornplayground.tornapi.models.torn;

import eu.tornplayground.tornapi.models.Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Objects;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class TornItem extends Model {

    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    @JsonProperty("effect")
    private String effect;

    @JsonProperty("requirement")
    private String requirement;

    @JsonProperty("type")
    private String type;

    @JsonProperty("weapon_type")
    private String weaponType;

    @JsonProperty("buy_price")
    private long buyPrice;

    @JsonProperty("sell_price")
    private long sellPrice;

    @JsonProperty("market_value")
    private long marketValue;

    @JsonProperty("circulation")
    private long circulation;

    @JsonProperty("image")
    private String image;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TornItem tornItem = (TornItem) o;
        return buyPrice == tornItem.buyPrice && sellPrice == tornItem.sellPrice && marketValue == tornItem.marketValue && circulation == tornItem.circulation && Objects.equals(name, tornItem.name) && Objects.equals(description, tornItem.description) && Objects.equals(effect, tornItem.effect) && Objects.equals(requirement, tornItem.requirement) && Objects.equals(type, tornItem.type) && Objects.equals(weaponType, tornItem.weaponType) && Objects.equals(image, tornItem.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, effect, requirement, type, weaponType, buyPrice, sellPrice, marketValue, circulation, image);
    }

}
