package eu.tornplayground.tornapi.models.user.stock;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.converters.EpochLocalDateTimeConverter;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = false)
public class Transaction extends Model {

    @JsonProperty("shares")
    private long shares;

    @JsonProperty("bought_price")
    private float boughtPrice;

    @JsonProperty("time_bought")
    @JsonDeserialize(converter = EpochLocalDateTimeConverter.class)
    private LocalDateTime timeBought;

}
