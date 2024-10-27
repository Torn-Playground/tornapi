package eu.tornplayground.tornapi.models.user;

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
public class Skills extends Model {

    @JsonProperty("reviving")
    private double reviving;

    @JsonProperty("hunting")
    private double hunting;

    @JsonProperty("racing")
    private double racing;

    @JsonProperty("player_id")
    private long playerId;

}
