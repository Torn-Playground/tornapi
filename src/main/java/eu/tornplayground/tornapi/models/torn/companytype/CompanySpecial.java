package eu.tornplayground.tornapi.models.torn.companytype;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Getter
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
public class CompanySpecial {

    @JsonProperty("effect")
    private String effect;

    @JsonProperty("cost")
    private int cost;

    @JsonProperty("rating_required")
    private int ratingRequired;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompanySpecial that = (CompanySpecial) o;
        return cost == that.cost && ratingRequired == that.ratingRequired && Objects.equals(effect, that.effect);
    }

    @Override
    public int hashCode() {
        return Objects.hash(effect, cost, ratingRequired);
    }

}
