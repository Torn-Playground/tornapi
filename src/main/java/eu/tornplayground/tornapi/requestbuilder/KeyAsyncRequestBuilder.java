package eu.tornplayground.tornapi.requestbuilder;

import eu.tornplayground.tornapi.TornApi;
import eu.tornplayground.tornapi.mappers.KeyMapper;
import eu.tornplayground.tornapi.models.info.KeyInfo;
import eu.tornplayground.tornapi.selections.KeySelections;

import java.util.concurrent.CompletableFuture;

public class KeyAsyncRequestBuilder extends RequestBuilder<KeyAsyncRequestBuilder, KeySelections> {

    public KeyAsyncRequestBuilder(TornApi tornApi) {
        super(tornApi, "key");
    }

    @Override
    public KeyAsyncRequestBuilder withTornErrorException(boolean throwError) {
        super.withTornErrorException(throwError);
        return this;
    }

    public CompletableFuture<KeyInfo> fetchInfo() {
        return fetchAsync(KeySelections.INFO, KeyMapper::ofInfo);
    }

}
