package eu.tornplayground.tornapi.mappers;

import eu.tornplayground.tornapi.models.common.AttackResult;
import eu.tornplayground.tornapi.models.faction.*;
import eu.tornplayground.tornapi.models.faction.basic.rank.Rank;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.ObjectMapper;

import java.time.Duration;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.List;

class FactionMapperTest {

    @Test
    @Disabled("No faction API Access, unable to implement.")
    void ofApplications() {
    }

    @Test
    @Disabled("No faction API Access, unable to implement.")
    void ofArmor() {
    }

    @Test
    @Disabled("No faction API Access, unable to implement.")
    void ofArmoryNews() {
    }

    @Test
    @Disabled("No faction API Access, unable to implement.")
    void ofAttackNews() {
    }

    @Test
    void ofAttacks() {
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
        softly.assertThat(result.get(0).getResult()).isEqualTo(AttackResult.ATTACKED);
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
        softly.assertThat(result.get(1).getResult()).isEqualTo(AttackResult.ATTACKED);
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
    void ofAttacksFull() {
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
        softly.assertThat(result.get(0).getResult()).isEqualTo(AttackResult.ATTACKED);
        softly.assertThat(result.get(0).isStealthed()).isEqualTo(true);
        softly.assertThat(result.get(0).getRespect()).isEqualTo(4.68f);

        softly.assertThat(result.get(1).getCode()).isEqualTo("abc123");
        softly.assertThat(result.get(1).getTimestampStarted()).isEqualTo(Instant.ofEpochSecond(1729886531).atZone(ZoneOffset.UTC).toLocalDateTime());
        softly.assertThat(result.get(1).getTimestampEnded()).isEqualTo(Instant.ofEpochSecond(1729886534).atZone(ZoneOffset.UTC).toLocalDateTime());
        softly.assertThat(result.get(1).getAttackerId()).isEqualTo(2);
        softly.assertThat(result.get(1).getAttackerFaction()).isEqualTo(2);
        softly.assertThat(result.get(1).getDefenderId()).isEqualTo(1);
        softly.assertThat(result.get(1).getDefenderFaction()).isEqualTo(1);
        softly.assertThat(result.get(1).getResult()).isEqualTo(AttackResult.ATTACKED);
        softly.assertThat(result.get(1).isStealthed()).isEqualTo(true);
        softly.assertThat(result.get(1).getRespect()).isEqualTo(3.76f);

        softly.assertAll();
    }

    @Test
    void ofBasic() {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree("{\"ID\":1,\"name\":\"Faction\",\"tag\":\"\",\"tag_image\":\"image.png\",\"leader\":1,\"co-leader\":2,\"respect\":981495,\"age\":1337,\"capacity\":80,\"best_chain\":50000,\"ranked_wars\":{\"18888\":{\"factions\":{\"20465\":{\"name\":\"SMTH - Phoenix Nirvana\",\"score\":37748,\"chain\":4577},\"36134\":{\"name\":\"SMTH - Silver Hand\",\"score\":34459,\"chain\":4580}},\"war\":{\"start\":1729778400,\"end\":0,\"target\":10974,\"winner\":0}}},\"territory_wars\":[{\"territory_war_id\":42201,\"territory\":\"EJE\",\"assaulting_faction\":9055,\"defending_faction\":11581,\"score\":0,\"required_score\":1250000,\"start_time\":1729869786,\"end_time\":1730128986,\"assaulters\":[463993,784387,902856,2527957,2593444],\"defenders\":[583823,1893037,1980155,2016943,2027195,2090022,2094400,2235735,2251781,2318684,2323769,2351099,2460991]},{\"territory_war_id\":42202,\"territory\":\"RFF\",\"assaulting_faction\":11581,\"defending_faction\":8803,\"score\":0,\"required_score\":1500000,\"start_time\":1729869904,\"end_time\":1730129104,\"assaulters\":[2454892],\"defenders\":[1577462,1874922,1875013,2711369,2794893,3133789]}],\"raid_wars\":[{\"raiding_faction\":51606,\"defending_faction\":51260,\"raider_score\":\"4168.87\",\"defender_score\":0,\"start_time\":1723608429}],\"peace\":{\"123456\":1729886758,\"123457\":1729900538},\"rank\":{\"level\":0,\"name\":\"Unranked\",\"division\":0,\"position\":0,\"wins\":1337},\"members\":{\"1\":{\"name\":\"PlayerOne\",\"level\":59,\"days_in_faction\":310,\"last_action\":{\"status\":\"Offline\",\"timestamp\":1729886758,\"relative\":\"12 minutes ago\"},\"status\":{\"description\":\"Traveling to Canada\",\"details\":\"\",\"state\":\"Traveling\",\"color\":\"blue\",\"until\":0},\"position\":\"Leader\"},\"2\":{\"name\":\"PlayerTwo\",\"level\":46,\"days_in_faction\":127,\"last_action\":{\"status\":\"Online\",\"timestamp\":1729885788,\"relative\":\"1 hour ago\"},\"status\":{\"description\":\"In hospital for 5 hrs 23 mins \",\"details\":\"Hospitalized by someone\",\"state\":\"Hospital\",\"color\":\"red\",\"until\":1729906255},\"position\":\"CoLeader\"}}}");

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

        softly.assertThat(basic.getRaidWars().size()).isEqualTo(1);
        softly.assertThat(basic.getRaidWars().get(0).getRaidingFaction()).isEqualTo(51606);
        softly.assertThat(basic.getRaidWars().get(0).getDefendingFaction()).isEqualTo(51260);
        softly.assertThat(basic.getRaidWars().get(0).getRaiderScore()).isEqualTo(4168.87f);
        softly.assertThat(basic.getRaidWars().get(0).getDefenderScore()).isEqualTo(0);
        softly.assertThat(basic.getRaidWars().get(0).getStartTime()).isEqualTo(Instant.ofEpochSecond(1723608429).atZone(ZoneOffset.UTC).toLocalDateTime());

        softly.assertThat(basic.getTerritoryWars().size()).isEqualTo(2);
        softly.assertThat(basic.getTerritoryWars().get(0).getTerritoryWarId()).isEqualTo(42201);
        softly.assertThat(basic.getTerritoryWars().get(0).getTerritory()).isEqualTo("EJE");
        softly.assertThat(basic.getTerritoryWars().get(0).getAssaultingFaction()).isEqualTo(9055);
        softly.assertThat(basic.getTerritoryWars().get(0).getDefendingFaction()).isEqualTo(11581);
        softly.assertThat(basic.getTerritoryWars().get(0).getScore()).isEqualTo(0);
        softly.assertThat(basic.getTerritoryWars().get(0).getRequiredScore()).isEqualTo(1250000);
        softly.assertThat(basic.getTerritoryWars().get(0).getStartTime()).isEqualTo(Instant.ofEpochSecond(1729869786).atZone(ZoneOffset.UTC).toLocalDateTime());
        softly.assertThat(basic.getTerritoryWars().get(0).getEndTime()).isEqualTo(Instant.ofEpochSecond(1730128986).atZone(ZoneOffset.UTC).toLocalDateTime());
        softly.assertThat(basic.getTerritoryWars().get(0).getAssaulters().size()).isEqualTo(5);
        softly.assertThat(basic.getTerritoryWars().get(0).getDefenders().size()).isEqualTo(13);

        softly.assertThat(basic.getPeace().size()).isEqualTo(2);
        softly.assertThat(basic.getPeace().get(123456)).isEqualTo(Instant.ofEpochSecond(1729886758).atZone(ZoneOffset.UTC).toLocalDateTime());
        softly.assertThat(basic.getPeace().get(123457)).isEqualTo(Instant.ofEpochSecond(1729900538).atZone(ZoneOffset.UTC).toLocalDateTime());

        softly.assertThat(basic.getRank().getLevel()).isEqualTo(0);
        softly.assertThat(basic.getRank().getName()).isEqualTo(Rank.UNRANKED);
        softly.assertThat(basic.getRank().getDivision()).isEqualTo(0);
        softly.assertThat(basic.getRank().getPosition()).isEqualTo(0);
        softly.assertThat(basic.getRank().getWins()).isEqualTo(1337);


        softly.assertAll();

    }

    @Test
    @Disabled("No faction API Access, unable to implement.")
    void ofBoosters() {
    }

    @Test
    @Disabled("No faction API Access, unable to implement.")
    void ofCesium() {
    }

    @Test
    @Disabled("No faction API Access, unable to implement.")
    void ofChainReport() {
    }

    @Test
    void ofChains() {
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
    void ofChain() {
    }

    @Test
    @Disabled("No faction API Access, unable to implement.")
    void ofContributors() {
    }

    @Test
    @Disabled("No faction API Access, unable to implement.")
    void ofCrimeNews() {
    }

    @Test
    @Disabled("No faction API Access, unable to implement.")
    void ofCrimes() {
    }

    @Test
    @Disabled("No faction API Access, unable to implement.")
    void ofCurrency() {
    }

    @Test
    @Disabled("No faction API Access, unable to implement.")
    void ofDonations() {
    }

    @Test
    @Disabled("No faction API Access, unable to implement.")
    void ofDrugs() {
    }

    @Test
    @Disabled("No faction API Access, unable to implement.")
    void ofFundsNews() {
    }

    @Test
    @Disabled("No faction API Access, unable to implement.")
    void ofMainNews() {
    }

    @Test
    @Disabled("No faction API Access, unable to implement.")
    void ofMedical() {
    }

    @Test
    @Disabled("No faction API Access, unable to implement.")
    void ofMembershipNews() {
    }

    @Test
    @Disabled("No faction API Access, unable to implement.")
    void ofPositions() {
    }

    @Test
    void ofRankedWar() {
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
    void ofReports() {
    }

    @Test
    @Disabled("No faction API Access, unable to implement.")
    void ofRevivesFull() {
    }

    @Test
    @Disabled("No faction API Access, unable to implement.")
    void ofRevives() {
    }

    @Test
    @Disabled("No faction API Access, unable to implement.")
    void ofStats() {
    }

    @Test
    @Disabled("No faction API Access, unable to implement.")
    void ofTemporary() {
    }

    @Test
    @Disabled("No faction API Access, unable to implement.")
    void ofTerritoryNews() {
    }

    @Disabled("Not yet implemented.")
    @Test
    void ofTerritory() {
    }

    @Test
    @Disabled("No faction API Access, unable to implement.")
    void ofUpgrades() {
    }

    @Test
    @Disabled("No faction API Access, unable to implement.")
    void ofWeapons() {
    }

}