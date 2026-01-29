package eu.tornplayground.tornapi.models.faction.basic;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.converters.DayDurationConverter;
import eu.tornplayground.tornapi.models.faction.basic.member.LastAction;
import eu.tornplayground.tornapi.models.faction.basic.member.Status;
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
public class Member extends Model {

    @JsonProperty("name")
    private String name;

    @JsonProperty("level")
    private short level;

    @JsonProperty("days_in_faction")
    @JsonDeserialize(converter = DayDurationConverter.class)
    private Duration daysInFaction;

    @JsonProperty("last_action")
    private LastAction lastAction;

    @JsonProperty("status")
    private Status status;

    @JsonProperty("position")
    private String position;

}
