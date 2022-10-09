package eu.tornplayground.tornapi.models.user;

import eu.tornplayground.tornapi.models.user.partial.BaseItem;

import java.util.Objects;

public class DisplayItem extends BaseItem {

    private long circulation;

    public long getCirculation() {
        return circulation;
    }

    public void setCirculation(long circulation) {
        this.circulation = circulation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DisplayItem that = (DisplayItem) o;
        return circulation == that.circulation;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), circulation);
    }

}
