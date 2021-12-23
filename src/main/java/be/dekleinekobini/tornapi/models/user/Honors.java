package be.dekleinekobini.tornapi.models.user;

import be.dekleinekobini.tornapi.models.Model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Honors extends Model {

    private long id;
    private LocalDateTime awarded;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getAwarded() {
        return awarded;
    }

    public void setAwarded(LocalDateTime awarded) {
        this.awarded = awarded;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Honors honors = (Honors) o;
        return id == honors.id && Objects.equals(awarded, honors.awarded);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, awarded);
    }

}
