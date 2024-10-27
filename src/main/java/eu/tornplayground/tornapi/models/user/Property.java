package eu.tornplayground.tornapi.models.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.user.property.Modifications;
import eu.tornplayground.tornapi.models.user.property.RentedInfo;
import eu.tornplayground.tornapi.models.user.property.Staff;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = false)
public class Property extends Model {

    @JsonProperty("owner_id")
    private long ownerId;

    @JsonProperty("property_type")
    private int propertyType;

    @JsonProperty("property")
    private String property;

    @JsonProperty("rented")
    private RentedInfo rented;

    @JsonProperty("status")
    private String status;

    @JsonProperty("happy")
    private int happy;

    @JsonProperty("upkeep")
    private int upkeep;

    @JsonProperty("staff_cost")
    private int staffCost;

    @JsonProperty("cost")
    private long cost;

    @JsonProperty("marketprice")
    private long marketPrice;

    @JsonProperty("modifications")
    private Modifications modifications;

    @JsonProperty("staff")
    private Staff staff;

}
