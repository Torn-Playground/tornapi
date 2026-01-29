package eu.tornplayground.tornapi.mappers;

import eu.tornplayground.tornapi.models.market.MarketItem;
import eu.tornplayground.tornapi.models.market.PointOrder;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.JsonNode;

import java.util.List;
import java.util.Map;

public class MarketMapper extends ModelMapper {

    private MarketMapper() {
    }

    public static List<MarketItem> ofBazaar(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("bazaar"), new TypeReference<>() {
        });
    }

    public static List<MarketItem> ofItemMarket(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("itemmarket"), new TypeReference<>() {
        });
    }

    public static Map<Long, PointOrder> ofPointsMarket(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("pointsmarket"), new TypeReference<>() {
        });
    }

}
