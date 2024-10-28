package eu.tornplayground.tornapi.requestbuilder;

import eu.tornplayground.tornapi.RequestBuilder;
import eu.tornplayground.tornapi.TornApi;
import eu.tornplayground.tornapi.TornErrorException;
import eu.tornplayground.tornapi.connector.TornHttpException;
import eu.tornplayground.tornapi.limiter.RequestLimitReachedException;
import eu.tornplayground.tornapi.mappers.TornMapper;
import eu.tornplayground.tornapi.models.torn.*;
import eu.tornplayground.tornapi.selections.TornSelections;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class TornRequestBuilder extends RequestBuilder<TornRequestBuilder, TornSelections> {

    public TornRequestBuilder(TornApi tornApi) {
        super(tornApi, "torn");
    }

    public Map<Long, CompanyType> fetchCompanies() throws TornHttpException, TornErrorException, RequestLimitReachedException, IOException {
        return fetch(TornSelections.COMPANIES, TornMapper::ofCompanies);
    }

    public Map<Long, TornItem> fetchItems() throws TornHttpException, TornErrorException, RequestLimitReachedException, IOException {
        return fetch(TornSelections.ITEMS, TornMapper::ofItems);
    }

    public Map<Long, Stock> fetchStocks() throws TornHttpException, TornErrorException, RequestLimitReachedException, IOException {
        return fetch(TornSelections.STOCKS, TornMapper::ofStocks);
    }

    public TornStats fetchStats() throws TornHttpException, TornErrorException, RequestLimitReachedException, IOException {
        return fetch(TornSelections.STATS, TornMapper::ofStats);
    }

    public Map<String, List<ShopLiftingSecurity>> fetchShoplifting() throws TornHttpException, TornErrorException, RequestLimitReachedException, IOException {
        return fetch(TornSelections.SHOPLIFTING, TornMapper::ofShoplifting);
    }

    public PawnShop fetchPawnShop() throws TornHttpException, TornErrorException, RequestLimitReachedException, IOException {
        return fetch(TornSelections.PAWNSHOP, TornMapper::ofPawnShop);
    }

}
