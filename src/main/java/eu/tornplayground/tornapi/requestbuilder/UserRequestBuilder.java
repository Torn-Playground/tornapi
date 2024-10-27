package eu.tornplayground.tornapi.requestbuilder;

import eu.tornplayground.tornapi.RequestBuilder;
import eu.tornplayground.tornapi.TornApi;
import eu.tornplayground.tornapi.TornApiErrorException;
import eu.tornplayground.tornapi.connector.TornHttpException;
import eu.tornplayground.tornapi.limiter.RequestLimitReachedException;
import eu.tornplayground.tornapi.mappers.UserMapper;
import eu.tornplayground.tornapi.models.Timestamp;
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
    public UserRequestBuilder throwTornError() {
        super.throwTornError();
        return this;
    }

    public List<Ammo> fetchAmmo() throws IOException, TornHttpException, InterruptedException, TornApiErrorException, RequestLimitReachedException {
        return fetch(UserSelections.AMMO, UserMapper::ofAmmo);
    }

    public Map<Long, Attack> fetchAttacks() throws IOException, TornHttpException, InterruptedException, TornApiErrorException, RequestLimitReachedException {
        return fetch(UserSelections.ATTACKS, UserMapper::ofAttacks);
    }

    public Map<Long, Attack> fetchAttacksFull() throws IOException, TornHttpException, InterruptedException, TornApiErrorException, RequestLimitReachedException {
        return fetch(UserSelections.ATTACKSFULL, UserMapper::ofAttacks);
    }

    public Bars fetchBars() throws IOException, TornHttpException, InterruptedException, TornApiErrorException, RequestLimitReachedException {
        return fetch(UserSelections.BARS, UserMapper::ofBars);
    }

    public Basic fetchBasic() throws IOException, TornHttpException, InterruptedException, TornApiErrorException, RequestLimitReachedException {
        return fetch(UserSelections.BASIC, UserMapper::ofBasic);
    }

    public BattleStats fetchBattleStats() throws IOException, TornHttpException, InterruptedException, TornApiErrorException, RequestLimitReachedException {
        return fetch(UserSelections.BATTLESTATS, UserMapper::ofBattleStats);
    }

    public List<BazaarItem> fetchBazaar() throws IOException, TornHttpException, InterruptedException, TornApiErrorException, RequestLimitReachedException {
        return fetch(UserSelections.BAZAAR, UserMapper::ofBazaar);
    }

    public Cooldowns fetchCooldowns() throws IOException, TornHttpException, InterruptedException, TornApiErrorException, RequestLimitReachedException {
        return fetch(UserSelections.COOLDOWNS, UserMapper::ofCooldowns);
    }

    public CriminalRecord fetchCrimes() throws IOException, TornHttpException, InterruptedException, TornApiErrorException, RequestLimitReachedException {
        return fetch(UserSelections.CRIMES, UserMapper::ofCrimes);
    }

    public Discord fetchDiscord() throws IOException, TornHttpException, InterruptedException, TornApiErrorException, RequestLimitReachedException {
        return fetch(UserSelections.DISCORD, UserMapper::ofDiscord);
    }

    public List<DisplayItem> fetchDisplay() throws IOException, TornHttpException, InterruptedException, TornApiErrorException, RequestLimitReachedException {
        return fetch(UserSelections.DISPLAY, UserMapper::ofDisplay);
    }

    public Education fetchEducation() throws IOException, TornHttpException, InterruptedException, TornApiErrorException, RequestLimitReachedException {
        return fetch(UserSelections.EDUCATION, UserMapper::ofEducation);
    }

    public Map<Long, Event> fetchEvents() throws IOException, TornHttpException, InterruptedException, TornApiErrorException, RequestLimitReachedException {
        return fetch(UserSelections.EVENTS, UserMapper::ofEvents);
    }

    public Gym fetchGym() throws IOException, TornHttpException, InterruptedException, TornApiErrorException, RequestLimitReachedException {
        return fetch(UserSelections.GYM, UserMapper::ofGym);
    }

    public Map<String, HOF> fetchHof() throws IOException, TornHttpException, InterruptedException, TornApiErrorException, RequestLimitReachedException {
        return fetch(UserSelections.HOF, UserMapper::ofHOF);
    }

    public List<Honor> fetchHonors() throws IOException, TornHttpException, InterruptedException, TornApiErrorException, RequestLimitReachedException {
        return fetch(UserSelections.HONORS, UserMapper::ofHonors);
    }

    public Map<String, String> fetchIcons() throws IOException, TornHttpException, InterruptedException, TornApiErrorException, RequestLimitReachedException {
        return fetch(UserSelections.ICONS, UserMapper::ofIcons);
    }

    public List<InventoryItem> fetchInventory() throws IOException, TornHttpException, InterruptedException, TornApiErrorException, RequestLimitReachedException {
        return fetch(UserSelections.INVENTORY, UserMapper::ofInventory);
    }

    public JobPoints fetchJobPoints() throws IOException, TornHttpException, InterruptedException, TornApiErrorException, RequestLimitReachedException {
        return fetch(UserSelections.JOBPOINTS, UserMapper::ofJobPoints);
    }

    public Map<String, Log> fetchLog() throws IOException, TornHttpException, InterruptedException, TornApiErrorException, RequestLimitReachedException {
        return fetch(UserSelections.LOG, UserMapper::ofLog);
    }

    public Map<String, Message> fetchMessages() throws IOException, TornHttpException, InterruptedException, TornApiErrorException, RequestLimitReachedException {
        return fetch(UserSelections.MESSAGES, UserMapper::ofMessages);
    }

    public Missions fetchMissions() throws IOException, TornHttpException, InterruptedException, TornApiErrorException, RequestLimitReachedException {
        return fetch(UserSelections.MISSIONS, UserMapper::ofMissions);
    }

    public Money fetchMoney() throws IOException, TornHttpException, InterruptedException, TornApiErrorException, RequestLimitReachedException {
        return fetch(UserSelections.MONEY, UserMapper::ofMoney);
    }

    public Networth fetchNetWorth() throws IOException, TornHttpException, InterruptedException, TornApiErrorException, RequestLimitReachedException {
        return fetch(UserSelections.NETWORTH, UserMapper::ofNetworth);
    }

    public Notifications fetchNotifications() throws IOException, TornHttpException, InterruptedException, TornApiErrorException, RequestLimitReachedException {
        return fetch(UserSelections.NOTIFICATIONS, UserMapper::ofNotifications);
    }

    public Perks fetchPerks() throws IOException, TornHttpException, InterruptedException, TornApiErrorException, RequestLimitReachedException {
        return fetch(UserSelections.PERKS, UserMapper::ofPerks);
    }

    public PersonalStats fetchPersonalStats() throws IOException, TornHttpException, InterruptedException, TornApiErrorException, RequestLimitReachedException {
        return fetch(UserSelections.PERSONALSTATS, UserMapper::ofPersonalStats);
    }

    public Profile fetchProfile() throws IOException, TornHttpException, InterruptedException, TornApiErrorException, RequestLimitReachedException {
        return fetch(UserSelections.PROFILE, UserMapper::ofProfile);
    }

    public Map<Long, Property> fetchProperties() throws IOException, TornHttpException, InterruptedException, TornApiErrorException, RequestLimitReachedException {
        return fetch(UserSelections.PROPERTIES, UserMapper::ofProperties);
    }

    public Refills fetchRefills() throws IOException, TornHttpException, InterruptedException, TornApiErrorException, RequestLimitReachedException {
        return fetch(UserSelections.REFILLS, UserMapper::ofRefills);
    }

    public List<Report> fetchReports() throws IOException, TornHttpException, InterruptedException, TornApiErrorException, RequestLimitReachedException {
        return fetch(UserSelections.REPORTS, UserMapper::ofReports);
    }

    public Map<Long, Revive> fetchRevives() throws IOException, TornHttpException, InterruptedException, TornApiErrorException, RequestLimitReachedException {
        return fetch(UserSelections.REVIVES, UserMapper::ofRevives);
    }

    public Map<Long, Revive> fetchRevivesFull() throws IOException, TornHttpException, InterruptedException, TornApiErrorException, RequestLimitReachedException {
        return fetch(UserSelections.REVIVESFULL, UserMapper::ofRevives);
    }

    public Skills fetchSkills() throws IOException, TornHttpException, InterruptedException, TornApiErrorException, RequestLimitReachedException {
        return fetch(UserSelections.SKILLS, UserMapper::ofSkills);
    }

    public Map<Long, Stock> fetchStocks() throws IOException, TornHttpException, InterruptedException, TornApiErrorException, RequestLimitReachedException {
        return fetch(UserSelections.STOCKS, UserMapper::ofStocks);
    }

    public Travel fetchTravel() throws IOException, TornHttpException, InterruptedException, TornApiErrorException, RequestLimitReachedException {
        return fetch(UserSelections.TRAVEL, UserMapper::ofTravel);
    }

    public List<WeaponExperience> fetchWeaponExp() throws IOException, TornHttpException, InterruptedException, TornApiErrorException, RequestLimitReachedException {
        return fetch(UserSelections.WEAPONEXP, UserMapper::ofWeaponExp);
    }

    public WorkStats fetchWorkStats() throws IOException, TornHttpException, InterruptedException, TornApiErrorException, RequestLimitReachedException {
        return fetch(UserSelections.WORKSTATS, UserMapper::ofWorkStats);
    }
}
