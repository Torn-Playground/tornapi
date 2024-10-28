package eu.tornplayground.tornapi.requestbuilder;

import eu.tornplayground.tornapi.RequestBuilder;
import eu.tornplayground.tornapi.TornApi;
import eu.tornplayground.tornapi.selections.CompanySelections;

public class CompanyRequestBuilder extends RequestBuilder<CompanySelections> {

    public CompanyRequestBuilder(TornApi tornApi) {
        super(tornApi, "company");
    }

    @Override
    public CompanyRequestBuilder withTornErrorException(boolean throwError) {
        super.withTornErrorException(throwError);
        return this;
    }


    @Override
    public CompanyRequestBuilder id(long id) {
        return (CompanyRequestBuilder) super.id(id);
    }

    @Override
    public CompanyRequestBuilder id(String id) {
        return (CompanyRequestBuilder) super.id(id);
    }

    @Override
    public CompanyRequestBuilder withComment(String comment) {
        return (CompanyRequestBuilder) super.withComment(comment);
    }

    @Override
    public CompanyRequestBuilder withParameter(String key, Object value) {
        return (CompanyRequestBuilder) super.withParameter(key, value);
    }

    @Override
    public CompanyRequestBuilder withSelections(String... selections) {
        return (CompanyRequestBuilder) super.withSelections(selections);
    }

    @Override
    public CompanyRequestBuilder withKey(String key) {
        return (CompanyRequestBuilder) super.withKey(key);
    }
}
