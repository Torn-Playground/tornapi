package be.dekleinekobini.tornapi.models.user;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

class CooldownsTest {

    @Test
    void of() throws JsonProcessingException {
        // Arrange
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode json = objectMapper.readTree("{\"cooldowns\":{\"drug\":27122,\"medical\":0,\"booster\":130277}}");

        // Act
        Cooldowns cooldowns = Cooldowns.of(json);

        // Assert
        SoftAssertions softly = new SoftAssertions();

        softly.assertThat(cooldowns.getDrug()).hasHours(7);
        softly.assertThat(cooldowns.getMedical()).hasSeconds(0);
        softly.assertThat(cooldowns.getBooster()).hasHours(36);

        softly.assertAll();
    }

}