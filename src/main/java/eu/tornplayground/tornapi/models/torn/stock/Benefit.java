package eu.tornplayground.tornapi.models.torn.stock;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.torn.benefit.Type;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Objects;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Benefit {

    @JsonProperty("type")
    private Type type;

    @JsonProperty("frequency")
    private int frequency;

    @JsonProperty("requirement")
    private long requirement;

    @JsonProperty("description")
    private String description;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Benefit benefit = (Benefit) o;
        return frequency == benefit.frequency && requirement == benefit.requirement && type == benefit.type && Objects.equals(description, benefit.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, frequency, requirement, description);
    }

}
