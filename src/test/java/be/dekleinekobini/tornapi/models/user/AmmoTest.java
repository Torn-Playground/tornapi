package be.dekleinekobini.tornapi.models.user;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class AmmoTest {

    @Test
    void of() throws JsonProcessingException {
        // Arrange
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode json = objectMapper.readTree("{\"ammo\":[{\"ammoID\":2,\"typeID\":1,\"size\":\"9mm Parabellum Round\",\"type\":\"Standard\",\"quantity\":3023,\"equipped\":1},{\"ammoID\":1,\"typeID\":1,\"size\":\"12 Gauge Cartridge\",\"type\":\"Standard\",\"quantity\":2355,\"equipped\":1},{\"ammoID\":1,\"typeID\":5,\"size\":\"12 Gauge Cartridge\",\"type\":\"Incendiary\",\"quantity\":243,\"equipped\":0},{\"ammoID\":3,\"typeID\":1,\"size\":\"5.7mm High Vel. Round\",\"type\":\"Standard\",\"quantity\":390,\"equipped\":0},{\"ammoID\":4,\"typeID\":1,\"size\":\"7.62 mm Rifle Round\",\"type\":\"Standard\",\"quantity\":3797,\"equipped\":0},{\"ammoID\":4,\"typeID\":2,\"size\":\"7.62 mm Rifle Round\",\"type\":\"Hollow Point\",\"quantity\":2146,\"equipped\":0},{\"ammoID\":4,\"typeID\":3,\"size\":\"7.62 mm Rifle Round\",\"type\":\"Piercing\",\"quantity\":2000,\"equipped\":0},{\"ammoID\":4,\"typeID\":4,\"size\":\"7.62 mm Rifle Round\",\"type\":\"Tracer\",\"quantity\":2500,\"equipped\":0},{\"ammoID\":4,\"typeID\":5,\"size\":\"7.62 mm Rifle Round\",\"type\":\"Incendiary\",\"quantity\":1500,\"equipped\":0},{\"ammoID\":5,\"typeID\":1,\"size\":\"5.56mm Rifle Round\",\"type\":\"Standard\",\"quantity\":88568,\"equipped\":0},{\"ammoID\":5,\"typeID\":2,\"size\":\"5.56mm Rifle Round\",\"type\":\"Hollow Point\",\"quantity\":274,\"equipped\":0},{\"ammoID\":5,\"typeID\":3,\"size\":\"5.56mm Rifle Round\",\"type\":\"Piercing\",\"quantity\":1500,\"equipped\":0},{\"ammoID\":5,\"typeID\":4,\"size\":\"5.56mm Rifle Round\",\"type\":\"Tracer\",\"quantity\":500,\"equipped\":0},{\"ammoID\":5,\"typeID\":5,\"size\":\"5.56mm Rifle Round\",\"type\":\"Incendiary\",\"quantity\":500,\"equipped\":0},{\"ammoID\":9,\"typeID\":1,\"size\":\"5.45mm Rifle Round\",\"type\":\"Standard\",\"quantity\":90,\"equipped\":0},{\"ammoID\":10,\"typeID\":1,\"size\":\".45 ACP Round\",\"type\":\"Standard\",\"quantity\":966,\"equipped\":0},{\"ammoID\":17,\"typeID\":1,\"size\":\".380 ACP Round\",\"type\":\"Standard\",\"quantity\":38,\"equipped\":0},{\"ammoID\":18,\"typeID\":1,\"size\":\"Liter of Fuel\",\"type\":\"Standard\",\"quantity\":3186,\"equipped\":0},{\"ammoID\":15,\"typeID\":1,\"size\":\"Flare\",\"type\":\"Standard\",\"quantity\":1000,\"equipped\":0}]}");

        // Act
        List<Ammo> ammo = Ammo.of(json);

        // Assert
        Ammo standard9mm = new Ammo();
        standard9mm.setAmmoId(2);
        standard9mm.setTypeId(1);
        standard9mm.setSize("9mm Parabellum Round");
        standard9mm.setType("Standard");
        standard9mm.setEquipped(true);

        Ammo hollow556 = new Ammo();
        hollow556.setAmmoId(5);
        hollow556.setTypeId(2);
        hollow556.setSize("5.56mm Rifle Round");
        hollow556.setType("Hollow Point");
        hollow556.setEquipped(false);

        assertThat(ammo)
                .hasSize(19)
                .contains(standard9mm, hollow556);
    }

}