package eu.tornplayground.tornapi.models.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.user.mission.MissionStatus;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Objects;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
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
