package eu.tornplayground.tornapi.requestbuilder;

import eu.tornplayground.tornapi.RequestBuilder;
import eu.tornplayground.tornapi.TornApi;
import eu.tornplayground.tornapi.selections.CompanySelections;

public class CompanyAsyncRequestBuilder extends RequestBuilder<CompanySelections> {
    public CompanyAsyncRequestBuilder(TornApi tornApi) {
        super(tornApi, "company");
    }

    @Override
    public CompanyAsyncRequestBuilder throwTornError() {
        super.throwTornError();
        return this;
    }
}
