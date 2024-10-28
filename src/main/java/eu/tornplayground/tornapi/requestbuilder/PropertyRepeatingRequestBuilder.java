package eu.tornplayground.tornapi.requestbuilder;

import eu.tornplayground.tornapi.TornApi;
import eu.tornplayground.tornapi.selections.PropertiesSelections;

public class PropertyRepeatingRequestBuilder extends RequestBuilder<PropertyRepeatingRequestBuilder, PropertiesSelections> {

    public PropertyRepeatingRequestBuilder(TornApi tornApi) {
        super(tornApi, "property");
    }

}
