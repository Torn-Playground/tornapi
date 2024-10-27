package eu.tornplayground.tornapi.models.user.stock;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.Model;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Objects;
@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Dividend extends Model {

    @JsonProperty("ready")
    private boolean ready;

    @JsonProperty("increment")
    private int increment;

    @JsonProperty("progress")
    private int progress;

    @JsonProperty("frequency")
    private int frequency;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dividend)) return false;
        Dividend dividend = (Dividend) o;
        return ready == dividend.ready && increment == dividend.increment && progress == dividend.progress && frequency == dividend.frequency;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ready, increment, progress, frequency);
    }
}
