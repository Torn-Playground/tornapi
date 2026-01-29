package eu.tornplayground.tornapi.mappers;

import eu.tornplayground.tornapi.models.Timestamp;
import eu.tornplayground.tornapi.models.TornError;
import tools.jackson.databind.DeserializationFeature;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.MapperFeature;
import tools.jackson.databind.ObjectMapper;
import tools.jackson.databind.json.JsonMapper;

public abstract class ModelMapper {

    protected static final ObjectMapper OBJECT_MAPPER = JsonMapper.builder()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
            .configure(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES, false)
            .configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS, true)
            .configure(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS, true)
            .build();

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
