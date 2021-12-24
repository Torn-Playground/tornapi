package be.dekleinekobini.tornapi.models.user;

import be.dekleinekobini.tornapi.models.Model;
import be.dekleinekobini.tornapi.models.converters.EpochLocalDateTimeConverter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.time.LocalDateTime;
import java.util.Objects;

public class Attack extends Model {

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

    public Fighter getAttacker() {
        return attacker;
    }

    public void setAttacker(Fighter attacker) {
        this.attacker = attacker;
    }

    public Fighter getDefender() {
        return defender;
    }

    public void setDefender(Fighter defender) {
        this.defender = defender;
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
        Attack attack = (Attack) o;
        return stealthed == attack.stealthed && Double.compare(attack.respect, respect) == 0 && chain == attack.chain && raid == attack.raid && Double.compare(attack.respectGain, respectGain) == 0 && Double.compare(attack.respectLoss, respectLoss) == 0 && Objects.equals(code, attack.code) && Objects.equals(timestampStarted, attack.timestampStarted) && Objects.equals(timestampEnded, attack.timestampEnded) && Objects.equals(attacker, attack.attacker) && Objects.equals(defender, attack.defender) && result == attack.result && Objects.equals(modifiers, attack.modifiers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, timestampStarted, timestampEnded, attacker, defender, result, stealthed, respect, chain, raid, respectGain, respectLoss, modifiers);
    }

    public static class Fighter {

        @JsonProperty("id")
        private long id;
        @JsonProperty("name")
        private String name;
        @JsonProperty("faction")
        private long faction;
        @JsonProperty("factionname")
        private String factionName;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public long getFaction() {
            return faction;
        }

        public void setFaction(long faction) {
            this.faction = faction;
        }

        public String getFactionName() {
            return factionName;
        }

        public void setFactionName(String factionName) {
            this.factionName = factionName;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Fighter fighter = (Fighter) o;
            return id == fighter.id && faction == fighter.faction && Objects.equals(name, fighter.name) && Objects.equals(factionName, fighter.factionName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name, faction, factionName);
        }

    }

    public enum AttackResult {

        ATTACKED, HOSPITALIZED, MUGGED, LOST, SPECIAL, ARRESTED, ASSIST, STALEMATE
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
