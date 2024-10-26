package eu.tornplayground.tornapi.models.user;

import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.user.partial.Gender;
import eu.tornplayground.tornapi.models.user.partial.Status;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Getter
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basic basic = (Basic) o;
        return level == basic.level && playerId == basic.playerId && gender == basic.gender && Objects.equals(name, basic.name) && Objects.equals(status, basic.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(level, gender, playerId, name, status);
    }

}
