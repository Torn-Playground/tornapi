package eu.tornplayground.tornapi.models.faction;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.common.AttackResult;
import eu.tornplayground.tornapi.models.converters.EpochLocalDateTimeConverter;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = false)
public class FactionAttacksFull extends Model {

    @JsonProperty("code")
    private String code;

    @JsonProperty("timestamp_started")
    @JsonDeserialize(converter = EpochLocalDateTimeConverter.class)
    private LocalDateTime timestampStarted;

    @JsonProperty("timestamp_ended")
    @JsonDeserialize(converter = EpochLocalDateTimeConverter.class)
    private LocalDateTime timestampEnded;

    @JsonProperty("attacker_id")
    private Integer attackerId;

    @JsonProperty("attacker_faction")
    private Integer attackerFaction;

    @JsonProperty("defender_id")
    private Integer defenderId;

    @JsonProperty("defender_faction")
    private Integer defenderFaction;

    @JsonProperty("result")
    private AttackResult result;

    @JsonProperty("stealthed")
    private boolean stealthed;

    @JsonProperty("respect")
    private float respect;

}
