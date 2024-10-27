package eu.tornplayground.tornapi.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Objects;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class TornError extends Model {

    @JsonProperty("code")
    private long code;

    @JsonProperty("error")
    private TornErrorType error;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TornError)) return false;
        TornError tornError = (TornError) o;
        return code == tornError.code && error == tornError.error;
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, error);
    }
}
