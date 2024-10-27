package eu.tornplayground.tornapi.models.user.partial;

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

}
