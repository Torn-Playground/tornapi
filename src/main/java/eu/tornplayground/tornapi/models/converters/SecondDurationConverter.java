package eu.tornplayground.tornapi.models.converters;

import tools.jackson.databind.util.StdConverter;

import java.time.Duration;

public class SecondDurationConverter extends StdConverter<Long, Duration> {

    @Override
    public Duration convert(Long value) {
        return Duration.ofSeconds(value);
    }

}
