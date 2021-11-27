package be.dekleinekobini.tornapi.models.user;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class PropertiesTest {

    @Test
    void of() throws JsonProcessingException {
        // Arrange
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode json = objectMapper.readTree("{\"properties\":{\"2102352\":{\"owner_id\":2122347,\"property_type\":11,\"property\":\"Palace\",\"status\":\"Owned by their spouse\",\"happy\":1125,\"upkeep\":3000,\"staff_cost\":0,\"cost\":65000000,\"marketprice\":280000000,\"modifications\":{\"interior\":0,\"hot_tub\":0,\"sauna\":0,\"pool\":0,\"open_bar\":0,\"shooting_range\":0,\"vault\":4,\"medical_facility\":0,\"airstrip\":0,\"yacht\":0},\"staff\":{\"maid\":0,\"guard\":0,\"pilot\":0,\"butler\":0,\"doctor\":0}},\"3150854\":{\"owner_id\":2122347,\"property_type\":13,\"property\":\"Private Island\",\"status\":\"Owned by their spouse\",\"happy\":4525,\"upkeep\":100000,\"staff_cost\":252500,\"cost\":500000000,\"marketprice\":1057788000,\"modifications\":{\"interior\":2,\"hot_tub\":1,\"sauna\":1,\"pool\":3,\"open_bar\":1,\"shooting_range\":1,\"vault\":4,\"medical_facility\":1,\"airstrip\":1,\"yacht\":0},\"staff\":{\"maid\":4,\"guard\":5,\"pilot\":1,\"butler\":3,\"doctor\":1}},\"3393900\":{\"owner_id\":2114440,\"property_type\":13,\"property\":\"Private Island\",\"status\":\"Owned by them\",\"happy\":5025,\"upkeep\":100000,\"staff_cost\":252500,\"cost\":500000000,\"marketprice\":1952788000,\"modifications\":{\"interior\":2,\"hot_tub\":1,\"sauna\":1,\"pool\":3,\"open_bar\":1,\"shooting_range\":1,\"vault\":4,\"medical_facility\":1,\"airstrip\":1,\"yacht\":1},\"staff\":{\"maid\":4,\"guard\":5,\"pilot\":1,\"butler\":3,\"doctor\":1}},\"3511064\":{\"owner_id\":2122347,\"property_type\":7,\"property\":\"Villa\",\"status\":\"Owned by their spouse\",\"happy\":400,\"upkeep\":350,\"staff_cost\":0,\"cost\":1250000,\"marketprice\":1250000,\"modifications\":{\"interior\":0,\"hot_tub\":0,\"sauna\":0,\"pool\":0,\"open_bar\":0,\"shooting_range\":0,\"vault\":0,\"medical_facility\":0,\"airstrip\":0,\"yacht\":0},\"staff\":{\"maid\":0,\"guard\":0,\"pilot\":0,\"butler\":0,\"doctor\":0}},\"3553122\":{\"owner_id\":2122347,\"property_type\":4,\"property\":\"Detached House\",\"status\":\"Owned by their spouse\",\"happy\":200,\"upkeep\":150,\"staff_cost\":0,\"cost\":300000,\"marketprice\":300000,\"modifications\":{\"interior\":0,\"hot_tub\":0,\"sauna\":0,\"pool\":0,\"open_bar\":0,\"shooting_range\":0,\"vault\":0,\"medical_facility\":0,\"airstrip\":0,\"yacht\":0},\"staff\":{\"maid\":0,\"guard\":0,\"pilot\":0,\"butler\":0,\"doctor\":0}},\"3555137\":{\"owner_id\":2122347,\"property_type\":7,\"property\":\"Villa\",\"status\":\"Owned by their spouse\",\"happy\":400,\"upkeep\":350,\"staff_cost\":0,\"cost\":1250000,\"marketprice\":1250000,\"modifications\":{\"interior\":0,\"hot_tub\":0,\"sauna\":0,\"pool\":0,\"open_bar\":0,\"shooting_range\":0,\"vault\":0,\"medical_facility\":0,\"airstrip\":0,\"yacht\":0},\"staff\":{\"maid\":0,\"guard\":0,\"pilot\":0,\"butler\":0,\"doctor\":0}},\"3579493\":{\"owner_id\":2122347,\"property_type\":7,\"property\":\"Villa\",\"status\":\"Owned by their spouse\",\"happy\":400,\"upkeep\":350,\"staff_cost\":0,\"cost\":1250000,\"marketprice\":1250000,\"modifications\":{\"interior\":0,\"hot_tub\":0,\"sauna\":0,\"pool\":0,\"open_bar\":0,\"shooting_range\":0,\"vault\":0,\"medical_facility\":0,\"airstrip\":0,\"yacht\":0},\"staff\":{\"maid\":0,\"guard\":0,\"pilot\":0,\"butler\":0,\"doctor\":0}},\"3598509\":{\"owner_id\":2122347,\"property_type\":3,\"property\":\"Semi-Detached House\",\"status\":\"Owned by their spouse\",\"happy\":150,\"upkeep\":70,\"staff_cost\":0,\"cost\":75000,\"marketprice\":75000,\"modifications\":{\"interior\":0,\"hot_tub\":0,\"sauna\":0,\"pool\":0,\"open_bar\":0,\"shooting_range\":0,\"vault\":0,\"medical_facility\":0,\"airstrip\":0,\"yacht\":0},\"staff\":{\"maid\":0,\"guard\":0,\"pilot\":0,\"butler\":0,\"doctor\":0}},\"3739842\":{\"owner_id\":2114440,\"property_type\":13,\"property\":\"Private Island\",\"status\":\"Owned by them\",\"happy\":4275,\"upkeep\":100000,\"staff_cost\":30000,\"cost\":500000000,\"marketprice\":1952788000,\"modifications\":{\"interior\":2,\"hot_tub\":1,\"sauna\":1,\"pool\":3,\"open_bar\":1,\"shooting_range\":1,\"vault\":4,\"medical_facility\":1,\"airstrip\":1,\"yacht\":1},\"staff\":{\"maid\":0,\"guard\":0,\"pilot\":1,\"butler\":0,\"doctor\":0}},\"3849560\":{\"owner_id\":2122347,\"property_type\":4,\"property\":\"Detached House\",\"status\":\"Owned by their spouse\",\"happy\":200,\"upkeep\":150,\"staff_cost\":0,\"cost\":300000,\"marketprice\":300000,\"modifications\":{\"interior\":0,\"hot_tub\":0,\"sauna\":0,\"pool\":0,\"open_bar\":0,\"shooting_range\":0,\"vault\":0,\"medical_facility\":0,\"airstrip\":0,\"yacht\":0},\"staff\":{\"maid\":0,\"guard\":0,\"pilot\":0,\"butler\":0,\"doctor\":0}},\"3854091\":{\"owner_id\":2122347,\"property_type\":4,\"property\":\"Detached House\",\"status\":\"Owned by their spouse\",\"happy\":200,\"upkeep\":150,\"staff_cost\":0,\"cost\":300000,\"marketprice\":300000,\"modifications\":{\"interior\":0,\"hot_tub\":0,\"sauna\":0,\"pool\":0,\"open_bar\":0,\"shooting_range\":0,\"vault\":0,\"medical_facility\":0,\"airstrip\":0,\"yacht\":0},\"staff\":{\"maid\":0,\"guard\":0,\"pilot\":0,\"butler\":0,\"doctor\":0}}}}");

        // Act
        Map<Long, Properties> result = Properties.of(json);

        // Assert
        Properties.Modifications property1Modifications = new Properties.Modifications();
        property1Modifications.setInterior(2);
        property1Modifications.setHotTub(true);
        property1Modifications.setSauna(true);
        property1Modifications.setPool(3);
        property1Modifications.setOpenBar(true);
        property1Modifications.setShootingRange(true);
        property1Modifications.setVault(4);
        property1Modifications.setMedicalFacility(true);
        property1Modifications.setAirstrip(true);
        property1Modifications.setYacht(false);

        Properties.Staff property1Staff = new Properties.Staff();
        property1Staff.setMaid(4);
        property1Staff.setGuard(5);
        property1Staff.setPilot(true);
        property1Staff.setButler(3);
        property1Staff.setDoctor(true);

        Properties property1 = new Properties();
        property1.setOwnerId(2122347);
        property1.setPropertyType(13);
        property1.setProperty("Private Island");
        property1.setStatus("Owned by their spouse");
        property1.setHappy(4525);
        property1.setUpkeep(100000);
        property1.setStaffCost(252500);
        property1.setCost(500000000);
        property1.setMarketPrice(1057788000);
        property1.setModifications(property1Modifications);
        property1.setStaff(property1Staff);

        assertThat(result)
                .hasSize(11)
                .containsEntry(3150854L, property1);
    }

}