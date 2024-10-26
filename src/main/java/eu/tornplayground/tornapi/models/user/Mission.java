package eu.tornplayground.tornapi.models.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.user.mission.MissionStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Getter
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
public class Mission extends Model {

    @JsonProperty("title")
    private String title;

    @JsonProperty("status")
    private MissionStatus status;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mission)) return false;
        Mission mission = (Mission) o;
        return Objects.equals(title, mission.title) && status == mission.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, status);
    }
}
