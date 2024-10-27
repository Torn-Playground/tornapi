package eu.tornplayground.tornapi.models.user.attacks;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Objects;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Fighter {

    @JsonProperty("id")
    private long id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("faction")
    private long faction;

    @JsonProperty("factionname")
    private String factionName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fighter fighter = (Fighter) o;
        return id == fighter.id && faction == fighter.faction && Objects.equals(name, fighter.name) && Objects.equals(factionName, fighter.factionName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, faction, factionName);
    }

}
