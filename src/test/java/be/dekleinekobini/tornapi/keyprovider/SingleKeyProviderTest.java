package be.dekleinekobini.tornapi.keyprovider;

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
        // Act
        String key = keyProvider.next();

        // Assert
        assertThat(key).isEqualTo("some-key");
    }

    @Test
    void nextMultiple() {
        for (int i = 0; i < 100; i++) {
            // Act
            String key = keyProvider.next();

            // Assert
            int index = i;

            assertThat(key)
                    .withFailMessage(() -> String.format("Key failed after try #%s", index))
                    .isEqualTo("some-key");
        }
    }

}