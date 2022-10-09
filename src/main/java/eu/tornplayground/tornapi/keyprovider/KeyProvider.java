package eu.tornplayground.tornapi.keyprovider;

import com.fasterxml.jackson.databind.JsonNode;
import eu.tornplayground.tornapi.TornApi;

public interface KeyProvider {

    String next();

    default void listener(TornApi.RequestData request, JsonNode data) {
    }

}
