package eu.tornplayground.tornapi.models.converters;

import com.fasterxml.jackson.databind.util.StdConverter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StringDateTimeConverter extends StdConverter<String, LocalDateTime> {

    public static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("HH:mm:ss - dd/MM/yy");

    @Override
    public LocalDateTime convert(String value) {
        return LocalDateTime.parse(value, DATE_FORMATTER);
    }
}
