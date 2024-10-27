package eu.tornplayground.tornapi.models.faction.basic.member;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.converters.EpochLocalDateTimeConverter;
import eu.tornplayground.tornapi.models.converters.RelativeConverter;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class LastAction extends Model {

    @JsonProperty("status")
    private String status;

    @JsonProperty("timestamp")
    @JsonDeserialize(converter = EpochLocalDateTimeConverter.class)
    private LocalDateTime timestamp;

    @JsonProperty("relative")
    @JsonDeserialize(converter = RelativeConverter.class)
    private Duration relative;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LastAction that = (LastAction) o;
        return Objects.equals(status, that.status) && Objects.equals(timestamp, that.timestamp) && Objects.equals(relative, that.relative);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, timestamp, relative);
    }
}
