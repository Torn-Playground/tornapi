package be.dekleinekobini.tornapi.keyprovider;

import be.dekleinekobini.tornapi.TornApi.RequestData;
import com.fasterxml.jackson.databind.JsonNode;

public interface KeyProvider {

    String next();

    default void listener(RequestData request, JsonNode data) {
    }

}
