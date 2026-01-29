package eu.tornplayground.tornapi.connector;

import tools.jackson.databind.JsonNode;

import java.io.IOException;

public interface ApiConnector {

    /**
     * Connects to the specified URL and returns the response as a JSON node.
     *
     * @param  url  the URL to connect to
     * @return      the JSON node representing the response
     * @throws IOException            if an I/O error occurs
     * @throws InterruptedException   if the connection is interrupted
     * @throws TornHttpException     if the response status code is not in the range 200-300
     */
    JsonNode connect(String url) throws TornHttpException, IOException, InterruptedException;

}
