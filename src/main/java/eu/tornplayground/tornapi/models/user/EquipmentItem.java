package eu.tornplayground.tornapi.models.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.user.partial.BaseItem;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Objects;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class EquipmentItem extends BaseItem {

    @JsonProperty("equipped")
    public boolean equipped;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EquipmentItem)) return false;
        if (!super.equals(o)) return false;
        EquipmentItem that = (EquipmentItem) o;
        return equipped == that.equipped;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), equipped);
    }
}
