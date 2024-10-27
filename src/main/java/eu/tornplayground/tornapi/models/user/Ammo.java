package eu.tornplayground.tornapi.models.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.user.ammo.AmmoSize;
import eu.tornplayground.tornapi.models.user.ammo.AmmoType;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = false)
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

}
