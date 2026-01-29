package eu.tornplayground.tornapi.models.companies;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.converters.DayDurationConverter;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import tools.jackson.databind.annotation.JsonDeserialize;

import java.time.Duration;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = false)
public class Company {

    @JsonProperty("ID")
    private long id;

    @JsonProperty("company_type")
    private long typeId;

    @JsonProperty("rating")
    private int rating;

    @JsonProperty("name")
    private String name;

    @JsonProperty("director")
    private long director;

    @JsonProperty("employees_hired")
    private int employees;

    @JsonProperty("employees_capacity")
    private int capacity;

    @JsonProperty("daily_income")
    private long dailyIncome;

    @JsonProperty("daily_customers")
    private int dailyCustomers;

    @JsonProperty("weekly_income")
    private long weeklyIncome;

    @JsonProperty("weekly_customers")
    private int weeklyCustomers;

    @JsonProperty("days_old")
    @JsonDeserialize(converter = DayDurationConverter.class)
    private Duration daysOld;

}
