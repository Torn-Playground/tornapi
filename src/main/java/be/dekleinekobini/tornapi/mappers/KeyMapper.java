package be.dekleinekobini.tornapi.mappers;

import be.dekleinekobini.tornapi.models.info.KeyInfo;
import com.fasterxml.jackson.databind.JsonNode;

public class KeyMapper extends ModelMapper {

    private KeyMapper() {
    }

    public static KeyInfo ofInfo(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json, KeyInfo.class);
    }

}
