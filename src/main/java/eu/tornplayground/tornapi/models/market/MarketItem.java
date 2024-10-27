package eu.tornplayground.tornapi.models.market;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = false)
public class MarketItem {

    @JsonProperty("ID")
    private long id;

    @JsonProperty("cost")
    private long cost;

    @JsonProperty("quantity")
    private long quantity;

}
