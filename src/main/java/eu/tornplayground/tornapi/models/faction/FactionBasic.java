package eu.tornplayground.tornapi.models.faction;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.converters.DayDurationConverter;
import eu.tornplayground.tornapi.models.converters.EpochLocalDateTimeConverter;
import eu.tornplayground.tornapi.models.faction.basic.FactionRank;
import eu.tornplayground.tornapi.models.faction.basic.Member;
import eu.tornplayground.tornapi.models.faction.basic.RaidWars;
import eu.tornplayground.tornapi.models.faction.basic.TerritoryWars;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = false)
public class FactionBasic extends Model {

    @JsonProperty("ID")
    private int id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("tag")
    private String tag;

    @JsonProperty("tag_image")
    private String tagImage;

    @JsonProperty("leader")
    private int leader;

    @JsonProperty("co-leader")
    private int coLeader;

    @JsonProperty("respect")
    private int respect;

    @JsonProperty("age")
    @JsonDeserialize(converter = DayDurationConverter.class)
    private Duration age;

    @JsonProperty("capacity")
    private int capacity;

    @JsonProperty("best_chain")
    private int bestChain;

    @JsonProperty("ranked_wars")
    private Map<String, RankedWar> wars;

    @JsonProperty("territory_wars")
    private List<TerritoryWars> territoryWars;

    @JsonProperty("raid_wars")
    private List<RaidWars> raidWars;

    @JsonProperty("peace")
    @JsonDeserialize(contentAs = LocalDateTime.class, contentConverter = EpochLocalDateTimeConverter.class)
    private Map<Integer, LocalDateTime> peace;

    @JsonProperty("rank")
    private FactionRank rank;

    @JsonProperty("members")
    private Map<Integer, Member> members;

}
