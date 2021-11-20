package be.dekleinekobini.tornapi.connector;

import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;

public interface ApiConnector {

    JsonNode connect(String url) throws IOException, InterruptedException;

}
