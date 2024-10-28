package eu.tornplayground.tornapi.requestbuilder;

import eu.tornplayground.tornapi.RequestBuilder;
import eu.tornplayground.tornapi.TornApi;
import eu.tornplayground.tornapi.mappers.KeyMapper;
import eu.tornplayground.tornapi.models.info.KeyInfo;
import eu.tornplayground.tornapi.selections.KeySelections;

import java.util.concurrent.CompletableFuture;

public class KeyAsyncRequestBuilder extends RequestBuilder<KeySelections> {

    public KeyAsyncRequestBuilder(TornApi tornApi) {
        super(tornApi, "key");
    }

    @Override
    public KeyAsyncRequestBuilder withTornErrorException(boolean throwError) {
        super.withTornErrorException(throwError);
        return this;
    }

    @Override
    public KeyAsyncRequestBuilder id(long id) {
        return (KeyAsyncRequestBuilder) super.id(id);
    }

    @Override
    public KeyAsyncRequestBuilder id(String id) {
        return (KeyAsyncRequestBuilder) super.id(id);
    }

    @Override
    public KeyAsyncRequestBuilder withComment(String comment) {
        return (KeyAsyncRequestBuilder) super.withComment(comment);
    }

    @Override
    public KeyAsyncRequestBuilder withParameter(String key, Object value) {
        return (KeyAsyncRequestBuilder) super.withParameter(key, value);
    }

    @Override
    public KeyAsyncRequestBuilder withSelections(String... selections) {
        return (KeyAsyncRequestBuilder) super.withSelections(selections);
    }

    @Override
    public KeyAsyncRequestBuilder withKey(String key) {
        return (KeyAsyncRequestBuilder) super.withKey(key);
    }

    public CompletableFuture<KeyInfo> fetchInfo() {
        return fetchAsync(KeySelections.INFO, KeyMapper::ofInfo);
    }

}
