package eu.tornplayground.tornapi.mappers;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import eu.tornplayground.tornapi.models.torn.*;

import java.util.List;
import java.util.Map;

public class TornMapper extends ModelMapper {

    private TornMapper() {
    }

    public static Map<Long, CompanyType> ofCompanies(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("companies"), new TypeReference<>() {
        });
    }

    public static Map<Long, TornItem> ofItems(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("items"), new TypeReference<>() {
        });
    }

    public static PawnShop ofPawnShop(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("pawnshop"), PawnShop.class);
    }

    public static Map<String, List<ShopLiftingSecurity>> ofShoplifting(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("shoplifting"), new TypeReference<>() {
        });
    }

    public static TornStats ofStats(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("stats"), TornStats.class);
    }

    public static Map<Long, Stock> ofStocks(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("stocks"), new TypeReference<>() {
        });
    }

}
