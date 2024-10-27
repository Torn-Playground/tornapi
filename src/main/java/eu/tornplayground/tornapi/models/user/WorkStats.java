package eu.tornplayground.tornapi.models.user;

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
public class WorkStats extends Model {

    @JsonProperty("manual_labor")
    private long manualLabor;

    @JsonProperty("intelligence")
    private long intelligence;

    @JsonProperty("endurance")
    private long endurance;

}
