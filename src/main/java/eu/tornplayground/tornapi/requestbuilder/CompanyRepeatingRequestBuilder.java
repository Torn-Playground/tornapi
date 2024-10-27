package eu.tornplayground.tornapi.requestbuilder;

import eu.tornplayground.tornapi.RequestBuilder;
import eu.tornplayground.tornapi.TornApi;
import eu.tornplayground.tornapi.selections.CompanySelections;

public class CompanyRepeatingRequestBuilder extends RequestBuilder<CompanySelections> {
    public CompanyRepeatingRequestBuilder(TornApi tornApi) {
        super(tornApi, "company");
    }

    @Override
    public CompanyRepeatingRequestBuilder throwTornError() {
        super.throwTornError();
        return this;
    }
}
