package eu.tornplayground.tornapi.models.user.profile;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.converters.DayDurationConverter;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import tools.jackson.databind.annotation.JsonDeserialize;

import java.time.Duration;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = false)
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

}
