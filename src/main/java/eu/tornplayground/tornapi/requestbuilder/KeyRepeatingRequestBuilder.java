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

    public RepeatingRequestTask<KeyInfo> repeatInfo(int intervalInSeconds, Consumer<KeyInfo> consumer) {
        return repeating(KeySelections.INFO, intervalInSeconds,KeyMapper::ofInfo, consumer);
    }
}
