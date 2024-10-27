package eu.tornplayground.tornapi.models.user.attacks;

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
public class Modifiers {

    @JsonProperty("fair_fight")
    private double fairFight;

    @JsonProperty("war")
    private double war;

    @JsonProperty("retaliation")
    private double retaliation;

    @JsonProperty("group_attack")
    private double groupAttack;

    @JsonProperty("overseas")
    private double overseas;

    @JsonProperty("chain_bonus")
    private double chainBonus;

}
