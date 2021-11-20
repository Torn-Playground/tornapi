package be.dekleinekobini.tornapi.selections;

public enum TornSelections  implements Selection {

    BANK,
    CARDS,
    CHAINREPORT,
    COMPANIES,
    COMPETITION,
    EDUCATION,
    FACTIONTREE,
    GYMS,
    HONORS,
    ITEMS,
    LOGCATEGORIES,
    LOGTYPES,
    MEDALS,
    ORGANISEDCRIMES,
    PAWNSHOP,
    POKERTABLES,
    PROPERTIES,
    RACKETS,
    RAIDS,
    STATS,
    STOCKS,
    TERRITORY,
    TERRITORYWARS,

    TIMESTAMP;

    @Override
    public String getSelection() {
        return name().toLowerCase();
    }

}
