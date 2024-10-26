package eu.tornplayground.tornapi.mappers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import eu.tornplayground.tornapi.models.Timestamp;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ModelMapperTest {

    @Test
    void ofTimestamp() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode json = objectMapper.readTree("{\"timestamp\":1729942749}");

        Timestamp timestamp = ModelMapper.ofTimestamp(json);

        assertThat(timestamp.getTimestamp()).isEqualTo(LocalDateTime.of(2024, 10, 26, 11, 39, 9));
    }

}