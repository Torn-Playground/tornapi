package be.dekleinekobini.tornapi.models.user;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class AttacksFullTest {

    @Test
    void of() throws JsonProcessingException {
        // Arrange
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode json = objectMapper.readTree("{\"attacks\":{\"163385223\":{\"code\":\"539b48279f80d57eece5971054962911\",\"timestamp_started\":1631438210,\"timestamp_ended\":1631438215,\"attacker_id\":2114440,\"attacker_faction\":20747,\"defender_id\":2084369,\"defender_faction\":17001,\"result\":\"Attacked\",\"stealthed\":0,\"respect\":3.39},\"163385401\":{\"code\":\"706a224293d3bb7d50c563c16f0719c2\",\"timestamp_started\":1631438292,\"timestamp_ended\":1631438295,\"attacker_id\":2114440,\"attacker_faction\":20747,\"defender_id\":2676799,\"defender_faction\":14686,\"result\":\"Attacked\",\"stealthed\":0,\"respect\":1.18},\"163385417\":{\"code\":\"9bf45a9c984947a852e985d619840868\",\"timestamp_started\":1631438299,\"timestamp_ended\":1631438301,\"attacker_id\":2114440,\"attacker_faction\":20747,\"defender_id\":2546876,\"defender_faction\":40039,\"result\":\"Attacked\",\"stealthed\":0,\"respect\":1.36}}}\n");

        // Act
        Map<Long, Attacks> result = Attacks.of(json);

        // Assert
        Attacks attack1 = new Attacks();
        attack1.setCode("539b48279f80d57eece5971054962911");
        attack1.setTimestampStarted(LocalDateTime.of(2021, 9, 12, 9, 16, 50));
        attack1.setTimestampEnded(LocalDateTime.of(2021, 9, 12, 9, 16, 55));
        attack1.setAttackerId(2114440);
        attack1.setAttackerFaction(20747);
        attack1.setDefenderId(2084369);
        attack1.setDefenderFaction(17001);
        attack1.setResult(Attacks.AttackResult.ATTACKED);
        attack1.setStealthed(false);
        attack1.setRespect(3.39);

        assertThat(result)
                .hasSize(3)
                .containsEntry(163385223L, attack1);
    }

}