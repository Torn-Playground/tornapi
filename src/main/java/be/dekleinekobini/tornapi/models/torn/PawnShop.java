package be.dekleinekobini.tornapi.models.torn;

import be.dekleinekobini.tornapi.models.Model;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class PawnShop extends Model {

    @JsonProperty("points_value")
    private long pointsValue;
    @JsonProperty("donatorpack_value")
    private long donatorPackValue;

    public long getPointsValue() {
        return pointsValue;
    }

    public void setPointsValue(long pointsValue) {
        this.pointsValue = pointsValue;
    }

    public long getDonatorPackValue() {
        return donatorPackValue;
    }

    public void setDonatorPackValue(long donatorPackValue) {
        this.donatorPackValue = donatorPackValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PawnShop pawnShop = (PawnShop) o;
        return pointsValue == pawnShop.pointsValue && donatorPackValue == pawnShop.donatorPackValue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pointsValue, donatorPackValue);
    }

}
