package eu.tornplayground.tornapi.models.user.report.reportdata;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.Model;

import java.util.Objects;

public class Warrant extends Model {

    @JsonProperty("name")
    private String name;

    @JsonProperty("user_id")
    private int userId;

    @JsonProperty("warrant")
    private long warrent;

    protected Warrant() {
    }

    public String getName() {
        return name;
    }

    public int getUserId() {
        return userId;
    }

    public long getWarrent() {
        return warrent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Warrant)) return false;
        Warrant warrant1 = (Warrant) o;
        return userId == warrant1.userId && warrent == warrant1.warrent && Objects.equals(name, warrant1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, userId, warrent);
    }
}
