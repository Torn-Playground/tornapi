package eu.tornplayground.tornapi.models.user.money;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.converters.SecondDurationConverter;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.Duration;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = false)
public class Bank extends Model {

    @JsonProperty("amount")
    private long amount;

    @JsonProperty("time_left")
    @JsonDeserialize(converter = SecondDurationConverter.class)
    private Duration timeLeft;

}
