package be.dekleinekobini.tornapi.models.user;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class BazaarTest {

    @Test
    void of() throws JsonProcessingException {
        // Arrange
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode json = objectMapper.readTree("{\"bazaar\":[{\"ID\":477,\"name\":\"Black Easter Egg\",\"type\":\"Candy\",\"quantity\":3,\"price\":250000,\"market_price\":166925},{\"ID\":472,\"name\":\"Blue Easter Egg\",\"type\":\"Candy\",\"quantity\":2,\"price\":250000,\"market_price\":167132},{\"ID\":97,\"name\":\"Bunch of Flowers\",\"type\":\"Flower\",\"quantity\":27459,\"price\":700,\"market_price\":245},{\"ID\":48,\"name\":\"Jacket\",\"type\":\"Clothing\",\"quantity\":216151,\"price\":699,\"market_price\":237},{\"ID\":584,\"name\":\"Orange Easter Egg\",\"type\":\"Candy\",\"quantity\":4,\"price\":175000,\"market_price\":164125},{\"ID\":585,\"name\":\"Pink Easter Egg\",\"type\":\"Candy\",\"quantity\":3,\"price\":175000,\"market_price\":166375},{\"ID\":474,\"name\":\"Red Easter Egg\",\"type\":\"Candy\",\"quantity\":3,\"price\":175000,\"market_price\":155189},{\"ID\":203,\"name\":\"Shrooms\",\"type\":\"Drug\",\"quantity\":65,\"price\":24999,\"market_price\":9999},{\"ID\":475,\"name\":\"Yellow Easter Egg\",\"type\":\"Candy\",\"quantity\":1,\"price\":175000,\"market_price\":168683}]}");

        // Act
        List<Bazaar> bazaar = Bazaar.of(json);

        // Assert
        Bazaar jacket = new Bazaar();
        jacket.setId(48);
        jacket.setName("Jacket");
        jacket.setType("Clothing");
        jacket.setQuantity(216151);
        jacket.setPrice(699);
        jacket.setMarketPrice(237);

        Bazaar bunchOfFlowers = new Bazaar();
        bunchOfFlowers.setId(97);
        bunchOfFlowers.setName("Bunch of Flowers");
        bunchOfFlowers.setType("Flower");
        bunchOfFlowers.setQuantity(27459);
        bunchOfFlowers.setPrice(700);
        bunchOfFlowers.setMarketPrice(245);

        assertThat(bazaar)
                .hasSize(9)
                .contains(jacket, bunchOfFlowers);
    }

}