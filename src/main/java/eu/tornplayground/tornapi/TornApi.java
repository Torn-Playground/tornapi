package eu.tornplayground.tornapi;

import com.fasterxml.jackson.databind.JsonNode;
import eu.tornplayground.tornapi.connector.ApiConnector;
import eu.tornplayground.tornapi.connector.TornHttpException;
import eu.tornplayground.tornapi.keyprovider.KeyProvider;
import eu.tornplayground.tornapi.selections.*;
import net.moznion.uribuildertiny.URIBuilderTiny;

import java.io.IOException;
import java.net.URI;
import java.util.*;
import java.util.stream.Collectors;

public class TornApi {

    private final ApiConnector connector;
    private final KeyProvider keyProvider;
    private String defaultComment;

    public TornApi(ApiConnector connector, KeyProvider keyProvider) {
        this.connector = connector;
        this.keyProvider = keyProvider;
    }

    public TornApi(ApiConnector connector) {
        this(connector, null);
    }

    public String getDefaultComment() {
        return defaultComment;
    }

    public void setDefaultComment(String defaultComment) {
        this.defaultComment = defaultComment;
    }

    public <T extends Selection> ApiSection<T> forCategory(String category, @SuppressWarnings("unused") Class<T> selectionType) {
        return new ApiSection<>(category, defaultComment);
    }

    public ApiSection<UserSelections> forUsers() {
        return forCategory("user", UserSelections.class);
    }

    public ApiSection<PropertiesSelections> forProperties() {
        return forCategory("property", PropertiesSelections.class);
    }

    public ApiSection<FactionSelections> forFaction() {
        return forCategory("faction", FactionSelections.class);
    }

    public ApiSection<CompanySelections> forCompany() {
        return forCategory("company", CompanySelections.class);
    }

    public ApiSection<ItemMarketSelections> forMarket() {
        return forCategory("market", ItemMarketSelections.class);
    }

    public ApiSection<TornSelections> forTorn() {
        return forCategory("torn", TornSelections.class);
    }

    public ApiSection<KeySelections> forKey() {
        return forCategory("key", KeySelections.class);
    }

    public static class RequestData {

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

    }

    public class ApiSection<T extends Selection> {

        private final String section;

        private final Set<String> selections = new HashSet<>();
        private final Map<String, Object> parameters = new HashMap<>();

        private String key;
        private String id;
        private String comment;

        private boolean usedProvider = false;

        private ApiSection(String section, String defaultComment) {
            this.section = section;
            this.comment = defaultComment;
        }

        /**
         * Set the id for the connection.
         */
        public ApiSection<T> id(long id) {
            return id(Long.toString(id));
        }

        /**
         * Set the id for the connection.
         */
        public ApiSection<T> id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Add selections to the connection.
         */
        @SafeVarargs
        public final ApiSection<T> withSelections(T... selections) {
            this.selections.addAll(Arrays.stream(selections)
                    .map(Selection::getSelection)
                    .collect(Collectors.toList()));
            return this;
        }

        /**
         * Add selections to the connection.
         */
        public ApiSection<T> withSelections(String... selections) {
            this.selections.addAll(List.of(selections));
            return this;
        }

        /**
         * Add selections to the connection.
         */
        public ApiSection<T> withParameter(String key, Object value) {
            this.parameters.put(key, value);
            return this;
        }

        /**
         * Add selections to the connection.
         */
        public ApiSection<T> withComment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * Set key to be used by the connection.
         */
        public ApiSection<T> key(String key) {
            this.key = key;
            usedProvider = false;
            return this;
        }

        /**
         * Consume a key using the KeyProvider.
         */
        public ApiSection<T> consumeKey() {
            Objects.requireNonNull(keyProvider);

            this.key = keyProvider.next();
            usedProvider = true;
            return this;
        }

        private URI buildUri() {
            Objects.requireNonNull(key);

            URIBuilderTiny uriBuilder = new URIBuilderTiny()
                    .setScheme("https")
                    .setHost("api.torn.com")
                    .setPaths(section);

            if (id != null) uriBuilder.appendPaths(id);

            uriBuilder.setQueryParameters(parameters);
            if (comment != null) uriBuilder.addQueryParameter("comment", comment);
            uriBuilder.addQueryParameter("selections", String.join(",", selections));
            uriBuilder.addQueryParameter("key", key);

            return uriBuilder.build();
        }

        public JsonNode fetch() throws IOException, InterruptedException, TornHttpException {
            URI uri = buildUri();

            JsonNode result = connector.connect(uri.toString());

            if (usedProvider) {
                RequestData request = new RequestData(key, id, section, selections, parameters);

                keyProvider.listener(request, result);
            }

            return result;
        }

    }

    //    private final ApiConnector connector;
//    private final String section;
//
//    public TornApi(ApiConnector connector, T anySelection) {
//        this.connector = connector;
//        this.section = anySelection.getSection();
//    }
//
//    public static TornApi<UserSelections> forUser(ApiConnector connector) {
//        return new TornApi<>(connector, UserSelections.PROFILE);
//    }
//
//    public static TornApi<PropertiesSelections> forProperty(ApiConnector connector) {
//        return new TornApi<>(connector, PropertiesSelections.PROPERTY);
//    }
//
//    public static TornApi<FactionSelections> forFaction(ApiConnector connector) {
//        return new TornApi<>(connector, FactionSelections.BASIC);
//    }
//
//    public static TornApi<CompanySelections> forCompany(ApiConnector connector) {
//        return new TornApi<>(connector, CompanySelections.PROFILE);
//    }
//
//    public static TornApi<ItemMarketSelections> forItemMarket(ApiConnector connector) {
//        return new TornApi<>(connector, ItemMarketSelections.BAZAAR);
//    }
//
//    public static TornApi<TornSelections> forTorn(ApiConnector connector) {
//        return new TornApi<>(connector, TornSelections.TIMESTAMP);
//    }
//
//    public static TornApi<KeySelections> forKey(ApiConnector connector) {
//        return new TornApi<>(connector, KeySelections.INFO);
//    }
//
//    public JSONObject fetchCurrent(SelectionList<T> selections, String key) throws IOException, InterruptedException {
//        return fetch(section, null, selections, key, null);
//    }
//
//    public JSONObject fetchCurrent(SelectionList<T> selections, String key, Map<String, Object> parameters) throws IOException, InterruptedException {
//        return fetch(section, null, selections, key, parameters);
//    }
//
//    public JSONObject fetch(long id, SelectionList<T> selections, String key) throws IOException, InterruptedException {
//        return fetch(section, Long.toString(id), selections, key, null);
//    }
//
//    public JSONObject fetch(String id, SelectionList<T> selections, String key) throws IOException, InterruptedException {
//        return fetch(section, id, selections, key, null);
//    }
//
//    public JSONObject fetch(long id, SelectionList<T> selections, String key, Map<String, Object> parameters) throws IOException, InterruptedException {
//        return fetch(section, Long.toString(id), selections, key, parameters);
//    }
//
//    public JSONObject fetch(String id, SelectionList<T> selections, String key, Map<String, Object> parameters) throws IOException, InterruptedException {
//        return fetch(section, id, selections, key, parameters);
//    }
//
//    private JSONObject fetch(String category, String id, SelectionList<T> selections, String key, Map<String, Object> parameters) throws IOException, InterruptedException {
//        Objects.requireNonNull(category);
//        Objects.requireNonNull(selections);
//        Objects.requireNonNull(key);
//        if (parameters == null) parameters = new HashMap<>();
//
//        URIBuilderTiny uriBuilder = new URIBuilderTiny()
//                .setScheme("https")
//                .setHost("api.torn.com")
//                .setPaths(category);
//
//        if (id != null) uriBuilder.appendPaths(id);
//
//        uriBuilder.setQueryParameters(parameters);
//        uriBuilder.addQueryParameter("selections", String.join(",", selections.toCollection()));
//        uriBuilder.addQueryParameter("key", key);
//
//        return connector.connect(uriBuilder.build().toString());
//    }


}
