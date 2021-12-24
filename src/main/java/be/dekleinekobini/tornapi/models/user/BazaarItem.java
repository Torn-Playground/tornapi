package be.dekleinekobini.tornapi.models.user;

import be.dekleinekobini.tornapi.models.user.partial.BaseItem;

import java.util.Objects;

public class BazaarItem extends BaseItem {

    private long price;

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BazaarItem that = (BazaarItem) o;
        return price == that.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), price);
    }

}
