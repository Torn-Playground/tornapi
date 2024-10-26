package eu.tornplayground.tornapi.models.user.report.reportdata;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.converters.StringDateConverter;

import java.time.LocalDate;
import java.util.Objects;

public class Reference extends Model {

    @JsonProperty("joined")
    @JsonDeserialize(converter = StringDateConverter.class)
    private LocalDate joined;

    @JsonProperty("left")
    @JsonDeserialize(converter = StringDateConverter.class)
    private LocalDate left;

    @JsonProperty("name")
    private String name;

    protected Reference() {
    }

    public LocalDate getJoined() {
        return joined;
    }

    public LocalDate getLeft() {
        return left;
    }

    public String getName() {
        return name;
    }

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
