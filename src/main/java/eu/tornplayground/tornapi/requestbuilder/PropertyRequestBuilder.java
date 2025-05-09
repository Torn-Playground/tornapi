package eu.tornplayground.tornapi.requestbuilder;

import eu.tornplayground.tornapi.TornApi;
import eu.tornplayground.tornapi.selections.PropertiesSelections;

public class PropertyRequestBuilder extends RequestBuilder<PropertyRequestBuilder, PropertiesSelections> {

    public PropertyRequestBuilder(TornApi tornApi) {
        super(tornApi, "property");
    }

}
