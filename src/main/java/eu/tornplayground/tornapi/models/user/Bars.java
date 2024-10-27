package eu.tornplayground.tornapi.models.user;

import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.converters.EpochLocalDateTimeConverter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import eu.tornplayground.tornapi.models.user.bars.Bar;
import eu.tornplayground.tornapi.models.user.bars.ChainBar;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Bars extends Model {

    @JsonProperty("server_time")
    @JsonDeserialize(converter = EpochLocalDateTimeConverter.class)
    private LocalDateTime serverTime;

    @JsonProperty("happy")
    private Bar happy;

    @JsonProperty("life")
    private Bar life;

    @JsonProperty("energy")
    private Bar energy;

    @JsonProperty("nerve")
    private Bar nerve;

    @JsonProperty("chain")
    private ChainBar chain;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bars bars = (Bars) o;
        return Objects.equals(serverTime, bars.serverTime) && Objects.equals(happy, bars.happy) && Objects.equals(life, bars.life) && Objects.equals(energy, bars.energy) && Objects.equals(nerve, bars.nerve) && Objects.equals(chain, bars.chain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverTime, happy, life, energy, nerve, chain);
    }

}
