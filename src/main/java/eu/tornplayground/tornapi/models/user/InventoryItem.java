package eu.tornplayground.tornapi.models.user;

import eu.tornplayground.tornapi.models.user.partial.BaseItem;

import java.util.Objects;

public class InventoryItem extends BaseItem {

    private long equipped;

    public long getEquipped() {
        return equipped;
    }

    public void setEquipped(long equipped) {
        this.equipped = equipped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        InventoryItem that = (InventoryItem) o;
        return equipped == that.equipped;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), equipped);
    }

}
