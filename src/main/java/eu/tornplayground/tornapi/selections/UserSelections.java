package eu.tornplayground.tornapi.selections;

public enum UserSelections implements Selection {

    AMMO,
    ATTACKS,
    ATTACKSFULL,
    BARS,
    BASIC,
    BATTLESTATS,
    BAZAAR,
    COOLDOWNS,
    CRIMES,
    DISCORD,
    DISPLAY,
    EDUCATION,
    EVENTS,
    GYM,
    HOF,
    HONORS,
    ICONS,
    INVENTORY,
    JOBPOINTS,
    LOG,
    MEDALS,
    MERITS,
    MESSAGES,
    MISSIONS,
    MONEY,
    NETWORTH,
    NEWEVENTS,
    NEWMESSAGES,
    NOTIFICATIONS,
    PERKS,
    PERSONALSTATS,
    PROFILE,
    PROPERTIES,
    PUBLICSTATUS,
    REFILLS,
    REPORTS,
    REVIVES,
    REVIVESFULL,
    SKILLS,
    STOCKS,
    TRAVEL,
    WEAPONEXP,
    WORKSTATS,

    TIMESTAMP;

    @Override
    public String getSelection() {
        return name().toLowerCase();
    }

}
