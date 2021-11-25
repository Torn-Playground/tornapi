package be.dekleinekobini.tornapi.models.user;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class HOFTest {

    @Test
    void of() throws JsonProcessingException {
        // Arrange
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode json = objectMapper.readTree("{\"halloffame\":{\"attacks\":{\"value\":9704,\"rank\":3183},\"battlestats\":{\"value\":1851378691,\"rank\":5878},\"busts\":{\"value\":3050,\"rank\":1773},\"defends\":{\"value\":1254,\"rank\":2272},\"networth\":{\"value\":24559486834,\"rank\":3139},\"offences\":{\"value\":44940,\"rank\":4375},\"revives\":{\"value\":2712,\"rank\":404},\"traveled\":{\"value\":772,\"rank\":16713},\"workstats\":{\"value\":209672,\"rank\":111392},\"level\":{\"value\":94,\"rank\":2462},\"rank\":{\"value\":23,\"rank\":3688},\"respect\":{\"value\":6334187,\"rank\":32}}}");

        // Act
        Map<String, HOF> result = HOF.of(json);

        // Assert
        HOF attacks = new HOF();
        attacks.setValue(9704);
        attacks.setRank(3183);

        HOF busts = new HOF();
        busts.setValue(3050);
        busts.setRank(1773);

        HOF revives = new HOF();
        revives.setValue(2712);
        revives.setRank(404);

        assertThat(result)
                .hasSize(12)
                .containsEntry(HOF.ATTACKS, attacks)
                .containsEntry(HOF.BUSTS, busts)
                .containsEntry(HOF.REVIVES, revives);
    }

}