package be.dekleinekobini.tornapi.mappers;

import be.dekleinekobini.tornapi.models.companies.Company;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;

import java.util.Map;

public class CompanyMapper extends ModelMapper {

    private CompanyMapper() {
    }

    public static Map<Long, Company> ofCompany(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("company"), new TypeReference<>() {
        });
    }

}
