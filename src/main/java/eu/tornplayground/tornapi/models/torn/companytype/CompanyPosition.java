package eu.tornplayground.tornapi.models.torn.companytype;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = false)
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

}
