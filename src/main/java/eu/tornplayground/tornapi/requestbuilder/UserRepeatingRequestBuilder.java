package eu.tornplayground.tornapi.requestbuilder;

import eu.tornplayground.tornapi.TornApi;
import eu.tornplayground.tornapi.mappers.UserMapper;
import eu.tornplayground.tornapi.models.user.*;
import eu.tornplayground.tornapi.selections.UserSelections;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class UserRepeatingRequestBuilder extends RequestBuilder<UserRepeatingRequestBuilder, UserSelections> {

    public UserRepeatingRequestBuilder(TornApi tornApi) {
        super(tornApi, "user");
    }

    public RepeatingRequestTask<List<Ammo>> repeatAmmo(int intervalInSeconds, Consumer<List<Ammo>> consumer) {
        return repeating(UserSelections.AMMO, intervalInSeconds, UserMapper::ofAmmo, consumer);
    }

    public RepeatingRequestTask<Map<Long, Attack>> repeatAttacks(int intervalInSeconds, Consumer<Map<Long, Attack>> consumer) {
        return repeating(UserSelections.ATTACKS, intervalInSeconds, UserMapper::ofAttacks, consumer);
    }

    public RepeatingRequestTask<Map<Long, Attack>> repeatAttacksFull(int intervalInSeconds, Consumer<Map<Long, Attack>> consumer) {
        return repeating(UserSelections.ATTACK_SFULL, intervalInSeconds, UserMapper::ofAttacks, consumer);
    }

    public RepeatingRequestTask<Bars> repeatBars(int intervalInSeconds, Consumer<Bars> consumer) {
        return repeating(UserSelections.BARS, intervalInSeconds, UserMapper::ofBars, consumer);
    }

    public RepeatingRequestTask<Basic> repeatBasic(int intervalInSeconds, Consumer<Basic> consumer) {
        return repeating(UserSelections.BASIC, intervalInSeconds, UserMapper::ofBasic, consumer);
    }

    public RepeatingRequestTask<BattleStats> repeatBattleStats(int intervalInSeconds, Consumer<BattleStats> consumer) {
        return repeating(UserSelections.BATTLE_STATS, intervalInSeconds, UserMapper::ofBattleStats, consumer);
    }

    public RepeatingRequestTask<List<BazaarItem>> repeatBazaar(int intervalInSeconds, Consumer<List<BazaarItem>> consumer) {
        return repeating(UserSelections.BAZAAR, intervalInSeconds, UserMapper::ofBazaar, consumer);
    }

    public RepeatingRequestTask<Cooldowns> repeatCooldowns(int intervalInSeconds, Consumer<Cooldowns> consumer) {
        return repeating(UserSelections.COOLDOWNS, intervalInSeconds, UserMapper::ofCooldowns, consumer);
    }

    public RepeatingRequestTask<CriminalRecord> repeatCrimes(int intervalInSeconds, Consumer<CriminalRecord> consumer) {
        return repeating(UserSelections.CRIMES, intervalInSeconds, UserMapper::ofCrimes, consumer);
    }

    public RepeatingRequestTask<Discord> repeatDiscord(int intervalInSeconds, Consumer<Discord> consumer) {
        return repeating(UserSelections.DISCORD, intervalInSeconds, UserMapper::ofDiscord, consumer);
    }

    public RepeatingRequestTask<List<DisplayItem>> repeatDisplay(int intervalInSeconds, Consumer<List<DisplayItem>> consumer) {
        return repeating(UserSelections.DISPLAY, intervalInSeconds, UserMapper::ofDisplay, consumer);
    }

    public RepeatingRequestTask<Education> repeatEducation(int intervalInSeconds, Consumer<Education> consumer) {
        return repeating(UserSelections.EDUCATION, intervalInSeconds, UserMapper::ofEducation, consumer);
    }

    public RepeatingRequestTask<Map<Long, Event>> repeatEvents(int intervalInSeconds, Consumer<Map<Long, Event>> consumer) {
        return repeating(UserSelections.EVENTS, intervalInSeconds, UserMapper::ofEvents, consumer);
    }

    public RepeatingRequestTask<Gym> repeatGym(int intervalInSeconds, Consumer<Gym> consumer) {
        return repeating(UserSelections.GYM, intervalInSeconds, UserMapper::ofGym, consumer);
    }

    public RepeatingRequestTask<Map<String, Hof>> repeatHof(int intervalInSeconds, Consumer<Map<String, Hof>> consumer) {
        return repeating(UserSelections.HOF, intervalInSeconds, UserMapper::ofHOF, consumer);
    }

    public RepeatingRequestTask<List<Honor>> repeatHonors(int intervalInSeconds, Consumer<List<Honor>> consumer) {
        return repeating(UserSelections.HONORS, intervalInSeconds, UserMapper::ofHonors, consumer);
    }

    public RepeatingRequestTask<Map<String, String>> repeatIcons(int intervalInSeconds, Consumer<Map<String, String>> consumer) {
        return repeating(UserSelections.ICONS, intervalInSeconds, UserMapper::ofIcons, consumer);
    }

    public RepeatingRequestTask<JobPoints> repeatJobPoints(int intervalInSeconds, Consumer<JobPoints> consumer) {
        return repeating(UserSelections.JOB_POINTS, intervalInSeconds, UserMapper::ofJobPoints, consumer);
    }

    public RepeatingRequestTask<Map<String, Log>> repeatLog(int intervalInSeconds, Consumer<Map<String, Log>> consumer) {
        return repeating(UserSelections.LOG, intervalInSeconds, UserMapper::ofLog, consumer);
    }

    public RepeatingRequestTask<Map<String, Message>> repeatMessages(int intervalInSeconds, Consumer<Map<String, Message>> consumer) {
        return repeating(UserSelections.MESSAGES, intervalInSeconds, UserMapper::ofMessages, consumer);
    }

    public RepeatingRequestTask<Map<String, List<Mission>>> repeatMissions(int intervalInSeconds, Consumer<Map<String, List<Mission>>> consumer) {
        return repeating(UserSelections.MISSIONS, intervalInSeconds, UserMapper::ofMissions, consumer);
    }

    public RepeatingRequestTask<Money> repeatMoney(int intervalInSeconds, Consumer<Money> consumer) {
        return repeating(UserSelections.MONEY, intervalInSeconds, UserMapper::ofMoney, consumer);
    }

    public RepeatingRequestTask<Networth> repeatNetWorth(int intervalInSeconds, Consumer<Networth> consumer) {
        return repeating(UserSelections.NETWORTH, intervalInSeconds, UserMapper::ofNetworth, consumer);
    }

    public RepeatingRequestTask<Notifications> repeatNotifications(int intervalInSeconds, Consumer<Notifications> consumer) {
        return repeating(UserSelections.NOTIFICATIONS, intervalInSeconds, UserMapper::ofNotifications, consumer);
    }

    public RepeatingRequestTask<Perks> repeatPerks(int intervalInSeconds, Consumer<Perks> consumer) {
        return repeating(UserSelections.PERKS, intervalInSeconds, UserMapper::ofPerks, consumer);
    }

    public RepeatingRequestTask<PersonalStats> repeatPersonalStats(int intervalInSeconds, Consumer<PersonalStats> consumer) {
        return repeating(UserSelections.PERSONAL_STATS, intervalInSeconds, UserMapper::ofPersonalStats, consumer);
    }

    public RepeatingRequestTask<Profile> repeatProfile(int intervalInSeconds, Consumer<Profile> consumer) {
        return repeating(UserSelections.PROFILE, intervalInSeconds, UserMapper::ofProfile, consumer);
    }

    public RepeatingRequestTask<Map<Long, Property>> repeatProperties(int intervalInSeconds, Consumer<Map<Long, Property>> consumer) {
        return repeating(UserSelections.PROPERTIES, intervalInSeconds, UserMapper::ofProperties, consumer);
    }

    public RepeatingRequestTask<Refills> repeatRefills(int intervalInSeconds, Consumer<Refills> consumer) {
        return repeating(UserSelections.REFILLS, intervalInSeconds, UserMapper::ofRefills, consumer);
    }

    public RepeatingRequestTask<List<Report>> repeatReports(int intervalInSeconds, Consumer<List<Report>> consumer) {
        return repeating(UserSelections.REPORTS, intervalInSeconds, UserMapper::ofReports, consumer);
    }

    public RepeatingRequestTask<Map<Long, Revive>> repeatRevives(int intervalInSeconds, Consumer<Map<Long, Revive>> consumer) {
        return repeating(UserSelections.REVIVES, intervalInSeconds, UserMapper::ofRevives, consumer);
    }

    public RepeatingRequestTask<Map<Long, Revive>> repeatRevivesFull(int intervalInSeconds, Consumer<Map<Long, Revive>> consumer) {
        return repeating(UserSelections.REVIVES_FULL, intervalInSeconds, UserMapper::ofRevives, consumer);
    }

    public RepeatingRequestTask<Skills> repeatSkills(int intervalInSeconds, Consumer<Skills> consumer) {
        return repeating(UserSelections.SKILLS, intervalInSeconds, UserMapper::ofSkills, consumer);
    }

    public RepeatingRequestTask<Map<Long, Stock>> repeatStocks(int intervalInSeconds, Consumer<Map<Long, Stock>> consumer) {
        return repeating(UserSelections.STOCKS, intervalInSeconds, UserMapper::ofStocks, consumer);
    }

    public RepeatingRequestTask<Travel> repeatTravel(int intervalInSeconds, Consumer<Travel> consumer) {
        return repeating(UserSelections.TRAVEL, intervalInSeconds, UserMapper::ofTravel, consumer);
    }

    public RepeatingRequestTask<List<WeaponExperience>> repeatWeaponExp(int intervalInSeconds, Consumer<List<WeaponExperience>> consumer) {
        return repeating(UserSelections.WEAPON_EXP, intervalInSeconds, UserMapper::ofWeaponExp, consumer);
    }

    public RepeatingRequestTask<WorkStats> repeatWorkStats(int intervalInSeconds, Consumer<WorkStats> consumer) {
        return repeating(UserSelections.WORK_STATS, intervalInSeconds, UserMapper::ofWorkStats, consumer);
    }

}
