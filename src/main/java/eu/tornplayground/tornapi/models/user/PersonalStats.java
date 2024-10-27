package eu.tornplayground.tornapi.models.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.converters.DayDurationConverter;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.Duration;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = false)
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

}
