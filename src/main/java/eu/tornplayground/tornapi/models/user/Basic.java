package eu.tornplayground.tornapi.models.user;

import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.user.partial.Gender;
import eu.tornplayground.tornapi.models.user.partial.Status;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Basic extends Model {

    private int level;
    private Gender gender;
    @JsonProperty("player_id")
    private long playerId;
    private String name;
    private Status status;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(long playerId) {
        this.playerId = playerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

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
