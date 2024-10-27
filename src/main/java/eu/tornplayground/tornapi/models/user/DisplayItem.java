package eu.tornplayground.tornapi.models.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.user.partial.BaseItem;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Objects;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class DisplayItem extends BaseItem {

    @JsonProperty("circulation")
    private long circulation;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DisplayItem that = (DisplayItem) o;
        return circulation == that.circulation;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), circulation);
    }

}
