package eu.tornplayground.tornapi.mappers;

import eu.tornplayground.tornapi.models.Timestamp;
import eu.tornplayground.tornapi.models.TornError;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;

public abstract class ModelMapper {

    protected final static ObjectMapper OBJECT_MAPPER = JsonMapper.builder()
            .findAndAddModules()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
            .configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS, true)
            .build();

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
