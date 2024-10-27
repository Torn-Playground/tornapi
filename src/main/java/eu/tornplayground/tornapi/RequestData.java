package eu.tornplayground.tornapi;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Map;
import java.util.Objects;
import java.util.Set;

@Getter
@AllArgsConstructor
public class RequestData {

    private final String key;
    private final String id;
    private final String section;

    private final Set<String> selections;
    private final Map<String, Object> parameters;

    /**
     * Hash the request data for caching.
     * Excludes the parameters as they are not used for caching.
     */
    public int cacheHash() {
        return Objects.hash(key, id, section, selections);
    }

}
