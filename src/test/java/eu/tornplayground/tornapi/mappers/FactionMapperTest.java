package eu.tornplayground.tornapi.mappers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import eu.tornplayground.tornapi.models.faction.*;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Objects;

class FactionMapperTest {

    @Test
    @Disabled("No faction API Access, unable to implement.")
    void ofApplications() throws JsonProcessingException {
    }

    @Test
    @Disabled("No faction API Access, unable to implement.")
    void ofArmor() throws JsonProcessingException {
    }

    @Test
    @Disabled("No faction API Access, unable to implement.")
    void ofArmoryNews() throws JsonProcessingException {
    }

    @Test
    @Disabled("No faction API Access, unable to implement.")
    void ofAttackNews() throws JsonProcessingException {
    }

    @Test
    void ofAttacks() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree("{\"attacks\": {\"1\": {\"code\": \"abc122\",\"timestamp_started\": 1729886519,\"timestamp_ended\": 1729886521,\"attacker_id\": 1,\"attacker_name\": \"Player One\",\"attacker_faction\": 1,\"attacker_factionname\": \"Faction One\",\"defender_id\": 2,\"defender_name\": \"Player Two\",\"defender_faction\": 2,\"defender_factionname\": \"Faction Two\",\"result\": \"Attacked\",\"stealthed\": 1,\"respect\": 4.68,\"chain\": 1340,\"raid\": 0,\"ranked_war\": 0,\"respect_gain\": 4.68,\"respect_loss\": 1.17,\"modifiers\": {\"fair_fight\": 3,\"war\": 1,\"retaliation\": 1,\"group_attack\": 1,\"overseas\": 1,\"chain_bonus\": 1.53}},\"2\": {\"code\": \"abc123\",\"timestamp_started\": 1729886531,\"timestamp_ended\": 1729886534,\"attacker_id\": 2,\"attacker_name\": \"Player Two\",\"attacker_faction\": 2,\"attacker_factionname\": \"Faction Two\",\"defender_id\": 1,\"defender_name\": \"Player One\",\"defender_faction\": 1,\"defender_factionname\": \"Faction One\",\"result\": \"Attacked\",\"stealthed\": 1,\"respect\": 3.76,\"chain\": 1341,\"raid\": 0,\"ranked_war\": 0,\"respect_gain\": 3.76,\"respect_loss\": 0.94,\"modifiers\": {\"fair_fight\": 2.08,\"war\": 1,\"retaliation\": 1,\"group_attack\": 1,\"overseas\": 1,\"chain_bonus\": 1.53}}}}");

        List<FactionAttacks> result = FactionMapper.ofAttacks(jsonNode);

        SoftAssertions softly = new SoftAssertions();

        softly.assertThat(result.size()).isEqualTo(2);
        softly.assertThat(result.get(0).getCode()).isEqualTo("abc122");
        softly.assertThat(result.get(0).getTimestampStarted()).isEqualTo(Instant.ofEpochSecond(1729886519).atZone(ZoneOffset.UTC).toLocalDateTime());
        softly.assertThat(result.get(0).getTimestampEnded()).isEqualTo(Instant.ofEpochSecond(1729886521).atZone(ZoneOffset.UTC).toLocalDateTime());
        softly.assertThat(result.get(0).getAttackerId()).isEqualTo(1);
        softly.assertThat(result.get(0).getAttackerName()).isEqualTo("Player One");
        softly.assertThat(result.get(0).getAttackerFaction()).isEqualTo(1);
        softly.assertThat(result.get(0).getAttackerFactionName()).isEqualTo("Faction One");
        softly.assertThat(result.get(0).getDefenderId()).isEqualTo(2);
        softly.assertThat(result.get(0).getDefenderName()).isEqualTo("Player Two");
        softly.assertThat(result.get(0).getDefenderFaction()).isEqualTo(2);
        softly.assertThat(result.get(0).getDefenderFactionName()).isEqualTo("Faction Two");
        softly.assertThat(result.get(0).getResult()).isEqualTo("Attacked");
        softly.assertThat(result.get(0).isStealthed()).isEqualTo(true);
        softly.assertThat(result.get(0).getRespect()).isEqualTo(4.68f);
        softly.assertThat(result.get(0).getChain()).isEqualTo(1340);
        softly.assertThat(result.get(0).isRaid()).isEqualTo(false);
        softly.assertThat(result.get(0).isRankedWar()).isEqualTo(false);
        softly.assertThat(result.get(0).getRespectGain()).isEqualTo(4.68f);
        softly.assertThat(result.get(0).getRespectLoss()).isEqualTo(1.17f);
        softly.assertThat(result.get(0).getModifiers().getFairFight()).isEqualTo(3f);
        softly.assertThat(result.get(0).getModifiers().getWar()).isEqualTo(1f);
        softly.assertThat(result.get(0).getModifiers().getRetaliation()).isEqualTo(1f);
        softly.assertThat(result.get(0).getModifiers().getGroupAttack()).isEqualTo(1f);
        softly.assertThat(result.get(0).getModifiers().getOverseas()).isEqualTo(1f);
        softly.assertThat(result.get(0).getModifiers().getChainBonus()).isEqualTo(1.53f);

        softly.assertThat(result.get(1).getCode()).isEqualTo("abc123");
        softly.assertThat(result.get(1).getTimestampStarted()).isEqualTo(Instant.ofEpochSecond(1729886531).atZone(ZoneOffset.UTC).toLocalDateTime());
        softly.assertThat(result.get(1).getTimestampEnded()).isEqualTo(Instant.ofEpochSecond(1729886534).atZone(ZoneOffset.UTC).toLocalDateTime());
        softly.assertThat(result.get(1).getAttackerId()).isEqualTo(2);
        softly.assertThat(result.get(1).getAttackerName()).isEqualTo("Player Two");
        softly.assertThat(result.get(1).getAttackerFaction()).isEqualTo(2);
        softly.assertThat(result.get(1).getAttackerFactionName()).isEqualTo("Faction Two");
        softly.assertThat(result.get(1).getDefenderId()).isEqualTo(1);
        softly.assertThat(result.get(1).getDefenderName()).isEqualTo("Player One");
        softly.assertThat(result.get(1).getDefenderFaction()).isEqualTo(1);
        softly.assertThat(result.get(1).getDefenderFactionName()).isEqualTo("Faction One");
        softly.assertThat(result.get(1).getResult()).isEqualTo("Attacked");
        softly.assertThat(result.get(1).isStealthed()).isEqualTo(true);
        softly.assertThat(result.get(1).getRespect()).isEqualTo(3.76f);
        softly.assertThat(result.get(1).getChain()).isEqualTo(1341);
        softly.assertThat(result.get(1).isRaid()).isEqualTo(false);
        softly.assertThat(result.get(1).isRankedWar()).isEqualTo(false);
        softly.assertThat(result.get(1).getRespectGain()).isEqualTo(3.76f);
        softly.assertThat(result.get(1).getRespectLoss()).isEqualTo(0.94f);
        softly.assertThat(result.get(1).getModifiers().getFairFight()).isEqualTo(2.08f);
        softly.assertThat(result.get(1).getModifiers().getWar()).isEqualTo(1f);
        softly.assertThat(result.get(1).getModifiers().getRetaliation()).isEqualTo(1f);
        softly.assertThat(result.get(1).getModifiers().getGroupAttack()).isEqualTo(1f);
        softly.assertThat(result.get(1).getModifiers().getOverseas()).isEqualTo(1f);
        softly.assertThat(result.get(1).getModifiers().getChainBonus()).isEqualTo(1.53f);

        softly.assertAll();

        /*
        {
 "attacks": {"1": {"code": "abc122","timestamp_started": 1729886519,"timestamp_ended": 1729886521,"attacker_id": 1,"attacker_name": "Player One","attacker_faction": 1,"attacker_factionname": "Faction One","defender_id": 2,"defender_name": "Player Two","defender_faction": 2,"defender_factionname": "Faction Two","result": "Attacked","stealthed": 1,"respect": 4.68,"chain": 1340,"raid": 0,"ranked_war": 0,"respect_gain": 4.68,"respect_loss": 1.17"modifiers": {"fair_fight": 3,"war": 1,"retaliation": 1,"group_attack": 1,"overseas": 1,"chain_bonus": 1.53}}"2": {"code": "abc123","timestamp_started": 1729886531,"timestamp_ended": 1729886534,"attacker_id": 2,"attacker_name": "Player Two","attacker_faction": 2,"attacker_factionname": "Faction Two","defender_id": 1,"defender_name": "Player One","defender_faction": 1,"defender_factionname": "Faction One","result": "Attacked","stealthed": 1,"respect": 3.76,"chain": 1341,"raid": 0,"ranked_war": 0,"respect_gain": 3.76,"respect_loss": 0.94"modifiers": {"fair_fight": 2.08,"war": 1,"retaliation": 1,"group_attack": 1,"overseas": 1,"chain_bonus": 1.53}}}}
         */

    }

    @Test
    void ofAttacksFull() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree("{\"attacks\": {\"1\": {\"code\": \"abc122\",\"timestamp_started\": 1729886519,\"timestamp_ended\": 1729886521,\"attacker_id\": 1,\"attacker_faction\": 1,\"defender_id\": 2,\"defender_faction\": 2,\"result\": \"Attacked\",\"stealthed\": 1,\"respect\": 4.68},\"2\": {\"code\": \"abc123\",\"timestamp_started\": 1729886531,\"timestamp_ended\": 1729886534,\"attacker_id\": 2,\"attacker_faction\": 2,\"defender_id\": 1,\"defender_faction\": 1,\"result\": \"Attacked\",\"stealthed\": 1,\"respect\": 3.76}}}");

        List<FactionAttacksFull> result = FactionMapper.ofAttacksFull(jsonNode);

        SoftAssertions softly = new SoftAssertions();

        softly.assertThat(result.size()).isEqualTo(2);
        softly.assertThat(result.get(0).getCode()).isEqualTo("abc122");
        softly.assertThat(result.get(0).getTimestampStarted()).isEqualTo(Instant.ofEpochSecond(1729886519).atZone(ZoneOffset.UTC).toLocalDateTime());
        softly.assertThat(result.get(0).getTimestampEnded()).isEqualTo(Instant.ofEpochSecond(1729886521).atZone(ZoneOffset.UTC).toLocalDateTime());
        softly.assertThat(result.get(0).getAttackerId()).isEqualTo(1);
        softly.assertThat(result.get(0).getAttackerFaction()).isEqualTo(1);
        softly.assertThat(result.get(0).getDefenderId()).isEqualTo(2);
        softly.assertThat(result.get(0).getDefenderFaction()).isEqualTo(2);
        softly.assertThat(result.get(0).getResult()).isEqualTo("Attacked");
        softly.assertThat(result.get(0).isStealthed()).isEqualTo(true);
        softly.assertThat(result.get(0).getRespect()).isEqualTo(4.68f);

        softly.assertThat(result.get(1).getCode()).isEqualTo("abc123");
        softly.assertThat(result.get(1).getTimestampStarted()).isEqualTo(Instant.ofEpochSecond(1729886531).atZone(ZoneOffset.UTC).toLocalDateTime());
        softly.assertThat(result.get(1).getTimestampEnded()).isEqualTo(Instant.ofEpochSecond(1729886534).atZone(ZoneOffset.UTC).toLocalDateTime());
        softly.assertThat(result.get(1).getAttackerId()).isEqualTo(2);
        softly.assertThat(result.get(1).getAttackerFaction()).isEqualTo(2);
        softly.assertThat(result.get(1).getDefenderId()).isEqualTo(1);
        softly.assertThat(result.get(1).getDefenderFaction()).isEqualTo(1);
        softly.assertThat(result.get(1).getResult()).isEqualTo("Attacked");
        softly.assertThat(result.get(1).isStealthed()).isEqualTo(true);
        softly.assertThat(result.get(1).getRespect()).isEqualTo(3.76f);

        softly.assertAll();
    }

    @Test
    void ofBasic() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree("{\"ID\":1,\"name\":\"Faction\",\"tag\":\"\",\"tag_image\":\"image.png\",\"leader\":1,\"co-leader\":2,\"respect\":981495,\"age\":1337,\"capacity\":80,\"best_chain\":50000,\"ranked_wars\":{},\"territory_wars\":{},\"raid_wars\":{},\"peace\":{},\"rank\":{\"level\":0,\"name\":\"Metal (Unranked)\",\"division\":0,\"position\":0,\"wins\":1337},\"members\":{\"1\":{\"name\":\"PlayerOne\",\"level\":59,\"days_in_faction\":310,\"last_action\":{\"status\":\"Offline\",\"timestamp\":1729886758,\"relative\":\"12 minutes ago\"},\"status\":{\"description\":\"Traveling to Canada\",\"details\":\"\",\"state\":\"Traveling\",\"color\":\"blue\",\"until\":0},\"position\":\"Leader\"},\"2\":{\"name\":\"PlayerTwo\",\"level\":46,\"days_in_faction\":127,\"last_action\":{\"status\":\"Online\",\"timestamp\":1729885788,\"relative\":\"1 hour ago\"},\"status\":{\"description\":\"In hospital for 5 hrs 23 mins \",\"details\":\"Hospitalized by someone\",\"state\":\"Hospital\",\"color\":\"red\",\"until\":1729906255},\"position\":\"CoLeader\"}}}");

        FactionBasic basic = FactionMapper.ofBasic(jsonNode);

        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(basic.getId()).isEqualTo(1);
        softly.assertThat(basic.getName()).isEqualTo("Faction");
        softly.assertThat(basic.getTag()).isEqualTo("");
        softly.assertThat(basic.getTagImage()).isEqualTo("image.png");
        softly.assertThat(basic.getLeader()).isEqualTo(1);
        softly.assertThat(basic.getCoLeader()).isEqualTo(2);
        softly.assertThat(basic.getRespect()).isEqualTo(981495);
        softly.assertThat(basic.getAge()).isEqualTo(Duration.ofDays(1337));
        softly.assertThat(basic.getCapacity()).isEqualTo(80);
        softly.assertThat(basic.getBestChain()).isEqualTo(50000);
        softly.assertThat(basic.getMembers().size()).isEqualTo(2);
        softly.assertThat(basic.getMembers().get(1).getName()).isEqualTo("PlayerOne");
        softly.assertThat(basic.getMembers().get(1).getLevel()).isEqualTo((short) 59);
        softly.assertThat(basic.getMembers().get(1).getLastAction().getRelative()).isEqualTo(Duration.ofMinutes(12));
        softly.assertThat(basic.getMembers().get(1).getStatus().getUntil()).isEqualTo(Instant.ofEpochSecond(0).atZone(ZoneOffset.UTC).toLocalDateTime());
        softly.assertThat(basic.getMembers().get(2).getName()).isEqualTo("PlayerTwo");
        softly.assertThat(basic.getMembers().get(2).getLevel()).isEqualTo((short) 46);
        softly.assertThat(basic.getMembers().get(2).getLastAction().getRelative()).isEqualTo(Duration.ofHours(1));
        softly.assertThat(basic.getMembers().get(2).getStatus().getUntil()).isEqualTo(Instant.ofEpochSecond(1729906255).atZone(ZoneOffset.UTC).toLocalDateTime());
        softly.assertAll();

    }

    @Test
    @Disabled("No faction API Access, unable to implement.")
    void ofBoosters() throws JsonProcessingException {
    }

    @Test
    @Disabled("No faction API Access, unable to implement.")
    void ofCesium() throws JsonProcessingException {
    }

    @Test
    @Disabled("No faction API Access, unable to implement.")
    void ofChainReport() throws JsonProcessingException {
    }

    @Test
    void ofChains() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree("{\"chain\":{\"current\":1417,\"max\":2500,\"timeout\":180,\"modifier\":1.54,\"cooldown\":0,\"start\":1729863272,\"end\":1729889147}}");

        Chain chain = FactionMapper.ofChain(jsonNode);

        SoftAssertions softly = new SoftAssertions();

        softly.assertThat(chain.getCurrent()).isEqualTo(1417);
        softly.assertThat(chain.getMax()).isEqualTo(2500);
        softly.assertThat(chain.getTimeout()).isEqualTo(Duration.ofSeconds(180));
        softly.assertThat(chain.getModifier()).isEqualTo(1.54f);
        softly.assertThat(chain.getCooldown()).isEqualTo(Duration.ofSeconds(0));
        softly.assertThat(chain.getStart()).isEqualTo(Instant.ofEpochSecond(1729863272).atZone(ZoneOffset.UTC).toLocalDateTime());
        softly.assertThat(chain.getEnd()).isEqualTo(Instant.ofEpochSecond(1729889147).atZone(ZoneOffset.UTC).toLocalDateTime());

        softly.assertAll();
    }

    @Disabled("Not yet implemented.")
    @Test
    void ofChain() throws JsonProcessingException {
    }

    @Test
    @Disabled("No faction API Access, unable to implement.")
    void ofContributors() throws JsonProcessingException {
    }

    @Test
    @Disabled("No faction API Access, unable to implement.")
    void ofCrimeNews() throws JsonProcessingException {
    }

    @Test
    @Disabled("No faction API Access, unable to implement.")
    void ofCrimes() throws JsonProcessingException {
    }

    @Test
    @Disabled("No faction API Access, unable to implement.")
    void ofCurrency() throws JsonProcessingException {
    }

    @Test
    @Disabled("No faction API Access, unable to implement.")
    void ofDonations() throws JsonProcessingException {
    }

    @Test
    @Disabled("No faction API Access, unable to implement.")
    void ofDrugs() throws JsonProcessingException {
    }

    @Test
    @Disabled("No faction API Access, unable to implement.")
    void ofFundsNews() throws JsonProcessingException {
    }

    @Test
    @Disabled("No faction API Access, unable to implement.")
    void ofMainNews() throws JsonProcessingException {
    }

    @Test
    @Disabled("No faction API Access, unable to implement.")
    void ofMedical() throws JsonProcessingException {
    }

    @Test
    @Disabled("No faction API Access, unable to implement.")
    void ofMembershipNews() throws JsonProcessingException {
    }

    @Test
    @Disabled("No faction API Access, unable to implement.")
    void ofPositions() throws JsonProcessingException {
    }
    
    @Test
    void ofRankedWar() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree("{\"rankedwars\": {\"1337\": {\"factions\": {\"1\": {\"name\": \"Faction One\",\"score\": 7781,\"chain\": 744},\"2\": {\"name\": \"Faction Two\",\"score\": 2385,\"chain\": 1384}},\"war\": {\"start\": 1647730800,\"end\": 1647822076,\"target\": 5390,\"winner\": 45835}}}}");
        
        List<RankedWar> rankedWar = FactionMapper.ofRankedWar(jsonNode);

        SoftAssertions softly = new SoftAssertions();

        softly.assertThat(rankedWar.size()).isEqualTo(1);
        softly.assertThat(rankedWar.get(0).getFactions().size()).isEqualTo(2);
        softly.assertThat(rankedWar.get(0).getFactions().get(1).getName()).isEqualTo("Faction One");
        softly.assertThat(rankedWar.get(0).getFactions().get(1).getScore()).isEqualTo(7781);
        softly.assertThat(rankedWar.get(0).getFactions().get(1).getChain()).isEqualTo(744);
        softly.assertThat(rankedWar.get(0).getFactions().get(2).getName()).isEqualTo("Faction Two");
        softly.assertThat(rankedWar.get(0).getFactions().get(2).getScore()).isEqualTo(2385);
        softly.assertThat(rankedWar.get(0).getFactions().get(2).getChain()).isEqualTo(1384);
        softly.assertThat(rankedWar.get(0).getWar().getStart()).isEqualTo(Instant.ofEpochSecond(1647730800).atZone(ZoneOffset.UTC).toLocalDateTime());
        softly.assertThat(rankedWar.get(0).getWar().getEnd()).isEqualTo(Instant.ofEpochSecond(1647822076).atZone(ZoneOffset.UTC).toLocalDateTime());
        softly.assertThat(rankedWar.get(0).getWar().getTarget()).isEqualTo(5390);
        softly.assertThat(rankedWar.get(0).getWar().getWinner()).isEqualTo(45835);
        softly.assertAll();
    }

    @Test
    @Disabled("No faction API Access, unable to implement.")
    void ofReports() throws JsonProcessingException {
    }

    @Test
    @Disabled("No faction API Access, unable to implement.")
    void ofRevivesFull() throws JsonProcessingException {
    }

    @Test
    @Disabled("No faction API Access, unable to implement.")
    void ofRevives() throws JsonProcessingException {
    }

    @Test
    @Disabled("No faction API Access, unable to implement.")
    void ofStats() throws JsonProcessingException {
    }

    @Test
    @Disabled("No faction API Access, unable to implement.")
    void ofTemporary() throws JsonProcessingException {
    }

    @Test
    @Disabled("No faction API Access, unable to implement.")
    void ofTerritoryNews() throws JsonProcessingException {
    }

    @Disabled("Not yet implemented.")
    @Test
    void ofTerritory() throws JsonProcessingException {
    }

    @Test
    @Disabled("No faction API Access, unable to implement.")
    void ofUpgrades() throws JsonProcessingException {
    }

    @Test
    @Disabled("No faction API Access, unable to implement.")
    void ofWeapons() throws JsonProcessingException {
    }

}