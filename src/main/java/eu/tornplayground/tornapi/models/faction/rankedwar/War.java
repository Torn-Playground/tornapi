package eu.tornplayground.tornapi.models.faction.rankedwar;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.converters.EpochLocalDateTimeConverter;

import java.time.LocalDateTime;
import java.util.Objects;

public class War extends Model {
    @JsonProperty("start")
    @JsonDeserialize(converter = EpochLocalDateTimeConverter.class)
    private LocalDateTime start;

    @JsonProperty("end")
    @JsonDeserialize(converter = EpochLocalDateTimeConverter.class)
    private LocalDateTime end;

    @JsonProperty("target")
    private int target;

    @JsonProperty("winner")
    private int winner;

    protected War() {
    }

    public LocalDateTime getStart() {
        return start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public int getTarget() {
        return target;
    }

    public int getWinner() {
        return winner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof War)) return false;
        War war = (War) o;
        return target == war.target && winner == war.winner && Objects.equals(start, war.start) && Objects.equals(end, war.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end, target, winner);
    }
}
