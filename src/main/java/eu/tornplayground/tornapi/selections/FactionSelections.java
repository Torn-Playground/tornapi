package eu.tornplayground.tornapi.selections;

public enum FactionSelections  implements Selection {

    APPLICATIONS,
    ARMOR,
    ARMORYNEWS,
    ATTACKNEWS,
    ATTACKS,
    ATTACKSFULL,
    BASIC,
    BOOSTERS,
    CESIUM,
    CHAIN,
    CHAINREPORT,
    CHAINS,
    CONTRIBUTORS,
    CRIMENEWS,
    CRIMES,
    CURRENCY,
    DONATIONS,
    DRUGS,
    FUNDSNEWS,
    MAINNEWS,
    MEDICAL,
    MEMBERSHIPNEWS,
    POSITIONS,
    REPORTS,
    REVIVES,
    REVIVESFULL,
    STATS,
    TEMPORARY,
    TERRITORY,
    TERRITORYNEWS,
    TIMESTAMP,
    UPGRADES,
    WEAPONS;

    @Override
    public String getSelection() {
        return name().toLowerCase();
    }

}
