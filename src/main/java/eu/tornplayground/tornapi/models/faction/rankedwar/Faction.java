package eu.tornplayground.tornapi.models.faction.rankedwar;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.Model;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = false)
public class Faction extends Model {

    @JsonProperty("name")
    private String name;

    @JsonProperty("score")
    private int score;

    @JsonProperty("chain")
    private int chain;

}
