package be.dekleinekobini.tornapi.models.user;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

class NetworthTest {

    @Test
    void of() throws JsonProcessingException { // Arrange
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode json = objectMapper.readTree("{\"networth\":{\"pending\":0,\"wallet\":886911,\"bank\":2398000000,\"points\":648277990,\"cayman\":0,\"vault\":0,\"piggybank\":3400000,\"items\":2356511851,\"displaycase\":56703412,\"bazaar\":55007420,\"itemmarket\":0,\"properties\":2929182000,\"stockmarket\":16109651000,\"auctionhouse\":0,\"company\":0,\"bookie\":0,\"enlistedcars\":16225460,\"loan\":0,\"unpaidfees\":0,\"total\":24573846044,\"parsetime\":0.2255561351776123}}");

        // Act
        Networth networth = Networth.of(json);

        // Assert
        SoftAssertions softly = new SoftAssertions();

        softly.assertThat(networth.getPending()).isEqualTo(0);
        softly.assertThat(networth.getWallet()).isEqualTo(886911);
        softly.assertThat(networth.getBank()).isEqualTo(2398000000L);
        softly.assertThat(networth.getPoints()).isEqualTo(648277990);
        softly.assertThat(networth.getCayman()).isEqualTo(0);
        softly.assertThat(networth.getVault()).isEqualTo(0);
        softly.assertThat(networth.getPiggyBank()).isEqualTo(3400000);
        softly.assertThat(networth.getItems()).isEqualTo(2356511851L);
        softly.assertThat(networth.getDisplayCase()).isEqualTo(56703412);
        softly.assertThat(networth.getBazaar()).isEqualTo(55007420);
        softly.assertThat(networth.getItemMarket()).isEqualTo(0);
        softly.assertThat(networth.getProperties()).isEqualTo(2929182000L);
        softly.assertThat(networth.getStockMarket()).isEqualTo(16109651000L);
        softly.assertThat(networth.getAuctionHouse()).isEqualTo(0);
        softly.assertThat(networth.getCompany()).isEqualTo(0);
        softly.assertThat(networth.getBookie()).isEqualTo(0);
        softly.assertThat(networth.getEnlistedCars()).isEqualTo(16225460);
        softly.assertThat(networth.getLoan()).isEqualTo(0);
        softly.assertThat(networth.getUnpaidFees()).isEqualTo(0);
        softly.assertThat(networth.getTotal()).isEqualTo(24573846044L);
        softly.assertThat(networth.getParseTime()).isEqualTo(0.2255561351776123);

        softly.assertAll();
    }

}