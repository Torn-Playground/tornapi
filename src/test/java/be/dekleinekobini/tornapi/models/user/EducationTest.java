package be.dekleinekobini.tornapi.models.user;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

class EducationTest {

    @Test
    void of() throws JsonProcessingException {
        // Arrange
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode json = objectMapper.readTree("{\"education_current\":28,\"education_timeleft\":403870,\"education_completed\":[1,14,15,16,17,18,19,20,21,22,24,25,26,27,32,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,112,113,116,119,120,125,126,127]}");

        // Act
        Education education = Education.of(json);

        // Assert
        SoftAssertions softly = new SoftAssertions();

        softly.assertThat(education.getCurrent()).isEqualTo(28);
        softly.assertThat(education.getTimeLeft()).hasHours(112);
        softly.assertThat(education.getCompleted())
                .hasSize(100)
                .contains(1L, 18L, 35L, 127L);

        softly.assertAll();
    }

}