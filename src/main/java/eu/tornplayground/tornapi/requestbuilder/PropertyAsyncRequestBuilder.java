package eu.tornplayground.tornapi.requestbuilder;

import eu.tornplayground.tornapi.RequestBuilder;
import eu.tornplayground.tornapi.TornApi;
import eu.tornplayground.tornapi.selections.PropertiesSelections;

public class PropertyAsyncRequestBuilder extends RequestBuilder<PropertiesSelections> {
    public PropertyAsyncRequestBuilder(TornApi tornApi) {
        super(tornApi, "property");
    }
}
