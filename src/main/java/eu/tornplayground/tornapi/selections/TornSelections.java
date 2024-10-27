package eu.tornplayground.tornapi.selections;

public enum TornSelections implements Selection {

    BANK,
    CARDS,
    CHAINREPORT,
    CITYSHOPS,
    COMPANIES,
    COMPETITION,
    EDUCATION,
    FACTIONTREE,
    GYMS,
    HONORS,
    ITEMDETAILS,
    ITEMS,
    ITEMSTATS,
    LOGCATEGORIES,
    LOGTYPES,
    MEDALS,
    ORGANISEDCRIMES,
    PAWNSHOP,
    POKERTABLES,
    PROPERTIES,
    RACKETS,
    RAIDREPORT,
    RAIDS,
    RANKEDWARREPORT,
    RANKEDWARS,
    SEARCHFORCASH,
    SHOPLIFTING,
    STATS,
    STOCKS,
    TERRITORY,
    TERRITORYNAMES,
    TERRITORYWARREPORT,
    TERRITORYWARS,

    TIMESTAMP;

    @Override
    public String getSelection() {
        return name().toLowerCase();
    }

}
