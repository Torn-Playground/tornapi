package eu.tornplayground.tornapi.models.faction.basic;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.converters.EpochLocalDateTimeConverter;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import tools.jackson.databind.annotation.JsonDeserialize;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = false)
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

}
