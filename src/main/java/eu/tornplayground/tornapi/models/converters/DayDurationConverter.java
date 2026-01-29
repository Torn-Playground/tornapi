package eu.tornplayground.tornapi.models.converters;

import tools.jackson.databind.util.StdConverter;

import java.time.Duration;

public class DayDurationConverter extends StdConverter<Long, Duration> {

    @Override
    public Duration convert(Long aLong) {
        return Duration.ofDays(aLong);
    }

}
