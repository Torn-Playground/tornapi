package eu.tornplayground.tornapi.requestbuilder;

import eu.tornplayground.tornapi.RequestBuilder;
import eu.tornplayground.tornapi.TornApi;
import eu.tornplayground.tornapi.selections.CompanySelections;

public class CompanyRepeatingRequestBuilder extends RequestBuilder<CompanySelections> {

    public CompanyRepeatingRequestBuilder(TornApi tornApi) {
        super(tornApi, "company");
    }

    @Override
    public CompanyRepeatingRequestBuilder withTornErrorException(boolean throwError) {
        super.withTornErrorException(throwError);
        return this;
    }

    @Override
    public CompanyRepeatingRequestBuilder id(long id) {
        return (CompanyRepeatingRequestBuilder) super.id(id);
    }

    @Override
    public CompanyRepeatingRequestBuilder id(String id) {
        return (CompanyRepeatingRequestBuilder) super.id(id);
    }

    @Override
    public CompanyRepeatingRequestBuilder withComment(String comment) {
        return (CompanyRepeatingRequestBuilder) super.withComment(comment);
    }

    @Override
    public CompanyRepeatingRequestBuilder withParameter(String key, Object value) {
        return (CompanyRepeatingRequestBuilder) super.withParameter(key, value);
    }

    @Override
    public CompanyRepeatingRequestBuilder withSelections(String... selections) {
        return (CompanyRepeatingRequestBuilder) super.withSelections(selections);
    }

    @Override
    public CompanyRepeatingRequestBuilder withKey(String key) {
        return (CompanyRepeatingRequestBuilder) super.withKey(key);
    }
}
