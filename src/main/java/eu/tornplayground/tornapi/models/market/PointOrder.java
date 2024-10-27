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
public class PointOrder {

    @JsonProperty("cost")
    private long cost;

    @JsonProperty("quantity")
    private long quantity;

    @JsonProperty("total_cost")
    private long totalCost;

}
