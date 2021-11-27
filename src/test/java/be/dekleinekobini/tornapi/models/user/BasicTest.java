package be.dekleinekobini.tornapi.models.user;

import be.dekleinekobini.tornapi.models.user.partial.Gender;
import be.dekleinekobini.tornapi.models.user.partial.Status;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.ZoneOffset;

class BasicTest {

    @Test
    void of() throws JsonProcessingException {
        // Arrange
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode json = objectMapper.readTree("{\"level\":94,\"gender\":\"Male\",\"player_id\":2114440,\"name\":\"DeKleineKobini\",\"status\":{\"description\":\"Okay\",\"details\":\"\",\"state\":\"Okay\",\"color\":\"green\",\"until\":0}}");

        // Act
        Basic basic = Basic.of(json);

        // Assert
        SoftAssertions softly = new SoftAssertions();

        softly.assertThat(basic.getLevel()).isEqualTo(94);
        softly.assertThat(basic.getGender()).isEqualTo(Gender.MALE);
        softly.assertThat(basic.getPlayerId()).isEqualTo(2114440);
        softly.assertThat(basic.getName()).isEqualTo("DeKleineKobini");

        softly.assertThat(basic.getStatus()).isNotNull();
        softly.assertThat(basic.getStatus().getDescription()).isEqualTo("Okay");
        softly.assertThat(basic.getStatus().getDetails()).isEqualTo("");
        softly.assertThat(basic.getStatus().getState()).isEqualTo(Status.State.OKAY);
        softly.assertThat(basic.getStatus().getColor()).isEqualTo("green");
        softly.assertThat(basic.getStatus().getUntil()).isEqualTo(Instant.ofEpochSecond(0).atOffset(ZoneOffset.UTC).toLocalDateTime());

        softly.assertAll();
    }

}