package eu.tornplayground.tornapi.models.user;

import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.converters.DayDurationConverter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.time.Duration;
import java.util.Objects;

@SuppressWarnings("unused")
public class PersonalStats extends Model {

    @JsonProperty("bazaarcustomers")
    private long bazaarCustomers;
    @JsonProperty("bazaarsales")
    private long bazaarSales;
    @JsonProperty("bazaarprofit")
    private long bazaarProfit;
    @JsonProperty("useractivity")
    private Duration userActivity;
    @JsonProperty("activestreak")
    private long activeStreak;
    @JsonProperty("bestactivestreak")
    private long bestActiveStreak;
    @JsonProperty("itemsbought")
    private long itemsBought;
    @JsonProperty("pointsbought")
    private long pointsBought;
    @JsonProperty("itemsboughtabroad")
    private long itemsBoughtAbroad;
    @JsonProperty("moneyinvested")
    private long moneyInvested;
    @JsonProperty("investedprofit")
    private long investedProfit;
    @JsonProperty("weaponsbought")
    private long weaponsBought;
    @JsonProperty("trades")
    private long trades;
    @JsonProperty("itemssent")
    private long itemsSent;
    @JsonProperty("auctionswon")
    private long auctionsWon;
    @JsonProperty("auctionsells")
    private long auctionSells;
    @JsonProperty("pointssold")
    private long pointsSold;
    @JsonProperty("attackswon")
    private long attacksWon;
    @JsonProperty("attackslost")
    private long attacksLost;
    @JsonProperty("attacksdraw")
    private long attacksDraw;
    @JsonProperty("bestkillstreak")
    private long bestKillStreak;
    @JsonProperty("killstreak")
    private long killStreak;
    @JsonProperty("moneymugged")
    private long moneyMugged;
    @JsonProperty("attacksstealthed")
    private long attacksStealthed;
    @JsonProperty("attackhits")
    private long attackHits;
    @JsonProperty("attackmisses")
    private long attackMisses;
    @JsonProperty("attackdamage")
    private long attackDamage;
    @JsonProperty("attackcriticalhits")
    private long attackCriticalHits;
    @JsonProperty("respectforfaction")
    private long respectForFaction;
    @JsonProperty("onehitkills")
    private long oneHitKills;
    @JsonProperty("defendswon")
    private long defendsWon;
    @JsonProperty("defendslost")
    private long defendsLost;
    @JsonProperty("defendsstalemated")
    private long defendsStalemated;
    @JsonProperty("bestdamage")
    private long bestDamage;
    @JsonProperty("roundsfired")
    private long roundsFired;
    @JsonProperty("yourunaway")
    private long attacksRunaway;
    @JsonProperty("theyrunaway")
    private long defendsRunaway;
    @JsonProperty("highestbeaten")
    private long highestBeaten;
    @JsonProperty("peoplebusted")
    private long peopleBusted;
    @JsonProperty("failedbusts")
    private long failedBusts;
    @JsonProperty("peoplebought")
    private long peopleBought;
    @JsonProperty("peopleboughtspent")
    private long peopleBoughtSpent;
    @JsonProperty("virusescoded")
    private long virusesCoded;
    @JsonProperty("cityfinds")
    private long cityFinds;
    @JsonProperty("traveltimes")
    private long travelTimes;
    @JsonProperty("bountiesplaced")
    private long bountiesPlaced;
    @JsonProperty("bountiesreceived")
    private long bountiesReceived;
    @JsonProperty("bountiescollected")
    private long bountiesCollected;
    @JsonProperty("totalbountyreward")
    private long totalBountyReward;
    @JsonProperty("revives")
    private long revives;
    @JsonProperty("revivesreceived")
    private long revivesReceived;
    @JsonProperty("medicalitemsused")
    private long medicalItemsUsed;
    @JsonProperty("statenhancersused")
    private long statEnhancersUsed;
    @JsonProperty("trainsreceived")
    private long trainsReceived;
    @JsonProperty("totalbountyspent")
    private long totalBountySpent;
    @JsonProperty("drugsused")
    private long drugsUsed;
    @JsonProperty("overdosed")
    private long overdosed;
    @JsonProperty("meritsbought")
    private long meritsBought;
    @JsonProperty("personalsplaced")
    private long personalsPlaced;
    @JsonProperty("classifiedadsplaced")
    private long classifiedAdsPlaced;
    @JsonProperty("mailssent")
    private long mailsSent;
    @JsonProperty("friendmailssent")
    private long friendMailsSent;
    @JsonProperty("factionmailssent")
    private long factionMailsSent;
    @JsonProperty("companymailssent")
    private long companyMailsSent;
    @JsonProperty("spousemailssent")
    private long spouseMailsSent;
    @JsonProperty("largestmug")
    private long largestMug;
    @JsonProperty("cantaken")
    private long cannabisTaken;
    @JsonProperty("exttaken")
    private long ecstasyTaken;
    @JsonProperty("kettaken")
    private long ketamineTaken;
    @JsonProperty("lsdtaken")
    private long lsdTaken;
    @JsonProperty("opitaken")
    private long opiumTaken;
    @JsonProperty("shrtaken")
    private long shroomsTaken;
    @JsonProperty("spetaken")
    private long speedTaken;
    @JsonProperty("pcptaken")
    private long pcpTaken;
    @JsonProperty("xantaken")
    private long xanaxTaken;
    @JsonProperty("victaken")
    private long vicodinTaken;

    @JsonProperty("chahits")
    private long mechanicalHits;
    @JsonProperty("heahits")
    private long heavyArtilleryHits;
    @JsonProperty("axehits")
    private long clubbingHits;
    @JsonProperty("grehits")
    private long temporaryHits;
    @JsonProperty("machits")
    private long machineGunHits;
    @JsonProperty("pishits")
    private long pistolHits;
    @JsonProperty("rifhits")
    private long rifleHits;
    @JsonProperty("shohits")
    private long shotgunHits;
    @JsonProperty("smghits")
    private long subMachineGunHits;
    @JsonProperty("piehits")
    private long piercingHits;
    @JsonProperty("slahits")
    private long slashingHits;
    @JsonProperty("argtravel")
    private long argentinaTravel;
    @JsonProperty("mextravel")
    private long mexicoTravel;
    @JsonProperty("dubtravel")
    private long unitedArabEmiratesTravel;
    @JsonProperty("hawtravel")
    private long hawaiiTravel;
    @JsonProperty("japtravel")
    private long japanTravel;
    @JsonProperty("lontravel")
    private long unitedKingdomTravel;
    @JsonProperty("soutravel")
    private long southAfricaTravel;
    @JsonProperty("switravel")
    private long switzerlandTravel;
    @JsonProperty("chitravel")
    private long chinaTravel;
    @JsonProperty("cantravel")
    private long canadaTravel;
    @JsonProperty("dumpfinds")
    private long dumpFinds;
    @JsonProperty("dumpsearches")
    private long dumpSearches;
    @JsonProperty("itemsdumped")
    private long itemsDumped;
    @JsonProperty("daysbeendonator")
    @JsonDeserialize(converter = DayDurationConverter.class)
    private Duration daysBeenDonator;
    @JsonProperty("caytravel")
    private long caymanIslandsTravel;
    @JsonProperty("jailed")
    private long jailed;
    @JsonProperty("hospital")
    private long hospital;
    @JsonProperty("attacksassisted")
    private long attacksAssisted;
    @JsonProperty("bloodwithdrawn")
    private long bloodWithdrawn;
    @JsonProperty("networth")
    private long networth;
    @JsonProperty("missionscompleted")
    private long missionsCompleted;
    @JsonProperty("contractscompleted")
    private long contractsCompleted;
    @JsonProperty("dukecontractscompleted")
    private long dukeContractsCompleted;
    @JsonProperty("missioncreditsearned")
    private long missionCreditsEarned;
    @JsonProperty("consumablesused")
    private long consumablesUsed;
    @JsonProperty("candyused")
    private long candyUsed;
    @JsonProperty("alcoholused")
    private long alcoholUsed;
    @JsonProperty("energydrinkused")
    private long energyDrinkUsed;
    @JsonProperty("nerverefills")
    private long nerveRefills;
    @JsonProperty("unarmoredwon")
    private long unarmoredWon;
    @JsonProperty("h2hhits")
    private long handToHandHits;
    @JsonProperty("organisedcrimes")
    private long organisedCrimes;
    @JsonProperty("territorytime")
    private Duration territoryTime;
    @JsonProperty("territoryjoins")
    private long territoryJoins;
    @JsonProperty("stockpayouts")
    private long stockPayouts;
    @JsonProperty("stockprofits")
    private long stockProfits;
    @JsonProperty("stocklosses")
    private long stockLosses;
    @JsonProperty("stockfees")
    private long stockFees;
    @JsonProperty("arrestsmade")
    private long arrestsMade;
    @JsonProperty("tokenrefills")
    private long tokenRefills;
    @JsonProperty("booksread")
    private long booksRead;
    @JsonProperty("traveltime")
    private Duration travelTime;
    @JsonProperty("boostersused")
    private long boostersUsed;
    @JsonProperty("rehabs")
    private long rehabs;
    @JsonProperty("rehabcost")
    private long rehabCost;
    @JsonProperty("awards")
    private long awards;
    @JsonProperty("receivedbountyvalue")
    private long receivedBountyValue;
    @JsonProperty("networthpending")
    private long networthPending;
    @JsonProperty("networthwallet")
    private long networthWallet;
    @JsonProperty("networthbank")
    private long networthBank;
    @JsonProperty("networthpoints")
    private long networthPoints;
    @JsonProperty("networthcayman")
    private long networthCayman;
    @JsonProperty("networthvault")
    private long networthVault;
    @JsonProperty("networthpiggybank")
    private long networthPiggyBank;
    @JsonProperty("networthitems")
    private long networthItems;
    @JsonProperty("networthdisplaycase")
    private long networthDisplayCase;
    @JsonProperty("networthbazaar")
    private long networthBazaar;
    @JsonProperty("networthproperties")
    private long networthProperties;
    @JsonProperty("networthstockmarket")
    private long networthStockMarket;
    @JsonProperty("networthitemmarket")
    private long networthItemMarket;
    @JsonProperty("networthauctionhouse")
    private long networthAuctionHouse;
    @JsonProperty("networthcompany")
    private long networthCompany;
    @JsonProperty("networthbookie")
    private long networthBookie;
    @JsonProperty("networthenlistedcars")
    private long networthenListedCars;
    @JsonProperty("networthloan")
    private long networthLoan;
    @JsonProperty("networthunpaidfees")
    private long networthUnpaidFees;
    @JsonProperty("racingskill")
    private long racingSkill;
    @JsonProperty("raceswon")
    private long racesWon;
    @JsonProperty("racesentered")
    private long racesEntered;
    @JsonProperty("racingpointsearned")
    private long racingPointsEarned;
    @JsonProperty("specialammoused")
    private long specialAmmoUsed;
    @JsonProperty("cityitemsbought")
    private long cityItemsBought;
    @JsonProperty("hollowammoused")
    private long hollowAmmoUsed;
    @JsonProperty("tracerammoused")
    private long tracerAmmoUsed;
    @JsonProperty("piercingammoused")
    private long piercingAmmoUsed;
    @JsonProperty("incendiaryammoused")
    private long incendiaryAmmoUsed;
    @JsonProperty("attackswonabroad")
    private long attacksWonAbroad;
    @JsonProperty("defendslostabroad")
    private long defendsLostAbroad;
    @JsonProperty("retals")
    private long retals;
    @JsonProperty("elo")
    private long elo;
    @JsonProperty("strength")
    private long strength;
    @JsonProperty("defense")
    private long defense;
    @JsonProperty("speed")
    private long speed;
    @JsonProperty("dexterity")
    private long dexterity;
    @JsonProperty("totalstats")
    private long totalStats;
    @JsonProperty("manuallabor")
    private long manualLabor;
    @JsonProperty("intelligence")
    private long intelligence;
    @JsonProperty("endurance")
    private long endurance;
    @JsonProperty("totalworkingstats")
    private long totalWorkingStats;
    @JsonProperty("jobpointsused")
    private long jobPointsUsed;
    @JsonProperty("reviveskill")
    private long reviveSkill;
    @JsonProperty("itemslooted")
    private long itemsLooted;
    @JsonProperty("refills")
    private long energyRefills;

    public long getBazaarCustomers() {
        return bazaarCustomers;
    }

    public void setBazaarCustomers(long bazaarCustomers) {
        this.bazaarCustomers = bazaarCustomers;
    }

    public long getBazaarSales() {
        return bazaarSales;
    }

    public void setBazaarSales(long bazaarSales) {
        this.bazaarSales = bazaarSales;
    }

    public long getBazaarProfit() {
        return bazaarProfit;
    }

    public void setBazaarProfit(long bazaarProfit) {
        this.bazaarProfit = bazaarProfit;
    }

    public Duration getUserActivity() {
        return userActivity;
    }

    public void setUserActivity(Duration userActivity) {
        this.userActivity = userActivity;
    }

    public long getActiveStreak() {
        return activeStreak;
    }

    public void setActiveStreak(long activeStreak) {
        this.activeStreak = activeStreak;
    }

    public long getBestActiveStreak() {
        return bestActiveStreak;
    }

    public void setBestActiveStreak(long bestActiveStreak) {
        this.bestActiveStreak = bestActiveStreak;
    }

    public long getItemsBought() {
        return itemsBought;
    }

    public void setItemsBought(long itemsBought) {
        this.itemsBought = itemsBought;
    }

    public long getPointsBought() {
        return pointsBought;
    }

    public void setPointsBought(long pointsBought) {
        this.pointsBought = pointsBought;
    }

    public long getItemsBoughtAbroad() {
        return itemsBoughtAbroad;
    }

    public void setItemsBoughtAbroad(long itemsBoughtAbroad) {
        this.itemsBoughtAbroad = itemsBoughtAbroad;
    }

    public long getMoneyInvested() {
        return moneyInvested;
    }

    public void setMoneyInvested(long moneyInvested) {
        this.moneyInvested = moneyInvested;
    }

    public long getInvestedProfit() {
        return investedProfit;
    }

    public void setInvestedProfit(long investedProfit) {
        this.investedProfit = investedProfit;
    }

    public long getWeaponsBought() {
        return weaponsBought;
    }

    public void setWeaponsBought(long weaponsBought) {
        this.weaponsBought = weaponsBought;
    }

    public long getTrades() {
        return trades;
    }

    public void setTrades(long trades) {
        this.trades = trades;
    }

    public long getItemsSent() {
        return itemsSent;
    }

    public void setItemsSent(long itemsSent) {
        this.itemsSent = itemsSent;
    }

    public long getAuctionsWon() {
        return auctionsWon;
    }

    public void setAuctionsWon(long auctionsWon) {
        this.auctionsWon = auctionsWon;
    }

    public long getAuctionSells() {
        return auctionSells;
    }

    public void setAuctionSells(long auctionSells) {
        this.auctionSells = auctionSells;
    }

    public long getPointsSold() {
        return pointsSold;
    }

    public void setPointsSold(long pointsSold) {
        this.pointsSold = pointsSold;
    }

    public long getAttacksWon() {
        return attacksWon;
    }

    public void setAttacksWon(long attacksWon) {
        this.attacksWon = attacksWon;
    }

    public long getAttacksLost() {
        return attacksLost;
    }

    public void setAttacksLost(long attacksLost) {
        this.attacksLost = attacksLost;
    }

    public long getAttacksDraw() {
        return attacksDraw;
    }

    public void setAttacksDraw(long attacksDraw) {
        this.attacksDraw = attacksDraw;
    }

    public long getBestKillStreak() {
        return bestKillStreak;
    }

    public void setBestKillStreak(long bestKillStreak) {
        this.bestKillStreak = bestKillStreak;
    }

    public long getKillStreak() {
        return killStreak;
    }

    public void setKillStreak(long killStreak) {
        this.killStreak = killStreak;
    }

    public long getMoneyMugged() {
        return moneyMugged;
    }

    public void setMoneyMugged(long moneyMugged) {
        this.moneyMugged = moneyMugged;
    }

    public long getAttacksStealthed() {
        return attacksStealthed;
    }

    public void setAttacksStealthed(long attacksStealthed) {
        this.attacksStealthed = attacksStealthed;
    }

    public long getAttackHits() {
        return attackHits;
    }

    public void setAttackHits(long attackHits) {
        this.attackHits = attackHits;
    }

    public long getAttackMisses() {
        return attackMisses;
    }

    public void setAttackMisses(long attackMisses) {
        this.attackMisses = attackMisses;
    }

    public long getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(long attackDamage) {
        this.attackDamage = attackDamage;
    }

    public long getAttackCriticalHits() {
        return attackCriticalHits;
    }

    public void setAttackCriticalHits(long attackCriticalHits) {
        this.attackCriticalHits = attackCriticalHits;
    }

    public long getRespectForFaction() {
        return respectForFaction;
    }

    public void setRespectForFaction(long respectForFaction) {
        this.respectForFaction = respectForFaction;
    }

    public long getOneHitKills() {
        return oneHitKills;
    }

    public void setOneHitKills(long oneHitKills) {
        this.oneHitKills = oneHitKills;
    }

    public long getDefendsWon() {
        return defendsWon;
    }

    public void setDefendsWon(long defendsWon) {
        this.defendsWon = defendsWon;
    }

    public long getDefendsLost() {
        return defendsLost;
    }

    public void setDefendsLost(long defendsLost) {
        this.defendsLost = defendsLost;
    }

    public long getDefendsStalemated() {
        return defendsStalemated;
    }

    public void setDefendsStalemated(long defendsStalemated) {
        this.defendsStalemated = defendsStalemated;
    }

    public long getBestDamage() {
        return bestDamage;
    }

    public void setBestDamage(long bestDamage) {
        this.bestDamage = bestDamage;
    }

    public long getRoundsFired() {
        return roundsFired;
    }

    public void setRoundsFired(long roundsFired) {
        this.roundsFired = roundsFired;
    }

    public long getAttacksRunaway() {
        return attacksRunaway;
    }

    public void setAttacksRunaway(long attacksRunaway) {
        this.attacksRunaway = attacksRunaway;
    }

    public long getDefendsRunaway() {
        return defendsRunaway;
    }

    public void setDefendsRunaway(long defendsRunaway) {
        this.defendsRunaway = defendsRunaway;
    }

    public long getHighestBeaten() {
        return highestBeaten;
    }

    public void setHighestBeaten(long highestBeaten) {
        this.highestBeaten = highestBeaten;
    }

    public long getPeopleBusted() {
        return peopleBusted;
    }

    public void setPeopleBusted(long peopleBusted) {
        this.peopleBusted = peopleBusted;
    }

    public long getFailedBusts() {
        return failedBusts;
    }

    public void setFailedBusts(long failedBusts) {
        this.failedBusts = failedBusts;
    }

    public long getPeopleBought() {
        return peopleBought;
    }

    public void setPeopleBought(long peopleBought) {
        this.peopleBought = peopleBought;
    }

    public long getPeopleBoughtSpent() {
        return peopleBoughtSpent;
    }

    public void setPeopleBoughtSpent(long peopleBoughtSpent) {
        this.peopleBoughtSpent = peopleBoughtSpent;
    }

    public long getVirusesCoded() {
        return virusesCoded;
    }

    public void setVirusesCoded(long virusesCoded) {
        this.virusesCoded = virusesCoded;
    }

    public long getCityFinds() {
        return cityFinds;
    }

    public void setCityFinds(long cityFinds) {
        this.cityFinds = cityFinds;
    }

    public long getTravelTimes() {
        return travelTimes;
    }

    public void setTravelTimes(long travelTimes) {
        this.travelTimes = travelTimes;
    }

    public long getBountiesPlaced() {
        return bountiesPlaced;
    }

    public void setBountiesPlaced(long bountiesPlaced) {
        this.bountiesPlaced = bountiesPlaced;
    }

    public long getBountiesReceived() {
        return bountiesReceived;
    }

    public void setBountiesReceived(long bountiesReceived) {
        this.bountiesReceived = bountiesReceived;
    }

    public long getBountiesCollected() {
        return bountiesCollected;
    }

    public void setBountiesCollected(long bountiesCollected) {
        this.bountiesCollected = bountiesCollected;
    }

    public long getTotalBountyReward() {
        return totalBountyReward;
    }

    public void setTotalBountyReward(long totalBountyReward) {
        this.totalBountyReward = totalBountyReward;
    }

    public long getRevives() {
        return revives;
    }

    public void setRevives(long revives) {
        this.revives = revives;
    }

    public long getRevivesReceived() {
        return revivesReceived;
    }

    public void setRevivesReceived(long revivesReceived) {
        this.revivesReceived = revivesReceived;
    }

    public long getMedicalItemsUsed() {
        return medicalItemsUsed;
    }

    public void setMedicalItemsUsed(long medicalItemsUsed) {
        this.medicalItemsUsed = medicalItemsUsed;
    }

    public long getStatEnhancersUsed() {
        return statEnhancersUsed;
    }

    public void setStatEnhancersUsed(long statEnhancersUsed) {
        this.statEnhancersUsed = statEnhancersUsed;
    }

    public long getTrainsReceived() {
        return trainsReceived;
    }

    public void setTrainsReceived(long trainsReceived) {
        this.trainsReceived = trainsReceived;
    }

    public long getTotalBountySpent() {
        return totalBountySpent;
    }

    public void setTotalBountySpent(long totalBountySpent) {
        this.totalBountySpent = totalBountySpent;
    }

    public long getDrugsUsed() {
        return drugsUsed;
    }

    public void setDrugsUsed(long drugsUsed) {
        this.drugsUsed = drugsUsed;
    }

    public long getOverdosed() {
        return overdosed;
    }

    public void setOverdosed(long overdosed) {
        this.overdosed = overdosed;
    }

    public long getMeritsBought() {
        return meritsBought;
    }

    public void setMeritsBought(long meritsBought) {
        this.meritsBought = meritsBought;
    }

    public long getPersonalsPlaced() {
        return personalsPlaced;
    }

    public void setPersonalsPlaced(long personalsPlaced) {
        this.personalsPlaced = personalsPlaced;
    }

    public long getClassifiedAdsPlaced() {
        return classifiedAdsPlaced;
    }

    public void setClassifiedAdsPlaced(long classifiedAdsPlaced) {
        this.classifiedAdsPlaced = classifiedAdsPlaced;
    }

    public long getMailsSent() {
        return mailsSent;
    }

    public void setMailsSent(long mailsSent) {
        this.mailsSent = mailsSent;
    }

    public long getFriendMailsSent() {
        return friendMailsSent;
    }

    public void setFriendMailsSent(long friendMailsSent) {
        this.friendMailsSent = friendMailsSent;
    }

    public long getFactionMailsSent() {
        return factionMailsSent;
    }

    public void setFactionMailsSent(long factionMailsSent) {
        this.factionMailsSent = factionMailsSent;
    }

    public long getCompanyMailsSent() {
        return companyMailsSent;
    }

    public void setCompanyMailsSent(long companyMailsSent) {
        this.companyMailsSent = companyMailsSent;
    }

    public long getSpouseMailsSent() {
        return spouseMailsSent;
    }

    public void setSpouseMailsSent(long spouseMailsSent) {
        this.spouseMailsSent = spouseMailsSent;
    }

    public long getLargestMug() {
        return largestMug;
    }

    public void setLargestMug(long largestMug) {
        this.largestMug = largestMug;
    }

    public long getCannabisTaken() {
        return cannabisTaken;
    }

    public void setCannabisTaken(long cannabisTaken) {
        this.cannabisTaken = cannabisTaken;
    }

    public long getEcstasyTaken() {
        return ecstasyTaken;
    }

    public void setEcstasyTaken(long ecstasyTaken) {
        this.ecstasyTaken = ecstasyTaken;
    }

    public long getKetamineTaken() {
        return ketamineTaken;
    }

    public void setKetamineTaken(long ketamineTaken) {
        this.ketamineTaken = ketamineTaken;
    }

    public long getLsdTaken() {
        return lsdTaken;
    }

    public void setLsdTaken(long lsdTaken) {
        this.lsdTaken = lsdTaken;
    }

    public long getOpiumTaken() {
        return opiumTaken;
    }

    public void setOpiumTaken(long opiumTaken) {
        this.opiumTaken = opiumTaken;
    }

    public long getShroomsTaken() {
        return shroomsTaken;
    }

    public void setShroomsTaken(long shroomsTaken) {
        this.shroomsTaken = shroomsTaken;
    }

    public long getSpeedTaken() {
        return speedTaken;
    }

    public void setSpeedTaken(long speedTaken) {
        this.speedTaken = speedTaken;
    }

    public long getPcpTaken() {
        return pcpTaken;
    }

    public void setPcpTaken(long pcpTaken) {
        this.pcpTaken = pcpTaken;
    }

    public long getXanaxTaken() {
        return xanaxTaken;
    }

    public void setXanaxTaken(long xanaxTaken) {
        this.xanaxTaken = xanaxTaken;
    }

    public long getVicodinTaken() {
        return vicodinTaken;
    }

    public void setVicodinTaken(long vicodinTaken) {
        this.vicodinTaken = vicodinTaken;
    }

    public long getMechanicalHits() {
        return mechanicalHits;
    }

    public void setMechanicalHits(long mechanicalHits) {
        this.mechanicalHits = mechanicalHits;
    }

    public long getHeavyArtilleryHits() {
        return heavyArtilleryHits;
    }

    public void setHeavyArtilleryHits(long heavyArtilleryHits) {
        this.heavyArtilleryHits = heavyArtilleryHits;
    }

    public long getClubbingHits() {
        return clubbingHits;
    }

    public void setClubbingHits(long clubbingHits) {
        this.clubbingHits = clubbingHits;
    }

    public long getTemporaryHits() {
        return temporaryHits;
    }

    public void setTemporaryHits(long temporaryHits) {
        this.temporaryHits = temporaryHits;
    }

    public long getMachineGunHits() {
        return machineGunHits;
    }

    public void setMachineGunHits(long machineGunHits) {
        this.machineGunHits = machineGunHits;
    }

    public long getPistolHits() {
        return pistolHits;
    }

    public void setPistolHits(long pistolHits) {
        this.pistolHits = pistolHits;
    }

    public long getRifleHits() {
        return rifleHits;
    }

    public void setRifleHits(long rifleHits) {
        this.rifleHits = rifleHits;
    }

    public long getShotgunHits() {
        return shotgunHits;
    }

    public void setShotgunHits(long shotgunHits) {
        this.shotgunHits = shotgunHits;
    }

    public long getSubMachineGunHits() {
        return subMachineGunHits;
    }

    public void setSubMachineGunHits(long subMachineGunHits) {
        this.subMachineGunHits = subMachineGunHits;
    }

    public long getPiercingHits() {
        return piercingHits;
    }

    public void setPiercingHits(long piercingHits) {
        this.piercingHits = piercingHits;
    }

    public long getSlashingHits() {
        return slashingHits;
    }

    public void setSlashingHits(long slashingHits) {
        this.slashingHits = slashingHits;
    }

    public long getArgentinaTravel() {
        return argentinaTravel;
    }

    public void setArgentinaTravel(long argentinaTravel) {
        this.argentinaTravel = argentinaTravel;
    }

    public long getMexicoTravel() {
        return mexicoTravel;
    }

    public void setMexicoTravel(long mexicoTravel) {
        this.mexicoTravel = mexicoTravel;
    }

    public long getUnitedArabEmiratesTravel() {
        return unitedArabEmiratesTravel;
    }

    public void setUnitedArabEmiratesTravel(long unitedArabEmiratesTravel) {
        this.unitedArabEmiratesTravel = unitedArabEmiratesTravel;
    }

    public long getHawaiiTravel() {
        return hawaiiTravel;
    }

    public void setHawaiiTravel(long hawaiiTravel) {
        this.hawaiiTravel = hawaiiTravel;
    }

    public long getJapanTravel() {
        return japanTravel;
    }

    public void setJapanTravel(long japanTravel) {
        this.japanTravel = japanTravel;
    }

    public long getUnitedKingdomTravel() {
        return unitedKingdomTravel;
    }

    public void setUnitedKingdomTravel(long unitedKingdomTravel) {
        this.unitedKingdomTravel = unitedKingdomTravel;
    }

    public long getSouthAfricaTravel() {
        return southAfricaTravel;
    }

    public void setSouthAfricaTravel(long southAfricaTravel) {
        this.southAfricaTravel = southAfricaTravel;
    }

    public long getSwitzerlandTravel() {
        return switzerlandTravel;
    }

    public void setSwitzerlandTravel(long switzerlandTravel) {
        this.switzerlandTravel = switzerlandTravel;
    }

    public long getChinaTravel() {
        return chinaTravel;
    }

    public void setChinaTravel(long chinaTravel) {
        this.chinaTravel = chinaTravel;
    }

    public long getCanadaTravel() {
        return canadaTravel;
    }

    public void setCanadaTravel(long canadaTravel) {
        this.canadaTravel = canadaTravel;
    }

    public long getDumpFinds() {
        return dumpFinds;
    }

    public void setDumpFinds(long dumpFinds) {
        this.dumpFinds = dumpFinds;
    }

    public long getDumpSearches() {
        return dumpSearches;
    }

    public void setDumpSearches(long dumpSearches) {
        this.dumpSearches = dumpSearches;
    }

    public long getItemsDumped() {
        return itemsDumped;
    }

    public void setItemsDumped(long itemsDumped) {
        this.itemsDumped = itemsDumped;
    }

    public Duration getDaysBeenDonator() {
        return daysBeenDonator;
    }

    public void setDaysBeenDonator(Duration daysBeenDonator) {
        this.daysBeenDonator = daysBeenDonator;
    }

    public long getCaymanIslandsTravel() {
        return caymanIslandsTravel;
    }

    public void setCaymanIslandsTravel(long caymanIslandsTravel) {
        this.caymanIslandsTravel = caymanIslandsTravel;
    }

    public long getJailed() {
        return jailed;
    }

    public void setJailed(long jailed) {
        this.jailed = jailed;
    }

    public long getHospital() {
        return hospital;
    }

    public void setHospital(long hospital) {
        this.hospital = hospital;
    }

    public long getAttacksAssisted() {
        return attacksAssisted;
    }

    public void setAttacksAssisted(long attacksAssisted) {
        this.attacksAssisted = attacksAssisted;
    }

    public long getBloodWithdrawn() {
        return bloodWithdrawn;
    }

    public void setBloodWithdrawn(long bloodWithdrawn) {
        this.bloodWithdrawn = bloodWithdrawn;
    }

    public long getNetworth() {
        return networth;
    }

    public void setNetworth(long networth) {
        this.networth = networth;
    }

    public long getMissionsCompleted() {
        return missionsCompleted;
    }

    public void setMissionsCompleted(long missionsCompleted) {
        this.missionsCompleted = missionsCompleted;
    }

    public long getContractsCompleted() {
        return contractsCompleted;
    }

    public void setContractsCompleted(long contractsCompleted) {
        this.contractsCompleted = contractsCompleted;
    }

    public long getDukeContractsCompleted() {
        return dukeContractsCompleted;
    }

    public void setDukeContractsCompleted(long dukeContractsCompleted) {
        this.dukeContractsCompleted = dukeContractsCompleted;
    }

    public long getMissionCreditsEarned() {
        return missionCreditsEarned;
    }

    public void setMissionCreditsEarned(long missionCreditsEarned) {
        this.missionCreditsEarned = missionCreditsEarned;
    }

    public long getConsumablesUsed() {
        return consumablesUsed;
    }

    public void setConsumablesUsed(long consumablesUsed) {
        this.consumablesUsed = consumablesUsed;
    }

    public long getCandyUsed() {
        return candyUsed;
    }

    public void setCandyUsed(long candyUsed) {
        this.candyUsed = candyUsed;
    }

    public long getAlcoholUsed() {
        return alcoholUsed;
    }

    public void setAlcoholUsed(long alcoholUsed) {
        this.alcoholUsed = alcoholUsed;
    }

    public long getEnergyDrinkUsed() {
        return energyDrinkUsed;
    }

    public void setEnergyDrinkUsed(long energyDrinkUsed) {
        this.energyDrinkUsed = energyDrinkUsed;
    }

    public long getNerveRefills() {
        return nerveRefills;
    }

    public void setNerveRefills(long nerveRefills) {
        this.nerveRefills = nerveRefills;
    }

    public long getUnarmoredWon() {
        return unarmoredWon;
    }

    public void setUnarmoredWon(long unarmoredWon) {
        this.unarmoredWon = unarmoredWon;
    }

    public long getHandToHandHits() {
        return handToHandHits;
    }

    public void setHandToHandHits(long handToHandHits) {
        this.handToHandHits = handToHandHits;
    }

    public long getOrganisedCrimes() {
        return organisedCrimes;
    }

    public void setOrganisedCrimes(long organisedCrimes) {
        this.organisedCrimes = organisedCrimes;
    }

    public Duration getTerritoryTime() {
        return territoryTime;
    }

    public void setTerritoryTime(Duration territoryTime) {
        this.territoryTime = territoryTime;
    }

    public long getTerritoryJoins() {
        return territoryJoins;
    }

    public void setTerritoryJoins(long territoryJoins) {
        this.territoryJoins = territoryJoins;
    }

    public long getStockPayouts() {
        return stockPayouts;
    }

    public void setStockPayouts(long stockPayouts) {
        this.stockPayouts = stockPayouts;
    }

    public long getStockProfits() {
        return stockProfits;
    }

    public void setStockProfits(long stockProfits) {
        this.stockProfits = stockProfits;
    }

    public long getStockLosses() {
        return stockLosses;
    }

    public void setStockLosses(long stockLosses) {
        this.stockLosses = stockLosses;
    }

    public long getStockFees() {
        return stockFees;
    }

    public void setStockFees(long stockFees) {
        this.stockFees = stockFees;
    }

    public long getArrestsMade() {
        return arrestsMade;
    }

    public void setArrestsMade(long arrestsMade) {
        this.arrestsMade = arrestsMade;
    }

    public long getTokenRefills() {
        return tokenRefills;
    }

    public void setTokenRefills(long tokenRefills) {
        this.tokenRefills = tokenRefills;
    }

    public long getBooksRead() {
        return booksRead;
    }

    public void setBooksRead(long booksRead) {
        this.booksRead = booksRead;
    }

    public Duration getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(Duration travelTime) {
        this.travelTime = travelTime;
    }

    public long getBoostersUsed() {
        return boostersUsed;
    }

    public void setBoostersUsed(long boostersUsed) {
        this.boostersUsed = boostersUsed;
    }

    public long getRehabs() {
        return rehabs;
    }

    public void setRehabs(long rehabs) {
        this.rehabs = rehabs;
    }

    public long getRehabCost() {
        return rehabCost;
    }

    public void setRehabCost(long rehabCost) {
        this.rehabCost = rehabCost;
    }

    public long getAwards() {
        return awards;
    }

    public void setAwards(long awards) {
        this.awards = awards;
    }

    public long getReceivedBountyValue() {
        return receivedBountyValue;
    }

    public void setReceivedBountyValue(long receivedBountyValue) {
        this.receivedBountyValue = receivedBountyValue;
    }

    public long getNetworthPending() {
        return networthPending;
    }

    public void setNetworthPending(long networthPending) {
        this.networthPending = networthPending;
    }

    public long getNetworthWallet() {
        return networthWallet;
    }

    public void setNetworthWallet(long networthWallet) {
        this.networthWallet = networthWallet;
    }

    public long getNetworthBank() {
        return networthBank;
    }

    public void setNetworthBank(long networthBank) {
        this.networthBank = networthBank;
    }

    public long getNetworthPoints() {
        return networthPoints;
    }

    public void setNetworthPoints(long networthPoints) {
        this.networthPoints = networthPoints;
    }

    public long getNetworthCayman() {
        return networthCayman;
    }

    public void setNetworthCayman(long networthCayman) {
        this.networthCayman = networthCayman;
    }

    public long getNetworthVault() {
        return networthVault;
    }

    public void setNetworthVault(long networthVault) {
        this.networthVault = networthVault;
    }

    public long getNetworthPiggyBank() {
        return networthPiggyBank;
    }

    public void setNetworthPiggyBank(long networthPiggyBank) {
        this.networthPiggyBank = networthPiggyBank;
    }

    public long getNetworthItems() {
        return networthItems;
    }

    public void setNetworthItems(long networthItems) {
        this.networthItems = networthItems;
    }

    public long getNetworthDisplayCase() {
        return networthDisplayCase;
    }

    public void setNetworthDisplayCase(long networthDisplayCase) {
        this.networthDisplayCase = networthDisplayCase;
    }

    public long getNetworthBazaar() {
        return networthBazaar;
    }

    public void setNetworthBazaar(long networthBazaar) {
        this.networthBazaar = networthBazaar;
    }

    public long getNetworthProperties() {
        return networthProperties;
    }

    public void setNetworthProperties(long networthProperties) {
        this.networthProperties = networthProperties;
    }

    public long getNetworthStockMarket() {
        return networthStockMarket;
    }

    public void setNetworthStockMarket(long networthStockMarket) {
        this.networthStockMarket = networthStockMarket;
    }

    public long getNetworthItemMarket() {
        return networthItemMarket;
    }

    public void setNetworthItemMarket(long networthItemMarket) {
        this.networthItemMarket = networthItemMarket;
    }

    public long getNetworthAuctionHouse() {
        return networthAuctionHouse;
    }

    public void setNetworthAuctionHouse(long networthAuctionHouse) {
        this.networthAuctionHouse = networthAuctionHouse;
    }

    public long getNetworthCompany() {
        return networthCompany;
    }

    public void setNetworthCompany(long networthCompany) {
        this.networthCompany = networthCompany;
    }

    public long getNetworthBookie() {
        return networthBookie;
    }

    public void setNetworthBookie(long networthBookie) {
        this.networthBookie = networthBookie;
    }

    public long getNetworthenListedCars() {
        return networthenListedCars;
    }

    public void setNetworthenListedCars(long networthenListedCars) {
        this.networthenListedCars = networthenListedCars;
    }

    public long getNetworthLoan() {
        return networthLoan;
    }

    public void setNetworthLoan(long networthLoan) {
        this.networthLoan = networthLoan;
    }

    public long getNetworthUnpaidFees() {
        return networthUnpaidFees;
    }

    public void setNetworthUnpaidFees(long networthUnpaidFees) {
        this.networthUnpaidFees = networthUnpaidFees;
    }

    public long getRacingSkill() {
        return racingSkill;
    }

    public void setRacingSkill(long racingSkill) {
        this.racingSkill = racingSkill;
    }

    public long getRacesWon() {
        return racesWon;
    }

    public void setRacesWon(long racesWon) {
        this.racesWon = racesWon;
    }

    public long getRacesEntered() {
        return racesEntered;
    }

    public void setRacesEntered(long racesEntered) {
        this.racesEntered = racesEntered;
    }

    public long getRacingPointsEarned() {
        return racingPointsEarned;
    }

    public void setRacingPointsEarned(long racingPointsEarned) {
        this.racingPointsEarned = racingPointsEarned;
    }

    public long getSpecialAmmoUsed() {
        return specialAmmoUsed;
    }

    public void setSpecialAmmoUsed(long specialAmmoUsed) {
        this.specialAmmoUsed = specialAmmoUsed;
    }

    public long getCityItemsBought() {
        return cityItemsBought;
    }

    public void setCityItemsBought(long cityItemsBought) {
        this.cityItemsBought = cityItemsBought;
    }

    public long getHollowAmmoUsed() {
        return hollowAmmoUsed;
    }

    public void setHollowAmmoUsed(long hollowAmmoUsed) {
        this.hollowAmmoUsed = hollowAmmoUsed;
    }

    public long getTracerAmmoUsed() {
        return tracerAmmoUsed;
    }

    public void setTracerAmmoUsed(long tracerAmmoUsed) {
        this.tracerAmmoUsed = tracerAmmoUsed;
    }

    public long getPiercingAmmoUsed() {
        return piercingAmmoUsed;
    }

    public void setPiercingAmmoUsed(long piercingAmmoUsed) {
        this.piercingAmmoUsed = piercingAmmoUsed;
    }

    public long getIncendiaryAmmoUsed() {
        return incendiaryAmmoUsed;
    }

    public void setIncendiaryAmmoUsed(long incendiaryAmmoUsed) {
        this.incendiaryAmmoUsed = incendiaryAmmoUsed;
    }

    public long getAttacksWonAbroad() {
        return attacksWonAbroad;
    }

    public void setAttacksWonAbroad(long attacksWonAbroad) {
        this.attacksWonAbroad = attacksWonAbroad;
    }

    public long getDefendsLostAbroad() {
        return defendsLostAbroad;
    }

    public void setDefendsLostAbroad(long defendsLostAbroad) {
        this.defendsLostAbroad = defendsLostAbroad;
    }

    public long getRetals() {
        return retals;
    }

    public void setRetals(long retals) {
        this.retals = retals;
    }

    public long getElo() {
        return elo;
    }

    public void setElo(long elo) {
        this.elo = elo;
    }

    public long getStrength() {
        return strength;
    }

    public void setStrength(long strength) {
        this.strength = strength;
    }

    public long getDefense() {
        return defense;
    }

    public void setDefense(long defense) {
        this.defense = defense;
    }

    public long getSpeed() {
        return speed;
    }

    public void setSpeed(long speed) {
        this.speed = speed;
    }

    public long getDexterity() {
        return dexterity;
    }

    public void setDexterity(long dexterity) {
        this.dexterity = dexterity;
    }

    public long getTotalStats() {
        return totalStats;
    }

    public void setTotalStats(long totalStats) {
        this.totalStats = totalStats;
    }

    public long getManualLabor() {
        return manualLabor;
    }

    public void setManualLabor(long manualLabor) {
        this.manualLabor = manualLabor;
    }

    public long getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(long intelligence) {
        this.intelligence = intelligence;
    }

    public long getEndurance() {
        return endurance;
    }

    public void setEndurance(long endurance) {
        this.endurance = endurance;
    }

    public long getTotalWorkingStats() {
        return totalWorkingStats;
    }

    public void setTotalWorkingStats(long totalWorkingStats) {
        this.totalWorkingStats = totalWorkingStats;
    }

    public long getJobPointsUsed() {
        return jobPointsUsed;
    }

    public void setJobPointsUsed(long jobPointsUsed) {
        this.jobPointsUsed = jobPointsUsed;
    }

    public long getReviveSkill() {
        return reviveSkill;
    }

    public void setReviveSkill(long reviveSkill) {
        this.reviveSkill = reviveSkill;
    }

    public long getItemsLooted() {
        return itemsLooted;
    }

    public void setItemsLooted(long itemsLooted) {
        this.itemsLooted = itemsLooted;
    }

    public long getEnergyRefills() {
        return energyRefills;
    }

    public void setEnergyRefills(long energyRefills) {
        this.energyRefills = energyRefills;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonalStats that = (PersonalStats) o;
        return bazaarCustomers == that.bazaarCustomers && bazaarSales == that.bazaarSales && bazaarProfit == that.bazaarProfit && activeStreak == that.activeStreak && bestActiveStreak == that.bestActiveStreak && itemsBought == that.itemsBought && pointsBought == that.pointsBought && itemsBoughtAbroad == that.itemsBoughtAbroad && moneyInvested == that.moneyInvested && investedProfit == that.investedProfit && weaponsBought == that.weaponsBought && trades == that.trades && itemsSent == that.itemsSent && auctionsWon == that.auctionsWon && auctionSells == that.auctionSells && pointsSold == that.pointsSold && attacksWon == that.attacksWon && attacksLost == that.attacksLost && attacksDraw == that.attacksDraw && bestKillStreak == that.bestKillStreak && killStreak == that.killStreak && moneyMugged == that.moneyMugged && attacksStealthed == that.attacksStealthed && attackHits == that.attackHits && attackMisses == that.attackMisses && attackDamage == that.attackDamage && attackCriticalHits == that.attackCriticalHits && respectForFaction == that.respectForFaction && oneHitKills == that.oneHitKills && defendsWon == that.defendsWon && defendsLost == that.defendsLost && defendsStalemated == that.defendsStalemated && bestDamage == that.bestDamage && roundsFired == that.roundsFired && attacksRunaway == that.attacksRunaway && defendsRunaway == that.defendsRunaway && highestBeaten == that.highestBeaten && peopleBusted == that.peopleBusted && failedBusts == that.failedBusts && peopleBought == that.peopleBought && peopleBoughtSpent == that.peopleBoughtSpent && virusesCoded == that.virusesCoded && cityFinds == that.cityFinds && travelTimes == that.travelTimes && bountiesPlaced == that.bountiesPlaced && bountiesReceived == that.bountiesReceived && bountiesCollected == that.bountiesCollected && totalBountyReward == that.totalBountyReward && revives == that.revives && revivesReceived == that.revivesReceived && medicalItemsUsed == that.medicalItemsUsed && statEnhancersUsed == that.statEnhancersUsed && trainsReceived == that.trainsReceived && totalBountySpent == that.totalBountySpent && drugsUsed == that.drugsUsed && overdosed == that.overdosed && meritsBought == that.meritsBought && personalsPlaced == that.personalsPlaced && classifiedAdsPlaced == that.classifiedAdsPlaced && mailsSent == that.mailsSent && friendMailsSent == that.friendMailsSent && factionMailsSent == that.factionMailsSent && companyMailsSent == that.companyMailsSent && spouseMailsSent == that.spouseMailsSent && largestMug == that.largestMug && cannabisTaken == that.cannabisTaken && ecstasyTaken == that.ecstasyTaken && ketamineTaken == that.ketamineTaken && lsdTaken == that.lsdTaken && opiumTaken == that.opiumTaken && shroomsTaken == that.shroomsTaken && speedTaken == that.speedTaken && pcpTaken == that.pcpTaken && xanaxTaken == that.xanaxTaken && vicodinTaken == that.vicodinTaken && mechanicalHits == that.mechanicalHits && heavyArtilleryHits == that.heavyArtilleryHits && clubbingHits == that.clubbingHits && temporaryHits == that.temporaryHits && machineGunHits == that.machineGunHits && pistolHits == that.pistolHits && rifleHits == that.rifleHits && shotgunHits == that.shotgunHits && subMachineGunHits == that.subMachineGunHits && piercingHits == that.piercingHits && slashingHits == that.slashingHits && argentinaTravel == that.argentinaTravel && mexicoTravel == that.mexicoTravel && unitedArabEmiratesTravel == that.unitedArabEmiratesTravel && hawaiiTravel == that.hawaiiTravel && japanTravel == that.japanTravel && unitedKingdomTravel == that.unitedKingdomTravel && southAfricaTravel == that.southAfricaTravel && switzerlandTravel == that.switzerlandTravel && chinaTravel == that.chinaTravel && canadaTravel == that.canadaTravel && dumpFinds == that.dumpFinds && dumpSearches == that.dumpSearches && itemsDumped == that.itemsDumped && caymanIslandsTravel == that.caymanIslandsTravel && jailed == that.jailed && hospital == that.hospital && attacksAssisted == that.attacksAssisted && bloodWithdrawn == that.bloodWithdrawn && networth == that.networth && missionsCompleted == that.missionsCompleted && contractsCompleted == that.contractsCompleted && dukeContractsCompleted == that.dukeContractsCompleted && missionCreditsEarned == that.missionCreditsEarned && consumablesUsed == that.consumablesUsed && candyUsed == that.candyUsed && alcoholUsed == that.alcoholUsed && energyDrinkUsed == that.energyDrinkUsed && nerveRefills == that.nerveRefills && unarmoredWon == that.unarmoredWon && handToHandHits == that.handToHandHits && organisedCrimes == that.organisedCrimes && territoryJoins == that.territoryJoins && stockPayouts == that.stockPayouts && stockProfits == that.stockProfits && stockLosses == that.stockLosses && stockFees == that.stockFees && arrestsMade == that.arrestsMade && tokenRefills == that.tokenRefills && booksRead == that.booksRead && boostersUsed == that.boostersUsed && rehabs == that.rehabs && rehabCost == that.rehabCost && awards == that.awards && receivedBountyValue == that.receivedBountyValue && networthPending == that.networthPending && networthWallet == that.networthWallet && networthBank == that.networthBank && networthPoints == that.networthPoints && networthCayman == that.networthCayman && networthVault == that.networthVault && networthPiggyBank == that.networthPiggyBank && networthItems == that.networthItems && networthDisplayCase == that.networthDisplayCase && networthBazaar == that.networthBazaar && networthProperties == that.networthProperties && networthStockMarket == that.networthStockMarket && networthItemMarket == that.networthItemMarket && networthAuctionHouse == that.networthAuctionHouse && networthCompany == that.networthCompany && networthBookie == that.networthBookie && networthenListedCars == that.networthenListedCars && networthLoan == that.networthLoan && networthUnpaidFees == that.networthUnpaidFees && racingSkill == that.racingSkill && racesWon == that.racesWon && racesEntered == that.racesEntered && racingPointsEarned == that.racingPointsEarned && specialAmmoUsed == that.specialAmmoUsed && cityItemsBought == that.cityItemsBought && hollowAmmoUsed == that.hollowAmmoUsed && tracerAmmoUsed == that.tracerAmmoUsed && piercingAmmoUsed == that.piercingAmmoUsed && incendiaryAmmoUsed == that.incendiaryAmmoUsed && attacksWonAbroad == that.attacksWonAbroad && defendsLostAbroad == that.defendsLostAbroad && retals == that.retals && elo == that.elo && strength == that.strength && defense == that.defense && speed == that.speed && dexterity == that.dexterity && totalStats == that.totalStats && manualLabor == that.manualLabor && intelligence == that.intelligence && endurance == that.endurance && totalWorkingStats == that.totalWorkingStats && jobPointsUsed == that.jobPointsUsed && reviveSkill == that.reviveSkill && itemsLooted == that.itemsLooted && energyRefills == that.energyRefills && Objects.equals(userActivity, that.userActivity) && Objects.equals(daysBeenDonator, that.daysBeenDonator) && Objects.equals(territoryTime, that.territoryTime) && Objects.equals(travelTime, that.travelTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bazaarCustomers, bazaarSales, bazaarProfit, userActivity, activeStreak, bestActiveStreak, itemsBought, pointsBought, itemsBoughtAbroad, moneyInvested, investedProfit, weaponsBought, trades, itemsSent, auctionsWon, auctionSells, pointsSold, attacksWon, attacksLost, attacksDraw, bestKillStreak, killStreak, moneyMugged, attacksStealthed, attackHits, attackMisses, attackDamage, attackCriticalHits, respectForFaction, oneHitKills, defendsWon, defendsLost, defendsStalemated, bestDamage, roundsFired, attacksRunaway, defendsRunaway, highestBeaten, peopleBusted, failedBusts, peopleBought, peopleBoughtSpent, virusesCoded, cityFinds, travelTimes, bountiesPlaced, bountiesReceived, bountiesCollected, totalBountyReward, revives, revivesReceived, medicalItemsUsed, statEnhancersUsed, trainsReceived, totalBountySpent, drugsUsed, overdosed, meritsBought, personalsPlaced, classifiedAdsPlaced, mailsSent, friendMailsSent, factionMailsSent, companyMailsSent, spouseMailsSent, largestMug, cannabisTaken, ecstasyTaken, ketamineTaken, lsdTaken, opiumTaken, shroomsTaken, speedTaken, pcpTaken, xanaxTaken, vicodinTaken, mechanicalHits, heavyArtilleryHits, clubbingHits, temporaryHits, machineGunHits, pistolHits, rifleHits, shotgunHits, subMachineGunHits, piercingHits, slashingHits, argentinaTravel, mexicoTravel, unitedArabEmiratesTravel, hawaiiTravel, japanTravel, unitedKingdomTravel, southAfricaTravel, switzerlandTravel, chinaTravel, canadaTravel, dumpFinds, dumpSearches, itemsDumped, daysBeenDonator, caymanIslandsTravel, jailed, hospital, attacksAssisted, bloodWithdrawn, networth, missionsCompleted, contractsCompleted, dukeContractsCompleted, missionCreditsEarned, consumablesUsed, candyUsed, alcoholUsed, energyDrinkUsed, nerveRefills, unarmoredWon, handToHandHits, organisedCrimes, territoryTime, territoryJoins, stockPayouts, stockProfits, stockLosses, stockFees, arrestsMade, tokenRefills, booksRead, travelTime, boostersUsed, rehabs, rehabCost, awards, receivedBountyValue, networthPending, networthWallet, networthBank, networthPoints, networthCayman, networthVault, networthPiggyBank, networthItems, networthDisplayCase, networthBazaar, networthProperties, networthStockMarket, networthItemMarket, networthAuctionHouse, networthCompany, networthBookie, networthenListedCars, networthLoan, networthUnpaidFees, racingSkill, racesWon, racesEntered, racingPointsEarned, specialAmmoUsed, cityItemsBought, hollowAmmoUsed, tracerAmmoUsed, piercingAmmoUsed, incendiaryAmmoUsed, attacksWonAbroad, defendsLostAbroad, retals, elo, strength, defense, speed, dexterity, totalStats, manualLabor, intelligence, endurance, totalWorkingStats, jobPointsUsed, reviveSkill, itemsLooted, energyRefills);
    }

}
