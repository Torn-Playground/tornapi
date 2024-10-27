package eu.tornplayground.tornapi.requestbuilder;

import eu.tornplayground.tornapi.RequestBuilder;
import eu.tornplayground.tornapi.TornApi;
import eu.tornplayground.tornapi.selections.PropertiesSelections;

public class PropertyRepeatingRequestBuilder extends RequestBuilder<PropertiesSelections> {

    public PropertyRepeatingRequestBuilder(TornApi tornApi) {
        super(tornApi, "property");
    }

    @Override
    public PropertyRepeatingRequestBuilder withTornErrorException(boolean throwError) {
        super.withTornErrorException(throwError);
        return this;
    }

}
