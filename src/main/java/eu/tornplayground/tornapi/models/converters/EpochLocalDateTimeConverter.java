package eu.tornplayground.tornapi.models.converters;

import tools.jackson.databind.util.StdConverter;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class EpochLocalDateTimeConverter extends StdConverter<Long, LocalDateTime> {

    @Override
    public LocalDateTime convert(Long aLong) {
        return Instant.ofEpochSecond(aLong).atOffset(ZoneOffset.UTC).toLocalDateTime();
    }

}
