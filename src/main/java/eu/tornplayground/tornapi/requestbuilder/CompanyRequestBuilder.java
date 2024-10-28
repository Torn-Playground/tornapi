package eu.tornplayground.tornapi.requestbuilder;

import eu.tornplayground.tornapi.TornApi;
import eu.tornplayground.tornapi.selections.CompanySelections;

public class CompanyRequestBuilder extends RequestBuilder<CompanyRequestBuilder, CompanySelections> {

    public CompanyRequestBuilder(TornApi tornApi) {
        super(tornApi, "company");
    }

}
