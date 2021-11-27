package be.dekleinekobini.tornapi.models.user;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RefillsTest {

    @Test
    void of() throws JsonProcessingException {
        // Arrange
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode json = objectMapper.readTree("{\"refills\":{\"energy_refill_used\":true,\"nerve_refill_used\":false,\"token_refill_used\":false,\"special_refills_available\":0}}");

        // Act
        Refills result = Refills.of(json);

        // Assert
        assertThat(result.isEnergyRefillUsed()).isEqualTo(true);
        assertThat(result.isNerveRefillUsed()).isEqualTo(false);
        assertThat(result.isTokenRefillUsed()).isEqualTo(false);
        assertThat(result.getSpecialRefillsAvailable()).isEqualTo(0);
    }

}