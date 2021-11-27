package be.dekleinekobini.tornapi.models.user;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class ReceivedEventsTest {

    @Test
    void of() throws JsonProcessingException {
        // Arrange
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode json = objectMapper.readTree("{\"receivedevents\":{\"1979908\":{\"owner\":1013799,\"timestamp\":1575493176,\"event\":\"You pop a few Xanax pills into your mouth and down a glass of water. A headache is followed by nausea and vomiting. You must have overdosed!\"},\"1979909\":{\"owner\":147761,\"timestamp\":1578281204,\"event\":\"You pop a few Xanax pills into your mouth and down a glass of water. A headache is followed by nausea and vomiting. You must have overdosed!\"},\"2142258\":{\"owner\":2069481,\"timestamp\":1595901942,\"event\":\"You take some Xanax and down a glass of water. A headache is followed by nausea and vomiting. You must have overdosed!\"},\"2142263\":{\"owner\":2069481,\"timestamp\":1595966824,\"event\":\"<a href = http://www.torn.com/profiles.php?XID=2068198>slabsaldinho</a> bought 30 x Crocus from your bazaar for $270,000.\"}}}");

        // Act
        Map<Long, ReceivedEvents> result = ReceivedEvents.of(json);

        // Assert
        ReceivedEvents event1 = new ReceivedEvents();
        event1.setOwner(1013799);
        event1.setTimestamp(LocalDateTime.of(2019, 12, 4, 20, 59, 36));
        event1.setEvent("You pop a few Xanax pills into your mouth and down a glass of water. A headache is followed by nausea and vomiting. You must have overdosed!");

        ReceivedEvents event2 = new ReceivedEvents();
        event2.setOwner(2069481);
        event2.setTimestamp(LocalDateTime.of(2020, 7, 28, 20, 7, 4));
        event2.setEvent("<a href = http://www.torn.com/profiles.php?XID=2068198>slabsaldinho</a> bought 30 x Crocus from your bazaar for $270,000.");

        assertThat(result)
                .hasSize(4)
                .containsEntry(1979908L, event1)
                .containsEntry(2142263L, event2);
    }

}