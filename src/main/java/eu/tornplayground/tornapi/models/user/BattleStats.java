package eu.tornplayground.tornapi.models.user;

import eu.tornplayground.tornapi.models.Model;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

public class BattleStats extends Model {

    private long strength;
    private long speed;
    private long dexterity;
    private long defense;
    private long total;
    @JsonProperty("strength_modifier")
    private int strengthModifier;
    @JsonProperty("defense_modifier")
    private int defenseModifier;
    @JsonProperty("speed_modifier")
    private int speedModifier;
    @JsonProperty("dexterity_modifier")
    private int dexterityModifier;
    @JsonProperty("strength_info")
    private List<String> strengthInfo;
    @JsonProperty("defense_info")
    private List<String> defenseInfo;
    @JsonProperty("speed_info")
    private List<String> speedInfo;
    @JsonProperty("dexterity_info")
    private List<String> dexterityInfo;

    public long getStrength() {
        return strength;
    }

    public void setStrength(long strength) {
        this.strength = strength;
    }

    public long getSpeed() {
        return speed;
    }

    public void setSpeed(long speed) {
        this.speed = speed;
    }

    public long getDexterity() {
        return dexterity;
    }

    public void setDexterity(long dexterity) {
        this.dexterity = dexterity;
    }

    public long getDefense() {
        return defense;
    }

    public void setDefense(long defense) {
        this.defense = defense;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public int getStrengthModifier() {
        return strengthModifier;
    }

    public void setStrengthModifier(int strengthModifier) {
        this.strengthModifier = strengthModifier;
    }

    public int getDefenseModifier() {
        return defenseModifier;
    }

    public void setDefenseModifier(int defenseModifier) {
        this.defenseModifier = defenseModifier;
    }

    public int getSpeedModifier() {
        return speedModifier;
    }

    public void setSpeedModifier(int speedModifier) {
        this.speedModifier = speedModifier;
    }

    public int getDexterityModifier() {
        return dexterityModifier;
    }

    public void setDexterityModifier(int dexterityModifier) {
        this.dexterityModifier = dexterityModifier;
    }

    public List<String> getStrengthInfo() {
        return strengthInfo;
    }

    public void setStrengthInfo(List<String> strengthInfo) {
        this.strengthInfo = strengthInfo;
    }

    public List<String> getDefenseInfo() {
        return defenseInfo;
    }

    public void setDefenseInfo(List<String> defenseInfo) {
        this.defenseInfo = defenseInfo;
    }

    public List<String> getSpeedInfo() {
        return speedInfo;
    }

    public void setSpeedInfo(List<String> speedInfo) {
        this.speedInfo = speedInfo;
    }

    public List<String> getDexterityInfo() {
        return dexterityInfo;
    }

    public void setDexterityInfo(List<String> dexterityInfo) {
        this.dexterityInfo = dexterityInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BattleStats that = (BattleStats) o;
        return strength == that.strength && speed == that.speed && dexterity == that.dexterity && defense == that.defense && total == that.total && strengthModifier == that.strengthModifier && defenseModifier == that.defenseModifier && speedModifier == that.speedModifier && dexterityModifier == that.dexterityModifier && Objects.equals(strengthInfo, that.strengthInfo) && Objects.equals(defenseInfo, that.defenseInfo) && Objects.equals(speedInfo, that.speedInfo) && Objects.equals(dexterityInfo, that.dexterityInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(strength, speed, dexterity, defense, total, strengthModifier, defenseModifier, speedModifier, dexterityModifier, strengthInfo, defenseInfo, speedInfo, dexterityInfo);
    }

}
