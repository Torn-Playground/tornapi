package eu.tornplayground.tornapi.requestbuilder;

import eu.tornplayground.tornapi.RequestBuilder;
import eu.tornplayground.tornapi.TornApi;
import eu.tornplayground.tornapi.mappers.FactionMapper;
import eu.tornplayground.tornapi.models.faction.*;
import eu.tornplayground.tornapi.selections.FactionSelections;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class FactionAsyncRequestBuilder extends RequestBuilder<FactionSelections> {

    public FactionAsyncRequestBuilder(TornApi tornApi) {
        super(tornApi, "faction");
    }

    @Override
    public FactionAsyncRequestBuilder withTornErrorException(boolean throwError) {
        super.withTornErrorException(throwError);
        return this;
    }

    @Override
    public FactionAsyncRequestBuilder id(long id) {
        return (FactionAsyncRequestBuilder) super.id(id);
    }

    @Override
    public FactionAsyncRequestBuilder id(String id) {
        return (FactionAsyncRequestBuilder) super.id(id);
    }

    @Override
    public FactionAsyncRequestBuilder withComment(String comment) {
        return (FactionAsyncRequestBuilder) super.withComment(comment);
    }

    @Override
    public FactionAsyncRequestBuilder withParameter(String key, Object value) {
        return (FactionAsyncRequestBuilder) super.withParameter(key, value);
    }

    @Override
    public FactionAsyncRequestBuilder withSelections(String... selections) {
        return (FactionAsyncRequestBuilder) super.withSelections(selections);
    }

    @Override
    public FactionAsyncRequestBuilder withKey(String key) {
        return (FactionAsyncRequestBuilder) super.withKey(key);
    }

    public CompletableFuture<FactionBasic> fetchBasic() {
        return fetchAsync(FactionSelections.BASIC, FactionMapper::ofBasic);
    }

    public CompletableFuture<List<FactionAttacks>> fetchAttacks() {
        return fetchAsync(FactionSelections.ATTACKS, FactionMapper::ofAttacks);
    }

    public CompletableFuture<List<FactionAttacksFull>> fetchAttacksFull() {
        return fetchAsync(FactionSelections.ATTACKSFULL, FactionMapper::ofAttacksFull);
    }

    public CompletableFuture<List<RankedWar>> fetchRankedWars() {
        return fetchAsync(FactionSelections.RANKEDWARS, FactionMapper::ofRankedWar);
    }

    public CompletableFuture<Chain> fetchChain() {
        return fetchAsync(FactionSelections.CHAIN, FactionMapper::ofChain);
    }

}
