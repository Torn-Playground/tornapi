package eu.tornplayground.tornapi.selections;

public enum CompanySelections implements Selection {
    COMPANIES,
    APPLICATIONS,
    DETAILED,
    EMPLOYEES,
    NEWS,
    PROFILE,
    STOCK,
    TIMESTAMP;

    @Override
    public String getSelection() {
        return name().toLowerCase();
    }

}
