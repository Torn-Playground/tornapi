package eu.tornplayground.tornapi.requestbuilder;

import eu.tornplayground.tornapi.RequestBuilder;
import eu.tornplayground.tornapi.TornApi;
import eu.tornplayground.tornapi.selections.PropertiesSelections;

public class PropertyAsyncRequestBuilder extends RequestBuilder<PropertiesSelections> {

    public PropertyAsyncRequestBuilder(TornApi tornApi) {
        super(tornApi, "property");
    }

    @Override
    public PropertyAsyncRequestBuilder withTornErrorException(boolean throwError) {
        super.withTornErrorException(throwError);
        return this;
    }

    @Override
    public PropertyAsyncRequestBuilder id(long id) {
        return (PropertyAsyncRequestBuilder) super.id(id);
    }

    @Override
    public PropertyAsyncRequestBuilder id(String id) {
        return (PropertyAsyncRequestBuilder) super.id(id);
    }

    @Override
    public PropertyAsyncRequestBuilder withComment(String comment) {
        return (PropertyAsyncRequestBuilder) super.withComment(comment);
    }

    @Override
    public PropertyAsyncRequestBuilder withParameter(String key, Object value) {
        return (PropertyAsyncRequestBuilder) super.withParameter(key, value);
    }

    @Override
    public PropertyAsyncRequestBuilder withSelections(String... selections) {
        return (PropertyAsyncRequestBuilder) super.withSelections(selections);
    }

    @Override
    public PropertyAsyncRequestBuilder withKey(String key) {
        return (PropertyAsyncRequestBuilder) super.withKey(key);
    }
}
