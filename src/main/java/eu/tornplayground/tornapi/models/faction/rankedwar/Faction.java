package eu.tornplayground.tornapi.models.faction.rankedwar;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.Model;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Objects;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Faction extends Model {
    @JsonProperty("name")
    private String name;

    @JsonProperty("score")
    private int score;

    @JsonProperty("chain")
    private int chain;

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
