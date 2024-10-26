package eu.tornplayground.tornapi.models.converters;

import com.fasterxml.jackson.databind.util.StdConverter;

import java.time.Duration;

public class SecondDurationConverter extends StdConverter<Long, Duration> {

    @Override
    public Duration convert(Long aLong) {
        return Duration.ofSeconds(aLong);
    }

}
