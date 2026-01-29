package eu.tornplayground.tornapi.models.converters;

import tools.jackson.databind.util.StdConverter;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class EpochZonedDateTimeConverter extends StdConverter<Long, ZonedDateTime> {

    @Override
    public ZonedDateTime convert(Long aLong) {
        return Instant.ofEpochSecond(aLong).atZone(ZoneOffset.UTC);
    }

}
