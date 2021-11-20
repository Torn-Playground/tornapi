package be.dekleinekobini.tornapi.selections;

public enum CompanySelections implements Selection {

    COMPANIES,

    APPLICATIONS,
    DETAILED,
    EMPLOYEES,
    NEWS,
    NEWSFULL,
    PROFILE,
    STOCK,

    TIMESTAMP;

    @Override
    public String getSelection() {
        return name().toLowerCase();
    }

}
