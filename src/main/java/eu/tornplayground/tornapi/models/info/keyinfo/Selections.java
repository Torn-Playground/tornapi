package eu.tornplayground.tornapi.models.info.keyinfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Objects;
import java.util.Set;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Selections {

    @JsonProperty("user")
    private Set<String> user;

    @JsonProperty("property")
    private Set<String> property;

    @JsonProperty("faction")
    private Set<String> faction;

    @JsonProperty("company")
    private Set<String> company;

    @JsonProperty("market")
    private Set<String> market;

    @JsonProperty("torn")
    private Set<String> torn;

    @JsonProperty("key")
    private Set<String> key;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Selections that = (Selections) o;
        return Objects.equals(user, that.user) && Objects.equals(property, that.property) && Objects.equals(faction, that.faction) && Objects.equals(company, that.company) && Objects.equals(market, that.market) && Objects.equals(torn, that.torn) && Objects.equals(key, that.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, property, faction, company, market, torn, key);
    }

}
