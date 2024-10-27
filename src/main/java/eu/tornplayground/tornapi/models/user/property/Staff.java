package eu.tornplayground.tornapi.models.user.property;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.Model;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Objects;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Staff)) return false;
        Staff staff = (Staff) o;
        return maid == staff.maid && guard == staff.guard && pilot == staff.pilot && butler == staff.butler && doctor == staff.doctor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(maid, guard, pilot, butler, doctor);
    }
}
