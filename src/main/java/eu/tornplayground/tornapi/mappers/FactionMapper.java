package eu.tornplayground.tornapi.mappers;

import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.JsonNode;
import eu.tornplayground.tornapi.models.faction.*;

import java.util.List;

public class FactionMapper extends ModelMapper {

    private FactionMapper() {
    }

    public static FactionBasic ofBasic(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json, new TypeReference<>() {
        });
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
        return mapNode.values()
                .stream()
                .map((value) -> OBJECT_MAPPER.convertValue(value, clazz))
                .toList();
    }

}
