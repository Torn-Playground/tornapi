package eu.tornplayground.tornapi.requestbuilder;

import eu.tornplayground.tornapi.TornApi;
import eu.tornplayground.tornapi.selections.PropertiesSelections;

public class PropertyAsyncRequestBuilder extends RequestBuilder<PropertyAsyncRequestBuilder, PropertiesSelections> {

    public PropertyAsyncRequestBuilder(TornApi tornApi) {
        super(tornApi, "property");
    }

}
