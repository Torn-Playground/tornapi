package eu.tornplayground.tornapi;

import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class RequestData {

    private final String key;
    private final String id;
    private final String section;

    private final Set<String> selections;
    private final Map<String, Object> parameters;

    public RequestData(String key, String id, String section, Set<String> selections, Map<String, Object> parameters) {
        this.key = key;
        this.id = id;
        this.section = section;
        this.selections = selections;
        this.parameters = parameters;
    }

    public String getKey() {
        return key;
    }

    public String getId() {
        return id;
    }

    public String getSection() {
        return section;
    }

    public Set<String> getSelections() {
        return selections;
    }

    public Map<String, Object> getParameters() {
        return parameters;
    }

    /**
     * Hash the request data for caching.
     * Excludes the parameters as they are not used for caching.
     */
    public int cacheHash() {
        return Objects.hash(key, id, section, selections);
    }
}
