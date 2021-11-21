package be.dekleinekobini.tornapi.models.user;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

class BattleStatsTest {

    @Test
    void of() throws JsonProcessingException {
        // Arrange
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode json = objectMapper.readTree("{\"strength\":1,\"speed\":2,\"dexterity\":3,\"defense\":4,\"total\":10,\"strength_modifier\":5,\"defense_modifier\":5,\"speed_modifier\":5,\"dexterity_modifier\":5,\"strength_info\":[\"+30% to Strength from Merits\",\"+5% to Strength from Education\",\"+1% to Strength from Faction\",\"-14% to Strength from Drug\"],\"defense_info\":[\"+30% to Defense from Merits\",\"+11% to Defense from Education\",\"-18% to Defense from Drug\"],\"speed_info\":[\"+30% to Speed from Merits\",\"+14% to Speed from Education\",\"+1% to Speed from Faction\",\"-25% to Speed from Drug\"],\"dexterity_info\":[\"+30% to Dexterity from Merits\",\"+19% to Dexterity from Education\"]}");

        // Act
        BattleStats stats = BattleStats.of(json);

        // Assert
        SoftAssertions softly = new SoftAssertions();

        softly.assertThat(stats).isNotNull();
        softly.assertThat(stats.getStrength()).isEqualTo(1);
        softly.assertThat(stats.getSpeed()).isEqualTo(2);
        softly.assertThat(stats.getDexterity()).isEqualTo(3);
        softly.assertThat(stats.getDefense()).isEqualTo(4);
        softly.assertThat(stats.getTotal()).isEqualTo(10);
        softly.assertThat(stats.getStrengthModifier()).isEqualTo(5);
        softly.assertThat(stats.getDefenseModifier()).isEqualTo(5);
        softly.assertThat(stats.getSpeedModifier()).isEqualTo(5);
        softly.assertThat(stats.getDexterityModifier()).isEqualTo(5);
        softly.assertThat(stats.getStrengthInfo()).hasSize(4);
        softly.assertThat(stats.getDefenseInfo()).hasSize(3);
        softly.assertThat(stats.getSpeedInfo()).hasSize(4);
        softly.assertThat(stats.getDexterityInfo()).hasSize(2);

        softly.assertAll();
    }

    @Test
    void ofTopPlayer() throws JsonProcessingException {
        // Arrange
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode json = objectMapper.readTree("{\"strength\":2166691479,\"speed\":1364171599,\"dexterity\":1506931433,\"defense\":520976069394180,\"total\":520981107188691,\"strength_modifier\":5,\"defense_modifier\":5,\"speed_modifier\":5,\"dexterity_modifier\":5,\"strength_info\":[\"+30% to Strength from Merits\",\"+5% to Strength from Education\",\"+1% to Strength from Faction\",\"-14% to Strength from Drug\"],\"defense_info\":[\"+30% to Defense from Merits\",\"+11% to Defense from Education\",\"-18% to Defense from Drug\"],\"speed_info\":[\"+30% to Speed from Merits\",\"+14% to Speed from Education\",\"+1% to Speed from Faction\",\"-25% to Speed from Drug\"],\"dexterity_info\":[\"+30% to Dexterity from Merits\",\"+19% to Dexterity from Education\"]}");

        // Act
        BattleStats stats = BattleStats.of(json);

        // Assert
        SoftAssertions softly = new SoftAssertions();

        softly.assertThat(stats).isNotNull();
        softly.assertThat(stats.getStrength()).isEqualTo(2166691479L);
        softly.assertThat(stats.getSpeed()).isEqualTo(1364171599L);
        softly.assertThat(stats.getDexterity()).isEqualTo(1506931433);
        softly.assertThat(stats.getDefense()).isEqualTo(520976069394180L);
        softly.assertThat(stats.getTotal()).isEqualTo(520981107188691L);
        softly.assertThat(stats.getStrengthModifier()).isEqualTo(5);
        softly.assertThat(stats.getDefenseModifier()).isEqualTo(5);
        softly.assertThat(stats.getSpeedModifier()).isEqualTo(5);
        softly.assertThat(stats.getDexterityModifier()).isEqualTo(5);
        softly.assertThat(stats.getStrengthInfo()).hasSize(4);
        softly.assertThat(stats.getDefenseInfo()).hasSize(3);
        softly.assertThat(stats.getSpeedInfo()).hasSize(4);
        softly.assertThat(stats.getDexterityInfo()).hasSize(2);

        softly.assertAll();
    }

}