package eu.tornplayground.tornapi.models.faction;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.common.AttackResult;
import eu.tornplayground.tornapi.models.converters.EpochLocalDateTimeConverter;
import eu.tornplayground.tornapi.models.faction.attacks.Modifiers;
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
public class FactionAttacks extends Model {

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

    @JsonProperty("attacker_name")
    private String attackerName;

    @JsonProperty("attacker_faction")
    private Integer attackerFaction;

    @JsonProperty("attacker_factionname")
    private String attackerFactionName;

    @JsonProperty("defender_id")
    private Integer defenderId;

    @JsonProperty("defender_name")
    private String defenderName;

    @JsonProperty("defender_faction")
    private Integer defenderFaction;

    @JsonProperty("defender_factionname")
    private String defenderFactionName;

    @JsonProperty("result")
    private AttackResult result;

    @JsonProperty("stealthed")
    private boolean stealthed;

    @JsonProperty("respect")
    private float respect;

    @JsonProperty("chain")
    private int chain;

    @JsonProperty("raid")
    private boolean raid;

    @JsonProperty("ranked_war")
    private boolean rankedWar;

    @JsonProperty("respect_gain")
    private float respectGain;

    @JsonProperty("respect_loss")
    private float respectLoss;

    @JsonProperty("modifiers")
    private Modifiers modifiers;

}
