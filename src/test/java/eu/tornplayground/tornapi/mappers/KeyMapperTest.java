package eu.tornplayground.tornapi.mappers;

import eu.tornplayground.tornapi.models.info.keyinfo.AccessType;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

class KeyMapperTest {

    @Test
    void ofInfo() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode json = objectMapper.readTree("{\"access_level\":3,\"access_type\":\"Limited Access\",\"selections\":{\"company\":[\"applications\",\"companies\",\"detailed\",\"employees\",\"news\",\"newsfull\",\"profile\",\"stock\",\"timestamp\",\"lookup\"],\"faction\":[\"applications\",\"armor\",\"armorynews\",\"attacknews\",\"attacks\",\"attacksfull\",\"basic\",\"boosters\",\"cesium\",\"chain\",\"chainreport\",\"chains\",\"contributors\",\"crimenews\",\"crimes\",\"currency\",\"donations\",\"drugs\",\"fundsnews\",\"mainnews\",\"medical\",\"membershipnews\",\"positions\",\"reports\",\"revives\",\"revivesfull\",\"stats\",\"temporary\",\"territory\",\"territorynews\",\"timestamp\",\"upgrades\",\"weapons\",\"lookup\"],\"market\":[\"bazaar\",\"itemmarket\",\"pointsmarket\",\"timestamp\",\"lookup\"],\"property\":[\"property\",\"timestamp\",\"lookup\"],\"torn\":[\"bank\",\"cards\",\"chainreport\",\"companies\",\"competition\",\"education\",\"factiontree\",\"gyms\",\"honors\",\"items\",\"logcategories\",\"logtypes\",\"medals\",\"organisedcrimes\",\"pawnshop\",\"pokertables\",\"properties\",\"rackets\",\"raids\",\"rankedwars\",\"rankedwarreport\",\"stats\",\"stocks\",\"territory\",\"territorywars\",\"timestamp\",\"lookup\"],\"user\":[\"ammo\",\"attacks\",\"attacksfull\",\"bars\",\"basic\",\"battlestats\",\"bazaar\",\"cooldowns\",\"crimes\",\"discord\",\"display\",\"education\",\"events\",\"gym\",\"hof\",\"honors\",\"icons\",\"inventory\",\"jobpoints\",\"medals\",\"merits\",\"messages\",\"missions\",\"money\",\"networth\",\"newevents\",\"newmessages\",\"notifications\",\"perks\",\"personalstats\",\"profile\",\"properties\",\"receivedevents\",\"refills\",\"reports\",\"revives\",\"revivesfull\",\"skills\",\"stocks\",\"timestamp\",\"travel\",\"weaponexp\",\"workstats\",\"lookup\"],\"key\":[\"info\"]}}");

        var result = KeyMapper.ofInfo(json);

        SoftAssertions softly = new SoftAssertions();

        softly.assertThat(result.getAccessLevel()).isEqualTo(3);
        softly.assertThat(result.getAccessType()).isEqualTo(AccessType.LIMITED_ACCESS);
        softly.assertThat(result.getSelections().getUser())
                .hasSize(44)
                .contains("hof", "money", "lookup");
        softly.assertThat(result.getSelections().getProperty())
                .hasSize(3)
                .contains("property", "lookup");
        softly.assertThat(result.getSelections().getFaction())
                .hasSize(34)
                .contains("crimes", "revivesfull", "weapons");
        softly.assertThat(result.getSelections().getCompany())
                .hasSize(10)
                .contains("applications", "profile", "stock");
        softly.assertThat(result.getSelections().getMarket())
                .hasSize(5)
                .contains("bazaar", "itemmarket");
        softly.assertThat(result.getSelections().getTorn())
                .hasSize(27)
                .contains("companies", "medals", "stocks");
        softly.assertThat(result.getSelections().getKey())
                .hasSize(1)
                .contains("info");

        softly.assertAll();
    }

}