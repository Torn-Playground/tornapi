package eu.tornplayground.tornapi;

import com.fasterxml.jackson.databind.JsonNode;
import eu.tornplayground.tornapi.connector.TornHttpException;
import eu.tornplayground.tornapi.limiter.RequestLimitReachedException;
import eu.tornplayground.tornapi.models.TornError;

import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

public class RepeatingRequestTask<T> {
    private static final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors() * 2);
    private final long intervalInSeconds;
    private Consumer<T> resultConsumer;
    private BiConsumer<TornError, RepeatingRequestTask<T>> tornErrorHandler;
    private BiConsumer<Exception, RepeatingRequestTask<T>> exceptionHandler;
    private Consumer<RepeatingRequestTask<T>> requestLimitReachedHandler;
    private ScheduledFuture<?> scheduledFuture;
    private final RequestBuilder<?> requestBuilder;
    private Function<JsonNode, T> mapping;

    public RepeatingRequestTask(long intervalInSeconds, RequestBuilder<?> requestBuilder, Consumer<T> consumer) {
        this.intervalInSeconds = intervalInSeconds;
        this.requestBuilder = requestBuilder;
        this.resultConsumer = consumer;
    }
    /**
     * @param exceptionHandler BiConsumer to handle exceptions which are not handled in {@link RepeatingRequestTask#handleTornError}
     */
    public RepeatingRequestTask<T> handleException(BiConsumer<Exception, RepeatingRequestTask<T>> exceptionHandler) {
        this.exceptionHandler = exceptionHandler;
        return this;
    }

    /**
     * @param tornErrorHandler handle {@link TornApiErrorException}
     */
    public RepeatingRequestTask<T> handleTornError(BiConsumer<TornError, RepeatingRequestTask<T>> tornErrorHandler) {
        this.tornErrorHandler = tornErrorHandler;
        return this;
    }

    /**
     * @param requestLimitReachedHandler handle {@link RequestLimitReachedException}
     */
    public RepeatingRequestTask<T> handleRequestLimitReached(Consumer<RepeatingRequestTask<T>> requestLimitReachedHandler) {
        this.requestLimitReachedHandler = requestLimitReachedHandler;
        return this;
    }

    protected RepeatingRequestTask<T> withMapping(Function<JsonNode, T> mapping) {
        this.mapping = mapping;
        return this;
    }

    public RepeatingRequestTask<T> start() {
        scheduledFuture = scheduler.scheduleAtFixedRate(() -> {
            try {
                if (requestBuilder.getTornApi().hasAutomaticKeyConsumption()) requestBuilder.consumeKey();

                final JsonNode result = requestBuilder.fetch();
                if (resultConsumer != null) {
                    resultConsumer.accept(mapping.apply(result));
                }
            } catch (TornApiErrorException e) {
                if (tornErrorHandler != null) {
                    tornErrorHandler.accept(e.getTornError(), this);
                }
            } catch (RequestLimitReachedException e) {
                if (requestLimitReachedHandler != null) {
                    requestLimitReachedHandler.accept(this);
                }
            } catch (IOException | InterruptedException | TornHttpException  e) {
                if (exceptionHandler == null) {
                    stop();
                    Thread.currentThread().interrupt();
                } else {
                    exceptionHandler.accept(e, this);
                }
            }
        }, 0, intervalInSeconds, TimeUnit.SECONDS);

        return this;
    }

    public void stop() {
        if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
            scheduledFuture.cancel(true);
        }
    }
}
