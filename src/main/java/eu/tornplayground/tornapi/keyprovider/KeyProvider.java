package eu.tornplayground.tornapi.keyprovider;

import eu.tornplayground.tornapi.RequestData;
import tools.jackson.databind.JsonNode;

public interface KeyProvider {

    String next();

    default void listener(RequestData request, JsonNode data) {
    }

}
