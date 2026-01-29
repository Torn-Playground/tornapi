package eu.tornplayground.tornapi.models.converters;

import tools.jackson.databind.util.StdConverter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringDateConverter extends StdConverter<String, LocalDate> {

    public static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    @Override
    public LocalDate convert(String value) {
        return LocalDate.parse(value, DATE_FORMATTER);
    }

}
