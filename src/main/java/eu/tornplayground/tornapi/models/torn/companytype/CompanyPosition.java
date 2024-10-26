package eu.tornplayground.tornapi.models.torn.companytype;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Getter
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
public class CompanyPosition {

    @JsonProperty("man_required")
    private int manualRequired;

    @JsonProperty("int_required")
    private int intelligenceRequired;

    @JsonProperty("end_required")
    private int enduranceRequired;

    @JsonProperty("man_gain")
    private int manualGain;

    @JsonProperty("int_gain")
    private int intelligenceGain;

    @JsonProperty("end_gain")
    private int enduranceGain;

    @JsonProperty("special_ability")
    private SpecialPosition specialAbility;

    @JsonProperty("description")
    private String description;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompanyPosition that = (CompanyPosition) o;
        return manualRequired == that.manualRequired && intelligenceRequired == that.intelligenceRequired && enduranceRequired == that.enduranceRequired && manualGain == that.manualGain && intelligenceGain == that.intelligenceGain && enduranceGain == that.enduranceGain && Objects.equals(specialAbility, that.specialAbility) && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manualRequired, intelligenceRequired, enduranceRequired, manualGain, intelligenceGain, enduranceGain, specialAbility, description);
    }

}
