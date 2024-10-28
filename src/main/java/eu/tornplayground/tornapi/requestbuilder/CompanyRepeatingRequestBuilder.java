package eu.tornplayground.tornapi.requestbuilder;

import eu.tornplayground.tornapi.TornApi;
import eu.tornplayground.tornapi.selections.CompanySelections;

public class CompanyRepeatingRequestBuilder extends RequestBuilder<CompanyRepeatingRequestBuilder, CompanySelections> {

    public CompanyRepeatingRequestBuilder(TornApi tornApi) {
        super(tornApi, "company");
    }

}
