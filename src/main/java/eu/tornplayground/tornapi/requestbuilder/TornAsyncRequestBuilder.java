package eu.tornplayground.tornapi.requestbuilder;

import eu.tornplayground.tornapi.RequestBuilder;
import eu.tornplayground.tornapi.TornApi;
import eu.tornplayground.tornapi.mappers.TornMapper;
import eu.tornplayground.tornapi.models.torn.*;
import eu.tornplayground.tornapi.selections.TornSelections;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class TornAsyncRequestBuilder extends RequestBuilder<TornSelections> {

    public TornAsyncRequestBuilder(TornApi tornApi) {
        super(tornApi, "torn");
    }

    @Override
    public TornAsyncRequestBuilder withTornErrorException(boolean throwError) {
        super.withTornErrorException(throwError);
        return this;
    }

    @Override
    public TornAsyncRequestBuilder id(long id) {
        return (TornAsyncRequestBuilder) super.id(id);
    }

    @Override
    public TornAsyncRequestBuilder id(String id) {
        return (TornAsyncRequestBuilder) super.id(id);
    }

    @Override
    public TornAsyncRequestBuilder withComment(String comment) {
        return (TornAsyncRequestBuilder) super.withComment(comment);
    }

    @Override
    public TornAsyncRequestBuilder withParameter(String key, Object value) {
        return (TornAsyncRequestBuilder) super.withParameter(key, value);
    }

    @Override
    public TornAsyncRequestBuilder withSelections(String... selections) {
        return (TornAsyncRequestBuilder) super.withSelections(selections);
    }

    @Override
    public TornAsyncRequestBuilder withKey(String key) {
        return (TornAsyncRequestBuilder) super.withKey(key);
    }

    public CompletableFuture<Map<Long, CompanyType>> fetchCompanies() {
        return fetchAsync(TornSelections.COMPANIES, TornMapper::ofCompanies);
    }

    public CompletableFuture<Map<Long, TornItem>> fetchItems() {
        return fetchAsync(TornSelections.ITEMS, TornMapper::ofItems);
    }

    public CompletableFuture<Map<Long, Stock>> fetchStocks() {
        return fetchAsync(TornSelections.STOCKS, TornMapper::ofStocks);
    }

    public CompletableFuture<TornStats> fetchStats() {
        return fetchAsync(TornSelections.STATS, TornMapper::ofStats);
    }

    public CompletableFuture<Map<String, List<ShopLiftingSecurity>>> fetchShoplifting() {
        return fetchAsync(TornSelections.SHOPLIFTING, TornMapper::ofShoplifting);
    }

    public CompletableFuture<PawnShop> fetchPawnShop() {
        return fetchAsync(TornSelections.PAWNSHOP, TornMapper::ofPawnShop);
    }

}
