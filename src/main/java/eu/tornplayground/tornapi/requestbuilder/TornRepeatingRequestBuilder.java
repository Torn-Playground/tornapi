package eu.tornplayground.tornapi.requestbuilder;

import eu.tornplayground.tornapi.RepeatingRequestTask;
import eu.tornplayground.tornapi.RequestBuilder;
import eu.tornplayground.tornapi.TornApi;
import eu.tornplayground.tornapi.mappers.TornMapper;
import eu.tornplayground.tornapi.models.torn.*;
import eu.tornplayground.tornapi.selections.TornSelections;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class TornRepeatingRequestBuilder extends RequestBuilder<TornSelections> {

    public TornRepeatingRequestBuilder(TornApi tornApi) {
        super(tornApi, "torn");
    }

    @Override
    public TornRepeatingRequestBuilder withTornErrorException(boolean throwError) {
        super.withTornErrorException(throwError);
        return this;
    }

    public RepeatingRequestTask<Map<Long, CompanyType>> repeatCompanies(int intervalInSeconds, Consumer<Map<Long, CompanyType>> consumer) {
        return repeating(TornSelections.COMPANIES, intervalInSeconds, TornMapper::ofCompanies, consumer);
    }

    public RepeatingRequestTask<Map<Long, TornItem>> repeatItems(int intervalInSeconds, Consumer<Map<Long, TornItem>> consumer) {
        return repeating(TornSelections.ITEMS, intervalInSeconds, TornMapper::ofItems, consumer);
    }

    public RepeatingRequestTask<Map<Long, Stock>> repeatStocks(int intervalInSeconds, Consumer<Map<Long, Stock>> consumer) {
        return repeating(TornSelections.STOCKS, intervalInSeconds, TornMapper::ofStocks, consumer);
    }

    public RepeatingRequestTask<TornStats> repeatStats(int intervalInSeconds, Consumer<TornStats> consumer) {
        return repeating(TornSelections.STATS, intervalInSeconds, TornMapper::ofStats, consumer);
    }

    public RepeatingRequestTask<Map<String, List<ShopLiftingSecurity>>> repeatShoplifting(int intervalInSeconds, Consumer<Map<String, List<ShopLiftingSecurity>>> consumer) {
        return repeating(TornSelections.SHOPLIFTING, intervalInSeconds, TornMapper::ofShoplifting, consumer);
    }

    public RepeatingRequestTask<PawnShop> repeatPawnShop(int intervalInSeconds, Consumer<PawnShop> consumer) {
        return repeating(TornSelections.PAWNSHOP, intervalInSeconds, TornMapper::ofPawnShop, consumer);
    }

}
