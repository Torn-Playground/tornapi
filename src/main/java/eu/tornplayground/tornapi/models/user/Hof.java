package eu.tornplayground.tornapi.models.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.Model;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Getter
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
public class Hof extends Model {

    public static final String ATTACKS = "attacks";
    public static final String BATTLE_STATS = "battlestats";
    public static final String BUSTS = "busts";
    public static final String DEFENDS = "defends";
    public static final String NETWORTH = "networth";
    public static final String OFFENCES = "offences";
    public static final String REVIVES = "revives";
    public static final String TRAVELED = "traveled";
    public static final String WORK_STATS = "workstats";
    public static final String LEVEL = "level";
    public static final String RANK = "rank";
    public static final String RESPECT = "respect";

    @JsonProperty("value")
    private long value;

    @JsonProperty("rank")
    private long rank;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hof)) return false;
        Hof hof = (Hof) o;
        return value == hof.value && rank == hof.rank;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, rank);
    }
}
