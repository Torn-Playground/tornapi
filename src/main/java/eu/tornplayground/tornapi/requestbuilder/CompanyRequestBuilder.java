package eu.tornplayground.tornapi.requestbuilder;

import eu.tornplayground.tornapi.RequestBuilder;
import eu.tornplayground.tornapi.TornApi;
import eu.tornplayground.tornapi.selections.CompanySelections;

public class CompanyRequestBuilder extends RequestBuilder<CompanySelections> {
    public CompanyRequestBuilder(TornApi tornApi) {
        super(tornApi, "company");
    }
}
