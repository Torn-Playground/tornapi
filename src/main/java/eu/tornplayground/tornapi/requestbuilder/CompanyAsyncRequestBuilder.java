package eu.tornplayground.tornapi.requestbuilder;

import eu.tornplayground.tornapi.RequestBuilder;
import eu.tornplayground.tornapi.TornApi;
import eu.tornplayground.tornapi.selections.CompanySelections;

public class CompanyAsyncRequestBuilder extends RequestBuilder<CompanySelections> {

    public CompanyAsyncRequestBuilder(TornApi tornApi) {
        super(tornApi, "company");
    }

    @Override
    public CompanyAsyncRequestBuilder withTornErrorException(boolean throwError) {
        super.withTornErrorException(throwError);
        return this;
    }

    @Override
    public CompanyAsyncRequestBuilder id(long id) {
        return (CompanyAsyncRequestBuilder) super.id(id);
    }

    @Override
    public CompanyAsyncRequestBuilder id(String id) {
        return (CompanyAsyncRequestBuilder) super.id(id);
    }

    @Override
    public CompanyAsyncRequestBuilder withComment(String comment) {
        return (CompanyAsyncRequestBuilder) super.withComment(comment);
    }

    @Override
    public CompanyAsyncRequestBuilder withParameter(String key, Object value) {
        return (CompanyAsyncRequestBuilder) super.withParameter(key, value);
    }

    @Override
    public CompanyAsyncRequestBuilder withSelections(String... selections) {
        return (CompanyAsyncRequestBuilder) super.withSelections(selections);
    }

    @Override
    public CompanyAsyncRequestBuilder withKey(String key) {
        return (CompanyAsyncRequestBuilder) super.withKey(key);
    }
}
