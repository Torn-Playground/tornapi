package be.dekleinekobini.tornapi.models.converters;

import com.fasterxml.jackson.databind.util.StdConverter;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class DayDurationConverter extends StdConverter<Long, Duration> {

    @Override
    public Duration convert(Long aLong) {
        return Duration.ofDays(aLong);
    }

}
