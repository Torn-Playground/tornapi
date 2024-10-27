package eu.tornplayground.tornapi.models.user;

import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.converters.EpochLocalDateTimeConverter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import eu.tornplayground.tornapi.models.user.attacks.AttackResult;
import eu.tornplayground.tornapi.models.user.attacks.Fighter;
import eu.tornplayground.tornapi.models.user.attacks.Modifiers;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Attack)) return false;
        Attack attack = (Attack) o;
        return stealthed == attack.stealthed && Double.compare(respect, attack.respect) == 0 && chain == attack.chain && raid == attack.raid && Double.compare(respectGain, attack.respectGain) == 0 && Double.compare(respectLoss, attack.respectLoss) == 0 && Objects.equals(code, attack.code) && Objects.equals(timestampStarted, attack.timestampStarted) && Objects.equals(timestampEnded, attack.timestampEnded) && Objects.equals(attacker, attack.attacker) && Objects.equals(defender, attack.defender) && result == attack.result && Objects.equals(modifiers, attack.modifiers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, timestampStarted, timestampEnded, attacker, defender, result, stealthed, respect, chain, raid, respectGain, respectLoss, modifiers);
    }

}
