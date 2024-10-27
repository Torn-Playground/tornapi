package eu.tornplayground.tornapi.models.user.profile;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.Model;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = false)
public class Job extends Model {

    @JsonProperty("position")
    private String position;

    @JsonProperty("company_id")
    private long companyId;

    @JsonProperty("company_name")
    private String companyName;

    @JsonProperty("company_type")
    private long companyType;

}
