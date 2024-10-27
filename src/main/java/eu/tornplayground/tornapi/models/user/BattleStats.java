package eu.tornplayground.tornapi.models.user;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import eu.tornplayground.tornapi.models.Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.converters.StatInfoConverter;
import eu.tornplayground.tornapi.models.user.battlestats.StatInfoType;
import eu.tornplayground.tornapi.models.user.battlestats.statinfo.BattleStat;
import eu.tornplayground.tornapi.models.user.battlestats.statinfo.StatInfo;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;
import java.util.Objects;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BattleStats extends Model {

    @JsonProperty("strength")
    private long strength;

    @JsonProperty("speed")
    private long speed;

    @JsonProperty("dexterity")
    private long dexterity;

    @JsonProperty("defense")
    private long defense;

    @JsonProperty("total")
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
    @JsonDeserialize(contentConverter = StatInfoConverter.class)
    private List<StatInfo> strengthInfo;

    @JsonProperty("defense_info")
    @JsonDeserialize(contentConverter = StatInfoConverter.class)
    private List<StatInfo> defenseInfo;

    @JsonProperty("speed_info")
    @JsonDeserialize(contentConverter = StatInfoConverter.class)
    private List<StatInfo> speedInfo;

    @JsonProperty("dexterity_info")
    @JsonDeserialize(contentConverter = StatInfoConverter.class)
    private List<StatInfo> dexterityInfo;

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
