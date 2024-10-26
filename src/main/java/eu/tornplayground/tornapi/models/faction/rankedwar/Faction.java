package eu.tornplayground.tornapi.models.faction.rankedwar;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.Model;

import java.util.Objects;

public class Faction extends Model {
    @JsonProperty("name")
    private String name;

    @JsonProperty("score")
    private int score;

    @JsonProperty("chain")
    private int chain;

    protected Faction() {
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public int getChain() {
        return chain;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Faction)) return false;
        Faction faction = (Faction) o;
        return score == faction.score && chain == faction.chain && Objects.equals(name, faction.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score, chain);
    }
}
