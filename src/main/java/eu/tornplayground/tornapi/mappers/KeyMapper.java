package eu.tornplayground.tornapi.mappers;

import eu.tornplayground.tornapi.models.info.KeyInfo;
import tools.jackson.databind.JsonNode;

public class KeyMapper extends ModelMapper {

    private KeyMapper() {
    }

    public static KeyInfo ofInfo(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json, KeyInfo.class);
    }

}
