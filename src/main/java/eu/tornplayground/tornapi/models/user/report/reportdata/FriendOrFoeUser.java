package eu.tornplayground.tornapi.models.user.report.reportdata;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.Model;

import java.util.Objects;

public class FriendOrFoeUser extends Model {

    @JsonProperty("name")
    private String name;

    @JsonProperty("user_id")
    private int userId;

    protected FriendOrFoeUser() {
    }

    public String getName() {
        return name;
    }

    public int getUserId() {
        return userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FriendOrFoeUser)) return false;
        FriendOrFoeUser that = (FriendOrFoeUser) o;
        return userId == that.userId && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, userId);
    }
}
