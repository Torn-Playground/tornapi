package eu.tornplayground.tornapi.requestbuilder;

import eu.tornplayground.tornapi.RequestBuilder;
import eu.tornplayground.tornapi.TornApi;
import eu.tornplayground.tornapi.TornApiErrorException;
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

    public List<MarketItem> fetchBazaar() throws IOException, TornHttpException, InterruptedException, TornApiErrorException, RequestLimitReachedException {
        return fetch(ItemMarketSelections.BAZAAR, MarketMapper::ofBazaar);
    }

    public List<MarketItem> fetchItemMarket() throws IOException, TornHttpException, InterruptedException, TornApiErrorException, RequestLimitReachedException {
        return fetch(ItemMarketSelections.ITEMMARKET, MarketMapper::ofItemMarket);
    }

    public Map<Long, PointOrder> fetchPointsMarket() throws IOException, TornHttpException, InterruptedException, TornApiErrorException, RequestLimitReachedException {
        return fetch(ItemMarketSelections.POINTSMARKET, MarketMapper::ofPointsMarket);
    }
}
