package eu.tornplayground.tornapi.cache;

import tools.jackson.databind.JsonNode;
import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;

import java.util.concurrent.TimeUnit;

/**
 * Default implementation of the response cache.
 * Caches responses for 30 seconds, which is the default limitation of the Torn API.
 */
public class DefaultResponseCache implements ResponseCache {

    private final Cache<Integer, JsonNode> cache;

    public DefaultResponseCache() {
        this.cache = Caffeine.newBuilder()
                .expireAfterWrite(30, TimeUnit.SECONDS)
                .build();
    }

    @Override
    public JsonNode get(Integer requestDataHash) {
        return cache.getIfPresent(requestDataHash);
    }

    @Override
    public void put(Integer requestDataHash, JsonNode data) {
        cache.put(requestDataHash, data);
    }

    @Override
    public boolean contains(Integer requestDataHash) {
        return cache.getIfPresent(requestDataHash) != null;
    }

}
