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

    @Override
    public PropertyRepeatingRequestBuilder id(long id) {
        return (PropertyRepeatingRequestBuilder) super.id(id);
    }

    @Override
    public PropertyRepeatingRequestBuilder id(String id) {
        return (PropertyRepeatingRequestBuilder) super.id(id);
    }

    @Override
    public PropertyRepeatingRequestBuilder withComment(String comment) {
        return (PropertyRepeatingRequestBuilder) super.withComment(comment);
    }

    @Override
    public PropertyRepeatingRequestBuilder withParameter(String key, Object value) {
        return (PropertyRepeatingRequestBuilder) super.withParameter(key, value);
    }

    @Override
    public PropertyRepeatingRequestBuilder withSelections(String... selections) {
        return (PropertyRepeatingRequestBuilder) super.withSelections(selections);
    }

    @Override
    public PropertyRepeatingRequestBuilder withKey(String key) {
        return (PropertyRepeatingRequestBuilder) super.withKey(key);
    }
}
