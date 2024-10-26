package eu.tornplayground.tornapi.models.user;

import eu.tornplayground.tornapi.models.Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Getter
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
public class WeaponExperience extends Model {

    @JsonProperty("itemID")
    private long itemId;

    @JsonProperty("name")
    private String name;

    @JsonProperty("exp")
    private byte exp;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WeaponExperience weaponExp = (WeaponExperience) o;
        return itemId == weaponExp.itemId && exp == weaponExp.exp && name.equals(weaponExp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemId, name, exp);
    }

}
