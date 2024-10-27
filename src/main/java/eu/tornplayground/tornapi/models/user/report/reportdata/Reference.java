package eu.tornplayground.tornapi.models.user.report.reportdata;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.converters.StringDateConverter;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.Objects;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Reference extends Model {

    @JsonProperty("joined")
    @JsonDeserialize(converter = StringDateConverter.class)
    private LocalDate joined;

    @JsonProperty("left")
    @JsonDeserialize(converter = StringDateConverter.class)
    private LocalDate left;

    @JsonProperty("name")
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Reference)) return false;
        Reference reference = (Reference) o;
        return Objects.equals(joined, reference.joined) && Objects.equals(left, reference.left) && Objects.equals(name, reference.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(joined, left, name);
    }
}
