package eu.tornplayground.tornapi.requestbuilder;

import eu.tornplayground.tornapi.RequestBuilder;
import eu.tornplayground.tornapi.TornApi;
import eu.tornplayground.tornapi.TornErrorException;
import eu.tornplayground.tornapi.connector.TornHttpException;
import eu.tornplayground.tornapi.limiter.RequestLimitReachedException;
import eu.tornplayground.tornapi.mappers.KeyMapper;
import eu.tornplayground.tornapi.models.info.KeyInfo;
import eu.tornplayground.tornapi.selections.KeySelections;

import java.io.IOException;

public class KeyRequestBuilder extends RequestBuilder<KeySelections> {
    public KeyRequestBuilder(TornApi tornApi) {
        super(tornApi, "key");
    }

    @Override
    public KeyRequestBuilder withTornErrorException(boolean throwError) {
        super.withTornErrorException(throwError);
        return this;
    }

    public KeyInfo fetchInfo() throws TornHttpException, TornErrorException, RequestLimitReachedException, IOException {
        return fetch(KeySelections.INFO, KeyMapper::ofInfo);
    }
}
