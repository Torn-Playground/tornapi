package eu.tornplayground.tornapi.models.companies;

import eu.tornplayground.tornapi.models.converters.DayDurationConverter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.Duration;
import java.util.Objects;

@Getter
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return id == company.id && typeId == company.typeId && rating == company.rating && director == company.director && employees == company.employees && capacity == company.capacity && dailyIncome == company.dailyIncome && dailyCustomers == company.dailyCustomers && weeklyIncome == company.weeklyIncome && weeklyCustomers == company.weeklyCustomers && daysOld == company.daysOld && Objects.equals(name, company.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, typeId, rating, name, director, employees, capacity, dailyIncome, dailyCustomers, weeklyIncome, weeklyCustomers, daysOld);
    }

}
