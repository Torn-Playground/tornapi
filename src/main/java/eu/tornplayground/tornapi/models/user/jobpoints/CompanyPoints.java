package eu.tornplayground.tornapi.models.user.jobpoints;

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
public class CompanyPoints {

    @JsonProperty("name")
    private String name;

    @JsonProperty("jobpoints")
    private long jobPoints;

}
