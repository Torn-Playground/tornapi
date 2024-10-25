package eu.tornplayground.tornapi.models.faction;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.converters.DayDurationConverter;
import eu.tornplayground.tornapi.models.converters.EpochLocalDateTimeConverter;
import eu.tornplayground.tornapi.models.faction.basic.Member;
import eu.tornplayground.tornapi.models.faction.basic.RaidWars;
import eu.tornplayground.tornapi.models.faction.basic.Rank;
import eu.tornplayground.tornapi.models.faction.basic.TerritoryWars;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;

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
    private Rank rank;

    @JsonProperty("members")
    private Map<Integer, Member> members;

    protected FactionBasic() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTag() {
        return tag;
    }

    public String getTagImage() {
        return tagImage;
    }

    public int getLeader() {
        return leader;
    }

    public int getCoLeader() {
        return coLeader;
    }

    public int getRespect() {
        return respect;
    }

    public Duration getAge() {
        return age;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getBestChain() {
        return bestChain;
    }

    public Map<String, RankedWar> getWars() {
        return wars;
    }

    public List<TerritoryWars> getTerritoryWars() {
        return territoryWars;
    }

    public List<RaidWars> getRaidWars() {
        return raidWars;
    }

    public Map<Integer, LocalDateTime> getPeace() {
        return peace;
    }

    public Rank getRank() {
        return rank;
    }

    public Map<Integer, Member> getMembers() {
        return members;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FactionBasic)) return false;
        FactionBasic that = (FactionBasic) o;
        return id == that.id && leader == that.leader && coLeader == that.coLeader && respect == that.respect && capacity == that.capacity && bestChain == that.bestChain && Objects.equals(name, that.name) && Objects.equals(tag, that.tag) && Objects.equals(tagImage, that.tagImage) && Objects.equals(age, that.age) && Objects.equals(wars, that.wars) && Objects.equals(territoryWars, that.territoryWars) && Objects.equals(raidWars, that.raidWars) && Objects.equals(peace, that.peace) && Objects.equals(rank, that.rank) && Objects.equals(members, that.members);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, tag, tagImage, leader, coLeader, respect, age, capacity, bestChain, wars, territoryWars, raidWars, peace, rank, members);
    }
}
