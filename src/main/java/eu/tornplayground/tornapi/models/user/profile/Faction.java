package eu.tornplayground.tornapi.models.user.profile;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.converters.DayDurationConverter;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.Duration;
import java.util.Objects;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Faction extends Model {

    @JsonProperty("position")
    private String position;

    @JsonProperty("faction_id")
    private long factionId;

    @JsonProperty("days_in_faction")
    @JsonDeserialize(converter = DayDurationConverter.class)
    private Duration daysInFaction;

    @JsonProperty("faction_name")
    private String factionName;

    @JsonProperty("faction_tag")
    private String factionTag;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Faction)) return false;
        Faction faction = (Faction) o;
        return factionId == faction.factionId && Objects.equals(position, faction.position) && Objects.equals(daysInFaction, faction.daysInFaction) && Objects.equals(factionName, faction.factionName) && Objects.equals(factionTag, faction.factionTag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, factionId, daysInFaction, factionName, factionTag);
    }
}
