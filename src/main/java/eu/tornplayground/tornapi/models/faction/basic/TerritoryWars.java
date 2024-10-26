package eu.tornplayground.tornapi.models.faction.basic;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.converters.EpochLocalDateTimeConverter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class TerritoryWars extends Model {
    @JsonProperty("territory_war_id")
    private int territoryWarId;

    @JsonProperty("territory")
    private String territory;

    @JsonProperty("assaulting_faction")
    private int assaultingFaction;

    @JsonProperty("defending_faction")
    private int defendingFaction;

    @JsonProperty("score")
    private int score;

    @JsonProperty("required_score")
    private int requiredScore;

    @JsonProperty("start_time")
    @JsonDeserialize(converter = EpochLocalDateTimeConverter.class)
    private LocalDateTime startTime;

    @JsonProperty("end_time")
    @JsonDeserialize(converter = EpochLocalDateTimeConverter.class)
    private LocalDateTime endTime;

    @JsonProperty("assaulters")
    private List<Integer> assaulters;

    @JsonProperty("defenders")
    private List<Integer> defenders;

    protected TerritoryWars() {
    }

    public int getTerritoryWarId() {
        return territoryWarId;
    }

    public String getTerritory() {
        return territory;
    }

    public int getAssaultingFaction() {
        return assaultingFaction;
    }

    public int getDefendingFaction() {
        return defendingFaction;
    }

    public int getScore() {
        return score;
    }

    public int getRequiredScore() {
        return requiredScore;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public List<Integer> getAssaulters() {
        return assaulters;
    }

    public List<Integer> getDefenders() {
        return defenders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TerritoryWars)) return false;
        TerritoryWars that = (TerritoryWars) o;
        return territoryWarId == that.territoryWarId && assaultingFaction == that.assaultingFaction && defendingFaction == that.defendingFaction && score == that.score && requiredScore == that.requiredScore && Objects.equals(territory, that.territory) && Objects.equals(startTime, that.startTime) && Objects.equals(endTime, that.endTime) && Objects.equals(assaulters, that.assaulters) && Objects.equals(defenders, that.defenders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(territoryWarId, territory, assaultingFaction, defendingFaction, score, requiredScore, startTime, endTime, assaulters, defenders);
    }
}
