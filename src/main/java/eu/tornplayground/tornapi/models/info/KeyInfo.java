package eu.tornplayground.tornapi.models.info;

import eu.tornplayground.tornapi.models.Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.info.keyinfo.AccessType;
import eu.tornplayground.tornapi.models.info.keyinfo.Selections;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.*;

@Getter
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
public class KeyInfo extends Model {

    @JsonProperty("access_level")
    private int accessLevel;

    @JsonProperty("access_type")
    private AccessType accessType;

    @JsonProperty("selections")
    private Selections selections;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KeyInfo keyInfo = (KeyInfo) o;
        return accessLevel == keyInfo.accessLevel && accessType == keyInfo.accessType && Objects.equals(selections, keyInfo.selections);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessLevel, accessType, selections);
    }

}
