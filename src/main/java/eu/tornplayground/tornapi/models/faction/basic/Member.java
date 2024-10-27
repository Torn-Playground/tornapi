package eu.tornplayground.tornapi.models.faction.basic;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.converters.DayDurationConverter;
import eu.tornplayground.tornapi.models.faction.basic.member.LastAction;
import eu.tornplayground.tornapi.models.faction.basic.member.Status;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.Duration;
import java.util.Objects;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Member)) return false;
        Member member = (Member) o;
        return level == member.level && Objects.equals(name, member.name) && Objects.equals(daysInFaction, member.daysInFaction) && Objects.equals(lastAction, member.lastAction) && Objects.equals(status, member.status) && Objects.equals(position, member.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, level, daysInFaction, lastAction, status, position);
    }
}
