package eu.tornplayground.tornapi.models.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.Model;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = false)
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

}
