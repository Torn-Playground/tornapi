package be.dekleinekobini.tornapi.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class Model {

    protected final static ObjectMapper OBJECT_MAPPER = JsonMapper.builder()
            .findAndAddModules()
            .build()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

}
