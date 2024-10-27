package eu.tornplayground.tornapi.models.faction.attacks;

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
public class Modifiers extends Model {

    @JsonProperty("fair_fight")
    private float fairFight;

    @JsonProperty("war")
    private float war;

    @JsonProperty("retaliation")
    private float retaliation;

    @JsonProperty("group_attack")
    private float groupAttack;

    @JsonProperty("overseas")
    private float overseas;

    @JsonProperty("chain_bonus")
    private float chainBonus;

    @JsonProperty("warlord_bonus")
    private float warlordBonus;

}
