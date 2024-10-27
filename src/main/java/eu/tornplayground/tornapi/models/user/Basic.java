package eu.tornplayground.tornapi.models.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.user.partial.Gender;
import eu.tornplayground.tornapi.models.user.partial.Status;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = false)
public class Basic extends Model {

    @JsonProperty("level")
    private int level;

    @JsonProperty("gender")
    private Gender gender;

    @JsonProperty("player_id")
    private long playerId;

    @JsonProperty("name")
    private String name;

    @JsonProperty("status")
    private Status status;

}
