package be.dekleinekobini.tornapi.models.torn;

import be.dekleinekobini.tornapi.models.Model;
import be.dekleinekobini.tornapi.models.converters.EpochLocalDateTimeConverter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.time.LocalDateTime;
import java.util.Objects;

public class TornStats extends Model {

    @JsonDeserialize(converter = EpochLocalDateTimeConverter.class)
    private LocalDateTime timestamp;
    @JsonProperty("users_total")
    private long usersTotal;
    @JsonProperty("users_male")
    private long usersMale;
    @JsonProperty("users_female")
    private long usersFemale;
    @JsonProperty("users_marriedcouples")
    private long usersMarriedCouples;
    @JsonProperty("users_daily")
    private long usersDaily;
    @JsonProperty("total_users_logins")
    private long totalUsersLogins;
    @JsonProperty("total_users_playtime")
    private double totalUsersPlaytime;
    @JsonProperty("job_army")
    private long jobArmy;
    @JsonProperty("job_grocer")
    private long jobGrocer;
    @JsonProperty("job_medical")
    private long jobMedical;
    @JsonProperty("job_casino")
    private long jobCasino;
    @JsonProperty("job_education")
    private long jobEducation;
    @JsonProperty("job_law")
    private long jobLaw;
    @JsonProperty("job_company")
    private long jobCompany;
    @JsonProperty("job_none")
    private long jobNone;
    @JsonProperty("crimes")
    private long crimes;
    @JsonProperty("jailed")
    private long jailed;
    @JsonProperty("money_onhand")
    private long moneyOnHand;
    @JsonProperty("money_average")
    private long moneyAverage;
    @JsonProperty("money_citybank")
    private long moneyCityBank;
    @JsonProperty("items")
    private long items;
    @JsonProperty("events")
    private long events;
    @JsonProperty("points_total")
    private long pointsTotal;
    @JsonProperty("points_market")
    private long pointsMarket;
    @JsonProperty("points_averagecost")
    private long pointsAverageCost;
    @JsonProperty("points_bought")
    private long pointsBought;
    @JsonProperty("total_points_boughttotal")
    private long totalPointsBoughtTotal;
    @JsonProperty("total_attacks_won")
    private long totalAttacksWon;
    @JsonProperty("total_attacks_lost")
    private long totalAttacksLost;
    @JsonProperty("total_attacks_stalemated")
    private long totalAttacksStalemated;
    @JsonProperty("total_attacks_runaway")
    private long totalAttacksRunaway;
    @JsonProperty("total_attacks_hits")
    private long totalAttacksHits;
    @JsonProperty("total_attacks_misses")
    private long totalAttacksMisses;
    @JsonProperty("total_attacks_criticalhits")
    private long totalAttacksCriticalHits;
    @JsonProperty("total_attacks_roundsfired")
    private long totalAttacksRoundsFired;
    @JsonProperty("total_attacks_stealthed")
    private long totalAttacksStealthed;
    @JsonProperty("total_attacks_moneymugged")
    private long totalAttacksMoneyMugged;
    @JsonProperty("total_attacks_respectgained")
    private long totalAttacksRespectGained;
    @JsonProperty("total_items_marketbought")
    private long totalItemsMarketBought;
    @JsonProperty("total_items_bazaarbought")
    private long totalItemsBazaarBought;
    @JsonProperty("total_items_auctionswon")
    private long totalItemsAuctionsWon;
    @JsonProperty("total_items_sent")
    private long totalItemsSent;
    @JsonProperty("total_trades")
    private long totalTrades;
    @JsonProperty("total_items_bazaarincome")
    private long totalItemsBazaarIncome;
    @JsonProperty("total_items_cityfinds")
    private long totalItemsCityFinds;
    @JsonProperty("total_items_dumpfinds")
    private long totalItemsDumpFinds;
    @JsonProperty("total_items_dumped")
    private long totalItemsDumped;
    @JsonProperty("total_jail_jailed")
    private long totalJailJailed;
    @JsonProperty("total_jail_busted")
    private long totalJailBusted;
    @JsonProperty("total_jail_busts")
    private long totalJailBusts;
    @JsonProperty("total_jail_bailed")
    private long totalJailBailed;
    @JsonProperty("total_jail_bailcosts")
    private long totalJailBailCosts;
    @JsonProperty("total_hospital_trips")
    private long totalHospitalTrips;
    @JsonProperty("total_hospital_medicalitemsused")
    private long totalHospitalMedicalItemsUsed;
    @JsonProperty("total_hospital_revived")
    private long totalHospitalRevived;
    @JsonProperty("total_mails_sent")
    private long totalMailsSent;
    @JsonProperty("total_mails_sent_friends")
    private long totalMailsSentFriends;
    @JsonProperty("total_mails_sent_faction")
    private long totalMailsSentFaction;
    @JsonProperty("total_mails_sent_company")
    private long totalMailsSentCompany;
    @JsonProperty("total_mails_sent_spouse")
    private long totalMailsSentSpouse;
    @JsonProperty("total_classifiedads_placed")
    private long totalClassifiedAdsPlaced;
    @JsonProperty("total_bounty_placed")
    private long totalBountyPlaced;
    @JsonProperty("total_bounty_rewards")
    private long totalBountyRewards;
    @JsonProperty("total_travel_all")
    private long totalTravelAll;
    @JsonProperty("total_travel_argentina")
    private long totalTravelArgentina;
    @JsonProperty("total_travel_mexico")
    private long totalTravelMexico;
    @JsonProperty("total_travel_dubai")
    private long totalTravelDubai;
    @JsonProperty("total_travel_hawaii")
    private long totalTravelHawaii;
    @JsonProperty("total_travel_japan")
    private long totalTravelJapan;
    @JsonProperty("total_travel_unitedkingdom")
    private long totalTravelUnitedKingdom;
    @JsonProperty("total_travel_southafrica")
    private long totalTravelSouthAfrica;
    @JsonProperty("total_travel_switzerland")
    private long totalTravelSwitzerland;
    @JsonProperty("total_travel_china")
    private long totalTravelChina;
    @JsonProperty("total_travel_canada")
    private long totalTravelCanada;
    @JsonProperty("total_travel_caymanislands")
    private long totalTravelCaymanIslands;
    @JsonProperty("total_drugs_used")
    private long totalDrugsUsed;
    @JsonProperty("total_drugs_overdosed")
    private long totalDrugsOverdosed;
    @JsonProperty("total_drugs_cannabis")
    private long totalDrugsCannabis;
    @JsonProperty("total_drugs_ecstacy")
    private long totalDrugsEcstacy;
    @JsonProperty("total_drugs_ketamine")
    private long totalDrugsKetamine;
    @JsonProperty("total_drugs_lsd")
    private long totalDrugsLsd;
    @JsonProperty("total_drugs_opium")
    private long totalDrugsOpium;
    @JsonProperty("total_drugs_shrooms")
    private long totalDrugsShrooms;
    @JsonProperty("total_drugs_speed")
    private long totalDrugsSpeed;
    @JsonProperty("total_drugs_pcp")
    private long totalDrugsPcp;
    @JsonProperty("total_drugs_xanax")
    private long totalDrugsXanax;
    @JsonProperty("total_drugs_vicodin")
    private long totalDrugsVicodin;
    @JsonProperty("total_merits_bought")
    private long totalMeritsBought;
    @JsonProperty("total_refills_bought")
    private long totalRefillsBought;
    @JsonProperty("total_company_trains")
    private long totalCompanyTrains;
    @JsonProperty("total_statenhancers_used")
    private long totalStatenhancersUsed;

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public long getUsersTotal() {
        return usersTotal;
    }

    public void setUsersTotal(long usersTotal) {
        this.usersTotal = usersTotal;
    }

    public long getUsersMale() {
        return usersMale;
    }

    public void setUsersMale(long usersMale) {
        this.usersMale = usersMale;
    }

    public long getUsersFemale() {
        return usersFemale;
    }

    public void setUsersFemale(long usersFemale) {
        this.usersFemale = usersFemale;
    }

    public long getUsersMarriedCouples() {
        return usersMarriedCouples;
    }

    public void setUsersMarriedCouples(long usersMarriedCouples) {
        this.usersMarriedCouples = usersMarriedCouples;
    }

    public long getUsersDaily() {
        return usersDaily;
    }

    public void setUsersDaily(long usersDaily) {
        this.usersDaily = usersDaily;
    }

    public long getTotalUsersLogins() {
        return totalUsersLogins;
    }

    public void setTotalUsersLogins(long totalUsersLogins) {
        this.totalUsersLogins = totalUsersLogins;
    }

    public double getTotalUsersPlaytime() {
        return totalUsersPlaytime;
    }

    public void setTotalUsersPlaytime(double totalUsersPlaytime) {
        this.totalUsersPlaytime = totalUsersPlaytime;
    }

    public long getJobArmy() {
        return jobArmy;
    }

    public void setJobArmy(long jobArmy) {
        this.jobArmy = jobArmy;
    }

    public long getJobGrocer() {
        return jobGrocer;
    }

    public void setJobGrocer(long jobGrocer) {
        this.jobGrocer = jobGrocer;
    }

    public long getJobMedical() {
        return jobMedical;
    }

    public void setJobMedical(long jobMedical) {
        this.jobMedical = jobMedical;
    }

    public long getJobCasino() {
        return jobCasino;
    }

    public void setJobCasino(long jobCasino) {
        this.jobCasino = jobCasino;
    }

    public long getJobEducation() {
        return jobEducation;
    }

    public void setJobEducation(long jobEducation) {
        this.jobEducation = jobEducation;
    }

    public long getJobLaw() {
        return jobLaw;
    }

    public void setJobLaw(long jobLaw) {
        this.jobLaw = jobLaw;
    }

    public long getJobCompany() {
        return jobCompany;
    }

    public void setJobCompany(long jobCompany) {
        this.jobCompany = jobCompany;
    }

    public long getJobNone() {
        return jobNone;
    }

    public void setJobNone(long jobNone) {
        this.jobNone = jobNone;
    }

    public long getCrimes() {
        return crimes;
    }

    public void setCrimes(long crimes) {
        this.crimes = crimes;
    }

    public long getJailed() {
        return jailed;
    }

    public void setJailed(long jailed) {
        this.jailed = jailed;
    }

    public long getMoneyOnHand() {
        return moneyOnHand;
    }

    public void setMoneyOnHand(long moneyOnHand) {
        this.moneyOnHand = moneyOnHand;
    }

    public long getMoneyAverage() {
        return moneyAverage;
    }

    public void setMoneyAverage(long moneyAverage) {
        this.moneyAverage = moneyAverage;
    }

    public long getMoneyCityBank() {
        return moneyCityBank;
    }

    public void setMoneyCityBank(long moneyCityBank) {
        this.moneyCityBank = moneyCityBank;
    }

    public long getItems() {
        return items;
    }

    public void setItems(long items) {
        this.items = items;
    }

    public long getEvents() {
        return events;
    }

    public void setEvents(long events) {
        this.events = events;
    }

    public long getPointsTotal() {
        return pointsTotal;
    }

    public void setPointsTotal(long pointsTotal) {
        this.pointsTotal = pointsTotal;
    }

    public long getPointsMarket() {
        return pointsMarket;
    }

    public void setPointsMarket(long pointsMarket) {
        this.pointsMarket = pointsMarket;
    }

    public long getPointsAverageCost() {
        return pointsAverageCost;
    }

    public void setPointsAverageCost(long pointsAverageCost) {
        this.pointsAverageCost = pointsAverageCost;
    }

    public long getPointsBought() {
        return pointsBought;
    }

    public void setPointsBought(long pointsBought) {
        this.pointsBought = pointsBought;
    }

    public long getTotalPointsBoughtTotal() {
        return totalPointsBoughtTotal;
    }

    public void setTotalPointsBoughtTotal(long totalPointsBoughtTotal) {
        this.totalPointsBoughtTotal = totalPointsBoughtTotal;
    }

    public long getTotalAttacksWon() {
        return totalAttacksWon;
    }

    public void setTotalAttacksWon(long totalAttacksWon) {
        this.totalAttacksWon = totalAttacksWon;
    }

    public long getTotalAttacksLost() {
        return totalAttacksLost;
    }

    public void setTotalAttacksLost(long totalAttacksLost) {
        this.totalAttacksLost = totalAttacksLost;
    }

    public long getTotalAttacksStalemated() {
        return totalAttacksStalemated;
    }

    public void setTotalAttacksStalemated(long totalAttacksStalemated) {
        this.totalAttacksStalemated = totalAttacksStalemated;
    }

    public long getTotalAttacksRunaway() {
        return totalAttacksRunaway;
    }

    public void setTotalAttacksRunaway(long totalAttacksRunaway) {
        this.totalAttacksRunaway = totalAttacksRunaway;
    }

    public long getTotalAttacksHits() {
        return totalAttacksHits;
    }

    public void setTotalAttacksHits(long totalAttacksHits) {
        this.totalAttacksHits = totalAttacksHits;
    }

    public long getTotalAttacksMisses() {
        return totalAttacksMisses;
    }

    public void setTotalAttacksMisses(long totalAttacksMisses) {
        this.totalAttacksMisses = totalAttacksMisses;
    }

    public long getTotalAttacksCriticalHits() {
        return totalAttacksCriticalHits;
    }

    public void setTotalAttacksCriticalHits(long totalAttacksCriticalHits) {
        this.totalAttacksCriticalHits = totalAttacksCriticalHits;
    }

    public long getTotalAttacksRoundsFired() {
        return totalAttacksRoundsFired;
    }

    public void setTotalAttacksRoundsFired(long totalAttacksRoundsFired) {
        this.totalAttacksRoundsFired = totalAttacksRoundsFired;
    }

    public long getTotalAttacksStealthed() {
        return totalAttacksStealthed;
    }

    public void setTotalAttacksStealthed(long totalAttacksStealthed) {
        this.totalAttacksStealthed = totalAttacksStealthed;
    }

    public long getTotalAttacksMoneyMugged() {
        return totalAttacksMoneyMugged;
    }

    public void setTotalAttacksMoneyMugged(long totalAttacksMoneyMugged) {
        this.totalAttacksMoneyMugged = totalAttacksMoneyMugged;
    }

    public long getTotalAttacksRespectGained() {
        return totalAttacksRespectGained;
    }

    public void setTotalAttacksRespectGained(long totalAttacksRespectGained) {
        this.totalAttacksRespectGained = totalAttacksRespectGained;
    }

    public long getTotalItemsMarketBought() {
        return totalItemsMarketBought;
    }

    public void setTotalItemsMarketBought(long totalItemsMarketBought) {
        this.totalItemsMarketBought = totalItemsMarketBought;
    }

    public long getTotalItemsBazaarBought() {
        return totalItemsBazaarBought;
    }

    public void setTotalItemsBazaarBought(long totalItemsBazaarBought) {
        this.totalItemsBazaarBought = totalItemsBazaarBought;
    }

    public long getTotalItemsAuctionsWon() {
        return totalItemsAuctionsWon;
    }

    public void setTotalItemsAuctionsWon(long totalItemsAuctionsWon) {
        this.totalItemsAuctionsWon = totalItemsAuctionsWon;
    }

    public long getTotalItemsSent() {
        return totalItemsSent;
    }

    public void setTotalItemsSent(long totalItemsSent) {
        this.totalItemsSent = totalItemsSent;
    }

    public long getTotalTrades() {
        return totalTrades;
    }

    public void setTotalTrades(long totalTrades) {
        this.totalTrades = totalTrades;
    }

    public long getTotalItemsBazaarIncome() {
        return totalItemsBazaarIncome;
    }

    public void setTotalItemsBazaarIncome(long totalItemsBazaarIncome) {
        this.totalItemsBazaarIncome = totalItemsBazaarIncome;
    }

    public long getTotalItemsCityFinds() {
        return totalItemsCityFinds;
    }

    public void setTotalItemsCityFinds(long totalItemsCityFinds) {
        this.totalItemsCityFinds = totalItemsCityFinds;
    }

    public long getTotalItemsDumpFinds() {
        return totalItemsDumpFinds;
    }

    public void setTotalItemsDumpFinds(long totalItemsDumpFinds) {
        this.totalItemsDumpFinds = totalItemsDumpFinds;
    }

    public long getTotalItemsDumped() {
        return totalItemsDumped;
    }

    public void setTotalItemsDumped(long totalItemsDumped) {
        this.totalItemsDumped = totalItemsDumped;
    }

    public long getTotalJailJailed() {
        return totalJailJailed;
    }

    public void setTotalJailJailed(long totalJailJailed) {
        this.totalJailJailed = totalJailJailed;
    }

    public long getTotalJailBusted() {
        return totalJailBusted;
    }

    public void setTotalJailBusted(long totalJailBusted) {
        this.totalJailBusted = totalJailBusted;
    }

    public long getTotalJailBusts() {
        return totalJailBusts;
    }

    public void setTotalJailBusts(long totalJailBusts) {
        this.totalJailBusts = totalJailBusts;
    }

    public long getTotalJailBailed() {
        return totalJailBailed;
    }

    public void setTotalJailBailed(long totalJailBailed) {
        this.totalJailBailed = totalJailBailed;
    }

    public long getTotalJailBailCosts() {
        return totalJailBailCosts;
    }

    public void setTotalJailBailCosts(long totalJailBailCosts) {
        this.totalJailBailCosts = totalJailBailCosts;
    }

    public long getTotalHospitalTrips() {
        return totalHospitalTrips;
    }

    public void setTotalHospitalTrips(long totalHospitalTrips) {
        this.totalHospitalTrips = totalHospitalTrips;
    }

    public long getTotalHospitalMedicalItemsUsed() {
        return totalHospitalMedicalItemsUsed;
    }

    public void setTotalHospitalMedicalItemsUsed(long totalHospitalMedicalItemsUsed) {
        this.totalHospitalMedicalItemsUsed = totalHospitalMedicalItemsUsed;
    }

    public long getTotalHospitalRevived() {
        return totalHospitalRevived;
    }

    public void setTotalHospitalRevived(long totalHospitalRevived) {
        this.totalHospitalRevived = totalHospitalRevived;
    }

    public long getTotalMailsSent() {
        return totalMailsSent;
    }

    public void setTotalMailsSent(long totalMailsSent) {
        this.totalMailsSent = totalMailsSent;
    }

    public long getTotalMailsSentFriends() {
        return totalMailsSentFriends;
    }

    public void setTotalMailsSentFriends(long totalMailsSentFriends) {
        this.totalMailsSentFriends = totalMailsSentFriends;
    }

    public long getTotalMailsSentFaction() {
        return totalMailsSentFaction;
    }

    public void setTotalMailsSentFaction(long totalMailsSentFaction) {
        this.totalMailsSentFaction = totalMailsSentFaction;
    }

    public long getTotalMailsSentCompany() {
        return totalMailsSentCompany;
    }

    public void setTotalMailsSentCompany(long totalMailsSentCompany) {
        this.totalMailsSentCompany = totalMailsSentCompany;
    }

    public long getTotalMailsSentSpouse() {
        return totalMailsSentSpouse;
    }

    public void setTotalMailsSentSpouse(long totalMailsSentSpouse) {
        this.totalMailsSentSpouse = totalMailsSentSpouse;
    }

    public long getTotalClassifiedAdsPlaced() {
        return totalClassifiedAdsPlaced;
    }

    public void setTotalClassifiedAdsPlaced(long totalClassifiedAdsPlaced) {
        this.totalClassifiedAdsPlaced = totalClassifiedAdsPlaced;
    }

    public long getTotalBountyPlaced() {
        return totalBountyPlaced;
    }

    public void setTotalBountyPlaced(long totalBountyPlaced) {
        this.totalBountyPlaced = totalBountyPlaced;
    }

    public long getTotalBountyRewards() {
        return totalBountyRewards;
    }

    public void setTotalBountyRewards(long totalBountyRewards) {
        this.totalBountyRewards = totalBountyRewards;
    }

    public long getTotalTravelAll() {
        return totalTravelAll;
    }

    public void setTotalTravelAll(long totalTravelAll) {
        this.totalTravelAll = totalTravelAll;
    }

    public long getTotalTravelArgentina() {
        return totalTravelArgentina;
    }

    public void setTotalTravelArgentina(long totalTravelArgentina) {
        this.totalTravelArgentina = totalTravelArgentina;
    }

    public long getTotalTravelMexico() {
        return totalTravelMexico;
    }

    public void setTotalTravelMexico(long totalTravelMexico) {
        this.totalTravelMexico = totalTravelMexico;
    }

    public long getTotalTravelDubai() {
        return totalTravelDubai;
    }

    public void setTotalTravelDubai(long totalTravelDubai) {
        this.totalTravelDubai = totalTravelDubai;
    }

    public long getTotalTravelHawaii() {
        return totalTravelHawaii;
    }

    public void setTotalTravelHawaii(long totalTravelHawaii) {
        this.totalTravelHawaii = totalTravelHawaii;
    }

    public long getTotalTravelJapan() {
        return totalTravelJapan;
    }

    public void setTotalTravelJapan(long totalTravelJapan) {
        this.totalTravelJapan = totalTravelJapan;
    }

    public long getTotalTravelUnitedKingdom() {
        return totalTravelUnitedKingdom;
    }

    public void setTotalTravelUnitedKingdom(long totalTravelUnitedKingdom) {
        this.totalTravelUnitedKingdom = totalTravelUnitedKingdom;
    }

    public long getTotalTravelSouthAfrica() {
        return totalTravelSouthAfrica;
    }

    public void setTotalTravelSouthAfrica(long totalTravelSouthAfrica) {
        this.totalTravelSouthAfrica = totalTravelSouthAfrica;
    }

    public long getTotalTravelSwitzerland() {
        return totalTravelSwitzerland;
    }

    public void setTotalTravelSwitzerland(long totalTravelSwitzerland) {
        this.totalTravelSwitzerland = totalTravelSwitzerland;
    }

    public long getTotalTravelChina() {
        return totalTravelChina;
    }

    public void setTotalTravelChina(long totalTravelChina) {
        this.totalTravelChina = totalTravelChina;
    }

    public long getTotalTravelCanada() {
        return totalTravelCanada;
    }

    public void setTotalTravelCanada(long totalTravelCanada) {
        this.totalTravelCanada = totalTravelCanada;
    }

    public long getTotalTravelCaymanIslands() {
        return totalTravelCaymanIslands;
    }

    public void setTotalTravelCaymanIslands(long totalTravelCaymanIslands) {
        this.totalTravelCaymanIslands = totalTravelCaymanIslands;
    }

    public long getTotalDrugsUsed() {
        return totalDrugsUsed;
    }

    public void setTotalDrugsUsed(long totalDrugsUsed) {
        this.totalDrugsUsed = totalDrugsUsed;
    }

    public long getTotalDrugsOverdosed() {
        return totalDrugsOverdosed;
    }

    public void setTotalDrugsOverdosed(long totalDrugsOverdosed) {
        this.totalDrugsOverdosed = totalDrugsOverdosed;
    }

    public long getTotalDrugsCannabis() {
        return totalDrugsCannabis;
    }

    public void setTotalDrugsCannabis(long totalDrugsCannabis) {
        this.totalDrugsCannabis = totalDrugsCannabis;
    }

    public long getTotalDrugsEcstacy() {
        return totalDrugsEcstacy;
    }

    public void setTotalDrugsEcstacy(long totalDrugsEcstacy) {
        this.totalDrugsEcstacy = totalDrugsEcstacy;
    }

    public long getTotalDrugsKetamine() {
        return totalDrugsKetamine;
    }

    public void setTotalDrugsKetamine(long totalDrugsKetamine) {
        this.totalDrugsKetamine = totalDrugsKetamine;
    }

    public long getTotalDrugsLsd() {
        return totalDrugsLsd;
    }

    public void setTotalDrugsLsd(long totalDrugsLsd) {
        this.totalDrugsLsd = totalDrugsLsd;
    }

    public long getTotalDrugsOpium() {
        return totalDrugsOpium;
    }

    public void setTotalDrugsOpium(long totalDrugsOpium) {
        this.totalDrugsOpium = totalDrugsOpium;
    }

    public long getTotalDrugsShrooms() {
        return totalDrugsShrooms;
    }

    public void setTotalDrugsShrooms(long totalDrugsShrooms) {
        this.totalDrugsShrooms = totalDrugsShrooms;
    }

    public long getTotalDrugsSpeed() {
        return totalDrugsSpeed;
    }

    public void setTotalDrugsSpeed(long totalDrugsSpeed) {
        this.totalDrugsSpeed = totalDrugsSpeed;
    }

    public long getTotalDrugsPcp() {
        return totalDrugsPcp;
    }

    public void setTotalDrugsPcp(long totalDrugsPcp) {
        this.totalDrugsPcp = totalDrugsPcp;
    }

    public long getTotalDrugsXanax() {
        return totalDrugsXanax;
    }

    public void setTotalDrugsXanax(long totalDrugsXanax) {
        this.totalDrugsXanax = totalDrugsXanax;
    }

    public long getTotalDrugsVicodin() {
        return totalDrugsVicodin;
    }

    public void setTotalDrugsVicodin(long totalDrugsVicodin) {
        this.totalDrugsVicodin = totalDrugsVicodin;
    }

    public long getTotalMeritsBought() {
        return totalMeritsBought;
    }

    public void setTotalMeritsBought(long totalMeritsBought) {
        this.totalMeritsBought = totalMeritsBought;
    }

    public long getTotalRefillsBought() {
        return totalRefillsBought;
    }

    public void setTotalRefillsBought(long totalRefillsBought) {
        this.totalRefillsBought = totalRefillsBought;
    }

    public long getTotalCompanyTrains() {
        return totalCompanyTrains;
    }

    public void setTotalCompanyTrains(long totalCompanyTrains) {
        this.totalCompanyTrains = totalCompanyTrains;
    }

    public long getTotalStatenhancersUsed() {
        return totalStatenhancersUsed;
    }

    public void setTotalStatenhancersUsed(long totalStatenhancersUsed) {
        this.totalStatenhancersUsed = totalStatenhancersUsed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TornStats tornStats = (TornStats) o;
        return usersTotal == tornStats.usersTotal && usersMale == tornStats.usersMale && usersFemale == tornStats.usersFemale && usersMarriedCouples == tornStats.usersMarriedCouples && usersDaily == tornStats.usersDaily && totalUsersLogins == tornStats.totalUsersLogins && Double.compare(tornStats.totalUsersPlaytime, totalUsersPlaytime) == 0 && jobArmy == tornStats.jobArmy && jobGrocer == tornStats.jobGrocer && jobMedical == tornStats.jobMedical && jobCasino == tornStats.jobCasino && jobEducation == tornStats.jobEducation && jobLaw == tornStats.jobLaw && jobCompany == tornStats.jobCompany && jobNone == tornStats.jobNone && crimes == tornStats.crimes && jailed == tornStats.jailed && moneyOnHand == tornStats.moneyOnHand && moneyAverage == tornStats.moneyAverage && moneyCityBank == tornStats.moneyCityBank && items == tornStats.items && events == tornStats.events && pointsTotal == tornStats.pointsTotal && pointsMarket == tornStats.pointsMarket && pointsAverageCost == tornStats.pointsAverageCost && pointsBought == tornStats.pointsBought && totalPointsBoughtTotal == tornStats.totalPointsBoughtTotal && totalAttacksWon == tornStats.totalAttacksWon && totalAttacksLost == tornStats.totalAttacksLost && totalAttacksStalemated == tornStats.totalAttacksStalemated && totalAttacksRunaway == tornStats.totalAttacksRunaway && totalAttacksHits == tornStats.totalAttacksHits && totalAttacksMisses == tornStats.totalAttacksMisses && totalAttacksCriticalHits == tornStats.totalAttacksCriticalHits && totalAttacksRoundsFired == tornStats.totalAttacksRoundsFired && totalAttacksStealthed == tornStats.totalAttacksStealthed && totalAttacksMoneyMugged == tornStats.totalAttacksMoneyMugged && totalAttacksRespectGained == tornStats.totalAttacksRespectGained && totalItemsMarketBought == tornStats.totalItemsMarketBought && totalItemsBazaarBought == tornStats.totalItemsBazaarBought && totalItemsAuctionsWon == tornStats.totalItemsAuctionsWon && totalItemsSent == tornStats.totalItemsSent && totalTrades == tornStats.totalTrades && totalItemsBazaarIncome == tornStats.totalItemsBazaarIncome && totalItemsCityFinds == tornStats.totalItemsCityFinds && totalItemsDumpFinds == tornStats.totalItemsDumpFinds && totalItemsDumped == tornStats.totalItemsDumped && totalJailJailed == tornStats.totalJailJailed && totalJailBusted == tornStats.totalJailBusted && totalJailBusts == tornStats.totalJailBusts && totalJailBailed == tornStats.totalJailBailed && totalJailBailCosts == tornStats.totalJailBailCosts && totalHospitalTrips == tornStats.totalHospitalTrips && totalHospitalMedicalItemsUsed == tornStats.totalHospitalMedicalItemsUsed && totalHospitalRevived == tornStats.totalHospitalRevived && totalMailsSent == tornStats.totalMailsSent && totalMailsSentFriends == tornStats.totalMailsSentFriends && totalMailsSentFaction == tornStats.totalMailsSentFaction && totalMailsSentCompany == tornStats.totalMailsSentCompany && totalMailsSentSpouse == tornStats.totalMailsSentSpouse && totalClassifiedAdsPlaced == tornStats.totalClassifiedAdsPlaced && totalBountyPlaced == tornStats.totalBountyPlaced && totalBountyRewards == tornStats.totalBountyRewards && totalTravelAll == tornStats.totalTravelAll && totalTravelArgentina == tornStats.totalTravelArgentina && totalTravelMexico == tornStats.totalTravelMexico && totalTravelDubai == tornStats.totalTravelDubai && totalTravelHawaii == tornStats.totalTravelHawaii && totalTravelJapan == tornStats.totalTravelJapan && totalTravelUnitedKingdom == tornStats.totalTravelUnitedKingdom && totalTravelSouthAfrica == tornStats.totalTravelSouthAfrica && totalTravelSwitzerland == tornStats.totalTravelSwitzerland && totalTravelChina == tornStats.totalTravelChina && totalTravelCanada == tornStats.totalTravelCanada && totalTravelCaymanIslands == tornStats.totalTravelCaymanIslands && totalDrugsUsed == tornStats.totalDrugsUsed && totalDrugsOverdosed == tornStats.totalDrugsOverdosed && totalDrugsCannabis == tornStats.totalDrugsCannabis && totalDrugsEcstacy == tornStats.totalDrugsEcstacy && totalDrugsKetamine == tornStats.totalDrugsKetamine && totalDrugsLsd == tornStats.totalDrugsLsd && totalDrugsOpium == tornStats.totalDrugsOpium && totalDrugsShrooms == tornStats.totalDrugsShrooms && totalDrugsSpeed == tornStats.totalDrugsSpeed && totalDrugsPcp == tornStats.totalDrugsPcp && totalDrugsXanax == tornStats.totalDrugsXanax && totalDrugsVicodin == tornStats.totalDrugsVicodin && totalMeritsBought == tornStats.totalMeritsBought && totalRefillsBought == tornStats.totalRefillsBought && totalCompanyTrains == tornStats.totalCompanyTrains && totalStatenhancersUsed == tornStats.totalStatenhancersUsed && Objects.equals(timestamp, tornStats.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestamp, usersTotal, usersMale, usersFemale, usersMarriedCouples, usersDaily, totalUsersLogins, totalUsersPlaytime, jobArmy, jobGrocer, jobMedical, jobCasino, jobEducation, jobLaw, jobCompany, jobNone, crimes, jailed, moneyOnHand, moneyAverage, moneyCityBank, items, events, pointsTotal, pointsMarket, pointsAverageCost, pointsBought, totalPointsBoughtTotal, totalAttacksWon, totalAttacksLost, totalAttacksStalemated, totalAttacksRunaway, totalAttacksHits, totalAttacksMisses, totalAttacksCriticalHits, totalAttacksRoundsFired, totalAttacksStealthed, totalAttacksMoneyMugged, totalAttacksRespectGained, totalItemsMarketBought, totalItemsBazaarBought, totalItemsAuctionsWon, totalItemsSent, totalTrades, totalItemsBazaarIncome, totalItemsCityFinds, totalItemsDumpFinds, totalItemsDumped, totalJailJailed, totalJailBusted, totalJailBusts, totalJailBailed, totalJailBailCosts, totalHospitalTrips, totalHospitalMedicalItemsUsed, totalHospitalRevived, totalMailsSent, totalMailsSentFriends, totalMailsSentFaction, totalMailsSentCompany, totalMailsSentSpouse, totalClassifiedAdsPlaced, totalBountyPlaced, totalBountyRewards, totalTravelAll, totalTravelArgentina, totalTravelMexico, totalTravelDubai, totalTravelHawaii, totalTravelJapan, totalTravelUnitedKingdom, totalTravelSouthAfrica, totalTravelSwitzerland, totalTravelChina, totalTravelCanada, totalTravelCaymanIslands, totalDrugsUsed, totalDrugsOverdosed, totalDrugsCannabis, totalDrugsEcstacy, totalDrugsKetamine, totalDrugsLsd, totalDrugsOpium, totalDrugsShrooms, totalDrugsSpeed, totalDrugsPcp, totalDrugsXanax, totalDrugsVicodin, totalMeritsBought, totalRefillsBought, totalCompanyTrains, totalStatenhancersUsed);
    }

}
