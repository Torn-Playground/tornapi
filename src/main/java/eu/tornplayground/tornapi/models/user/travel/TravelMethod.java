package eu.tornplayground.tornapi.models.user.travel;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;

@Getter
public enum TravelMethod {

    STANDARD("Standard"),
    AIRSTRIP("Airstrip"),
    PRIVATE("Private"),
    BUSINESS("Business");

    private final String name;

    TravelMethod(String name) {
        this.name = name;
    }

    @JsonCreator
    public static TravelMethod fromName(String name) {
        for (TravelMethod method : values()) {
            if (method.getName().equals(name)) {
                return method;
            }
        }
        return null;
    }

}
