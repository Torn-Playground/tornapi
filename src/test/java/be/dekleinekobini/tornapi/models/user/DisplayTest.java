package be.dekleinekobini.tornapi.models.user;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class DisplayTest {

    @Test
    void of() throws JsonProcessingException {
        // Arrange
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode json = objectMapper.readTree("{\"display\":[{\"ID\":634,\"name\":\"Bag of Bloody Eyeballs\",\"type\":\"Candy\",\"quantity\":1,\"circulation\":54795,\"market_price\":44178},{\"ID\":37,\"name\":\"Bag of Bon Bons\",\"type\":\"Candy\",\"quantity\":11,\"circulation\":1708490,\"market_price\":577},{\"ID\":527,\"name\":\"Bag of Candy Kisses\",\"type\":\"Candy\",\"quantity\":35,\"circulation\":818191,\"market_price\":26193},{\"ID\":529,\"name\":\"Bag of Chocolate Truffles\",\"type\":\"Candy\",\"quantity\":27,\"circulation\":972508,\"market_price\":85945},{\"ID\":1039,\"name\":\"Bag of Humbugs\",\"type\":\"Candy\",\"quantity\":5,\"circulation\":11974,\"market_price\":364142},{\"ID\":556,\"name\":\"Bag of Reindeer Droppings\",\"type\":\"Candy\",\"quantity\":25,\"circulation\":519304,\"market_price\":86979},{\"ID\":528,\"name\":\"Bag of Tootsie Rolls\",\"type\":\"Candy\",\"quantity\":24,\"circulation\":950421,\"market_price\":46049},{\"ID\":181,\"name\":\"Bottle of Champagne\",\"type\":\"Alcohol\",\"quantity\":27,\"circulation\":599084,\"market_price\":3942},{\"ID\":638,\"name\":\"Bottle of Christmas Cocktail\",\"type\":\"Alcohol\",\"quantity\":2,\"circulation\":280545,\"market_price\":189394},{\"ID\":873,\"name\":\"Bottle of Green Stout\",\"type\":\"Alcohol\",\"quantity\":4,\"circulation\":49793,\"market_price\":901798},{\"ID\":550,\"name\":\"Bottle of Kandy Kane\",\"type\":\"Alcohol\",\"quantity\":6,\"circulation\":493263,\"market_price\":85046},{\"ID\":551,\"name\":\"Bottle of Minty Mayhem\",\"type\":\"Alcohol\",\"quantity\":3,\"circulation\":514896,\"market_price\":169295},{\"ID\":552,\"name\":\"Bottle of Mistletoe Madness\",\"type\":\"Alcohol\",\"quantity\":5,\"circulation\":507926,\"market_price\":372733},{\"ID\":531,\"name\":\"Bottle of Pumpkin Brew\",\"type\":\"Alcohol\",\"quantity\":4,\"circulation\":536716,\"market_price\":85798},{\"ID\":541,\"name\":\"Bottle of Stinky Swamp Punch\",\"type\":\"Alcohol\",\"quantity\":1,\"circulation\":196059,\"market_price\":374163},{\"ID\":38,\"name\":\"Box of Bon Bons\",\"type\":\"Candy\",\"quantity\":26,\"circulation\":464735,\"market_price\":1077},{\"ID\":35,\"name\":\"Box of Chocolate Bars\",\"type\":\"Candy\",\"quantity\":1,\"circulation\":3161637,\"market_price\":525},{\"ID\":39,\"name\":\"Box of Extra Strong Mints\",\"type\":\"Candy\",\"quantity\":2,\"circulation\":2848723,\"market_price\":556},{\"ID\":209,\"name\":\"Box of Sweet Hearts\",\"type\":\"Candy\",\"quantity\":2,\"circulation\":2737116,\"market_price\":579},{\"ID\":586,\"name\":\"Jawbreaker\",\"type\":\"Candy\",\"quantity\":23,\"circulation\":70464,\"market_price\":270163},{\"ID\":310,\"name\":\"Lollipop\",\"type\":\"Candy\",\"quantity\":401,\"circulation\":45010089,\"market_price\":592},{\"ID\":870,\"name\":\"Love Juice\",\"type\":\"Drug\",\"quantity\":2,\"circulation\":32491,\"market_price\":14931665},{\"ID\":1143,\"name\":\"Medical Mask\",\"type\":\"Clothing\",\"quantity\":1,\"circulation\":2000,\"market_price\":0},{\"ID\":151,\"name\":\"Pixie Sticks\",\"type\":\"Candy\",\"quantity\":4,\"circulation\":207253,\"market_price\":265828}]}");

        // Act
        List<Display> result = Display.of(json);

        // Assert
        Display candyKisses = new Display();
        candyKisses.setId(527);
        candyKisses.setName("Bag of Candy Kisses");
        candyKisses.setType("Candy");
        candyKisses.setQuantity(35);
        candyKisses.setCirculation(818191);
        candyKisses.setMarketPrice(26193);

        Display medicalMask = new Display();
        medicalMask.setId(1143);
        medicalMask.setName("Medical Mask");
        medicalMask.setType("Clothing");
        medicalMask.setQuantity(1);
        medicalMask.setCirculation(2000);
        medicalMask.setMarketPrice(0);

        assertThat(result)
                .hasSize(24)
                .contains(candyKisses, medicalMask);
    }

}