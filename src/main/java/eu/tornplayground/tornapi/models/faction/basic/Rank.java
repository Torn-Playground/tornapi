package eu.tornplayground.tornapi.models.faction.basic;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.Model;

import java.util.Objects;

public class Rank extends Model {
    @JsonProperty("level")
    private int level;

    @JsonProperty("name")
    private String name;

    @JsonProperty("division")
    private int division;

    @JsonProperty("position")
    private int position;

    @JsonProperty("wins")
    private int wins;

    protected Rank() {
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    public int getDivision() {
        return division;
    }

    public int getPosition() {
        return position;
    }

    public int getWins() {
        return wins;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rank)) return false;
        Rank rank = (Rank) o;
        return level == rank.level && position == rank.position && wins == rank.wins && Objects.equals(name, rank.name) && division == rank.division;
    }

    @Override
    public int hashCode() {
        return Objects.hash(level, name, division, position, wins);
    }
}
