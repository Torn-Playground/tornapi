package eu.tornplayground.tornapi.models.faction;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.converters.EpochLocalDateTimeConverter;

import java.time.LocalDateTime;
import java.util.Objects;

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
    private String result;

    @JsonProperty("stealthed")
    private boolean stealthed;

    @JsonProperty("respect")
    private float respect;

    protected FactionAttacksFull() {
    }

    public String getCode() {
        return code;
    }

    public LocalDateTime getTimestampStarted() {
        return timestampStarted;
    }

    public LocalDateTime getTimestampEnded() {
        return timestampEnded;
    }

    public Integer getAttackerId() {
        return attackerId;
    }

    public Integer getAttackerFaction() {
        return attackerFaction;
    }

    public Integer getDefenderId() {
        return defenderId;
    }

    public Integer getDefenderFaction() {
        return defenderFaction;
    }

    public String getResult() {
        return result;
    }

    public boolean isStealthed() {
        return stealthed;
    }

    public float getRespect() {
        return respect;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FactionAttacksFull)) return false;
        FactionAttacksFull that = (FactionAttacksFull) o;
        return stealthed == that.stealthed && Float.compare(respect, that.respect) == 0 && Objects.equals(code, that.code) && Objects.equals(timestampStarted, that.timestampStarted) && Objects.equals(timestampEnded, that.timestampEnded) && Objects.equals(attackerId, that.attackerId) && Objects.equals(attackerFaction, that.attackerFaction) && Objects.equals(defenderId, that.defenderId) && Objects.equals(defenderFaction, that.defenderFaction) && Objects.equals(result, that.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, timestampStarted, timestampEnded, attackerId, attackerFaction, defenderId, defenderFaction, result, stealthed, respect);
    }
}
