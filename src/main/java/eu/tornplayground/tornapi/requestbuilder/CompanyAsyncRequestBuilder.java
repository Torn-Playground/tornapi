package eu.tornplayground.tornapi.requestbuilder;

import eu.tornplayground.tornapi.TornApi;
import eu.tornplayground.tornapi.selections.CompanySelections;

public class CompanyAsyncRequestBuilder extends RequestBuilder<CompanyAsyncRequestBuilder, CompanySelections> {

    public CompanyAsyncRequestBuilder(TornApi tornApi) {
        super(tornApi, "company");
    }

}
