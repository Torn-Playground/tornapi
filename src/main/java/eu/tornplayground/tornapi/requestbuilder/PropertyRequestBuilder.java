package eu.tornplayground.tornapi.requestbuilder;

import eu.tornplayground.tornapi.RequestBuilder;
import eu.tornplayground.tornapi.TornApi;
import eu.tornplayground.tornapi.selections.PropertiesSelections;

public class PropertyRequestBuilder extends RequestBuilder<PropertiesSelections> {

    public PropertyRequestBuilder(TornApi tornApi) {
        super(tornApi, "property");
    }

    @Override
    public PropertyRequestBuilder withTornErrorException(boolean throwError) {
        super.withTornErrorException(throwError);
        return this;
    }

    @Override
    public PropertyRequestBuilder id(long id) {
        return (PropertyRequestBuilder) super.id(id);
    }

    @Override
    public PropertyRequestBuilder id(String id) {
        return (PropertyRequestBuilder) super.id(id);
    }

    @Override
    public PropertyRequestBuilder withComment(String comment) {
        return (PropertyRequestBuilder) super.withComment(comment);
    }

    @Override
    public PropertyRequestBuilder withParameter(String key, Object value) {
        return (PropertyRequestBuilder) super.withParameter(key, value);
    }

    @Override
    public PropertyRequestBuilder withSelections(String... selections) {
        return (PropertyRequestBuilder) super.withSelections(selections);
    }

    @Override
    public PropertyRequestBuilder withKey(String key) {
        return (PropertyRequestBuilder) super.withKey(key);
    }
}
