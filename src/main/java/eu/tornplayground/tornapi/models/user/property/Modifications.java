package eu.tornplayground.tornapi.models.user.property;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.Model;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = false)
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

}
