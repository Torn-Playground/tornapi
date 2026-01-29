package eu.tornplayground.tornapi.models.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.common.LastAction;
import eu.tornplayground.tornapi.models.converters.EpochLocalDateTimeConverter;
import eu.tornplayground.tornapi.models.user.revive.ReviveResult;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import tools.jackson.databind.annotation.JsonDeserialize;

import java.time.LocalDateTime;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = false)
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

}
