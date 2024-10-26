package eu.tornplayground.tornapi.models.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.converters.EpochLocalDateTimeConverter;
import eu.tornplayground.tornapi.models.user.attacks.AttackResult;
import eu.tornplayground.tornapi.models.user.attacks.Fighter;
import eu.tornplayground.tornapi.models.user.attacks.Modifiers;
import eu.tornplayground.tornapi.models.user.attacksfull.FighterFull;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
public class AttackFull extends Model {

    @JsonProperty("code")
    private String code;

    @JsonProperty("timestamp_started")
    @JsonDeserialize(converter = EpochLocalDateTimeConverter.class)
    private LocalDateTime timestampStarted;

    @JsonProperty("timestamp_ended")
    @JsonDeserialize(converter = EpochLocalDateTimeConverter.class)
    private LocalDateTime timestampEnded;

    @JsonUnwrapped(prefix = "attacker_")
    private FighterFull attacker;

    @JsonUnwrapped(prefix = "defender_")
    private FighterFull defender;

    @JsonProperty("result")
    private AttackResult result;

    @JsonProperty("stealthed")
    private boolean stealthed;

    @JsonProperty("respect")
    private double respect;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AttackFull)) return false;
        AttackFull that = (AttackFull) o;
        return stealthed == that.stealthed && Double.compare(respect, that.respect) == 0 && Objects.equals(code, that.code) && Objects.equals(timestampStarted, that.timestampStarted) && Objects.equals(timestampEnded, that.timestampEnded) && Objects.equals(attacker, that.attacker) && Objects.equals(defender, that.defender) && result == that.result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, timestampStarted, timestampEnded, attacker, defender, result, stealthed, respect);
    }
}
