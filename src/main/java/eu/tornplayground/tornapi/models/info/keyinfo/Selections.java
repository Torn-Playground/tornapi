package eu.tornplayground.tornapi.models.info.keyinfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Set;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = false)
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

}
