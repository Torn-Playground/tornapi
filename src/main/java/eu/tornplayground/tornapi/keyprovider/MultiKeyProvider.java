package eu.tornplayground.tornapi.keyprovider;

import java.util.concurrent.atomic.AtomicInteger;

public class MultiKeyProvider implements KeyProvider {

    private final String[] keys;
    private final AtomicInteger currentKeyIndex = new AtomicInteger(0);

    public MultiKeyProvider(String... keys) {
        this.keys = keys;
    }

    @Override
    public String next() {
        return keys[currentKeyIndex.getAndUpdate(i -> (i + 1) % keys.length)];
    }

}
