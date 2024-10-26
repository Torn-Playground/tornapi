package eu.tornplayground.tornapi.models.torn;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.Model;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Getter
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
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
    @Getter(value = lombok.AccessLevel.NONE)
    private boolean disabled;

    public boolean isDisabled() {
        return disabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShopLiftingSecurity that = (ShopLiftingSecurity) o;
        return disabled == that.disabled && Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, disabled);
    }

}
