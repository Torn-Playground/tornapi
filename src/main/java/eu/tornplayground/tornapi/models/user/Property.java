package eu.tornplayground.tornapi.models.user;

import eu.tornplayground.tornapi.models.Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.user.property.Modifications;
import eu.tornplayground.tornapi.models.user.property.RentedInfo;
import eu.tornplayground.tornapi.models.user.property.Staff;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Objects;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Property)) return false;
        Property property1 = (Property) o;
        return ownerId == property1.ownerId && propertyType == property1.propertyType && happy == property1.happy && upkeep == property1.upkeep && staffCost == property1.staffCost && cost == property1.cost && marketPrice == property1.marketPrice && Objects.equals(property, property1.property) && Objects.equals(rented, property1.rented) && Objects.equals(status, property1.status) && Objects.equals(modifications, property1.modifications) && Objects.equals(staff, property1.staff);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ownerId, propertyType, property, rented, status, happy, upkeep, staffCost, cost, marketPrice, modifications, staff);
    }
}
