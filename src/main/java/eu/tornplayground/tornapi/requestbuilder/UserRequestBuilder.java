package eu.tornplayground.tornapi.requestbuilder;

import eu.tornplayground.tornapi.RequestBuilder;
import eu.tornplayground.tornapi.TornApi;
import eu.tornplayground.tornapi.TornErrorException;
import eu.tornplayground.tornapi.connector.TornHttpException;
import eu.tornplayground.tornapi.limiter.RequestLimitReachedException;
import eu.tornplayground.tornapi.mappers.UserMapper;
import eu.tornplayground.tornapi.models.user.*;
import eu.tornplayground.tornapi.selections.UserSelections;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class UserRequestBuilder extends RequestBuilder<UserSelections> {

    public UserRequestBuilder(TornApi tornApi) {
        super(tornApi, "user");
    }

    @Override
    public UserRequestBuilder withTornErrorException(boolean throwError) {
        super.withTornErrorException(throwError);
        return this;
    }

    public List<Ammo> fetchAmmo() throws TornHttpException, TornErrorException, RequestLimitReachedException, IOException {
        return fetch(UserSelections.AMMO, UserMapper::ofAmmo);
    }

    public Map<Long, Attack> fetchAttacks() throws TornHttpException, TornErrorException, RequestLimitReachedException, IOException {
        return fetch(UserSelections.ATTACKS, UserMapper::ofAttacks);
    }

    public Map<Long, Attack> fetchAttacksFull() throws TornHttpException, TornErrorException, RequestLimitReachedException, IOException {
        return fetch(UserSelections.ATTACK_SFULL, UserMapper::ofAttacks);
    }

    public Bars fetchBars() throws TornHttpException, TornErrorException, RequestLimitReachedException, IOException {
        return fetch(UserSelections.BARS, UserMapper::ofBars);
    }

    public Basic fetchBasic() throws TornHttpException, TornErrorException, RequestLimitReachedException, IOException {
        return fetch(UserSelections.BASIC, UserMapper::ofBasic);
    }

    public BattleStats fetchBattleStats() throws TornHttpException, TornErrorException, RequestLimitReachedException, IOException {
        return fetch(UserSelections.BATTLE_STATS, UserMapper::ofBattleStats);
    }

    public List<BazaarItem> fetchBazaar() throws TornHttpException, TornErrorException, RequestLimitReachedException, IOException {
        return fetch(UserSelections.BAZAAR, UserMapper::ofBazaar);
    }

    public Cooldowns fetchCooldowns() throws TornHttpException, TornErrorException, RequestLimitReachedException, IOException {
        return fetch(UserSelections.COOLDOWNS, UserMapper::ofCooldowns);
    }

    public CriminalRecord fetchCrimes() throws TornHttpException, TornErrorException, RequestLimitReachedException, IOException {
        return fetch(UserSelections.CRIMES, UserMapper::ofCrimes);
    }

    public Discord fetchDiscord() throws TornHttpException, TornErrorException, RequestLimitReachedException, IOException {
        return fetch(UserSelections.DISCORD, UserMapper::ofDiscord);
    }

    public List<DisplayItem> fetchDisplay() throws TornHttpException, TornErrorException, RequestLimitReachedException, IOException {
        return fetch(UserSelections.DISPLAY, UserMapper::ofDisplay);
    }

    public Education fetchEducation() throws TornHttpException, TornErrorException, RequestLimitReachedException, IOException {
        return fetch(UserSelections.EDUCATION, UserMapper::ofEducation);
    }

    public Map<Long, Event> fetchEvents() throws TornHttpException, TornErrorException, RequestLimitReachedException, IOException {
        return fetch(UserSelections.EVENTS, UserMapper::ofEvents);
    }

    public Gym fetchGym() throws TornHttpException, TornErrorException, RequestLimitReachedException, IOException {
        return fetch(UserSelections.GYM, UserMapper::ofGym);
    }

    public Map<String, Hof> fetchHof() throws TornHttpException, TornErrorException, RequestLimitReachedException, IOException {
        return fetch(UserSelections.HOF, UserMapper::ofHOF);
    }

    public List<Honor> fetchHonors() throws TornHttpException, TornErrorException, RequestLimitReachedException, IOException {
        return fetch(UserSelections.HONORS, UserMapper::ofHonors);
    }

    public Map<String, String> fetchIcons() throws TornHttpException, TornErrorException, RequestLimitReachedException, IOException {
        return fetch(UserSelections.ICONS, UserMapper::ofIcons);
    }

    public JobPoints fetchJobPoints() throws TornHttpException, TornErrorException, RequestLimitReachedException, IOException {
        return fetch(UserSelections.JOB_POINTS, UserMapper::ofJobPoints);
    }

    public Map<String, Log> fetchLog() throws TornHttpException, TornErrorException, RequestLimitReachedException, IOException {
        return fetch(UserSelections.LOG, UserMapper::ofLog);
    }

    public Map<String, Message> fetchMessages() throws TornHttpException, TornErrorException, RequestLimitReachedException, IOException {
        return fetch(UserSelections.MESSAGES, UserMapper::ofMessages);
    }

    public Map<String, List<Mission>> fetchMissions() throws TornHttpException, TornErrorException, RequestLimitReachedException, IOException {
        return fetch(UserSelections.MISSIONS, UserMapper::ofMissions);
    }

    public Money fetchMoney() throws TornHttpException, TornErrorException, RequestLimitReachedException, IOException {
        return fetch(UserSelections.MONEY, UserMapper::ofMoney);
    }

    public Networth fetchNetWorth() throws TornHttpException, TornErrorException, RequestLimitReachedException, IOException {
        return fetch(UserSelections.NETWORTH, UserMapper::ofNetworth);
    }

    public Notifications fetchNotifications() throws TornHttpException, TornErrorException, RequestLimitReachedException, IOException {
        return fetch(UserSelections.NOTIFICATIONS, UserMapper::ofNotifications);
    }

    public Perks fetchPerks() throws TornHttpException, TornErrorException, RequestLimitReachedException, IOException {
        return fetch(UserSelections.PERKS, UserMapper::ofPerks);
    }

    public PersonalStats fetchPersonalStats() throws TornHttpException, TornErrorException, RequestLimitReachedException, IOException {
        return fetch(UserSelections.PERSONAL_STATS, UserMapper::ofPersonalStats);
    }

    public Profile fetchProfile() throws TornHttpException, TornErrorException, RequestLimitReachedException, IOException {
        return fetch(UserSelections.PROFILE, UserMapper::ofProfile);
    }

    public Map<Long, Property> fetchProperties() throws TornHttpException, TornErrorException, RequestLimitReachedException, IOException {
        return fetch(UserSelections.PROPERTIES, UserMapper::ofProperties);
    }

    public Refills fetchRefills() throws TornHttpException, TornErrorException, RequestLimitReachedException, IOException {
        return fetch(UserSelections.REFILLS, UserMapper::ofRefills);
    }

    public List<Report> fetchReports() throws TornHttpException, TornErrorException, RequestLimitReachedException, IOException {
        return fetch(UserSelections.REPORTS, UserMapper::ofReports);
    }

    public Map<Long, Revive> fetchRevives() throws TornHttpException, TornErrorException, RequestLimitReachedException, IOException {
        return fetch(UserSelections.REVIVES, UserMapper::ofRevives);
    }

    public Map<Long, Revive> fetchRevivesFull() throws TornHttpException, TornErrorException, RequestLimitReachedException, IOException {
        return fetch(UserSelections.REVIVES_FULL, UserMapper::ofRevives);
    }

    public Skills fetchSkills() throws TornHttpException, TornErrorException, RequestLimitReachedException, IOException {
        return fetch(UserSelections.SKILLS, UserMapper::ofSkills);
    }

    public Map<Long, Stock> fetchStocks() throws TornHttpException, TornErrorException, RequestLimitReachedException, IOException {
        return fetch(UserSelections.STOCKS, UserMapper::ofStocks);
    }

    public Travel fetchTravel() throws TornHttpException, TornErrorException, RequestLimitReachedException, IOException {
        return fetch(UserSelections.TRAVEL, UserMapper::ofTravel);
    }

    public List<WeaponExperience> fetchWeaponExp() throws TornHttpException, TornErrorException, RequestLimitReachedException, IOException {
        return fetch(UserSelections.WEAPON_EXP, UserMapper::ofWeaponExp);
    }

    public WorkStats fetchWorkStats() throws TornHttpException, TornErrorException, RequestLimitReachedException, IOException {
        return fetch(UserSelections.WORK_STATS, UserMapper::ofWorkStats);
    }

}
