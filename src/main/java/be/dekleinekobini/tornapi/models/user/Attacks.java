package be.dekleinekobini.tornapi.models.user;

import be.dekleinekobini.tornapi.models.Model;
import be.dekleinekobini.tornapi.models.converters.EpochLocalDateTimeConverter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.Objects;

public class Attacks extends Model {

    private String code;
    @JsonProperty("timestamp_started")
    @JsonDeserialize(converter = EpochLocalDateTimeConverter.class)
    private LocalDateTime timestampStarted;
    @JsonProperty("timestamp_ended")
    @JsonDeserialize(converter = EpochLocalDateTimeConverter.class)
    private LocalDateTime timestampEnded;
    @JsonProperty("attacker_id")
    private long attackerId;
    @JsonProperty("attacker_name")
    private String attackerName;
    @JsonProperty("attacker_faction")
    private long attackerFaction;
    @JsonProperty("attacker_factionname")
    private String attackerFactionName;
    @JsonProperty("defender_id")
    private long defenderId;
    @JsonProperty("defender_name")
    private String defenderName;
    @JsonProperty("defender_faction")
    private long defenderFaction;
    @JsonProperty("defender_factionname")
    private String defenderFactionName;
    private AttackResult result;
    private boolean stealthed;
    private double respect;
    private long chain;
    private boolean raid;
    @JsonProperty("respect_gain")
    private double respectGain;
    @JsonProperty("respect_loss")
    private double respectLoss;
    private Modifiers modifiers;

    public static Map<Long, Attacks> of(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("attacks"), new TypeReference<>() {
        });
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LocalDateTime getTimestampStarted() {
        return timestampStarted;
    }

    public void setTimestampStarted(LocalDateTime timestampStarted) {
        this.timestampStarted = timestampStarted;
    }

    public LocalDateTime getTimestampEnded() {
        return timestampEnded;
    }

    public void setTimestampEnded(LocalDateTime timestampEnded) {
        this.timestampEnded = timestampEnded;
    }

    public long getAttackerId() {
        return attackerId;
    }

    public void setAttackerId(long attackerId) {
        this.attackerId = attackerId;
    }

    public String getAttackerName() {
        return attackerName;
    }

    public void setAttackerName(String attackerName) {
        this.attackerName = attackerName;
    }

    public long getAttackerFaction() {
        return attackerFaction;
    }

    public void setAttackerFaction(long attackerFaction) {
        this.attackerFaction = attackerFaction;
    }

    public String getAttackerFactionName() {
        return attackerFactionName;
    }

    public void setAttackerFactionName(String attackerFactionName) {
        this.attackerFactionName = attackerFactionName;
    }

    public long getDefenderId() {
        return defenderId;
    }

    public void setDefenderId(long defenderId) {
        this.defenderId = defenderId;
    }

    public String getDefenderName() {
        return defenderName;
    }

    public void setDefenderName(String defenderName) {
        this.defenderName = defenderName;
    }

    public long getDefenderFaction() {
        return defenderFaction;
    }

    public void setDefenderFaction(long defenderFaction) {
        this.defenderFaction = defenderFaction;
    }

    public String getDefenderFactionName() {
        return defenderFactionName;
    }

    public void setDefenderFactionName(String defenderFactionName) {
        this.defenderFactionName = defenderFactionName;
    }

    public AttackResult getResult() {
        return result;
    }

    public void setResult(AttackResult result) {
        this.result = result;
    }

    public boolean isStealthed() {
        return stealthed;
    }

    public void setStealthed(boolean stealthed) {
        this.stealthed = stealthed;
    }

    public double getRespect() {
        return respect;
    }

    public void setRespect(double respect) {
        this.respect = respect;
    }

    public long getChain() {
        return chain;
    }

    public void setChain(long chain) {
        this.chain = chain;
    }

    public boolean isRaid() {
        return raid;
    }

    public void setRaid(boolean raid) {
        this.raid = raid;
    }

    public double getRespectGain() {
        return respectGain;
    }

    public void setRespectGain(double respectGain) {
        this.respectGain = respectGain;
    }

    public double getRespectLoss() {
        return respectLoss;
    }

    public void setRespectLoss(double respectLoss) {
        this.respectLoss = respectLoss;
    }

    public Modifiers getModifiers() {
        return modifiers;
    }

    public void setModifiers(Modifiers modifiers) {
        this.modifiers = modifiers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Attacks attacks = (Attacks) o;
        return attackerId == attacks.attackerId && attackerFaction == attacks.attackerFaction && defenderId == attacks.defenderId && defenderFaction == attacks.defenderFaction && stealthed == attacks.stealthed && Double.compare(attacks.respect, respect) == 0 && chain == attacks.chain && raid == attacks.raid && Double.compare(attacks.respectGain, respectGain) == 0 && Double.compare(attacks.respectLoss, respectLoss) == 0 && code.equals(attacks.code) && timestampStarted.equals(attacks.timestampStarted) && timestampEnded.equals(attacks.timestampEnded) && Objects.equals(attackerName, attacks.attackerName) && Objects.equals(attackerFactionName, attacks.attackerFactionName) && Objects.equals(defenderName, attacks.defenderName) && Objects.equals(defenderFactionName, attacks.defenderFactionName) && result == attacks.result && Objects.equals(modifiers, attacks.modifiers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, timestampStarted, timestampEnded, attackerId, attackerName, attackerFaction, attackerFactionName, defenderId, defenderName, defenderFaction, defenderFactionName, result, stealthed, respect, chain, raid, respectGain, respectLoss, modifiers);
    }

    public enum AttackResult {

        Attacked, Hospitalized, Mugged, Lost, Special, Arrested, Assist, Stalemate
        // TODO - Verify 'Arrested'.

    }

    public static class Modifiers {

        @JsonProperty("fair_fight")
        private double fairFight;
        private double war;
        private double retaliation;
        @JsonProperty("group_attack")
        private double groupAttack;
        private double overseas;
        @JsonProperty("chain_bonus")
        private double chainBonus;

        public double getFairFight() {
            return fairFight;
        }

        public void setFairFight(double fairFight) {
            this.fairFight = fairFight;
        }

        public double getWar() {
            return war;
        }

        public void setWar(double war) {
            this.war = war;
        }

        public double getRetaliation() {
            return retaliation;
        }

        public void setRetaliation(double retaliation) {
            this.retaliation = retaliation;
        }

        public double getGroupAttack() {
            return groupAttack;
        }

        public void setGroupAttack(double groupAttack) {
            this.groupAttack = groupAttack;
        }

        public double getOverseas() {
            return overseas;
        }

        public void setOverseas(double overseas) {
            this.overseas = overseas;
        }

        public double getChainBonus() {
            return chainBonus;
        }

        public void setChainBonus(double chainBonus) {
            this.chainBonus = chainBonus;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Modifiers modifiers = (Modifiers) o;
            return Double.compare(modifiers.fairFight, fairFight) == 0 && Double.compare(modifiers.war, war) == 0 && Double.compare(modifiers.retaliation, retaliation) == 0 && Double.compare(modifiers.groupAttack, groupAttack) == 0 && Double.compare(modifiers.overseas, overseas) == 0 && Double.compare(modifiers.chainBonus, chainBonus) == 0;
        }

        @Override
        public int hashCode() {
            return Objects.hash(fairFight, war, retaliation, groupAttack, overseas, chainBonus);
        }

    }

}
