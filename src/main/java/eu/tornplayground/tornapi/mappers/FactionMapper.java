package eu.tornplayground.tornapi.mappers;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import eu.tornplayground.tornapi.models.faction.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FactionMapper extends ModelMapper {

    private FactionMapper() {
    }

    public static FactionBasic ofBasic(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json, new TypeReference<>() {});
    }

    public static List<FactionAttacks> ofAttacks(JsonNode json) {
        return fromMap(json.get("attacks"), FactionAttacks.class);
    }

    public static List<FactionAttacksFull> ofAttacksFull(JsonNode json) {
        return fromMap(json.get("attacks"), FactionAttacksFull.class);
    }

    public static List<RankedWar> ofRankedWar(JsonNode json) {
        return fromMap(json.get("rankedwars"), RankedWar.class);
    }

    public static Chain ofChain(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("chain"), Chain.class);
    }

    private static <T> List<T> fromMap(JsonNode mapNode, Class<T> clazz) {
        List<T> mapEntryValues = new ArrayList<>();
        Iterator<String> mapEntryKeys = mapNode.fieldNames();
        while (mapEntryKeys.hasNext()) {
            mapEntryValues.add(OBJECT_MAPPER.convertValue(mapNode.get(mapEntryKeys.next()), clazz));
        }
        return mapEntryValues;
    }
}
