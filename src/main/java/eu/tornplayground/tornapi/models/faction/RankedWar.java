package eu.tornplayground.tornapi.models.faction;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.faction.rankedwar.Faction;
import eu.tornplayground.tornapi.models.faction.rankedwar.War;

import java.util.Map;
import java.util.Objects;

public class RankedWar extends Model {
    @JsonProperty("factions")
    private Map<Integer, Faction> factions;

    @JsonProperty("war")
    private War war;

    protected RankedWar() {
    }

    public Map<Integer, Faction> getFactions() {
        return factions;
    }

    public War getWar() {
        return war;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RankedWar)) return false;
        RankedWar rankedWar = (RankedWar) o;
        return Objects.equals(factions, rankedWar.factions) && Objects.equals(war, rankedWar.war);
    }

    @Override
    public int hashCode() {
        return Objects.hash(factions, war);
    }
}
