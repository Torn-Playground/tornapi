package eu.tornplayground.tornapi.cache;

import com.fasterxml.jackson.databind.JsonNode;

public interface ResponseCache {
    void put(Integer requestDataHash, JsonNode data);

    JsonNode get(Integer requestDataHash);

    boolean contains(Integer requestDataHash);
}
