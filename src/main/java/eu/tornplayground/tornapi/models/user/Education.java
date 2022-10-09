package eu.tornplayground.tornapi.models.user;

import eu.tornplayground.tornapi.models.Model;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.Duration;
import java.util.List;
import java.util.Objects;

public class Education extends Model {

    @JsonProperty("education_current")
    private long current;
    @JsonProperty("education_timeleft")
    private Duration timeLeft;
    @JsonProperty("education_completed")
    private List<Long> completed;

    public long getCurrent() {
        return current;
    }

    public void setCurrent(long current) {
        this.current = current;
    }

    public Duration getTimeLeft() {
        return timeLeft;
    }

    public void setTimeLeft(Duration timeLeft) {
        this.timeLeft = timeLeft;
    }

    public List<Long> getCompleted() {
        return completed;
    }

    public void setCompleted(List<Long> completed) {
        this.completed = completed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Education education = (Education) o;
        return current == education.current && Objects.equals(timeLeft, education.timeLeft) && Objects.equals(completed, education.completed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(current, timeLeft, completed);
    }

}
