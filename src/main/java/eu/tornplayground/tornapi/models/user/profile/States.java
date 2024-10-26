package eu.tornplayground.tornapi.models.user.profile;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.Model;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Getter
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
public class States extends Model {

    @JsonProperty("hospital_timestamp")
    private long hospitalTimestamp;

    @JsonProperty("jail_timestamp")
    private long jailTimestamp;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof States)) return false;
        States states = (States) o;
        return hospitalTimestamp == states.hospitalTimestamp && jailTimestamp == states.jailTimestamp;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hospitalTimestamp, jailTimestamp);
    }
}
