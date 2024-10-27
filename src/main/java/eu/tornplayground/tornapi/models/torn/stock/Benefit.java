package eu.tornplayground.tornapi.models.torn.stock;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.torn.benefit.Type;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = false)
public class Benefit {

    @JsonProperty("type")
    private Type type;

    @JsonProperty("frequency")
    private int frequency;

    @JsonProperty("requirement")
    private long requirement;

    @JsonProperty("description")
    private String description;

}
