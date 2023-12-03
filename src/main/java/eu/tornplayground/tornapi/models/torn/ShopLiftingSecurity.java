package eu.tornplayground.tornapi.models.torn;

import eu.tornplayground.tornapi.models.Model;

import java.util.Objects;

public class ShopLiftingSecurity extends Model {

    public static final String ONE_CAMERA = "One camera";
    public static final String TWO_CAMERAS = "Two cameras";
    public static final String THREE_CAMERAS = "Three cameras";
    public static final String FOUR_CAMERAS = "Four cameras";
    public static final String ONE_GUARD = "One guard";
    public static final String TWO_GUARDS = "Two guards";
    public static final String CHECKPOINT = "Checkpoint";

    private String title;
    private boolean disabled;

    public ShopLiftingSecurity() {
    }

    public ShopLiftingSecurity(String title, boolean disabled) {
        this.title = title;
        this.disabled = disabled;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
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
