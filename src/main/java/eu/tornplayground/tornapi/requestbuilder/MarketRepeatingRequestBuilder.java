package eu.tornplayground.tornapi.requestbuilder;

import eu.tornplayground.tornapi.RepeatingRequestTask;
import eu.tornplayground.tornapi.RequestBuilder;
import eu.tornplayground.tornapi.TornApi;
import eu.tornplayground.tornapi.mappers.MarketMapper;
import eu.tornplayground.tornapi.models.market.MarketItem;
import eu.tornplayground.tornapi.models.market.PointOrder;
import eu.tornplayground.tornapi.selections.ItemMarketSelections;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class MarketRepeatingRequestBuilder extends RequestBuilder<ItemMarketSelections> {

    public MarketRepeatingRequestBuilder(TornApi tornApi) {
        super(tornApi, "market");
    }

    @Override
    public MarketRepeatingRequestBuilder withTornErrorException(boolean throwError) {
        super.withTornErrorException(throwError);
        return this;
    }

    @Override
    public MarketRepeatingRequestBuilder id(long id) {
        return (MarketRepeatingRequestBuilder) super.id(id);
    }

    @Override
    public MarketRepeatingRequestBuilder id(String id) {
        return (MarketRepeatingRequestBuilder) super.id(id);
    }

    @Override
    public MarketRepeatingRequestBuilder withComment(String comment) {
        return (MarketRepeatingRequestBuilder) super.withComment(comment);
    }

    @Override
    public MarketRepeatingRequestBuilder withParameter(String key, Object value) {
        return (MarketRepeatingRequestBuilder) super.withParameter(key, value);
    }

    @Override
    public MarketRepeatingRequestBuilder withSelections(String... selections) {
        return (MarketRepeatingRequestBuilder) super.withSelections(selections);
    }

    @Override
    public MarketRepeatingRequestBuilder withKey(String key) {
        return (MarketRepeatingRequestBuilder) super.withKey(key);
    }

    public RepeatingRequestTask<List<MarketItem>> repeatBazaar(int intervalInSeconds, Consumer<List<MarketItem>> consumer) {
        return repeating(ItemMarketSelections.BAZAAR, intervalInSeconds, MarketMapper::ofBazaar, consumer);
    }

    public RepeatingRequestTask<List<MarketItem>> repeatItemMarket(int intervalInSeconds, Consumer<List<MarketItem>> consumer) {
        return repeating(ItemMarketSelections.ITEMMARKET, intervalInSeconds, MarketMapper::ofItemMarket, consumer);
    }

    public RepeatingRequestTask<Map<Long, PointOrder>> repeatPointsMarket(int intervalInSeconds, Consumer<Map<Long, PointOrder>> consumer) {
        return repeating(ItemMarketSelections.POINTSMARKET, intervalInSeconds, MarketMapper::ofPointsMarket, consumer);
    }

}
