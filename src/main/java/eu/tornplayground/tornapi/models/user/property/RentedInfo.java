package eu.tornplayground.tornapi.models.user.property;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.converters.DayDurationConverter;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.Duration;
import java.util.Objects;

@Getter
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
public class RentedInfo extends Model {
    @JsonProperty("cost_per_day")
    private int costPerDay;

    @JsonProperty("days_left")
    @JsonDeserialize(converter = DayDurationConverter.class)
    private Duration daysLeft;

    @JsonProperty("total_cost")
    private int totalCost;

    @JsonProperty("user_id")
    private long userId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RentedInfo)) return false;
        RentedInfo that = (RentedInfo) o;
        return costPerDay == that.costPerDay && totalCost == that.totalCost && userId == that.userId && Objects.equals(daysLeft, that.daysLeft);
    }

    @Override
    public int hashCode() {
        return Objects.hash(costPerDay, daysLeft, totalCost, userId);
    }
}
