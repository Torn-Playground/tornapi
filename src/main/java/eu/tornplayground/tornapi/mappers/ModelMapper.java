package eu.tornplayground.tornapi.mappers;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import eu.tornplayground.tornapi.models.Timestamp;
import eu.tornplayground.tornapi.models.TornError;

public abstract class ModelMapper {

    protected static final ObjectMapper OBJECT_MAPPER = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
            .configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS, true)
            .configure(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS, true);

    protected ModelMapper() {
    }

    public static Timestamp ofTimestamp(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json, Timestamp.class);
    }

    public static boolean hasError(JsonNode json) {
        return json.has("error");
    }

    public static TornError ofError(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("error"), TornError.class);
    }

}
