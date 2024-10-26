package eu.tornplayground.tornapi.models.user;

import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.converters.DayDurationConverter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.Duration;
import java.util.Objects;

@Getter
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonalStats)) return false;
        PersonalStats that = (PersonalStats) o;
        return bazaarCustomers == that.bazaarCustomers && bazaarSales == that.bazaarSales && bazaarProfit == that.bazaarProfit && activeStreak == that.activeStreak && bestActiveStreak == that.bestActiveStreak && itemsBought == that.itemsBought && pointsBought == that.pointsBought && itemsBoughtAbroad == that.itemsBoughtAbroad && moneyInvested == that.moneyInvested && investedProfit == that.investedProfit && weaponsBought == that.weaponsBought && trades == that.trades && itemsSent == that.itemsSent && auctionsWon == that.auctionsWon && auctionSells == that.auctionSells && pointsSold == that.pointsSold && attacksWon == that.attacksWon && attacksLost == that.attacksLost && attacksDraw == that.attacksDraw && bestKillStreak == that.bestKillStreak && killStreak == that.killStreak && moneyMugged == that.moneyMugged && attacksStealthed == that.attacksStealthed && attackHits == that.attackHits && attackMisses == that.attackMisses && attackDamage == that.attackDamage && attackCriticalHits == that.attackCriticalHits && respectForFaction == that.respectForFaction && oneHitKills == that.oneHitKills && defendsWon == that.defendsWon && defendsLost == that.defendsLost && defendsStalemated == that.defendsStalemated && bestDamage == that.bestDamage && roundsFired == that.roundsFired && attacksRunaway == that.attacksRunaway && defendsRunaway == that.defendsRunaway && highestBeaten == that.highestBeaten && peopleBusted == that.peopleBusted && failedBusts == that.failedBusts && peopleBought == that.peopleBought && peopleBoughtSpent == that.peopleBoughtSpent && virusesCoded == that.virusesCoded && cityFinds == that.cityFinds && travelTimes == that.travelTimes && bountiesPlaced == that.bountiesPlaced && bountiesReceived == that.bountiesReceived && bountiesCollected == that.bountiesCollected && totalBountyReward == that.totalBountyReward && revives == that.revives && revivesReceived == that.revivesReceived && medicalItemsUsed == that.medicalItemsUsed && statEnhancersUsed == that.statEnhancersUsed && trainsReceived == that.trainsReceived && totalBountySpent == that.totalBountySpent && drugsUsed == that.drugsUsed && overdosed == that.overdosed && meritsBought == that.meritsBought && personalsPlaced == that.personalsPlaced && classifiedAdsPlaced == that.classifiedAdsPlaced && mailsSent == that.mailsSent && friendMailsSent == that.friendMailsSent && factionMailsSent == that.factionMailsSent && companyMailsSent == that.companyMailsSent && spouseMailsSent == that.spouseMailsSent && largestMug == that.largestMug && cannabisTaken == that.cannabisTaken && ecstasyTaken == that.ecstasyTaken && ketamineTaken == that.ketamineTaken && lsdTaken == that.lsdTaken && opiumTaken == that.opiumTaken && shroomsTaken == that.shroomsTaken && speedTaken == that.speedTaken && pcpTaken == that.pcpTaken && xanaxTaken == that.xanaxTaken && vicodinTaken == that.vicodinTaken && mechanicalHits == that.mechanicalHits && heavyArtilleryHits == that.heavyArtilleryHits && clubbingHits == that.clubbingHits && temporaryHits == that.temporaryHits && machineGunHits == that.machineGunHits && pistolHits == that.pistolHits && rifleHits == that.rifleHits && shotgunHits == that.shotgunHits && subMachineGunHits == that.subMachineGunHits && piercingHits == that.piercingHits && slashingHits == that.slashingHits && argentinaTravel == that.argentinaTravel && mexicoTravel == that.mexicoTravel && unitedArabEmiratesTravel == that.unitedArabEmiratesTravel && hawaiiTravel == that.hawaiiTravel && japanTravel == that.japanTravel && unitedKingdomTravel == that.unitedKingdomTravel && southAfricaTravel == that.southAfricaTravel && switzerlandTravel == that.switzerlandTravel && chinaTravel == that.chinaTravel && canadaTravel == that.canadaTravel && dumpFinds == that.dumpFinds && dumpSearches == that.dumpSearches && itemsDumped == that.itemsDumped && caymanIslandsTravel == that.caymanIslandsTravel && jailed == that.jailed && hospital == that.hospital && attacksAssisted == that.attacksAssisted && bloodWithdrawn == that.bloodWithdrawn && networth == that.networth && missionsCompleted == that.missionsCompleted && contractsCompleted == that.contractsCompleted && dukeContractsCompleted == that.dukeContractsCompleted && missionCreditsEarned == that.missionCreditsEarned && consumablesUsed == that.consumablesUsed && candyUsed == that.candyUsed && alcoholUsed == that.alcoholUsed && energyDrinkUsed == that.energyDrinkUsed && nerveRefills == that.nerveRefills && unarmoredWon == that.unarmoredWon && handToHandHits == that.handToHandHits && organisedCrimes == that.organisedCrimes && territoryJoins == that.territoryJoins && stockPayouts == that.stockPayouts && stockProfits == that.stockProfits && stockLosses == that.stockLosses && stockFees == that.stockFees && arrestsMade == that.arrestsMade && tokenRefills == that.tokenRefills && booksRead == that.booksRead && boostersUsed == that.boostersUsed && rehabs == that.rehabs && rehabCost == that.rehabCost && awards == that.awards && receivedBountyValue == that.receivedBountyValue && networthPending == that.networthPending && networthWallet == that.networthWallet && networthBank == that.networthBank && networthPoints == that.networthPoints && networthCayman == that.networthCayman && networthVault == that.networthVault && networthPiggyBank == that.networthPiggyBank && networthItems == that.networthItems && networthDisplayCase == that.networthDisplayCase && networthBazaar == that.networthBazaar && networthProperties == that.networthProperties && networthStockMarket == that.networthStockMarket && networthItemMarket == that.networthItemMarket && networthAuctionHouse == that.networthAuctionHouse && networthCompany == that.networthCompany && networthBookie == that.networthBookie && networthenListedCars == that.networthenListedCars && networthLoan == that.networthLoan && networthUnpaidFees == that.networthUnpaidFees && racingSkill == that.racingSkill && racesWon == that.racesWon && racesEntered == that.racesEntered && racingPointsEarned == that.racingPointsEarned && specialAmmoUsed == that.specialAmmoUsed && cityItemsBought == that.cityItemsBought && hollowAmmoUsed == that.hollowAmmoUsed && tracerAmmoUsed == that.tracerAmmoUsed && piercingAmmoUsed == that.piercingAmmoUsed && incendiaryAmmoUsed == that.incendiaryAmmoUsed && attacksWonAbroad == that.attacksWonAbroad && defendsLostAbroad == that.defendsLostAbroad && retals == that.retals && elo == that.elo && strength == that.strength && defense == that.defense && speed == that.speed && dexterity == that.dexterity && totalStats == that.totalStats && manualLabor == that.manualLabor && intelligence == that.intelligence && endurance == that.endurance && totalWorkingStats == that.totalWorkingStats && jobPointsUsed == that.jobPointsUsed && reviveSkill == that.reviveSkill && itemsLooted == that.itemsLooted && energyRefills == that.energyRefills && Objects.equals(userActivity, that.userActivity) && Objects.equals(daysBeenDonator, that.daysBeenDonator) && Objects.equals(territoryTime, that.territoryTime) && Objects.equals(travelTime, that.travelTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bazaarCustomers, bazaarSales, bazaarProfit, userActivity, activeStreak, bestActiveStreak, itemsBought, pointsBought, itemsBoughtAbroad, moneyInvested, investedProfit, weaponsBought, trades, itemsSent, auctionsWon, auctionSells, pointsSold, attacksWon, attacksLost, attacksDraw, bestKillStreak, killStreak, moneyMugged, attacksStealthed, attackHits, attackMisses, attackDamage, attackCriticalHits, respectForFaction, oneHitKills, defendsWon, defendsLost, defendsStalemated, bestDamage, roundsFired, attacksRunaway, defendsRunaway, highestBeaten, peopleBusted, failedBusts, peopleBought, peopleBoughtSpent, virusesCoded, cityFinds, travelTimes, bountiesPlaced, bountiesReceived, bountiesCollected, totalBountyReward, revives, revivesReceived, medicalItemsUsed, statEnhancersUsed, trainsReceived, totalBountySpent, drugsUsed, overdosed, meritsBought, personalsPlaced, classifiedAdsPlaced, mailsSent, friendMailsSent, factionMailsSent, companyMailsSent, spouseMailsSent, largestMug, cannabisTaken, ecstasyTaken, ketamineTaken, lsdTaken, opiumTaken, shroomsTaken, speedTaken, pcpTaken, xanaxTaken, vicodinTaken, mechanicalHits, heavyArtilleryHits, clubbingHits, temporaryHits, machineGunHits, pistolHits, rifleHits, shotgunHits, subMachineGunHits, piercingHits, slashingHits, argentinaTravel, mexicoTravel, unitedArabEmiratesTravel, hawaiiTravel, japanTravel, unitedKingdomTravel, southAfricaTravel, switzerlandTravel, chinaTravel, canadaTravel, dumpFinds, dumpSearches, itemsDumped, daysBeenDonator, caymanIslandsTravel, jailed, hospital, attacksAssisted, bloodWithdrawn, networth, missionsCompleted, contractsCompleted, dukeContractsCompleted, missionCreditsEarned, consumablesUsed, candyUsed, alcoholUsed, energyDrinkUsed, nerveRefills, unarmoredWon, handToHandHits, organisedCrimes, territoryTime, territoryJoins, stockPayouts, stockProfits, stockLosses, stockFees, arrestsMade, tokenRefills, booksRead, travelTime, boostersUsed, rehabs, rehabCost, awards, receivedBountyValue, networthPending, networthWallet, networthBank, networthPoints, networthCayman, networthVault, networthPiggyBank, networthItems, networthDisplayCase, networthBazaar, networthProperties, networthStockMarket, networthItemMarket, networthAuctionHouse, networthCompany, networthBookie, networthenListedCars, networthLoan, networthUnpaidFees, racingSkill, racesWon, racesEntered, racingPointsEarned, specialAmmoUsed, cityItemsBought, hollowAmmoUsed, tracerAmmoUsed, piercingAmmoUsed, incendiaryAmmoUsed, attacksWonAbroad, defendsLostAbroad, retals, elo, strength, defense, speed, dexterity, totalStats, manualLabor, intelligence, endurance, totalWorkingStats, jobPointsUsed, reviveSkill, itemsLooted, energyRefills);
    }
}
