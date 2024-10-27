package eu.tornplayground.tornapi.requestbuilder;

import eu.tornplayground.tornapi.RequestBuilder;
import eu.tornplayground.tornapi.TornApi;
import eu.tornplayground.tornapi.TornErrorException;
import eu.tornplayground.tornapi.connector.TornHttpException;
import eu.tornplayground.tornapi.limiter.RequestLimitReachedException;
import eu.tornplayground.tornapi.mappers.MarketMapper;
import eu.tornplayground.tornapi.models.market.MarketItem;
import eu.tornplayground.tornapi.models.market.PointOrder;
import eu.tornplayground.tornapi.selections.ItemMarketSelections;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class MarketRequestBuilder extends RequestBuilder<ItemMarketSelections> {

    public MarketRequestBuilder(TornApi tornApi) {
        super(tornApi, "market");
    }

    @Override
    public MarketRequestBuilder withTornErrorException(boolean throwError) {
        super.withTornErrorException(throwError);
        return this;
    }

    public List<MarketItem> fetchBazaar() throws TornHttpException, TornErrorException, RequestLimitReachedException, IOException {
        return fetch(ItemMarketSelections.BAZAAR, MarketMapper::ofBazaar);
    }

    public List<MarketItem> fetchItemMarket() throws TornHttpException, TornErrorException, RequestLimitReachedException, IOException {
        return fetch(ItemMarketSelections.ITEMMARKET, MarketMapper::ofItemMarket);
    }

    public Map<Long, PointOrder> fetchPointsMarket() throws TornHttpException, TornErrorException, RequestLimitReachedException, IOException {
        return fetch(ItemMarketSelections.POINTSMARKET, MarketMapper::ofPointsMarket);
    }

}
