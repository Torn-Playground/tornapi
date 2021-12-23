package be.dekleinekobini.tornapi.models.torn;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

class LogTypesTest {

    @Test
    void of() throws JsonProcessingException {
        // Arrange
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode json = objectMapper.readTree("");

        // Act
        Object result = null;

        // Assert
        SoftAssertions softly = new SoftAssertions();

        softly.fail("Not yet implemented");

        softly.assertAll();
    }

}