package eu.tornplayground.tornapi.models.user.partial;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import eu.tornplayground.tornapi.models.common.PlayerState;
import eu.tornplayground.tornapi.models.converters.EpochLocalDateTimeConverter;
import eu.tornplayground.tornapi.models.faction.basic.member.Color;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Status status = (Status) o;
        return Objects.equals(description, status.description) && Objects.equals(details, status.details) && state == status.state && Objects.equals(color, status.color) && Objects.equals(until, status.until);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, details, state, color, until);
    }
}
