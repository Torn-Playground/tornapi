package eu.tornplayground.tornapi.models.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.converters.StatInfoConverter;
import eu.tornplayground.tornapi.models.user.battlestats.statinfo.StatInfo;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = false)
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

}
