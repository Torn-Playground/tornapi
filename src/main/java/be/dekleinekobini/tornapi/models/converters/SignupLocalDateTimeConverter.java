package be.dekleinekobini.tornapi.models.converters;

import com.fasterxml.jackson.databind.util.StdConverter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class SignupLocalDateTimeConverter extends StdConverter<String, LocalDateTime> {

    @Override
    public LocalDateTime convert(String s) {
        String[] parts = s.split(" ");

        LocalDate date = LocalDate.parse(parts[0]);
        LocalTime time = LocalTime.parse(parts[1]);
        return LocalDateTime.of(date, time);
    }

}
