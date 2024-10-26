package eu.tornplayground.tornapi.models.user.attacks;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.checkerframework.checker.regex.qual.Regex;

import java.util.Objects;

@Getter
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Modifiers modifiers = (Modifiers) o;
        return Double.compare(modifiers.fairFight, fairFight) == 0 && Double.compare(modifiers.war, war) == 0 && Double.compare(modifiers.retaliation, retaliation) == 0 && Double.compare(modifiers.groupAttack, groupAttack) == 0 && Double.compare(modifiers.overseas, overseas) == 0 && Double.compare(modifiers.chainBonus, chainBonus) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fairFight, war, retaliation, groupAttack, overseas, chainBonus);
    }
}
