package eu.tornplayground.tornapi.models;

import eu.tornplayground.tornapi.models.converters.EpochLocalDateTimeConverter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Timestamp extends Model {

    @JsonDeserialize(converter = EpochLocalDateTimeConverter.class)
    private LocalDateTime timestamp;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Timestamp timestamp1 = (Timestamp) o;
        return Objects.equals(timestamp, timestamp1.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestamp);
    }

}
