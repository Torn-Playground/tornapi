package eu.tornplayground.tornapi.models.user;

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
public class Notifications extends Model {

    @JsonProperty("messages")
    private long messages;

    @JsonProperty("events")
    private long events;

    @JsonProperty("awards")
    private long awards;

    @JsonProperty("competition")
    private long competition;

}
