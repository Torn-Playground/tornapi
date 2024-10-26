package eu.tornplayground.tornapi.models.user;

import eu.tornplayground.tornapi.models.Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Objects;

@Getter
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Perks)) return false;
        Perks perks = (Perks) o;
        return Objects.equals(jobPerks, perks.jobPerks) && Objects.equals(propertyPerks, perks.propertyPerks) && Objects.equals(stockPerks, perks.stockPerks) && Objects.equals(meritPerks, perks.meritPerks) && Objects.equals(educationPerks, perks.educationPerks) && Objects.equals(enhancerPerks, perks.enhancerPerks) && Objects.equals(companyPerks, perks.companyPerks) && Objects.equals(factionPerks, perks.factionPerks) && Objects.equals(bookPerks, perks.bookPerks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobPerks, propertyPerks, stockPerks, meritPerks, educationPerks, enhancerPerks, companyPerks, factionPerks, bookPerks);
    }
}
