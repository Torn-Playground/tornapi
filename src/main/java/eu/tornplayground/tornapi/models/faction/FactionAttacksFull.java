package eu.tornplayground.tornapi.models.faction;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.converters.EpochLocalDateTimeConverter;
import eu.tornplayground.tornapi.models.common.AttackResult;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FactionAttacksFull)) return false;
        FactionAttacksFull that = (FactionAttacksFull) o;
        return stealthed == that.stealthed && Float.compare(respect, that.respect) == 0 && Objects.equals(code, that.code) && Objects.equals(timestampStarted, that.timestampStarted) && Objects.equals(timestampEnded, that.timestampEnded) && Objects.equals(attackerId, that.attackerId) && Objects.equals(attackerFaction, that.attackerFaction) && Objects.equals(defenderId, that.defenderId) && Objects.equals(defenderFaction, that.defenderFaction) && result == that.result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, timestampStarted, timestampEnded, attackerId, attackerFaction, defenderId, defenderFaction, result, stealthed, respect);
    }
}
