package eu.tornplayground.tornapi.models.user.money;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.converters.SecondDurationConverter;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.Duration;
import java.util.Objects;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Bank extends Model {

    @JsonProperty("amount")
    private long amount;

    @JsonProperty("time_left")
    @JsonDeserialize(converter = SecondDurationConverter.class)
    private Duration timeLeft;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bank)) return false;
        Bank bank = (Bank) o;
        return amount == bank.amount && Objects.equals(timeLeft, bank.timeLeft);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, timeLeft);
    }
}
