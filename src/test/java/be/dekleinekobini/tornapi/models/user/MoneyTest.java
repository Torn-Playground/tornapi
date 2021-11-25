package be.dekleinekobini.tornapi.models.user;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

class MoneyTest {

    @Test
    void of() throws JsonProcessingException { // Arrange
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode json = objectMapper.readTree("{\"points\":14251,\"cayman_bank\":0,\"vault_amount\":0,\"company_funds\":0,\"daily_networth\":24502797128,\"money_onhand\":886911,\"city_bank\":{\"amount\":2398000000,\"time_left\":7073405}}");

        // Act
        Money money = Money.of(json);

        // Assert
        SoftAssertions softly = new SoftAssertions();

        softly.assertThat(money.getPoints()).isEqualTo(14251);
        softly.assertThat(money.getCaymanBank()).isEqualTo(0);
        softly.assertThat(money.getVault()).isEqualTo(0);
        softly.assertThat(money.getCompanyFunds()).isEqualTo(0);
        softly.assertThat(money.getDailyNetworth()).isEqualTo(24502797128L);
        softly.assertThat(money.getMoneyOnHand()).isEqualTo(886911);
        softly.assertThat(money.getCityBank().getAmount()).isEqualTo(2398000000L);
        softly.assertThat(money.getCityBank().getTimeLeft()).hasDays(81);

        softly.assertAll();
    }

}