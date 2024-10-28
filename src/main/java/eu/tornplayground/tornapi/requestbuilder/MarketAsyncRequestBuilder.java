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

public class MarketAsyncRequestBuilder extends RequestBuilder<ItemMarketSelections> {

    public MarketAsyncRequestBuilder(TornApi tornApi) {
        super(tornApi, "market");
    }

    @Override
    public MarketAsyncRequestBuilder withTornErrorException(boolean throwError) {
        super.withTornErrorException(throwError);
        return this;
    }

    @Override
    public MarketAsyncRequestBuilder id(long id) {
        return (MarketAsyncRequestBuilder) super.id(id);
    }

    @Override
    public MarketAsyncRequestBuilder id(String id) {
        return (MarketAsyncRequestBuilder) super.id(id);
    }

    @Override
    public MarketAsyncRequestBuilder withComment(String comment) {
        return (MarketAsyncRequestBuilder) super.withComment(comment);
    }

    @Override
    public MarketAsyncRequestBuilder withParameter(String key, Object value) {
        return (MarketAsyncRequestBuilder) super.withParameter(key, value);
    }

    @Override
    public MarketAsyncRequestBuilder withSelections(String... selections) {
        return (MarketAsyncRequestBuilder) super.withSelections(selections);
    }

    @Override
    public MarketAsyncRequestBuilder withKey(String key) {
        return (MarketAsyncRequestBuilder) super.withKey(key);
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
