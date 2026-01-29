package eu.tornplayground.tornapi.models.user.partial;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.common.PlayerState;
import eu.tornplayground.tornapi.models.converters.EpochLocalDateTimeConverter;
import eu.tornplayground.tornapi.models.faction.basic.member.Color;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import tools.jackson.databind.annotation.JsonDeserialize;

import java.time.LocalDateTime;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = false)
public class Status {

    @JsonProperty("description")
    private String description;

    @JsonProperty("details")
    private String details;

    @JsonProperty("state")
    private PlayerState state;

    @JsonProperty("color")
    private Color color;

    @JsonDeserialize(converter = EpochLocalDateTimeConverter.class)
    private LocalDateTime until;

}
