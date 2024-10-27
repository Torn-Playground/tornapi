package eu.tornplayground.tornapi.models.torn.companytype;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = false)
public class CompanySpecial {

    @JsonProperty("effect")
    private String effect;

    @JsonProperty("cost")
    private int cost;

    @JsonProperty("rating_required")
    private int ratingRequired;

}
