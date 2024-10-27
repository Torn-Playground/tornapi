package eu.tornplayground.tornapi.models.info;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.info.keyinfo.AccessType;
import eu.tornplayground.tornapi.models.info.keyinfo.Selections;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = false)
public class KeyInfo extends Model {

    @JsonProperty("access_level")
    private int accessLevel;

    @JsonProperty("access_type")
    private AccessType accessType;

    @JsonProperty("selections")
    private Selections selections;

}
