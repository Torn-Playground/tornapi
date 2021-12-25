package be.dekleinekobini.tornapi.mappers;

import be.dekleinekobini.tornapi.models.torn.PawnShop;
import be.dekleinekobini.tornapi.models.torn.Stock;
import be.dekleinekobini.tornapi.models.torn.TornItem;
import be.dekleinekobini.tornapi.models.torn.TornStats;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;

import java.util.Map;

public class TornMapper extends ModelMapper {

    private TornMapper() {
    }

    public static Map<Long, TornItem> ofItems(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("items"), new TypeReference<>() {
        });
    }

    public static PawnShop ofPawnShop(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("pawnshop"), PawnShop.class);
    }

    public static TornStats ofStats(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("stats"), TornStats.class);
    }

    public static Map<Long, Stock> ofStocks(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("stocks"), new TypeReference<>() {
        });
    }

}
