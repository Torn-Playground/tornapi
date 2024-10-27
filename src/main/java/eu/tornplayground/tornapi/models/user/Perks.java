package eu.tornplayground.tornapi.models.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.Model;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = false)
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

}
