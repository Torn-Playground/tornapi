package eu.tornplayground.tornapi.requestbuilder;

import eu.tornplayground.tornapi.RequestBuilder;
import eu.tornplayground.tornapi.TornApi;
import eu.tornplayground.tornapi.mappers.MarketMapper;
import eu.tornplayground.tornapi.models.market.MarketItem;
import eu.tornplayground.tornapi.models.market.PointOrder;
import eu.tornplayground.tornapi.selections.ItemMarketSelections;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class MarketAsyncRequestBuilder extends RequestBuilder<MarketAsyncRequestBuilder, ItemMarketSelections> {

    public MarketAsyncRequestBuilder(TornApi tornApi) {
        super(tornApi, "market");
    }

    public CompletableFuture<List<MarketItem>> fetchBazaar() {
        return fetchAsync(ItemMarketSelections.BAZAAR, MarketMapper::ofBazaar);
    }

    public CompletableFuture<List<MarketItem>> fetchItemMarket() {
        return fetchAsync(ItemMarketSelections.ITEMMARKET, MarketMapper::ofItemMarket);
    }

    public CompletableFuture<Map<Long, PointOrder>> fetchPointsMarket() {
        return fetchAsync(ItemMarketSelections.POINTSMARKET, MarketMapper::ofPointsMarket);
    }

}
