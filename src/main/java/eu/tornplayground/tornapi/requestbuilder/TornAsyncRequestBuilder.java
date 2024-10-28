package eu.tornplayground.tornapi.requestbuilder;

import eu.tornplayground.tornapi.RequestBuilder;
import eu.tornplayground.tornapi.TornApi;
import eu.tornplayground.tornapi.mappers.TornMapper;
import eu.tornplayground.tornapi.models.torn.*;
import eu.tornplayground.tornapi.selections.TornSelections;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class TornAsyncRequestBuilder extends RequestBuilder<TornAsyncRequestBuilder, TornSelections> {

    public TornAsyncRequestBuilder(TornApi tornApi) {
        super(tornApi, "torn");
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
