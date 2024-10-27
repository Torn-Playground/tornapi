package eu.tornplayground.tornapi.keyprovider;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;

public class MultiKeyProvider implements KeyProvider {

    private final LinkedList<String> keys;
    private int currentKeyIndex = 0;

    public MultiKeyProvider(String... keys) {
        this.keys = new LinkedList<>(List.of(keys));
    }

    @Override
    public synchronized String next() {
        if (currentKeyIndex >= keys.size()) {
            currentKeyIndex = 0;
        }

        final String nextKey = keys.get(currentKeyIndex++);

        notifyAll();

        return nextKey;
    }
}
