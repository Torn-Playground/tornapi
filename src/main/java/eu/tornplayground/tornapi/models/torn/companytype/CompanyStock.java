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
public class CompanyStock {

    @JsonProperty("cost")
    private Object cost;

    @JsonProperty("rrp")
    private long rrp;

}
