package eu.tornplayground.tornapi.selections;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;

@Getter
public enum UserSelections implements Selection {
    AMMO("ammo"),
    ATTACKS("attacks"),
    ATTACK_SFULL("attacksfull"),
    BARS("bars"),
    BASIC("basic"),
    BATTLE_STATS("battlestats"),
    BAZAAR("bazaar"),
    COOLDOWNS("cooldowns"),
    CRIMES("crimes"),
    DISCORD("discord"),
    DISPLAY("display"),
    EDUCATION("education"),
    EVENTS("events"),
    GYM("gym"),
    HOF("hof"),
    HONORS("honors"),
    ICONS("icons"),
    JOB_POINTS("jobpoints"),
    LOG("log"),
    MEDALS("medals"),
    MERITS("merits"),
    MESSAGES("messages"),
    MISSIONS("missions"),
    MONEY("money"),
    NETWORTH("networth"),
    NEW_EVENTS("newevents"),
    NEW_MESSAGES("newmessages"),
    NOTIFICATIONS("notifications"),
    PERKS("perks"),
    PERSONAL_STATS("personalstats"),
    PROFILE("profile"),
    PROPERTIES("properties"),
    PUBLIC_STATUS("publicstatus"),
    REFILLS("refills"),
    REPORTS("reports"),
    REVIVES("revives"),
    REVIVES_FULL("revivesfull"),
    SKILLS("skills"),
    STOCKS("stocks"),
    TRAVEL("travel"),
    WEAPON_EXP("weaponexp"),
    WORK_STATS("workstats"),
    TIMESTAMP("timestamp");

    private final String selection;

    UserSelections(String selection) {
        this.selection = selection;
    }

    @JsonCreator
    public UserSelections fromString(String selection) {
        for (UserSelections s : UserSelections.values()) {
            if (s.selection.equalsIgnoreCase(selection)) {
                return s;
            }
        }
        return null;
    }

}
