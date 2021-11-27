package be.dekleinekobini.tornapi.models.user;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class JobPointsTest {

    @Test
    void of() throws JsonProcessingException {
        // Arrange
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode json = objectMapper.readTree("{\"jobpoints\":{\"jobs\":{\"law\":2},\"companies\":{\"1\":{\"name\":\"Hair Salon\",\"jobpoints\":9},\"2\":{\"name\":\"Law Firm\",\"jobpoints\":648},\"7\":{\"name\":\"Game Shop\",\"jobpoints\":58},\"10\":{\"name\":\"Adult Novelties\",\"jobpoints\":3},\"14\":{\"name\":\"Sweet Shop\",\"jobpoints\":1},\"16\":{\"name\":\"Television Network\",\"jobpoints\":24},\"20\":{\"name\":\"Property Broker\",\"jobpoints\":18},\"32\":{\"name\":\"Lingerie Store\",\"jobpoints\":5}}}}");

        // Act
        JobPoints result = JobPoints.of(json);

        // Assert
        JobPoints.CompanyPoints hairSalon = new JobPoints.CompanyPoints();
        hairSalon.setName("Hair Salon");
        hairSalon.setJobPoints(9);

        JobPoints.CompanyPoints adultNovelties = new JobPoints.CompanyPoints();
        adultNovelties.setName("Adult Novelties");
        adultNovelties.setJobPoints(3);

        JobPoints.CompanyPoints televisionNetwork = new JobPoints.CompanyPoints();
        televisionNetwork.setName("Television Network");
        televisionNetwork.setJobPoints(24);

        assertThat(result.getJobs())
                .hasSize(1)
                .containsEntry("law", 2L);

        assertThat(result.getCompanies())
                .hasSize(8)
                .containsEntry(1L, hairSalon)
                .containsEntry(10L, adultNovelties)
                .containsEntry(16L, televisionNetwork);
    }

}