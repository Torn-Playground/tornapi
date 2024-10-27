package eu.tornplayground.tornapi.requestbuilder;

import eu.tornplayground.tornapi.RequestBuilder;
import eu.tornplayground.tornapi.TornApi;
import eu.tornplayground.tornapi.TornApiErrorException;
import eu.tornplayground.tornapi.connector.TornHttpException;
import eu.tornplayground.tornapi.limiter.RequestLimitReachedException;
import eu.tornplayground.tornapi.mappers.TornMapper;
import eu.tornplayground.tornapi.models.torn.*;
import eu.tornplayground.tornapi.selections.TornSelections;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class TornRequestBuilder extends RequestBuilder<TornSelections> {
    public TornRequestBuilder(TornApi tornApi) {
        super(tornApi, "torn");
    }

    @Override
    public TornRequestBuilder throwTornError() {
        super.throwTornError();
        return this;
    }

    public Map<Long, CompanyType> fetchCompanies() throws IOException, TornHttpException, InterruptedException, TornApiErrorException, RequestLimitReachedException {
        return fetch(TornSelections.COMPANIES, TornMapper::ofCompanies);
    }

    public Map<Long, TornItem> fetchItems() throws IOException, TornHttpException, InterruptedException, TornApiErrorException, RequestLimitReachedException {
        return fetch(TornSelections.ITEMS, TornMapper::ofItems);
    }

    public Map<Long, Stock> fetchStocks() throws IOException, TornHttpException, InterruptedException, TornApiErrorException, RequestLimitReachedException {
        return fetch(TornSelections.STOCKS, TornMapper::ofStocks);
    }

    public TornStats fetchStats() throws IOException, TornHttpException, InterruptedException, TornApiErrorException, RequestLimitReachedException {
        return fetch(TornSelections.STATS, TornMapper::ofStats);
    }

    public Map<String, List<ShopLiftingSecurity>> fetchShoplifting() throws IOException, TornHttpException, InterruptedException, TornApiErrorException, RequestLimitReachedException {
        return fetch(TornSelections.SHOPLIFTING, TornMapper::ofShoplifting);
    }

    public PawnShop fetchPawnShop() throws IOException, TornHttpException, InterruptedException, TornApiErrorException, RequestLimitReachedException {
        return fetch(TornSelections.PAWNSHOP, TornMapper::ofPawnShop);
    }
}
