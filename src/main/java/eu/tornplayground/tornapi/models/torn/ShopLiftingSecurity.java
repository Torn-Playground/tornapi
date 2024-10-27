package eu.tornplayground.tornapi.models.torn;

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
public class ShopLiftingSecurity extends Model {

    public static final String ONE_CAMERA = "One camera";
    public static final String TWO_CAMERAS = "Two cameras";
    public static final String THREE_CAMERAS = "Three cameras";
    public static final String FOUR_CAMERAS = "Four cameras";
    public static final String ONE_GUARD = "One guard";
    public static final String TWO_GUARDS = "Two guards";
    public static final String CHECKPOINT = "Checkpoint";

    @JsonProperty("title")
    private String title;

    @JsonProperty("disabled")
    private boolean disabled;

}
