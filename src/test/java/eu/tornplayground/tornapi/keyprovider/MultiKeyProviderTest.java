package eu.tornplayground.tornapi.keyprovider;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MultiKeyProviderTest {

    private KeyProvider keyProvider;

    @BeforeEach
    void setUp() {
        this.keyProvider = new MultiKeyProvider("some-key", "some-other-key");
    }

    @Test
    void next() {
        assertThat(keyProvider.next()).isEqualTo("some-key");
        assertThat(keyProvider.next()).isEqualTo("some-other-key");
        assertThat(keyProvider.next()).isEqualTo("some-key");
    }

    @Test
    void nextMultiple() {
        for (int i = 0; i < 100; i++) {
            final int index = i;
            assertThat(keyProvider.next())
                    .withFailMessage(() -> String.format("Key failed after try #%s", index))
                    .isEqualTo(index % 2 == 0 ? "some-key" : "some-other-key");
        }
    }
}