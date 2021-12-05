package be.dekleinekobini.tornapi.models.user;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;

class PersonalStatsTest {

    @Test
    void of() throws JsonProcessingException {
        // Arrange
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode json = objectMapper.readTree("{\"personalstats\":{\"bazaarcustomers\":7801,\"bazaarsales\":2714831,\"bazaarprofit\":75932306550,\"useractivity\":22624363,\"activestreak\":459,\"bestactivestreak\":459,\"itemsbought\":1043,\"pointsbought\":29128,\"itemsboughtabroad\":20616,\"moneyinvested\":35689375237,\"investedprofit\":5497581175,\"weaponsbought\":4188,\"trades\":3815,\"itemssent\":589,\"auctionswon\":17,\"auctionsells\":2,\"pointssold\":252428,\"attackswon\":9728,\"attackslost\":817,\"attacksdraw\":143,\"bestkillstreak\":534,\"killstreak\":5,\"moneymugged\":660791618,\"attacksstealthed\":5528,\"attackhits\":36288,\"attackmisses\":12278,\"attackdamage\":28907918,\"attackcriticalhits\":5502,\"respectforfaction\":48138,\"onehitkills\":4122,\"defendswon\":1255,\"defendslost\":3505,\"defendsstalemated\":10,\"bestdamage\":9205,\"roundsfired\":79750,\"yourunaway\":1018,\"theyrunaway\":5,\"highestbeaten\":100,\"peoplebusted\":3150,\"failedbusts\":465,\"peoplebought\":500,\"peopleboughtspent\":41927499,\"virusescoded\":112,\"cityfinds\":614,\"traveltimes\":780,\"bountiesplaced\":139,\"bountiesreceived\":145,\"bountiescollected\":534,\"totalbountyreward\":79103973,\"revives\":2712,\"revivesreceived\":103,\"medicalitemsused\":16487,\"statenhancersused\":0,\"trainsreceived\":1044,\"totalbountyspent\":19955670,\"drugsused\":4065,\"overdosed\":67,\"meritsbought\":47,\"personalsplaced\":0,\"classifiedadsplaced\":1,\"mailssent\":1296,\"friendmailssent\":16,\"factionmailssent\":221,\"companymailssent\":4,\"spousemailssent\":1,\"largestmug\":37116538,\"cantaken\":861,\"exttaken\":66,\"kettaken\":50,\"lsdtaken\":51,\"opitaken\":50,\"shrtaken\":50,\"spetaken\":50,\"pcptaken\":50,\"xantaken\":2778,\"victaken\":59,\"chahits\":1459,\"heahits\":734,\"axehits\":1650,\"grehits\":322,\"machits\":133,\"pishits\":143,\"rifhits\":1331,\"shohits\":196,\"smghits\":347,\"piehits\":3141,\"slahits\":1055,\"argtravel\":50,\"mextravel\":133,\"dubtravel\":20,\"hawtravel\":51,\"japtravel\":23,\"lontravel\":47,\"soutravel\":56,\"switravel\":162,\"chitravel\":50,\"cantravel\":107,\"dumpfinds\":1715,\"dumpsearches\":1715,\"itemsdumped\":6192,\"daysbeendonator\":1299,\"caytravel\":81,\"jailed\":856,\"hospital\":7752,\"attacksassisted\":223,\"bloodwithdrawn\":7055,\"networth\":25073965359,\"missionscompleted\":1,\"contractscompleted\":702,\"dukecontractscompleted\":702,\"missioncreditsearned\":29220,\"consumablesused\":29623,\"candyused\":5411,\"alcoholused\":24183,\"energydrinkused\":29,\"nerverefills\":866,\"unarmoredwon\":372,\"h2hhits\":290,\"organisedcrimes\":281,\"territorytime\":2770783,\"territoryjoins\":2003,\"stockpayouts\":914,\"stockprofits\":954386795,\"stocklosses\":276160981,\"stockfees\":22475154,\"arrestsmade\":0,\"tokenrefills\":12,\"booksread\":7,\"traveltime\":8279449,\"boostersused\":125,\"rehabs\":1072,\"rehabcost\":260875000,\"awards\":442,\"receivedbountyvalue\":29982264,\"networthpending\":0,\"networthwallet\":0,\"networthbank\":2398000000,\"networthpoints\":626619319,\"networthcayman\":0,\"networthvault\":0,\"networthpiggybank\":3400000,\"networthitems\":2452155963,\"networthdisplaycase\":56891798,\"networthbazaar\":55006598,\"networthproperties\":2929182000,\"networthstockmarket\":16091454500,\"networthitemmarket\":0,\"networthauctionhouse\":0,\"networthcompany\":0,\"networthbookie\":445060388,\"networthenlistedcars\":16194793,\"networthloan\":0,\"networthunpaidfees\":0,\"racingskill\":18,\"raceswon\":753,\"racesentered\":3556,\"racingpointsearned\":3125,\"specialammoused\":15837,\"cityitemsbought\":22999,\"hollowammoused\":7080,\"tracerammoused\":3500,\"piercingammoused\":2750,\"incendiaryammoused\":2507,\"attackswonabroad\":167,\"defendslostabroad\":65,\"retals\":8,\"elo\":1729,\"strength\":69,\"defense\":69,\"speed\":69,\"dexterity\":69,\"totalstats\":276,\"manuallabor\":18325,\"intelligence\":71524,\"endurance\":121184,\"totalworkingstats\":211033,\"jobpointsused\":10437,\"reviveskill\":100,\"itemslooted\":3,\"refills\":1067}}");

        // Act
        PersonalStats result = PersonalStats.of(json);

        // Assert
        SoftAssertions softly = new SoftAssertions();

        softly.assertThat(result.getBazaarCustomers()).isEqualTo(7801);
        softly.assertThat(result.getBazaarSales()).isEqualTo(2714831);
        softly.assertThat(result.getBazaarProfit()).isEqualTo(75932306550L);
        softly.assertThat(result.getUserActivity()).isEqualTo(
                Duration.ofDays(261)
                        .plusHours(20)
                        .plusMinutes(32)
                        .plusSeconds(43)
        );
        softly.assertThat(result.getActiveStreak()).isEqualTo(459);
        softly.assertThat(result.getBestActiveStreak()).isEqualTo(459);
        softly.assertThat(result.getItemsBought()).isEqualTo(1043);
        softly.assertThat(result.getPointsBought()).isEqualTo(29128);
        softly.assertThat(result.getItemsBoughtAbroad()).isEqualTo(20616);
        softly.assertThat(result.getMoneyInvested()).isEqualTo(35689375237L);
        softly.assertThat(result.getInvestedProfit()).isEqualTo(5497581175L);
        softly.assertThat(result.getWeaponsBought()).isEqualTo(4188);
        softly.assertThat(result.getTrades()).isEqualTo(3815);
        softly.assertThat(result.getItemsSent()).isEqualTo(589);
        softly.assertThat(result.getAuctionsWon()).isEqualTo(17);
        softly.assertThat(result.getAuctionSells()).isEqualTo(2);
        softly.assertThat(result.getPointsSold()).isEqualTo(252428);
        softly.assertThat(result.getAttacksWon()).isEqualTo(9728);
        softly.assertThat(result.getAttacksLost()).isEqualTo(817);
        softly.assertThat(result.getAttacksDraw()).isEqualTo(143);
        softly.assertThat(result.getBestKillStreak()).isEqualTo(534);
        softly.assertThat(result.getKillStreak()).isEqualTo(5);
        softly.assertThat(result.getMoneyMugged()).isEqualTo(660791618);
        softly.assertThat(result.getAttacksStealthed()).isEqualTo(5528);
        softly.assertThat(result.getAttackHits()).isEqualTo(36288);
        softly.assertThat(result.getAttackMisses()).isEqualTo(12278);
        softly.assertThat(result.getAttackDamage()).isEqualTo(28907918);
        softly.assertThat(result.getAttackCriticalHits()).isEqualTo(5502);
        softly.assertThat(result.getRespectForFaction()).isEqualTo(48138);
        softly.assertThat(result.getOneHitKills()).isEqualTo(4122);
        softly.assertThat(result.getDefendsWon()).isEqualTo(1255);
        softly.assertThat(result.getDefendsLost()).isEqualTo(3505);
        softly.assertThat(result.getDefendsStalemated()).isEqualTo(10);
        softly.assertThat(result.getBestDamage()).isEqualTo(9205);
        softly.assertThat(result.getRoundsFired()).isEqualTo(79750);
        softly.assertThat(result.getAttacksRunaway()).isEqualTo(1018);
        softly.assertThat(result.getDefendsRunaway()).isEqualTo(5);
        softly.assertThat(result.getHighestBeaten()).isEqualTo(100);
        softly.assertThat(result.getPeopleBusted()).isEqualTo(3150);
        softly.assertThat(result.getFailedBusts()).isEqualTo(465);
        softly.assertThat(result.getPeopleBought()).isEqualTo(500);
        softly.assertThat(result.getPeopleBoughtSpent()).isEqualTo(41927499);
        softly.assertThat(result.getVirusesCoded()).isEqualTo(112);
        softly.assertThat(result.getCityFinds()).isEqualTo(614);
        softly.assertThat(result.getTravelTimes()).isEqualTo(780);
        softly.assertThat(result.getBountiesPlaced()).isEqualTo(139);
        softly.assertThat(result.getBountiesReceived()).isEqualTo(145);
        softly.assertThat(result.getBountiesCollected()).isEqualTo(534);
        softly.assertThat(result.getTotalBountyReward()).isEqualTo(79103973);
        softly.assertThat(result.getRevives()).isEqualTo(2712);
        softly.assertThat(result.getRevivesReceived()).isEqualTo(103);
        softly.assertThat(result.getMedicalItemsUsed()).isEqualTo(16487);
        softly.assertThat(result.getStatEnhancersUsed()).isEqualTo(0);
        softly.assertThat(result.getTrainsReceived()).isEqualTo(1044);
        softly.assertThat(result.getTotalBountySpent()).isEqualTo(19955670);
        softly.assertThat(result.getDrugsUsed()).isEqualTo(4065);
        softly.assertThat(result.getOverdosed()).isEqualTo(67);
        softly.assertThat(result.getMeritsBought()).isEqualTo(47);
        softly.assertThat(result.getPersonalsPlaced()).isEqualTo(0);
        softly.assertThat(result.getClassifiedAdsPlaced()).isEqualTo(1);
        softly.assertThat(result.getMailsSent()).isEqualTo(1296);
        softly.assertThat(result.getFriendMailsSent()).isEqualTo(16);
        softly.assertThat(result.getFactionMailsSent()).isEqualTo(221);
        softly.assertThat(result.getCompanyMailsSent()).isEqualTo(4);
        softly.assertThat(result.getSpouseMailsSent()).isEqualTo(1);
        softly.assertThat(result.getLargestMug()).isEqualTo(37116538);
        softly.assertThat(result.getCannabisTaken()).isEqualTo(861);
        softly.assertThat(result.getEcstasyTaken()).isEqualTo(66);
        softly.assertThat(result.getKetamineTaken()).isEqualTo(50);
        softly.assertThat(result.getLsdTaken()).isEqualTo(51);
        softly.assertThat(result.getOpiumTaken()).isEqualTo(50);
        softly.assertThat(result.getShroomsTaken()).isEqualTo(50);
        softly.assertThat(result.getSpeedTaken()).isEqualTo(50);
        softly.assertThat(result.getPcpTaken()).isEqualTo(50);
        softly.assertThat(result.getXanaxTaken()).isEqualTo(2778);
        softly.assertThat(result.getVicodinTaken()).isEqualTo(59);
        softly.assertThat(result.getMechanicalHits()).isEqualTo(1459);
        softly.assertThat(result.getHeavyArtilleryHits()).isEqualTo(734);
        softly.assertThat(result.getClubbingHits()).isEqualTo(1650);
        softly.assertThat(result.getTemporaryHits()).isEqualTo(322);
        softly.assertThat(result.getMachineGunHits()).isEqualTo(133);
        softly.assertThat(result.getPistolHits()).isEqualTo(143);
        softly.assertThat(result.getRifleHits()).isEqualTo(1331);
        softly.assertThat(result.getShotgunHits()).isEqualTo(196);
        softly.assertThat(result.getSubMachineGunHits()).isEqualTo(347);
        softly.assertThat(result.getPiercingHits()).isEqualTo(3141);
        softly.assertThat(result.getSlashingHits()).isEqualTo(1055);
        softly.assertThat(result.getArgentinaTravel()).isEqualTo(50);
        softly.assertThat(result.getMexicoTravel()).isEqualTo(133);
        softly.assertThat(result.getUnitedArabEmiratesTravel()).isEqualTo(20);
        softly.assertThat(result.getHawaiiTravel()).isEqualTo(51);
        softly.assertThat(result.getJapanTravel()).isEqualTo(23);
        softly.assertThat(result.getUnitedKingdomTravel()).isEqualTo(47);
        softly.assertThat(result.getSouthAfricaTravel()).isEqualTo(56);
        softly.assertThat(result.getSwitzerlandTravel()).isEqualTo(162);
        softly.assertThat(result.getChinaTravel()).isEqualTo(50);
        softly.assertThat(result.getCanadaTravel()).isEqualTo(107);
        softly.assertThat(result.getDumpFinds()).isEqualTo(1715);
        softly.assertThat(result.getDumpSearches()).isEqualTo(1715);
        softly.assertThat(result.getItemsDumped()).isEqualTo(6192);
        softly.assertThat(result.getDaysBeenDonator()).isEqualTo(Duration.ofDays(1299));
        softly.assertThat(result.getCaymanIslandsTravel()).isEqualTo(81);
        softly.assertThat(result.getJailed()).isEqualTo(856);
        softly.assertThat(result.getHospital()).isEqualTo(7752);
        softly.assertThat(result.getAttacksAssisted()).isEqualTo(223);
        softly.assertThat(result.getBloodWithdrawn()).isEqualTo(7055);
        softly.assertThat(result.getNetworth()).isEqualTo(25073965359L);
        softly.assertThat(result.getMissionsCompleted()).isEqualTo(1);
        softly.assertThat(result.getContractsCompleted()).isEqualTo(702);
        softly.assertThat(result.getDukeContractsCompleted()).isEqualTo(702);
        softly.assertThat(result.getMissionCreditsEarned()).isEqualTo(29220);
        softly.assertThat(result.getConsumablesUsed()).isEqualTo(29623);
        softly.assertThat(result.getCandyUsed()).isEqualTo(5411);
        softly.assertThat(result.getAlcoholUsed()).isEqualTo(24183);
        softly.assertThat(result.getEnergyDrinkUsed()).isEqualTo(29);
        softly.assertThat(result.getNerveRefills()).isEqualTo(866);
        softly.assertThat(result.getUnarmoredWon()).isEqualTo(372);
        softly.assertThat(result.getHandToHandHits()).isEqualTo(290);
        softly.assertThat(result.getOrganisedCrimes()).isEqualTo(281);
        softly.assertThat(result.getTerritoryTime()).isEqualTo(
                Duration.ofDays(32)
                        .plusHours(1)
                        .plusMinutes(39)
                        .plusSeconds(43)
        );
        softly.assertThat(result.getTerritoryJoins()).isEqualTo(2003);
        softly.assertThat(result.getStockPayouts()).isEqualTo(914);
        softly.assertThat(result.getStockProfits()).isEqualTo(954386795);
        softly.assertThat(result.getStockLosses()).isEqualTo(276160981);
        softly.assertThat(result.getStockFees()).isEqualTo(22475154);
        softly.assertThat(result.getArrestsMade()).isEqualTo(0);
        softly.assertThat(result.getTokenRefills()).isEqualTo(12);
        softly.assertThat(result.getBooksRead()).isEqualTo(7);
        softly.assertThat(result.getTravelTime()).isEqualTo(
                Duration.ofDays(95)
                        .plusHours(19)
                        .plusMinutes(50)
                        .plusSeconds(49)
        );
        softly.assertThat(result.getBoostersUsed()).isEqualTo(125);
        softly.assertThat(result.getRehabs()).isEqualTo(1072);
        softly.assertThat(result.getRehabCost()).isEqualTo(260875000);
        softly.assertThat(result.getAwards()).isEqualTo(442);
        softly.assertThat(result.getReceivedBountyValue()).isEqualTo(29982264);
        softly.assertThat(result.getNetworthPending()).isEqualTo(0);
        softly.assertThat(result.getNetworthWallet()).isEqualTo(0);
        softly.assertThat(result.getNetworthBank()).isEqualTo(2398000000L);
        softly.assertThat(result.getNetworthPoints()).isEqualTo(626619319);
        softly.assertThat(result.getNetworthCayman()).isEqualTo(0);
        softly.assertThat(result.getNetworthVault()).isEqualTo(0);
        softly.assertThat(result.getNetworthPiggyBank()).isEqualTo(3400000);
        softly.assertThat(result.getNetworthItems()).isEqualTo(2452155963L);
        softly.assertThat(result.getNetworthDisplayCase()).isEqualTo(56891798);
        softly.assertThat(result.getNetworthBazaar()).isEqualTo(55006598);
        softly.assertThat(result.getNetworthProperties()).isEqualTo(2929182000L);
        softly.assertThat(result.getNetworthStockMarket()).isEqualTo(16091454500L);
        softly.assertThat(result.getNetworthItemMarket()).isEqualTo(0);
        softly.assertThat(result.getNetworthAuctionHouse()).isEqualTo(0);
        softly.assertThat(result.getNetworthCompany()).isEqualTo(0);
        softly.assertThat(result.getNetworthBookie()).isEqualTo(445060388);
        softly.assertThat(result.getNetworthenListedCars()).isEqualTo(16194793);
        softly.assertThat(result.getNetworthLoan()).isEqualTo(0);
        softly.assertThat(result.getNetworthUnpaidFees()).isEqualTo(0);
        softly.assertThat(result.getRacingSkill()).isEqualTo(18);
        softly.assertThat(result.getRacesWon()).isEqualTo(753);
        softly.assertThat(result.getRacesEntered()).isEqualTo(3556);
        softly.assertThat(result.getRacingPointsEarned()).isEqualTo(3125);
        softly.assertThat(result.getSpecialAmmoUsed()).isEqualTo(15837);
        softly.assertThat(result.getCityItemsBought()).isEqualTo(22999);
        softly.assertThat(result.getHollowAmmoUsed()).isEqualTo(7080);
        softly.assertThat(result.getTracerAmmoUsed()).isEqualTo(3500);
        softly.assertThat(result.getPiercingAmmoUsed()).isEqualTo(2750);
        softly.assertThat(result.getIncendiaryAmmoUsed()).isEqualTo(2507);
        softly.assertThat(result.getAttacksWonAbroad()).isEqualTo(167);
        softly.assertThat(result.getDefendsLostAbroad()).isEqualTo(65);
        softly.assertThat(result.getRetals()).isEqualTo(8);
        softly.assertThat(result.getElo()).isEqualTo(1729);
        softly.assertThat(result.getStrength()).isEqualTo(69);
        softly.assertThat(result.getDefense()).isEqualTo(69);
        softly.assertThat(result.getSpeed()).isEqualTo(69);
        softly.assertThat(result.getDexterity()).isEqualTo(69);
        softly.assertThat(result.getTotalStats()).isEqualTo(276);
        softly.assertThat(result.getManualLabor()).isEqualTo(18325);
        softly.assertThat(result.getIntelligence()).isEqualTo(71524);
        softly.assertThat(result.getEndurance()).isEqualTo(121184);
        softly.assertThat(result.getTotalWorkingStats()).isEqualTo(211033);
        softly.assertThat(result.getJobPointsUsed()).isEqualTo(10437);
        softly.assertThat(result.getReviveSkill()).isEqualTo(100);
        softly.assertThat(result.getItemsLooted()).isEqualTo(3);
        softly.assertThat(result.getEnergyRefills()).isEqualTo(1067);

        softly.assertAll();
    }

}