package eu.tornplayground.tornapi.requestbuilder;

import eu.tornplayground.tornapi.RequestBuilder;
import eu.tornplayground.tornapi.TornApi;
import eu.tornplayground.tornapi.mappers.UserMapper;
import eu.tornplayground.tornapi.models.user.*;
import eu.tornplayground.tornapi.selections.UserSelections;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class UserAsyncRequestBuilder extends RequestBuilder<UserSelections> {
    public UserAsyncRequestBuilder(TornApi tornApi) {
        super(tornApi, "user");
    }

    @Override
    public UserAsyncRequestBuilder withTornErrorException(boolean throwError) {
        super.withTornErrorException(throwError);
        return this;
    }

    public CompletableFuture<List<Ammo>> fetchAmmo() {
        return fetchAsync(UserSelections.AMMO, UserMapper::ofAmmo);
    }

    public CompletableFuture<Map<Long, Attack>> fetchAttacks() {
        return fetchAsync(UserSelections.ATTACKS, UserMapper::ofAttacks);
    }

    public CompletableFuture<Map<Long, Attack>> fetchAttacksFull() {
        return fetchAsync(UserSelections.ATTACKSFULL, UserMapper::ofAttacks);
    }

    public CompletableFuture<Bars> fetchBars() {
        return fetchAsync(UserSelections.BARS, UserMapper::ofBars);
    }

    public CompletableFuture<Basic> fetchBasic() {
        return fetchAsync(UserSelections.BASIC, UserMapper::ofBasic);
    }

    public CompletableFuture<BattleStats> fetchBattleStats() {
        return fetchAsync(UserSelections.BATTLESTATS, UserMapper::ofBattleStats);
    }

    public CompletableFuture<List<BazaarItem>> fetchBazaar() {
        return fetchAsync(UserSelections.BAZAAR, UserMapper::ofBazaar);
    }

    public CompletableFuture<Cooldowns> fetchCooldowns() {
        return fetchAsync(UserSelections.COOLDOWNS, UserMapper::ofCooldowns);
    }

    public CompletableFuture<CriminalRecord> fetchCrimes() {
        return fetchAsync(UserSelections.CRIMES, UserMapper::ofCrimes);
    }

    public CompletableFuture<Discord> fetchDiscord() {
        return fetchAsync(UserSelections.DISCORD, UserMapper::ofDiscord);
    }

    public CompletableFuture<List<DisplayItem>> fetchDisplay() {
        return fetchAsync(UserSelections.DISPLAY, UserMapper::ofDisplay);
    }

    public CompletableFuture<Education> fetchEducation() {
        return fetchAsync(UserSelections.EDUCATION, UserMapper::ofEducation);
    }

    public CompletableFuture<Map<Long, Event>> fetchEvents() {
        return fetchAsync(UserSelections.EVENTS, UserMapper::ofEvents);
    }

    public CompletableFuture<Gym> fetchGym() {
        return fetchAsync(UserSelections.GYM, UserMapper::ofGym);
    }

    public CompletableFuture<Map<String, HOF>> fetchHof() {
        return fetchAsync(UserSelections.HOF, UserMapper::ofHOF);
    }

    public CompletableFuture<List<Honor>> fetchHonors() {
        return fetchAsync(UserSelections.HONORS, UserMapper::ofHonors);
    }

    public CompletableFuture<Map<String, String>> fetchIcons() {
        return fetchAsync(UserSelections.ICONS, UserMapper::ofIcons);
    }

    public CompletableFuture<List<InventoryItem>> fetchInventory() {
        return fetchAsync(UserSelections.INVENTORY, UserMapper::ofInventory);
    }

    public CompletableFuture<JobPoints> fetchJobPoints() {
        return fetchAsync(UserSelections.JOBPOINTS, UserMapper::ofJobPoints);
    }

    public CompletableFuture<Map<String, Log>> fetchLog() {
        return fetchAsync(UserSelections.LOG, UserMapper::ofLog);
    }

    public CompletableFuture<Map<String, Message>> fetchMessages() {
        return fetchAsync(UserSelections.MESSAGES, UserMapper::ofMessages);
    }

    public CompletableFuture<Missions> fetchMissions() {
        return fetchAsync(UserSelections.MISSIONS, UserMapper::ofMissions);
    }

    public CompletableFuture<Money> fetchMoney() {
        return fetchAsync(UserSelections.MONEY, UserMapper::ofMoney);
    }

    public CompletableFuture<Networth> fetchNetWorth() {
        return fetchAsync(UserSelections.NETWORTH, UserMapper::ofNetworth);
    }

    public CompletableFuture<Notifications> fetchNotifications() {
        return fetchAsync(UserSelections.NOTIFICATIONS, UserMapper::ofNotifications);
    }

    public CompletableFuture<Perks> fetchPerks() {
        return fetchAsync(UserSelections.PERKS, UserMapper::ofPerks);
    }

    public CompletableFuture<PersonalStats> fetchPersonalStats() {
        return fetchAsync(UserSelections.PERSONALSTATS, UserMapper::ofPersonalStats);
    }

    public CompletableFuture<Profile> fetchProfile() {
        return fetchAsync(UserSelections.PROFILE, UserMapper::ofProfile);
    }

    public CompletableFuture<Map<Long, Property>> fetchProperties() {
        return fetchAsync(UserSelections.PROPERTIES, UserMapper::ofProperties);
    }

    public CompletableFuture<Refills> fetchRefills() {
        return fetchAsync(UserSelections.REFILLS, UserMapper::ofRefills);
    }

    public CompletableFuture<List<Report>> fetchReports() {
        return fetchAsync(UserSelections.REPORTS, UserMapper::ofReports);
    }

    public CompletableFuture<Map<Long, Revive>> fetchRevives() {
        return fetchAsync(UserSelections.REVIVES, UserMapper::ofRevives);
    }

    public CompletableFuture<Map<Long, Revive>> fetchRevivesFull() {
        return fetchAsync(UserSelections.REVIVESFULL, UserMapper::ofRevives);
    }

    public CompletableFuture<Skills> fetchSkills() {
        return fetchAsync(UserSelections.SKILLS, UserMapper::ofSkills);
    }

    public CompletableFuture<Map<Long, Stock>> fetchStocks() {
        return fetchAsync(UserSelections.STOCKS, UserMapper::ofStocks);
    }

    public CompletableFuture<Travel> fetchTravel() {
        return fetchAsync(UserSelections.TRAVEL, UserMapper::ofTravel);
    }

    public CompletableFuture<List<WeaponExperience>> fetchWeaponExp() {
        return fetchAsync(UserSelections.WEAPONEXP, UserMapper::ofWeaponExp);
    }

    public CompletableFuture<WorkStats> fetchWorkStats() {
        return fetchAsync(UserSelections.WORKSTATS, UserMapper::ofWorkStats);
    }
}
