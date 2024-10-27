package eu.tornplayground.tornapi.models.user.property;

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
public class Staff extends Model {

    @JsonProperty("maid")
    private int maid;

    @JsonProperty("guard")
    private int guard;

    @JsonProperty("pilot")
    @Getter(value = lombok.AccessLevel.NONE)
    private boolean pilot;

    @JsonProperty("butler")
    private int butler;

    @JsonProperty("doctor")
    @Getter(value = lombok.AccessLevel.NONE)
    private boolean doctor;

    public boolean hasPilot() {
        return pilot;
    }

    public boolean hasDoctor() {
        return doctor;
    }

}
