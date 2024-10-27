package eu.tornplayground.tornapi;

import com.fasterxml.jackson.databind.JsonNode;
import eu.tornplayground.tornapi.connector.TornHttpException;
import eu.tornplayground.tornapi.limiter.RequestLimitReachedException;
import eu.tornplayground.tornapi.limiter.RequestLimiter;
import eu.tornplayground.tornapi.mappers.ModelMapper;
import eu.tornplayground.tornapi.selections.Selection;
import net.moznion.uribuildertiny.URIBuilderTiny;

import java.io.IOException;
import java.net.URI;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public abstract class RequestBuilder<T extends Selection> {

    private final TornApi tornApi;
    private final String section;

    private final Set<String> selections = new HashSet<>();
    private final Map<String, Object> parameters = new HashMap<>();

    private String key;
    private String overwrittenKey;
    private String id;
    private String comment;

    private boolean usedProvider = false;
    private boolean throwTornError = false;

    protected RequestBuilder(TornApi tornApi, String section) {
        this.tornApi = tornApi;
        this.section = section;
        this.comment = tornApi.getComment();
    }

    protected TornApi getTornApi() {
        return tornApi;
    }

    /**
     * Set the id for the connection.
     */
    public RequestBuilder<T> id(long id) {
        return id(Long.toString(id));
    }

    /**
     * Set the id for the connection.
     */
    public RequestBuilder<T> id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Add selections to the connection.
     */
    @SafeVarargs
    public final RequestBuilder<T> withSelections(T... selections) {
        this.selections.addAll(Arrays.stream(selections)
                .map(Selection::getSelection)
                .collect(Collectors.toList()));
        return this;
    }

    /**
     * Add selections to the connection.
     */
    public RequestBuilder<T> withSelections(String... selections) {
        this.selections.addAll(List.of(selections));
        return this;
    }

    /**
     * Add selections to the connection.
     */
    public RequestBuilder<T> withParameter(String key, Object value) {
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Add selections to the connection.
     */
    public RequestBuilder<T> withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Set key to be used by the connection.
     */
    public RequestBuilder<T> withKey(String key) {
        this.overwrittenKey = key;
        usedProvider = false;
        return this;
    }

    /**
     * Consume a key using the KeyProvider.
     */
    public RequestBuilder<T> consumeKey() {
        Objects.requireNonNull(tornApi.getKeyProvider());

        this.key = tornApi.getKeyProvider().next();
        usedProvider = true;
        return this;
    }

    protected String getKey() {
        return overwrittenKey == null ? key : overwrittenKey;
    }

    /**
     * Catch torn errors and throw a {@link TornErrorException} instead of returning the error in the JsonNode.
     */
    public RequestBuilder<T> withTornErrorException(boolean throwTornError) {
        this.throwTornError = throwTornError;
        return this;
    }

    protected URI buildUri() {
        Objects.requireNonNull(getKey());

        URIBuilderTiny uriBuilder = new URIBuilderTiny()
                .setScheme("https")
                .setHost("api.torn.com")
                .setPaths(section);

        if (id != null) uriBuilder.appendPaths(id);

        uriBuilder.setQueryParameters(parameters);
        if (comment != null) uriBuilder.addQueryParameter("comment", comment);
        uriBuilder.addQueryParameter("selections", String.join(",", selections));
        uriBuilder.addQueryParameter("key", getKey());

        return uriBuilder.build();
    }

    /**
     * Fetch data from the API.
     */
    public JsonNode fetch() throws TornHttpException, RequestLimitReachedException, IOException, TornErrorException {
        if (overwrittenKey == null && tornApi.hasAutomaticKeyConsumption()) {
            consumeKey();
        }

        final RequestData request = new RequestData(getKey(), id, section, selections, parameters);

        if (tornApi.getResponseCache() != null && tornApi.getResponseCache().contains(request.cacheHash())) {
            return tornApi.getResponseCache().get(request.cacheHash());
        }

        if (tornApi.getRequestLimiter() != null) {
            try {
                tornApi.getRequestLimiter().handleRequest(getKey());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                // at this point there is an issue with the wrapper itself and the user should not have to "handle" that, because he can't really do anything about it
                throw new RuntimeException("Something went horribly wrong, while waiting for the limiter", e);
            }
        }

        final URI uri = buildUri();
        final JsonNode result;

        try {
            result = tornApi.getConnector().connect(uri.toString());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            // at this point there is an issue with the wrapper itself and the user should not have to "handle" that, because he can't really do anything about it
            throw new RuntimeException("Something went horribly wrong, while trying to fetch the data", e);
        }

        if (throwTornError && ModelMapper.hasError(result)) {
            throw new TornErrorException(ModelMapper.ofError(result));
        }

        if (usedProvider) {
            tornApi.getKeyProvider().listener(request, result);
        }

        if (tornApi.getResponseCache() != null && !ModelMapper.hasError(result)) {
            tornApi.getResponseCache().put(request.cacheHash(), result);
        }

        return result;
    }

    protected <V> V fetch(T selection, Function<JsonNode, V> mapping) throws IOException, TornHttpException, RequestLimitReachedException, TornErrorException {
        withSelections(selection);
        return mapping.apply(fetch());
    }

    public CompletableFuture<JsonNode> fetchAsync() {
        return CompletableFuture.supplyAsync(() -> {
            try {
                return fetch();
            } catch (Exception e) {
                throw new CompletionException(e);
            }
        });
    }

    protected <V> CompletableFuture<V> fetchAsync(T selection, Function<JsonNode, V> mapping) {
        withSelections(selection);
        return fetchAsync().thenApply(mapping);
    }

    /**
     * Repeatedly fetch data from the API and consume it.
     * Does not ignore the {@link RequestLimiter}, if one is configured.
     * Enabled {@link RequestBuilder#withTornErrorException(boolean)} automaically for handling them in {@link RepeatingRequestTask#handleTornError(BiConsumer)}.
     *
     * @param intervalInSeconds in milliseconds
     */
    public RepeatingRequestTask<JsonNode> repeating(long intervalInSeconds, Consumer<JsonNode> consumer) {
        withTornErrorException(true);
        return new RepeatingRequestTask<>(intervalInSeconds, this, consumer);
    }

    protected <V> RepeatingRequestTask<V> repeating(T selection, long intervalInSeconds, Function<JsonNode, V> mapping, Consumer<V> consumer) {
        withSelections(selection);
        return new RepeatingRequestTask<>(intervalInSeconds, this, consumer)
                .withMapping(mapping);
    }
}
