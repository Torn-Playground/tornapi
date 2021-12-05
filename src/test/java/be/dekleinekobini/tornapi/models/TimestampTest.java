package be.dekleinekobini.tornapi.models;

import be.dekleinekobini.tornapi.models.Timestamp;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

class TimestampTest {

    @Test
    void of() throws JsonProcessingException {
        // Arrange
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode json = objectMapper.readTree("{\"timestamp\":1637509704}");

        // Act
        Timestamp timestamp = Timestamp.of(json);

        // Assert
        assertThat(timestamp.getTimestamp()).isEqualTo(LocalDateTime.of(2021, 11, 21, 15, 48, 24));
    }

}