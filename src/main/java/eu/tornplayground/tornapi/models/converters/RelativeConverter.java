package eu.tornplayground.tornapi.models.converters;

import com.fasterxml.jackson.databind.util.StdConverter;

import java.time.Duration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RelativeConverter extends StdConverter<String, Duration> {

    @Override
    public Duration convert(String relativeString) {
        Pattern pattern = Pattern.compile("(\\d+)\\s+(minutes?|hours?|days?)\\s+ago");
        Matcher matcher = pattern.matcher(relativeString);

        if (matcher.find()) {
            int number = Integer.parseInt(matcher.group(1));  // Extract the number
            String unit = matcher.group(2);  // Extract the time unit

            switch (unit.toLowerCase()) {
                case "minute":
                case "minutes":
                    return Duration.ofMinutes(number);
                case "hour":
                case "hours":
                    return Duration.ofHours(number);
                case "day":
                case "days":
                    return Duration.ofDays(number);
                default:
                    throw new IllegalArgumentException("Unsupported time unit: " + unit);
            }
        }

        throw new IllegalArgumentException("Invalid time format: " + relativeString);
    }

}
