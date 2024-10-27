package eu.tornplayground.tornapi.models.user.property;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.Model;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;

import java.util.Objects;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Modifications extends Model {

    @JsonProperty("airstrip")
    @Getter(value = lombok.AccessLevel.NONE)
    private boolean airstrip;

    @JsonProperty("hot_tub")
    @Getter(value = lombok.AccessLevel.NONE)
    private boolean hotTub;

    @JsonProperty("interior")
    private int interior;

    @JsonProperty("medical_facility")
    @Getter(value = lombok.AccessLevel.NONE)
    private boolean medicalFacility;

    @JsonProperty("open_bar")
    @Getter(value = lombok.AccessLevel.NONE)
    private boolean openBar;

    @JsonProperty("sauna")
    @Getter(value = lombok.AccessLevel.NONE)
    private boolean sauna;

    @JsonProperty("pool")
    private int pool;

    @JsonProperty("shooting_range")
    @Getter(value = lombok.AccessLevel.NONE)
    private boolean shootingRange;

    @JsonProperty("vault")
    private int vault;

    @JsonProperty("yacht")
    @Getter(value = lombok.AccessLevel.NONE)
    private boolean yacht;

    public boolean hasAirstrip() {
        return airstrip;
    }

    public boolean hasHotTub() {
        return hotTub;
    }

    public boolean hasMedicalFacility() {
        return medicalFacility;
    }

    public boolean hasOpenBar() {
        return openBar;
    }

    public boolean hasSauna() {
        return sauna;
    }

    public boolean hasShootingRange() {
        return shootingRange;
    }

    public boolean hasYacht() {
        return yacht;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Modifications)) return false;
        Modifications that = (Modifications) o;
        return airstrip == that.airstrip && hotTub == that.hotTub && interior == that.interior && medicalFacility == that.medicalFacility && openBar == that.openBar && sauna == that.sauna && pool == that.pool && shootingRange == that.shootingRange && vault == that.vault && yacht == that.yacht;
    }

    @Override
    public int hashCode() {
        return Objects.hash(airstrip, hotTub, interior, medicalFacility, openBar, sauna, pool, shootingRange, vault, yacht);
    }
}
