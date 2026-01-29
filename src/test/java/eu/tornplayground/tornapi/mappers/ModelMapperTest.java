package eu.tornplayground.tornapi.mappers;

import eu.tornplayground.tornapi.models.Timestamp;
import eu.tornplayground.tornapi.models.TornError;
import eu.tornplayground.tornapi.models.TornErrorType;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.ObjectMapper;

import java.time.LocalDateTime;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ModelMapperTest {

    @Test
    void ofTimestamp() {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode json = objectMapper.readTree("{\"timestamp\":1729942749}");

        Timestamp timestamp = ModelMapper.ofTimestamp(json);

        assertThat(timestamp.getTimestamp()).isEqualTo(LocalDateTime.of(2024, 10, 26, 11, 39, 9));
    }

    @Test
    void hasError_whenNoError() {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode json = objectMapper.readTree("{\"timestamp\":1729942749}");

        assertThat(ModelMapper.hasError(json)).isFalse();
    }

    @Test
    void hasError_whenError() {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode json = objectMapper.readTree("{\"error\":{\"code\":4,\"error\":\"Wrong fields\"}}");

        assertThat(ModelMapper.hasError(json)).isTrue();
    }

    @Test
    void ofError() {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode json = objectMapper.readTree("{\"error\":{\"code\":4,\"error\":\"Wrong fields\"}}");

        TornError error = ModelMapper.ofError(json);

        SoftAssertions softly = new SoftAssertions();

        softly.assertThat(error.getCode()).isEqualTo(4);
        softly.assertThat(error.getError()).isEqualTo(TornErrorType.WRONG_FIELDS);

        softly.assertAll();
    }

}