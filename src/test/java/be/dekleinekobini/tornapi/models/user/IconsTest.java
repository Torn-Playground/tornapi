package be.dekleinekobini.tornapi.models.user;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class IconsTest {

    @Test
    void of() throws JsonProcessingException {
        // Arrange
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode json = objectMapper.readTree("{\"icons\":{\"icon51\":\"Drug Cooldown - Under the influence of Xanax - 0 days, 1 hours, 41 minutes and 59 seconds\",\"icon38\":\"Stock Market - You own shares in the stock market\",\"icon19\":\"Education - Currently completing the Trigonometry course - 17 days, 16 hours, 25 minutes and 2 seconds\",\"icon85\":\"Organized Crime - Hijack a plane - REDACTED\",\"icon27\":\"Company - Attorney of Jux @ Law (Law Firm)\",\"icon35\":\"Bazaar - You have items in your bazaar\",\"icon68\":\"Reading Book - Yes Please Diabetes - Doubles candy effects for 31 days - REDACTED\",\"icon29\":\"Bank Investment - Current bank investment worth REDACTED - REDACTED\",\"icon9\":\"Faction - Thunderbird of HAKA\",\"icon8\":\"Married - ExKioz\",\"icon10\":\"Player Committee - Member\",\"icon4\":\"Subscriber - Donator status: REDACTED - Subscriber until: REDACTED\",\"icon6\":\"Male\"}}");

        // Act
        Map<String, String> result = Icons.of(json);

        // Assert
        assertThat(result)
                .hasSize(13)
                .containsEntry("icon6", "Male")
                .containsEntry("icon27", "Company - Attorney of Jux @ Law (Law Firm)")
                .containsEntry("icon35", "Bazaar - You have items in your bazaar")
                .containsEntry("icon38", "Stock Market - You own shares in the stock market");
    }

}