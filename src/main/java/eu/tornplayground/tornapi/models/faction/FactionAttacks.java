package eu.tornplayground.tornapi.models.faction;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.converters.EpochLocalDateTimeConverter;
import eu.tornplayground.tornapi.models.faction.attacks.Modifiers;

import java.time.LocalDateTime;
import java.util.Objects;

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
    private String result;

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

    protected FactionAttacks() {
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

    public String getAttackerName() {
        return attackerName;
    }

    public Integer getAttackerFaction() {
        return attackerFaction;
    }

    public String getAttackerFactionName() {
        return attackerFactionName;
    }

    public Integer getDefenderId() {
        return defenderId;
    }

    public String getDefenderName() {
        return defenderName;
    }

    public Integer getDefenderFaction() {
        return defenderFaction;
    }

    public String getDefenderFactionName() {
        return defenderFactionName;
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

    public int getChain() {
        return chain;
    }

    public boolean isRaid() {
        return raid;
    }

    public boolean isRankedWar() {
        return rankedWar;
    }

    public float getRespectGain() {
        return respectGain;
    }

    public float getRespectLoss() {
        return respectLoss;
    }

    public Modifiers getModifiers() {
        return modifiers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FactionAttacks)) return false;
        FactionAttacks that = (FactionAttacks) o;
        return stealthed == that.stealthed && Float.compare(respect, that.respect) == 0 && chain == that.chain && raid == that.raid && rankedWar == that.rankedWar && Float.compare(respectGain, that.respectGain) == 0 && Float.compare(respectLoss, that.respectLoss) == 0 && Objects.equals(code, that.code) && Objects.equals(timestampStarted, that.timestampStarted) && Objects.equals(timestampEnded, that.timestampEnded) && Objects.equals(attackerId, that.attackerId) && Objects.equals(attackerName, that.attackerName) && Objects.equals(attackerFaction, that.attackerFaction) && Objects.equals(attackerFactionName, that.attackerFactionName) && Objects.equals(defenderId, that.defenderId) && Objects.equals(defenderName, that.defenderName) && Objects.equals(defenderFaction, that.defenderFaction) && Objects.equals(defenderFactionName, that.defenderFactionName) && Objects.equals(result, that.result) && Objects.equals(modifiers, that.modifiers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, timestampStarted, timestampEnded, attackerId, attackerName, attackerFaction, attackerFactionName, defenderId, defenderName, defenderFaction, defenderFactionName, result, stealthed, respect, chain, raid, rankedWar, respectGain, respectLoss, modifiers);
    }
}
