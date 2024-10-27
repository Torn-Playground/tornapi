package eu.tornplayground.tornapi.models.user.property;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.converters.DayDurationConverter;
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

}
