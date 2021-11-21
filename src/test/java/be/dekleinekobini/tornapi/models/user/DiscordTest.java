package be.dekleinekobini.tornapi.models.user;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

class DiscordTest {

    @Test
    void of() throws JsonProcessingException {
        // Arrange
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode json = objectMapper.readTree("{\"discord\":{\"userID\":2114440,\"discordID\":\"215959283605569537\"}}");

        // Act
        Discord discord = Discord.of(json);

        // Assert
        SoftAssertions softly = new SoftAssertions();

        softly.assertThat(discord.getUserId()).isEqualTo(2114440);
        softly.assertThat(discord.getDiscordId()).isEqualTo("215959283605569537");

        softly.assertAll();
    }

}