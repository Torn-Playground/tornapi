package be.dekleinekobini.tornapi.models.user;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

class CrimesTest {

    @Test
    void of() throws JsonProcessingException {
        // Arrange
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode json = objectMapper.readTree("{\"criminalrecord\":{\"selling_illegal_products\":5001,\"theft\":2630,\"auto_theft\":208,\"drug_deals\":10003,\"computer_crimes\":10019,\"murder\":9407,\"fraud_crimes\":2551,\"other\":5043,\"total\":44862}}");

        // Act
        Crimes crimes = Crimes.of(json);

        // Assert
        SoftAssertions softly = new SoftAssertions();

        softly.assertThat(crimes.getSellingIllegalProducts()).isEqualTo(5001);
        softly.assertThat(crimes.getTheft()).isEqualTo(2630);
        softly.assertThat(crimes.getAutoTheft()).isEqualTo(208);
        softly.assertThat(crimes.getDrugDeals()).isEqualTo(10003);
        softly.assertThat(crimes.getComputerCrimes()).isEqualTo(10019);
        softly.assertThat(crimes.getMurder()).isEqualTo(9407);
        softly.assertThat(crimes.getFraudCrimes()).isEqualTo(2551);
        softly.assertThat(crimes.getOther()).isEqualTo(5043);
        softly.assertThat(crimes.getTotal()).isEqualTo(44862);

        softly.assertAll();
    }

}