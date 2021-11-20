package be.dekleinekobini.tornapi.keyprovider;

public class SingleKeyProvider implements KeyProvider {

    private final String key;

    public SingleKeyProvider(String key) {
        this.key = key;
    }

    @Override
    public String next() {
        return key;
    }

}
