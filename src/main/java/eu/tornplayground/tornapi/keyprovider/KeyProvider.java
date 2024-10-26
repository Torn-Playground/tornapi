package eu.tornplayground.tornapi.keyprovider;

import com.fasterxml.jackson.databind.JsonNode;
import eu.tornplayground.tornapi.RequestData;

public interface KeyProvider {

    String next();

    default void listener(RequestData request, JsonNode data) {
    }

}
