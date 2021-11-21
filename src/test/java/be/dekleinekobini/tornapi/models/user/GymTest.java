package be.dekleinekobini.tornapi.models.user;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GymTest {

    @Test
    void of() throws JsonProcessingException {
        // Arrange
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode json = objectMapper.readTree("{\"active_gym\":28}\n");

        // Act
        Gym gym = Gym.of(json);

        // Assert
        assertThat(gym.getActiveGym()).isEqualTo(28);
    }

}