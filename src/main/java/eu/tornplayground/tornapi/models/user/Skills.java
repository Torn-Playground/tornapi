package eu.tornplayground.tornapi.models.user;

import eu.tornplayground.tornapi.models.Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Objects;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Skills extends Model {

    @JsonProperty("reviving")
    private double reviving;

    @JsonProperty("hunting")
    private double hunting;

    @JsonProperty("racing")
    private double racing;

    @JsonProperty("player_id")
    private long playerId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Skills skills = (Skills) o;
        return Double.compare(skills.reviving, reviving) == 0 && Double.compare(skills.hunting, hunting) == 0 && Double.compare(skills.racing, racing) == 0 && playerId == skills.playerId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(reviving, hunting, racing, playerId);
    }

}
