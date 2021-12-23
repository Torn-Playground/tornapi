package be.dekleinekobini.tornapi.models.user;

import be.dekleinekobini.tornapi.models.Model;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Refills extends Model {

    @JsonProperty("energy_refill_used")
    private boolean energyRefillUsed;
    @JsonProperty("nerve_refill_used")
    private boolean nerveRefillUsed;
    @JsonProperty("token_refill_used")
    private boolean tokenRefillUsed;
    @JsonProperty("special_refills_available")
    private int specialRefillsAvailable;

    public boolean isEnergyRefillUsed() {
        return energyRefillUsed;
    }

    public void setEnergyRefillUsed(boolean energyRefillUsed) {
        this.energyRefillUsed = energyRefillUsed;
    }

    public boolean isNerveRefillUsed() {
        return nerveRefillUsed;
    }

    public void setNerveRefillUsed(boolean nerveRefillUsed) {
        this.nerveRefillUsed = nerveRefillUsed;
    }

    public boolean isTokenRefillUsed() {
        return tokenRefillUsed;
    }

    public void setTokenRefillUsed(boolean tokenRefillUsed) {
        this.tokenRefillUsed = tokenRefillUsed;
    }

    public int getSpecialRefillsAvailable() {
        return specialRefillsAvailable;
    }

    public void setSpecialRefillsAvailable(int specialRefillsAvailable) {
        this.specialRefillsAvailable = specialRefillsAvailable;
    }

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
