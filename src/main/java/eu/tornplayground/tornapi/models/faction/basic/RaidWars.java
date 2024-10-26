package eu.tornplayground.tornapi.models.faction.basic;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.converters.EpochLocalDateTimeConverter;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
public class RaidWars extends Model {
    @JsonProperty("raiding_faction")
    private int raidingFaction;

    @JsonProperty("defending_faction")
    private int defendingFaction;

    @JsonProperty("raider_score")
    private float raiderScore;

    @JsonProperty("defender_score")
    private int defenderScore;

    @JsonProperty("start_time")
    @JsonDeserialize(converter = EpochLocalDateTimeConverter.class)
    private LocalDateTime startTime;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RaidWars)) return false;
        RaidWars raidWars = (RaidWars) o;
        return raidingFaction == raidWars.raidingFaction && defendingFaction == raidWars.defendingFaction && Float.compare(raiderScore, raidWars.raiderScore) == 0 && defenderScore == raidWars.defenderScore && Objects.equals(startTime, raidWars.startTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(raidingFaction, defendingFaction, raiderScore, defenderScore, startTime);
    }
}
