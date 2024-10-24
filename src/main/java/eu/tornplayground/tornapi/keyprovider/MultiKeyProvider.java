package eu.tornplayground.tornapi.keyprovider;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MultiKeyProvider implements KeyProvider {

    private final LinkedList<String> keys;

    public MultiKeyProvider(String... keys) {
        this.keys = new LinkedList<>(List.of(keys));
    }

    @Override
    public String next() {
        final String nextKey = keys.pollFirst();
        keys.add(nextKey);
        return nextKey;
    }
}
