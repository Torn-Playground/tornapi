package eu.tornplayground.tornapi;

import com.fasterxml.jackson.databind.JsonNode;
import eu.tornplayground.tornapi.limiter.RequestLimitReachedException;
import eu.tornplayground.tornapi.models.TornError;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

public class RepeatingRequestTask<T> {
    private static int counter = 0;
    private final long intervalInSeconds;
    private final Consumer<T> resultConsumer;
    private final RequestBuilder<?> requestBuilder;
    private boolean taskStopped = false;

    private BiConsumer<TornError, RepeatingRequestTask<T>> tornErrorHandler;
    private BiConsumer<Exception, RepeatingRequestTask<T>> exceptionHandler;
    private Consumer<RepeatingRequestTask<T>> requestLimitReachedHandler;
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

    public synchronized RepeatingRequestTask<T> start() {
        new Thread(() -> {
            Thread.currentThread().setName("RepeatingRequestTask-" + counter++);
            while (!taskStopped) {
                try {
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
                } catch (Exception exception) {
                    if (exceptionHandler == null) {
                        Thread.currentThread().interrupt();
                    } else {
                        exceptionHandler.accept(exception, this);
                    }
                } finally {
                    try {
                        Thread.sleep(intervalInSeconds * 1000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }).start();

        return this;
    }

    public void stop() {
        taskStopped = true;
    }
}
