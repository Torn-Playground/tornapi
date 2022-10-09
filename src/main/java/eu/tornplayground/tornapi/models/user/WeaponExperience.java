package eu.tornplayground.tornapi.models.user;

import eu.tornplayground.tornapi.models.Model;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class WeaponExperience extends Model {

    @JsonProperty("itemID")
    private long itemId;
    private String name;
    private byte exp;

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getExp() {
        return exp;
    }

    public void setExp(byte exp) {
        this.exp = exp;
    }

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
