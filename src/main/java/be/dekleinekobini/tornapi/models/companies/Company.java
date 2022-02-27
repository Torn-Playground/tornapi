package be.dekleinekobini.tornapi.models.companies;

import be.dekleinekobini.tornapi.models.converters.DayDurationConverter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.Objects;

public class Company {

    @JsonProperty("ID")
    private long id;
    @JsonProperty("company_type")
    private long typeId;
    private int rating;
    private String name;
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
    private int daysOld;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getTypeId() {
        return typeId;
    }

    public void setTypeId(long typeId) {
        this.typeId = typeId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getDirector() {
        return director;
    }

    public void setDirector(long director) {
        this.director = director;
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public long getDailyIncome() {
        return dailyIncome;
    }

    public void setDailyIncome(long dailyIncome) {
        this.dailyIncome = dailyIncome;
    }

    public int getDailyCustomers() {
        return dailyCustomers;
    }

    public void setDailyCustomers(int dailyCustomers) {
        this.dailyCustomers = dailyCustomers;
    }

    public long getWeeklyIncome() {
        return weeklyIncome;
    }

    public void setWeeklyIncome(long weeklyIncome) {
        this.weeklyIncome = weeklyIncome;
    }

    public int getWeeklyCustomers() {
        return weeklyCustomers;
    }

    public void setWeeklyCustomers(int weeklyCustomers) {
        this.weeklyCustomers = weeklyCustomers;
    }

    public int getDaysOld() {
        return daysOld;
    }

    public void setDaysOld(int daysOld) {
        this.daysOld = daysOld;
    }

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
