package be.dekleinekobini.tornapi.models.user;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

class BarsTest {

    @Test
    void of() throws JsonProcessingException {
        // Arrange
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode json = objectMapper.readTree("{\"server_time\":1637502830,\"happy\":{\"current\":4425,\"maximum\":4525,\"increment\":5,\"interval\":900,\"ticktime\":370,\"fulltime\":17470},\"life\":{\"current\":6633,\"maximum\":6633,\"increment\":397,\"interval\":300,\"ticktime\":70,\"fulltime\":0},\"energy\":{\"current\":75,\"maximum\":150,\"increment\":5,\"interval\":600,\"ticktime\":370,\"fulltime\":8770},\"nerve\":{\"current\":33,\"maximum\":105,\"increment\":1,\"interval\":300,\"ticktime\":70,\"fulltime\":21370},\"chain\":{\"current\":0,\"maximum\":25000,\"timeout\":0,\"modifier\":1,\"cooldown\":0}}");

        // Act
        Bars bars = Bars.of(json);

        // Assert
        SoftAssertions softly = new SoftAssertions();

        softly.assertThat(bars.getServerTime()).isEqualTo(LocalDateTime.of(2021, 11, 21, 13, 53, 50));

        softly.assertThat(bars.getHappy().getCurrent()).isEqualTo(4425);
        softly.assertThat(bars.getHappy().getMaximum()).isEqualTo(4525);
        softly.assertThat(bars.getHappy().getIncrement()).isEqualTo(5);
        softly.assertThat(bars.getHappy().getInterval()).hasMinutes(15);
        softly.assertThat(bars.getHappy().getTicktime()).hasSeconds(370);
        softly.assertThat(bars.getHappy().getFulltime()).hasSeconds(17470);

        softly.assertThat(bars.getLife().getCurrent()).isEqualTo(6633);
        softly.assertThat(bars.getLife().getMaximum()).isEqualTo(6633);
        softly.assertThat(bars.getLife().getIncrement()).isEqualTo(397);
        softly.assertThat(bars.getLife().getInterval()).hasMinutes(5);
        softly.assertThat(bars.getLife().getTicktime()).hasSeconds(70);
        softly.assertThat(bars.getLife().getFulltime()).hasSeconds(0);

        softly.assertThat(bars.getEnergy().getCurrent()).isEqualTo(75);
        softly.assertThat(bars.getEnergy().getMaximum()).isEqualTo(150);
        softly.assertThat(bars.getEnergy().getIncrement()).isEqualTo(5);
        softly.assertThat(bars.getEnergy().getInterval()).hasMinutes(10);
        softly.assertThat(bars.getEnergy().getTicktime()).hasSeconds(370);
        softly.assertThat(bars.getEnergy().getFulltime()).hasMinutes(146);

        softly.assertThat(bars.getNerve().getCurrent()).isEqualTo(33);
        softly.assertThat(bars.getNerve().getMaximum()).isEqualTo(105);
        softly.assertThat(bars.getNerve().getIncrement()).isEqualTo(1);
        softly.assertThat(bars.getNerve().getInterval()).hasMinutes(5);
        softly.assertThat(bars.getNerve().getTicktime()).hasSeconds(70);
        softly.assertThat(bars.getNerve().getFulltime()).hasMinutes(356);

        softly.assertThat(bars.getChain().getCurrent()).isEqualTo(0);
        softly.assertThat(bars.getChain().getMaximum()).isEqualTo(25000);
        softly.assertThat(bars.getChain().getTimeout()).isEqualTo(0);
        softly.assertThat(bars.getChain().getModifier()).isEqualTo(1);
        softly.assertThat(bars.getChain().getCooldown()).isEqualTo(0);

        softly.assertAll();
    }

}