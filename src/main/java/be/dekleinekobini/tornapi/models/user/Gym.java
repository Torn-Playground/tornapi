package be.dekleinekobini.tornapi.models.user;

import be.dekleinekobini.tornapi.models.Model;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Gym extends Model {

    @JsonProperty("active_gym")
    private long activeGym;

    public long getActiveGym() {
        return activeGym;
    }

    public void setActiveGym(long activeGym) {
        this.activeGym = activeGym;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gym gym = (Gym) o;
        return activeGym == gym.activeGym;
    }

    @Override
    public int hashCode() {
        return Objects.hash(activeGym);
    }
}
