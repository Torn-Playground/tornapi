package eu.tornplayground.tornapi.models.torn;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.Model;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = false)
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

}
