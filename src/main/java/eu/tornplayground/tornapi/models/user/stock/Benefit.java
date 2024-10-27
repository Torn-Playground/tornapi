package eu.tornplayground.tornapi.models.user.stock;


import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.Model;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = false)
public class Benefit extends Model {

    @JsonProperty("ready")
    private boolean ready;

    @JsonProperty("increment")
    private int increment;

    @JsonProperty("progress")
    private int progress;

    @JsonProperty("frequency")
    private int frequency;

}
