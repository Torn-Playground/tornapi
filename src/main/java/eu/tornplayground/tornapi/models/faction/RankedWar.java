package eu.tornplayground.tornapi.models.faction;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.faction.rankedwar.Faction;
import eu.tornplayground.tornapi.models.faction.rankedwar.War;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Map;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = false)
public class RankedWar extends Model {

    @JsonProperty("factions")
    private Map<Integer, Faction> factions;

    @JsonProperty("war")
    private War war;

}
