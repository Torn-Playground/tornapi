package be.dekleinekobini.tornapi.models.user;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

class TravelTest {

    @Test
    void of() throws JsonProcessingException {
        // Arrange
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode json = objectMapper.readTree("{\"travel\":{\"destination\":\"Switzerland\",\"method\":\"Airstrip\",\"timestamp\":1637448692,\"departed\":1637441492,\"time_left\":7190}}");

        // Act
        Travel travel = Travel.of(json);

        // Assert
        SoftAssertions softly = new SoftAssertions();

        softly.assertThat(travel.getDestination()).isEqualTo("Switzerland");
        softly.assertThat(travel.getMethod()).isEqualTo(Travel.TravelMethod.AIRSTRIP);
        softly.assertThat(travel.getTimestamp()).isEqualTo(LocalDateTime.of(2021, 11, 20, 22, 51, 32));
        softly.assertThat(travel.getDeparted()).isEqualTo(LocalDateTime.of(2021, 11, 20, 20, 51, 32));
        softly.assertThat(travel.getTimeLeft()).hasMinutes(119);

        softly.assertAll();
    }

}