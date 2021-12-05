package be.dekleinekobini.tornapi.models.user;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

class SkillsTest {

    @Test
    void of() throws JsonProcessingException {
        // Arrange
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode json = objectMapper.readTree("{\"reviving\":\"100.00\",\"hunting\":\"62.74\",\"racing\":\"18.73\",\"player_id\":2114440}");

        // Act
        Skills result = Skills.of(json);

        // Assert
        SoftAssertions softly = new SoftAssertions();

        softly.assertThat(result.getReviving()).isEqualTo(100);
        softly.assertThat(result.getHunting()).isEqualTo(62.74);
        softly.assertThat(result.getRacing()).isEqualTo(18.73);
        softly.assertThat(result.getPlayerId()).isEqualTo(2114440);

        softly.assertAll();
    }

}