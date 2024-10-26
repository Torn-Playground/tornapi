package eu.tornplayground.tornapi.models.user;

import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.common.LastAction;
import eu.tornplayground.tornapi.models.converters.EpochLocalDateTimeConverter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import eu.tornplayground.tornapi.models.user.revive.ReviveResult;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
public class Revive extends Model {

    @JsonProperty("timestamp")
    @JsonDeserialize(converter = EpochLocalDateTimeConverter.class)
    private LocalDateTime timestamp;

    @JsonProperty("result")
    private ReviveResult result;

    @JsonProperty("chance")
    private double chance;

    @JsonProperty("reviver_id")
    private long reviverId;

    @JsonProperty("reviver_name")
    private String reviverName;

    @JsonProperty("reviver_faction")
    private long reviverFaction;

    @JsonProperty("reviver_factionname")
    private String reviverFactionName;

    @JsonProperty("target_id")
    private long targetId;

    @JsonProperty("target_name")
    private String targetName;

    @JsonProperty("target_faction")
    private long targetFaction;

    @JsonProperty("target_factionname")
    private String targetFactionName;

    @JsonProperty("target_hospital_reason")
    private String targetHospitalReason;

    @JsonProperty("target_early_discharge")
    private boolean targetEarlyDischarge;

    @JsonProperty("target_last_action")
    private LastAction targetLastAction;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Revive revives = (Revive) o;
        return Double.compare(revives.chance, chance) == 0 && reviverId == revives.reviverId && reviverFaction == revives.reviverFaction && targetId == revives.targetId && targetFaction == revives.targetFaction && targetEarlyDischarge == revives.targetEarlyDischarge && timestamp.equals(revives.timestamp) && result.equals(revives.result) && Objects.equals(reviverName, revives.reviverName) && Objects.equals(reviverFactionName, revives.reviverFactionName) && Objects.equals(targetName, revives.targetName) && Objects.equals(targetFactionName, revives.targetFactionName) && targetHospitalReason.equals(revives.targetHospitalReason) && targetLastAction.equals(revives.targetLastAction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestamp, result, chance, reviverId, reviverName, reviverFaction, reviverFactionName, targetId, targetName, targetFaction, targetFactionName, targetHospitalReason, targetEarlyDischarge, targetLastAction);
    }
}
