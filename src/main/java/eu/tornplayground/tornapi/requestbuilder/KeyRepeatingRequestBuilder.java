package eu.tornplayground.tornapi.requestbuilder;

import eu.tornplayground.tornapi.RepeatingRequestTask;
import eu.tornplayground.tornapi.RequestBuilder;
import eu.tornplayground.tornapi.TornApi;
import eu.tornplayground.tornapi.mappers.KeyMapper;
import eu.tornplayground.tornapi.models.info.KeyInfo;
import eu.tornplayground.tornapi.selections.KeySelections;

import java.util.function.Consumer;

public class KeyRepeatingRequestBuilder extends RequestBuilder<KeySelections> {

    public KeyRepeatingRequestBuilder(TornApi tornApi) {
        super(tornApi, "key");
    }

    @Override
    public KeyRepeatingRequestBuilder withTornErrorException(boolean throwError) {
        super.withTornErrorException(throwError);
        return this;
    }

    @Override
    public KeyRepeatingRequestBuilder id(long id) {
        return (KeyRepeatingRequestBuilder) super.id(id);
    }

    @Override
    public KeyRepeatingRequestBuilder id(String id) {
        return (KeyRepeatingRequestBuilder) super.id(id);
    }

    @Override
    public KeyRepeatingRequestBuilder withComment(String comment) {
        return (KeyRepeatingRequestBuilder) super.withComment(comment);
    }

    @Override
    public KeyRepeatingRequestBuilder withParameter(String key, Object value) {
        return (KeyRepeatingRequestBuilder) super.withParameter(key, value);
    }

    @Override
    public KeyRepeatingRequestBuilder withSelections(String... selections) {
        return (KeyRepeatingRequestBuilder) super.withSelections(selections);
    }

    @Override
    public KeyRepeatingRequestBuilder withKey(String key) {
        return (KeyRepeatingRequestBuilder) super.withKey(key);
    }

    public RepeatingRequestTask<KeyInfo> repeatInfo(int intervalInSeconds, Consumer<KeyInfo> consumer) {
        return repeating(KeySelections.INFO, intervalInSeconds, KeyMapper::ofInfo, consumer);
    }

}
