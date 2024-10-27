package eu.tornplayground.tornapi.models.user.attacksfull;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Objects;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class FighterFull {

    @JsonProperty("id")
    private long id;

    @JsonProperty("faction")
    private long faction;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FighterFull)) return false;
        FighterFull that = (FighterFull) o;
        return id == that.id && faction == that.faction;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, faction);
    }
}
