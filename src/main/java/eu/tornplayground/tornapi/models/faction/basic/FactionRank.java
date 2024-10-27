package eu.tornplayground.tornapi.models.faction.basic;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.faction.basic.rank.Rank;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Objects;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class FactionRank extends Model {
    @JsonProperty("level")
    private int level;

    @JsonProperty("name")
    private Rank name;

    @JsonProperty("division")
    private int division;

    @JsonProperty("position")
    private int position;

    @JsonProperty("wins")
    private int wins;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FactionRank)) return false;
        FactionRank that = (FactionRank) o;
        return level == that.level && division == that.division && position == that.position && wins == that.wins && name == that.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(level, name, division, position, wins);
    }
}
