package eu.tornplayground.tornapi.models.faction.attacks;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.Model;

import java.util.Objects;

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

    protected Modifiers() {
    }

    public float getFairFight() {
        return fairFight;
    }

    public float getWar() {
        return war;
    }

    public float getRetaliation() {
        return retaliation;
    }

    public float getGroupAttack() {
        return groupAttack;
    }

    public float getOverseas() {
        return overseas;
    }

    public float getChainBonus() {
        return chainBonus;
    }

    public float getWarlordBonus() {
        return warlordBonus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Modifiers)) return false;
        Modifiers modifiers = (Modifiers) o;
        return Float.compare(fairFight, modifiers.fairFight) == 0 && Float.compare(war, modifiers.war) == 0 && Float.compare(retaliation, modifiers.retaliation) == 0 && Float.compare(groupAttack, modifiers.groupAttack) == 0 && Float.compare(overseas, modifiers.overseas) == 0 && Float.compare(chainBonus, modifiers.chainBonus) == 0 && Float.compare(warlordBonus, modifiers.warlordBonus) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fairFight, war, retaliation, groupAttack, overseas, chainBonus, warlordBonus);
    }
}
