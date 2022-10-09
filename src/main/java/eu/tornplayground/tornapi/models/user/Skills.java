package eu.tornplayground.tornapi.models.user;

import eu.tornplayground.tornapi.models.Model;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Skills extends Model {

    private double reviving;
    private double hunting;
    private double racing;
    @JsonProperty("player_id")
    private long playerId;

    public double getReviving() {
        return reviving;
    }

    public void setReviving(double reviving) {
        this.reviving = reviving;
    }

    public double getHunting() {
        return hunting;
    }

    public void setHunting(double hunting) {
        this.hunting = hunting;
    }

    public double getRacing() {
        return racing;
    }

    public void setRacing(double racing) {
        this.racing = racing;
    }

    public long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(long playerId) {
        this.playerId = playerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Skills skills = (Skills) o;
        return Double.compare(skills.reviving, reviving) == 0 && Double.compare(skills.hunting, hunting) == 0 && Double.compare(skills.racing, racing) == 0 && playerId == skills.playerId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(reviving, hunting, racing, playerId);
    }

}
