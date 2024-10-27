package eu.tornplayground.tornapi.models.faction.basic;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.faction.basic.rank.Rank;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = false)
public class FactionRank extends Model {

    @JsonProperty("level")
    private int level;

    @JsonProperty("name")
    private Rank name;

    @JsonProperty("division")
    private int division;

    @JsonProperty("position")
    private int position;

    @JsonProperty("wins")
    private int wins;

}
