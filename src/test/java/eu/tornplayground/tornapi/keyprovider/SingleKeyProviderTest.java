package eu.tornplayground.tornapi.keyprovider;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SingleKeyProviderTest {

    private SingleKeyProvider keyProvider;

    @BeforeEach
    void setUp() {
        this.keyProvider = new SingleKeyProvider("some-key");
    }

    @Test
    void next() {
        String key = keyProvider.next();

        assertThat(key).isEqualTo("some-key");
    }

    @Test
    void nextMultiple() {
        for (int i = 0; i < 100; i++) {
            String key = keyProvider.next();

            int index = i;

            assertThat(key)
                    .withFailMessage(() -> String.format("Key failed after try #%s", index))
                    .isEqualTo("some-key");
        }
    }

}