package be.dekleinekobini.tornapi.models.user;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class WeaponExpTest {

    @Test
    void of() throws JsonProcessingException {
        // Arrange
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode json = objectMapper.readTree("{\"weaponexp\":[{\"itemID\":175,\"name\":\"Taser\",\"exp\":100},{\"itemID\":8,\"name\":\"Axe\",\"exp\":100},{\"itemID\":10,\"name\":\"Chainsaw\",\"exp\":100},{\"itemID\":237,\"name\":\"Kodachi\",\"exp\":100},{\"itemID\":255,\"name\":\"Flamethrower\",\"exp\":100},{\"itemID\":395,\"name\":\"Metal Nunchakus\",\"exp\":100},{\"itemID\":614,\"name\":\"Diamond Bladed Knife\",\"exp\":100},{\"itemID\":399,\"name\":\"ArmaLite M-15A4\",\"exp\":100},{\"itemID\":147,\"name\":\"Rusty Sword\",\"exp\":100},{\"itemID\":26,\"name\":\"AK-47\",\"exp\":67},{\"itemID\":233,\"name\":\"BT MP9\",\"exp\":43},{\"itemID\":805,\"name\":\"Duke's Hammer\",\"exp\":42},{\"itemID\":792,\"name\":\"Penelope\",\"exp\":39},{\"itemID\":63,\"name\":\"Minigun\",\"exp\":38},{\"itemID\":440,\"name\":\"Pillow\",\"exp\":30},{\"itemID\":616,\"name\":\"Trout\",\"exp\":26},{\"itemID\":223,\"name\":\"Jackhammer\",\"exp\":25},{\"itemID\":21,\"name\":\"Dual 92G Berettas\",\"exp\":24},{\"itemID\":394,\"name\":\"Brick\",\"exp\":17},{\"itemID\":1,\"name\":\"Hammer\",\"exp\":13},{\"itemID\":219,\"name\":\"Enfield SA-80\",\"exp\":13},{\"itemID\":2,\"name\":\"Baseball Bat\",\"exp\":7},{\"itemID\":220,\"name\":\"Grenade\",\"exp\":5},{\"itemID\":22,\"name\":\"Sawed-Off Shotgun\",\"exp\":4},{\"itemID\":24,\"name\":\"MP5 Navy\",\"exp\":3},{\"itemID\":29,\"name\":\"M16 A2 Rifle\",\"exp\":3},{\"itemID\":483,\"name\":\"MP5k\",\"exp\":3},{\"itemID\":27,\"name\":\"M4A1 Colt Carbine\",\"exp\":2},{\"itemID\":232,\"name\":\"SIG 550\",\"exp\":2},{\"itemID\":241,\"name\":\"Bushmaster Carbon 15\",\"exp\":2},{\"itemID\":6,\"name\":\"Kitchen Knife\",\"exp\":2},{\"itemID\":248,\"name\":\"Qsz-92\",\"exp\":1},{\"itemID\":18,\"name\":\"Fiveseven\",\"exp\":1},{\"itemID\":487,\"name\":\"Thompson\",\"exp\":1},{\"itemID\":402,\"name\":\"Ice Pick\",\"exp\":1},{\"itemID\":484,\"name\":\"AK74U\",\"exp\":1},{\"itemID\":490,\"name\":\"Blunderbuss\",\"exp\":1},{\"itemID\":249,\"name\":\"SKS Carbine\",\"exp\":1}]}");

        // Act
        List<WeaponExp> result = WeaponExp.of(json);

        // Assert
        WeaponExp taser = new WeaponExp();
        taser.setItemId(175);
        taser.setName("Taser");
        taser.setExp((byte) 100);

        WeaponExp ak47 = new WeaponExp();
        ak47.setItemId(26);
        ak47.setName("AK-47");
        ak47.setExp((byte) 67);

        WeaponExp sksCarbine = new WeaponExp();
        sksCarbine.setItemId(249);
        sksCarbine.setName("SKS Carbine");
        sksCarbine.setExp((byte) 1);

        assertThat(result)
                .hasSize(38)
                .contains(taser, ak47, sksCarbine);
    }

}