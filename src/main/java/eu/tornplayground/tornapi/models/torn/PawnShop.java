package eu.tornplayground.tornapi.models.torn;

import eu.tornplayground.tornapi.models.Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Objects;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PawnShop extends Model {

    @JsonProperty("points_value")
    private long pointsValue;

    @JsonProperty("donatorpack_value")
    private long donatorPackValue;

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
