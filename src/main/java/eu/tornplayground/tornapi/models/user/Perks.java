package eu.tornplayground.tornapi.models.user;

import eu.tornplayground.tornapi.models.Model;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

public class Perks extends Model {

    @JsonProperty("job_perks")
    private List<String> jobPerks;
    @JsonProperty("property_perks")
    private List<String> propertyPerks;
    @JsonProperty("stock_perks")
    private List<String> stockPerks;
    @JsonProperty("merit_perks")
    private List<String> meritPerks;
    @JsonProperty("education_perks")
    private List<String> educationPerks;
    @JsonProperty("enhancer_perks")
    private List<String> enhancerPerks;
    @JsonProperty("company_perks")
    private List<String> companyPerks;
    @JsonProperty("faction_perks")
    private List<String> factionPerks;
    @JsonProperty("book_perks")
    private List<String> bookPerks;

    public List<String> getJobPerks() {
        return jobPerks;
    }

    public void setJobPerks(List<String> jobPerks) {
        this.jobPerks = jobPerks;
    }

    public List<String> getPropertyPerks() {
        return propertyPerks;
    }

    public void setPropertyPerks(List<String> propertyPerks) {
        this.propertyPerks = propertyPerks;
    }

    public List<String> getStockPerks() {
        return stockPerks;
    }

    public void setStockPerks(List<String> stockPerks) {
        this.stockPerks = stockPerks;
    }

    public List<String> getMeritPerks() {
        return meritPerks;
    }

    public void setMeritPerks(List<String> meritPerks) {
        this.meritPerks = meritPerks;
    }

    public List<String> getEducationPerks() {
        return educationPerks;
    }

    public void setEducationPerks(List<String> educationPerks) {
        this.educationPerks = educationPerks;
    }

    public List<String> getEnhancerPerks() {
        return enhancerPerks;
    }

    public void setEnhancerPerks(List<String> enhancerPerks) {
        this.enhancerPerks = enhancerPerks;
    }

    public List<String> getCompanyPerks() {
        return companyPerks;
    }

    public void setCompanyPerks(List<String> companyPerks) {
        this.companyPerks = companyPerks;
    }

    public List<String> getFactionPerks() {
        return factionPerks;
    }

    public void setFactionPerks(List<String> factionPerks) {
        this.factionPerks = factionPerks;
    }

    public List<String> getBookPerks() {
        return bookPerks;
    }

    public void setBookPerks(List<String> bookPerks) {
        this.bookPerks = bookPerks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Perks perks = (Perks) o;
        return Objects.equals(jobPerks, perks.jobPerks) && Objects.equals(propertyPerks, perks.propertyPerks) && Objects.equals(stockPerks, perks.stockPerks) && Objects.equals(meritPerks, perks.meritPerks) && Objects.equals(educationPerks, perks.educationPerks) && Objects.equals(enhancerPerks, perks.enhancerPerks) && Objects.equals(companyPerks, perks.companyPerks) && Objects.equals(factionPerks, perks.factionPerks) && Objects.equals(bookPerks, perks.bookPerks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobPerks, propertyPerks, stockPerks, meritPerks, educationPerks, enhancerPerks, companyPerks, factionPerks, bookPerks);
    }

}
