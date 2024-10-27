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
public class Refills extends Model {

    @JsonProperty("energy_refill_used")
    private boolean energyRefillUsed;

    @JsonProperty("nerve_refill_used")
    private boolean nerveRefillUsed;

    @JsonProperty("token_refill_used")
    private boolean tokenRefillUsed;

    @JsonProperty("special_refills_available")
    private int specialRefillsAvailable;

}
