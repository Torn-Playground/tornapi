package eu.tornplayground.tornapi.models.user;

import eu.tornplayground.tornapi.models.Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.user.ammo.AmmoSize;
import eu.tornplayground.tornapi.models.user.ammo.AmmoType;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Objects;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Ammo extends Model {

    @JsonProperty("ammoID")
    private long ammoId;

    @JsonProperty("typeID")
    private long typeId;

    @JsonProperty("size")
    private AmmoSize size;

    @JsonProperty("type")
    private AmmoType type;

    @JsonProperty("equipped")
    private boolean equipped;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ammo)) return false;
        Ammo ammo = (Ammo) o;
        return ammoId == ammo.ammoId && typeId == ammo.typeId && equipped == ammo.equipped && size == ammo.size && type == ammo.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ammoId, typeId, size, type, equipped);
    }
}
