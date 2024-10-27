package eu.tornplayground.tornapi.models.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.Model;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Honor extends Model {

    @JsonProperty("ID")
    private long id;

    @JsonProperty("awarded")
    private LocalDateTime awarded;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Honor honor = (Honor) o;
        return id == honor.id && Objects.equals(awarded, honor.awarded);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, awarded);
    }

}
