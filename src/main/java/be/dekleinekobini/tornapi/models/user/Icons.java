package be.dekleinekobini.tornapi.models.user;

import be.dekleinekobini.tornapi.models.Model;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;

import java.util.Map;

public class Icons extends Model {

    public static Map<String, String> of(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("icons"), new TypeReference<>() {
        });
    }

}
