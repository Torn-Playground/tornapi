package eu.tornplayground.tornapi.models.torn.companytype;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;

@Getter
public enum SpecialPosition {

    NONE("None"),
    TRAINER("Trainer"),
    SECRETARY("Secretary"),
    MANAGER("Manager"),
    MARKETER("Marketer"),
    CLEANER("Cleaner");

    private final String name;

    SpecialPosition(String name) {
        this.name = name;
    }

    @JsonCreator
    public SpecialPosition fromName(String name) {
        for (SpecialPosition value : SpecialPosition.values()) {
            if (value.name.equals(name)) {
                return value;
            }
        }
        return null;
    }

}
