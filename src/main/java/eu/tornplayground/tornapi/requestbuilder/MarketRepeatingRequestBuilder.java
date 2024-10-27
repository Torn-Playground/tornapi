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
