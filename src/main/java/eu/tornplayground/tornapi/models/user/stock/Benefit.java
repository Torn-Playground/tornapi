package eu.tornplayground.tornapi.models.user.stock;


import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.Model;

import java.util.Objects;

public class Benefit extends Model {

    @JsonProperty("ready")
    private boolean ready;

    @JsonProperty("increment")
    private int increment;

    @JsonProperty("progress")
    private int progress;

    @JsonProperty("frequency")
    private int frequency;

    protected Benefit() {
    }

    public boolean isReady() {
        return ready;
    }

    public int getIncrement() {
        return increment;
    }

    public int getProgress() {
        return progress;
    }

    public int getFrequency() {
        return frequency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Benefit dividend = (Benefit) o;
        return ready == dividend.ready && increment == dividend.increment && progress == dividend.progress && frequency == dividend.frequency;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ready, increment, progress, frequency);
    }

}