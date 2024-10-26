package eu.tornplayground.tornapi.models.user;

import eu.tornplayground.tornapi.models.Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Getter
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
public class Refills extends Model {

    @JsonProperty("energy_refill_used")
    private boolean energyRefillUsed;

    @JsonProperty("nerve_refill_used")
    private boolean nerveRefillUsed;

    @JsonProperty("token_refill_used")
    private boolean tokenRefillUsed;

    @JsonProperty("special_refills_available")
    private int specialRefillsAvailable;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Refills refills = (Refills) o;
        return energyRefillUsed == refills.energyRefillUsed && nerveRefillUsed == refills.nerveRefillUsed && tokenRefillUsed == refills.tokenRefillUsed && specialRefillsAvailable == refills.specialRefillsAvailable;
    }

    @Override
    public int hashCode() {
        return Objects.hash(energyRefillUsed, nerveRefillUsed, tokenRefillUsed, specialRefillsAvailable);
    }
}
