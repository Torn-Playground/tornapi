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

public class TornRequestBuilder extends RequestBuilder<TornSelections> {

    public TornRequestBuilder(TornApi tornApi) {
        super(tornApi, "torn");
    }

    @Override
    public TornRequestBuilder withTornErrorException(boolean throwError) {
        super.withTornErrorException(throwError);
        return this;
    }

    @Override
    public TornRequestBuilder id(long id) {
        return (TornRequestBuilder) super.id(id);
    }

    @Override
    public TornRequestBuilder id(String id) {
        return (TornRequestBuilder) super.id(id);
    }

    @Override
    public TornRequestBuilder withComment(String comment) {
        return (TornRequestBuilder) super.withComment(comment);
    }

    @Override
    public TornRequestBuilder withParameter(String key, Object value) {
        return (TornRequestBuilder) super.withParameter(key, value);
    }

    @Override
    public TornRequestBuilder withSelections(String... selections) {
        return (TornRequestBuilder) super.withSelections(selections);
    }

    @Override
    public TornRequestBuilder withKey(String key) {
        return (TornRequestBuilder) super.withKey(key);
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
