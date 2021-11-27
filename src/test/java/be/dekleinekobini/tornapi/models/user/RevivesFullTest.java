package be.dekleinekobini.tornapi.models.user;

import be.dekleinekobini.tornapi.models.user.partial.LastActionStatus;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class RevivesFullTest {

    @Test
    void of() throws JsonProcessingException {
        // Arrange
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode json = objectMapper.readTree("{\"revives\":{\"4521338\":{\"timestamp\":1636160789,\"result\":\"success\",\"chance\":100,\"reviver_id\":2235232,\"reviver_faction\":17133,\"target_id\":2114440,\"target_faction\":33007,\"target_hospital_reason\":\"Hospitalized by <a href = \\\"http://www.torn.com/profiles.php?XID=734492\\\">BabyLuST</a>\",\"target_early_discharge\":0,\"target_last_action\":{\"status\":\"Online\",\"timestamp\":1636160783}},\"4524700\":{\"timestamp\":1636193289,\"result\":\"success\",\"chance\":96.69,\"reviver_id\":2543367,\"reviver_faction\":21028,\"target_id\":2114440,\"target_faction\":33007,\"target_hospital_reason\":\"Overdosed on Xanax\",\"target_early_discharge\":0,\"target_last_action\":{\"status\":\"Online\",\"timestamp\":1636193244}},\"4648307\":{\"timestamp\":1637536174,\"result\":\"success\",\"chance\":96.11,\"reviver_id\":363281,\"reviver_faction\":17133,\"target_id\":2114440,\"target_faction\":33007,\"target_hospital_reason\":\"Hospitalized by <a href = \\\"http://www.torn.com/profiles.php?XID=1456295\\\">Nepy</a>\",\"target_early_discharge\":0,\"target_last_action\":{\"status\":\"Offline\",\"timestamp\":1637533844}}}}\n");

        // Act
        Map<Long, Revives> result = Revives.of(json);

        // Assert
        Revives.LastAction reviveLastAction1 = new Revives.LastAction();
        reviveLastAction1.setStatus(LastActionStatus.ONLINE);
        reviveLastAction1.setTimestamp(LocalDateTime.of(2021, 11, 6, 1, 6, 23));


        Revives revive1 = new Revives();
        revive1.setTimestamp(LocalDateTime.of(2021, 11, 6, 1, 6, 29));
        revive1.setResult(Revives.Result.SUCCESS);
        revive1.setChance(100);
        revive1.setReviverId(2235232);
        revive1.setReviverFaction(17133);
        revive1.setTargetId(2114440);
        revive1.setTargetFaction(33007);
        revive1.setTargetHospitalReason("Hospitalized by <a href = \"http://www.torn.com/profiles.php?XID=734492\">BabyLuST</a>");
        revive1.setTargetEarlyDischarge(false);
        revive1.setTargetLastAction(reviveLastAction1);

        Revives.LastAction reviveLastAction2 = new Revives.LastAction();
        reviveLastAction2.setStatus(LastActionStatus.OFFLINE);
        reviveLastAction2.setTimestamp(LocalDateTime.of(2021, 11, 21, 22, 30, 44));

        Revives revive2 = new Revives();
        revive2.setTimestamp(LocalDateTime.of(2021, 11, 21, 23, 9, 34));
        revive2.setResult(Revives.Result.SUCCESS);
        revive2.setChance(96.11);
        revive2.setReviverId(363281);
        revive2.setReviverFaction(17133);
        revive2.setTargetId(2114440);
        revive2.setTargetFaction(33007);
        revive2.setTargetHospitalReason("Hospitalized by <a href = \"http://www.torn.com/profiles.php?XID=1456295\">Nepy</a>");
        revive2.setTargetEarlyDischarge(false);
        revive2.setTargetLastAction(reviveLastAction2);

        assertThat(result)
                .hasSize(3)
                .containsEntry(4521338L, revive1)
                .containsEntry(4648307L, revive2);
    }

}