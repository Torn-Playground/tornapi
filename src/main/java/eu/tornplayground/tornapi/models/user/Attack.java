package eu.tornplayground.tornapi.models.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.converters.EpochLocalDateTimeConverter;
import eu.tornplayground.tornapi.models.user.attacks.AttackResult;
import eu.tornplayground.tornapi.models.user.attacks.Fighter;
import eu.tornplayground.tornapi.models.user.attacks.Modifiers;
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
public class Attack extends Model {

    @JsonProperty("code")
    private String code;

    @JsonProperty("timestamp_started")
    @JsonDeserialize(converter = EpochLocalDateTimeConverter.class)
    private LocalDateTime timestampStarted;

    @JsonProperty("timestamp_ended")
    @JsonDeserialize(converter = EpochLocalDateTimeConverter.class)
    private LocalDateTime timestampEnded;

    @JsonUnwrapped(prefix = "attacker_")
    private Fighter attacker;

    @JsonUnwrapped(prefix = "defender_")
    private Fighter defender;

    @JsonProperty("result")
    private AttackResult result;

    @JsonProperty("stealthed")
    private boolean stealthed;

    @JsonProperty("respect")
    private double respect;

    @JsonProperty("chain")
    private long chain;

    @JsonProperty("raid")
    private boolean raid;

    @JsonProperty("respect_gain")
    private double respectGain;

    @JsonProperty("respect_loss")
    private double respectLoss;

    @JsonProperty("modifiers")
    private Modifiers modifiers;

}
