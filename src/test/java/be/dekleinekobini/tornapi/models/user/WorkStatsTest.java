package be.dekleinekobini.tornapi.models.user;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

class WorkStatsTest {

    @Test
    void of() throws JsonProcessingException {
        // Arrange
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode json = objectMapper.readTree("{\"manual_labor\":18325,\"intelligence\":70312,\"endurance\":120589}");

        // Act
        WorkStats stats = WorkStats.of(json);

        // Assert
        SoftAssertions softly = new SoftAssertions();

        softly.assertThat(stats.getManualLabor()).isEqualTo(18325);
        softly.assertThat(stats.getIntelligence()).isEqualTo(70312);
        softly.assertThat(stats.getEndurance()).isEqualTo(120589);

        softly.assertAll();
    }

}