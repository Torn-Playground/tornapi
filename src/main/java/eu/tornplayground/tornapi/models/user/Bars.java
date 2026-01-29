package eu.tornplayground.tornapi.models.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.converters.EpochLocalDateTimeConverter;
import eu.tornplayground.tornapi.models.user.bars.Bar;
import eu.tornplayground.tornapi.models.user.bars.ChainBar;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import tools.jackson.databind.annotation.JsonDeserialize;

import java.time.LocalDateTime;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = false)
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

}
