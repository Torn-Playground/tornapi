package eu.tornplayground.tornapi.mappers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import eu.tornplayground.tornapi.models.torn.CompanyType;
import eu.tornplayground.tornapi.models.torn.ShopLiftingSecurity;
import eu.tornplayground.tornapi.models.torn.Stock;
import eu.tornplayground.tornapi.models.torn.TornItem;
import eu.tornplayground.tornapi.models.torn.benefit.Type;
import eu.tornplayground.tornapi.models.torn.companytype.CompanyPosition;
import eu.tornplayground.tornapi.models.torn.companytype.CompanySpecial;
import eu.tornplayground.tornapi.models.torn.companytype.CompanyStock;
import eu.tornplayground.tornapi.models.torn.companytype.SpecialPosition;
import eu.tornplayground.tornapi.models.torn.stock.Benefit;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import static eu.tornplayground.tornapi.models.torn.ShopLiftingSecurity.ONE_CAMERA;
import static eu.tornplayground.tornapi.models.torn.ShopLiftingSecurity.TWO_CAMERAS;

class TornMapperTest {

    @Disabled("Not yet implemented.")
    @Test
    void ofBank() {
    }

    @Disabled("Not yet implemented.")
    @Test
    void ofCards() {
    }

    @Disabled("Not yet implemented.")
    @Test
    void ofChainReport() {
    }

    @Test
    void ofCompanies() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode json = objectMapper.readTree(this.getClass().getResource("/responses/torn-companies.json"));

        Map<Long, CompanyType> result = TornMapper.ofCompanies(json);

        SoftAssertions softly = new SoftAssertions();

        CompanyType companyType = result.get(1L);
        softly.assertThat(companyType.getName()).isEqualTo("Hair Salon");
        softly.assertThat(companyType.getCost()).isEqualTo(750000);
        softly.assertThat(companyType.getDefaultEmployees()).isEqualTo(4);

        CompanyPosition companyPosition = companyType.getPositions().get("Stylist");
        softly.assertThat(companyPosition.getManualRequired()).isEqualTo(1500);
        softly.assertThat(companyPosition.getIntelligenceRequired()).isEqualTo(0);
        softly.assertThat(companyPosition.getEnduranceRequired()).isEqualTo(750);
        softly.assertThat(companyPosition.getManualGain()).isEqualTo(34);
        softly.assertThat(companyPosition.getIntelligenceGain()).isEqualTo(0);
        softly.assertThat(companyPosition.getEnduranceGain()).isEqualTo(17);
        softly.assertThat(companyPosition.getSpecialAbility()).isEqualTo(SpecialPosition.NONE);
        softly.assertThat(companyPosition.getDescription()).isEqualTo("This person primarily cuts and styles hair, an integral position in a hair salon.");

        CompanyStock standardTreatment = companyType.getStock().get("Standard Treatment");
        softly.assertThat(standardTreatment.getRrp()).isEqualTo(95);

        CompanySpecial debate = companyType.getSpecials().get("Debate");
        softly.assertThat(debate.getEffect()).isEqualTo("Experience");
        softly.assertThat(debate.getCost()).isEqualTo(1);
        softly.assertThat(debate.getRatingRequired()).isEqualTo(1);

        softly.assertAll();
    }

    @Disabled("Not yet implemented.")
    @Test
    void ofCompetition() {
    }

    @Disabled("Not yet implemented.")
    @Test
    void ofEducation() {
    }

    @Disabled("Not yet implemented.")
    @Test
    void ofFactionTree() {
    }

    @Disabled("Not yet implemented.")
    @Test
    void ofGyms() {
    }

    @Disabled("Not yet implemented.")
    @Test
    void ofHonors() {
    }

    @Test
    void ofItems() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode json = objectMapper.readTree(this.getClass().getResource("/responses/torn-items.json"));

        Map<Long, TornItem> result = TornMapper.ofItems(json);

        SoftAssertions softly = new SoftAssertions();

        TornItem tornItem = result.get(1L);
        softly.assertThat(tornItem.getName()).isEqualTo("Hammer");
        softly.assertThat(tornItem.getDescription()).isEqualTo("A small, lightweight tool used in the building industry. Can also be used as a weapon.");
        softly.assertThat(tornItem.getEffect()).isEmpty();
        softly.assertThat(tornItem.getRequirement()).isEmpty();
        softly.assertThat(tornItem.getType()).isEqualTo("Melee");
        softly.assertThat(tornItem.getWeaponType()).isEqualTo("Clubbing");
        softly.assertThat(tornItem.getBuyPrice()).isEqualTo(75);
        softly.assertThat(tornItem.getSellPrice()).isEqualTo(50);
        softly.assertThat(tornItem.getMarketValue()).isEqualTo(47);
        softly.assertThat(tornItem.getCirculation()).isEqualTo(1839955);
        softly.assertThat(tornItem.getImage()).isEqualTo("https://www.torn.com/images/items/1/large.png");

        softly.assertAll();
    }

    @Disabled("Not yet implemented.")
    @Test
    void ofLogCategories() {
    }

    @Disabled("Not yet implemented.")
    @Test
    void ofLogTypes() {
    }

    @Disabled("Not yet implemented.")
    @Test
    void ofMedals() {
    }

    @Disabled("Not yet implemented.")
    @Test
    void ofOrganisedCrimes() {
    }

    @Test
    void ofPawnShop() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode json = objectMapper.readTree("{\"pawnshop\":{\"points_value\":45000,\"donatorpack_value\":22600000}}");

        var result = TornMapper.ofPawnShop(json);

        SoftAssertions softly = new SoftAssertions();

        softly.assertThat(result.getPointsValue()).isEqualTo(45000);
        softly.assertThat(result.getDonatorPackValue()).isEqualTo(22600000);

        softly.assertAll();
    }

    @Disabled("Not yet implemented.")
    @Test
    void ofPokerTables() {
    }

    @Disabled("Not yet implemented.")
    @Test
    void ofProperties() {
    }

    @Disabled("Not yet implemented.")
    @Test
    void ofRackets() {
    }

    @Disabled("Not yet implemented.")
    @Test
    void ofRaids() {
    }

    @Disabled("Not yet implemented.")
    @Test
    void ofRankedWarReport() {
    }

    @Test
    void ofStats() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode json = objectMapper.readTree("{\"stats\":{\"timestamp\":1640404138,\"users_total\":1324415,\"users_male\":1127806,\"users_female\":196609,\"users_marriedcouples\":59608,\"users_daily\":8979,\"total_users_logins\":333720202,\"total_users_playtime\":\"7255.4\",\"job_army\":35841,\"job_grocer\":21549,\"job_medical\":8644,\"job_casino\":23970,\"job_education\":5247,\"job_law\":2770,\"job_company\":45166,\"job_none\":1181228,\"crimes\":1381105146,\"jailed\":0,\"money_onhand\":2461706579390,\"money_average\":1858712,\"money_citybank\":57856226520054,\"items\":420767355,\"events\":887228339,\"points_total\":133085060,\"points_market\":370289,\"points_averagecost\":46384,\"points_bought\":443839,\"total_points_boughttotal\":1625843719,\"total_attacks_won\":198665516,\"total_attacks_lost\":24193555,\"total_attacks_stalemated\":2697487,\"total_attacks_runaway\":2599220,\"total_attacks_hits\":915755823,\"total_attacks_misses\":657395038,\"total_attacks_criticalhits\":127877518,\"total_attacks_roundsfired\":2991180805,\"total_attacks_stealthed\":114795824,\"total_attacks_moneymugged\":27720491529200,\"total_attacks_respectgained\":565611320,\"total_items_marketbought\":130864299,\"total_items_bazaarbought\":2545153482,\"total_items_auctionswon\":713132,\"total_items_sent\":11765491,\"total_trades\":6564983,\"total_items_bazaarincome\":273252827697811,\"total_items_cityfinds\":18828746,\"total_items_dumpfinds\":51165861,\"total_items_dumped\":192903445,\"total_jail_jailed\":35624554,\"total_jail_busted\":30665506,\"total_jail_busts\":7238305,\"total_jail_bailed\":3246594,\"total_jail_bailcosts\":570538949808,\"total_hospital_trips\":246109313,\"total_hospital_medicalitemsused\":208577770,\"total_hospital_revived\":7619161,\"total_mails_sent\":114941854,\"total_mails_sent_friends\":24766678,\"total_mails_sent_faction\":26213991,\"total_mails_sent_company\":8013514,\"total_mails_sent_spouse\":7320627,\"total_classifiedads_placed\":1037291,\"total_bounty_placed\":8156249,\"total_bounty_rewards\":2093141716179,\"total_travel_all\":46202223,\"total_travel_argentina\":3794644,\"total_travel_mexico\":4922972,\"total_travel_dubai\":3732419,\"total_travel_hawaii\":2148677,\"total_travel_japan\":2080654,\"total_travel_unitedkingdom\":5682542,\"total_travel_southafrica\":5829382,\"total_travel_switzerland\":5449755,\"total_travel_china\":3768691,\"total_travel_canada\":4575221,\"total_travel_caymanislands\":4215342,\"total_drugs_used\":58728330,\"total_drugs_overdosed\":1432248,\"total_drugs_cannabis\":2842263,\"total_drugs_ecstacy\":4523778,\"total_drugs_ketamine\":346265,\"total_drugs_lsd\":1803602,\"total_drugs_opium\":347409,\"total_drugs_shrooms\":349816,\"total_drugs_speed\":197366,\"total_drugs_pcp\":226674,\"total_drugs_xanax\":43899224,\"total_drugs_vicodin\":4157288,\"total_merits_bought\":554064,\"total_refills_bought\":21603909,\"total_company_trains\":36236575,\"total_statenhancers_used\":111776}}");

        var result = TornMapper.ofStats(json);

        SoftAssertions softly = new SoftAssertions();

        softly.assertThat(result.getTimestamp()).isEqualTo(LocalDateTime.of(2021, 12, 25, 3, 48, 58));
        softly.assertThat(result.getUsersTotal()).isEqualTo(1324415);
        softly.assertThat(result.getUsersMale()).isEqualTo(1127806);
        softly.assertThat(result.getUsersFemale()).isEqualTo(196609);
        softly.assertThat(result.getUsersMarriedCouples()).isEqualTo(59608);
        softly.assertThat(result.getUsersDaily()).isEqualTo(8979);
        softly.assertThat(result.getTotalUsersLogins()).isEqualTo(333720202);
        softly.assertThat(result.getTotalUsersPlaytime()).isEqualTo(7255.4);
        softly.assertThat(result.getJobArmy()).isEqualTo(35841);
        softly.assertThat(result.getJobGrocer()).isEqualTo(21549);
        softly.assertThat(result.getJobMedical()).isEqualTo(8644);
        softly.assertThat(result.getJobCasino()).isEqualTo(23970);
        softly.assertThat(result.getJobEducation()).isEqualTo(5247);
        softly.assertThat(result.getJobLaw()).isEqualTo(2770);
        softly.assertThat(result.getJobCompany()).isEqualTo(45166);
        softly.assertThat(result.getJobNone()).isEqualTo(1181228);
        softly.assertThat(result.getCrimes()).isEqualTo(1381105146);
        softly.assertThat(result.getJailed()).isEqualTo(0);
        softly.assertThat(result.getMoneyOnHand()).isEqualTo(2461706579390L);
        softly.assertThat(result.getMoneyAverage()).isEqualTo(1858712);
        softly.assertThat(result.getMoneyCityBank()).isEqualTo(57856226520054L);
        softly.assertThat(result.getItems()).isEqualTo(420767355);
        softly.assertThat(result.getEvents()).isEqualTo(887228339);
        softly.assertThat(result.getPointsTotal()).isEqualTo(133085060);
        softly.assertThat(result.getPointsMarket()).isEqualTo(370289);
        softly.assertThat(result.getPointsAverageCost()).isEqualTo(46384);
        softly.assertThat(result.getPointsBought()).isEqualTo(443839);
        softly.assertThat(result.getTotalPointsBoughtTotal()).isEqualTo(1625843719);
        softly.assertThat(result.getTotalAttacksWon()).isEqualTo(198665516);
        softly.assertThat(result.getTotalAttacksLost()).isEqualTo(24193555);
        softly.assertThat(result.getTotalAttacksStalemated()).isEqualTo(2697487);
        softly.assertThat(result.getTotalAttacksRunaway()).isEqualTo(2599220);
        softly.assertThat(result.getTotalAttacksHits()).isEqualTo(915755823);
        softly.assertThat(result.getTotalAttacksMisses()).isEqualTo(657395038);
        softly.assertThat(result.getTotalAttacksCriticalHits()).isEqualTo(127877518);
        softly.assertThat(result.getTotalAttacksRoundsFired()).isEqualTo(2991180805L);
        softly.assertThat(result.getTotalAttacksStealthed()).isEqualTo(114795824);
        softly.assertThat(result.getTotalAttacksMoneyMugged()).isEqualTo(27720491529200L);
        softly.assertThat(result.getTotalAttacksRespectGained()).isEqualTo(565611320);
        softly.assertThat(result.getTotalItemsMarketBought()).isEqualTo(130864299);
        softly.assertThat(result.getTotalItemsBazaarBought()).isEqualTo(2545153482L);
        softly.assertThat(result.getTotalItemsAuctionsWon()).isEqualTo(713132);
        softly.assertThat(result.getTotalItemsSent()).isEqualTo(11765491);
        softly.assertThat(result.getTotalTrades()).isEqualTo(6564983);
        softly.assertThat(result.getTotalItemsBazaarIncome()).isEqualTo(273252827697811L);
        softly.assertThat(result.getTotalItemsCityFinds()).isEqualTo(18828746);
        softly.assertThat(result.getTotalItemsDumpFinds()).isEqualTo(51165861);
        softly.assertThat(result.getTotalItemsDumped()).isEqualTo(192903445);
        softly.assertThat(result.getTotalJailJailed()).isEqualTo(35624554);
        softly.assertThat(result.getTotalJailBusted()).isEqualTo(30665506);
        softly.assertThat(result.getTotalJailBusts()).isEqualTo(7238305);
        softly.assertThat(result.getTotalJailBailed()).isEqualTo(3246594);
        softly.assertThat(result.getTotalJailBailCosts()).isEqualTo(570538949808L);
        softly.assertThat(result.getTotalHospitalTrips()).isEqualTo(246109313);
        softly.assertThat(result.getTotalHospitalMedicalItemsUsed()).isEqualTo(208577770);
        softly.assertThat(result.getTotalHospitalRevived()).isEqualTo(7619161);
        softly.assertThat(result.getTotalMailsSent()).isEqualTo(114941854);
        softly.assertThat(result.getTotalMailsSentFriends()).isEqualTo(24766678);
        softly.assertThat(result.getTotalMailsSentFaction()).isEqualTo(26213991);
        softly.assertThat(result.getTotalMailsSentCompany()).isEqualTo(8013514);
        softly.assertThat(result.getTotalMailsSentSpouse()).isEqualTo(7320627);
        softly.assertThat(result.getTotalClassifiedAdsPlaced()).isEqualTo(1037291);
        softly.assertThat(result.getTotalBountyPlaced()).isEqualTo(8156249);
        softly.assertThat(result.getTotalBountyRewards()).isEqualTo(2093141716179L);
        softly.assertThat(result.getTotalTravelAll()).isEqualTo(46202223);
        softly.assertThat(result.getTotalTravelArgentina()).isEqualTo(3794644);
        softly.assertThat(result.getTotalTravelMexico()).isEqualTo(4922972);
        softly.assertThat(result.getTotalTravelDubai()).isEqualTo(3732419);
        softly.assertThat(result.getTotalTravelHawaii()).isEqualTo(2148677);
        softly.assertThat(result.getTotalTravelJapan()).isEqualTo(2080654);
        softly.assertThat(result.getTotalTravelUnitedKingdom()).isEqualTo(5682542);
        softly.assertThat(result.getTotalTravelSouthAfrica()).isEqualTo(5829382);
        softly.assertThat(result.getTotalTravelSwitzerland()).isEqualTo(5449755);
        softly.assertThat(result.getTotalTravelChina()).isEqualTo(3768691);
        softly.assertThat(result.getTotalTravelCanada()).isEqualTo(4575221);
        softly.assertThat(result.getTotalTravelCaymanIslands()).isEqualTo(4215342);
        softly.assertThat(result.getTotalDrugsUsed()).isEqualTo(58728330);
        softly.assertThat(result.getTotalDrugsOverdosed()).isEqualTo(1432248);
        softly.assertThat(result.getTotalDrugsCannabis()).isEqualTo(2842263);
        softly.assertThat(result.getTotalDrugsEcstacy()).isEqualTo(4523778);
        softly.assertThat(result.getTotalDrugsKetamine()).isEqualTo(346265);
        softly.assertThat(result.getTotalDrugsLsd()).isEqualTo(1803602);
        softly.assertThat(result.getTotalDrugsOpium()).isEqualTo(347409);
        softly.assertThat(result.getTotalDrugsShrooms()).isEqualTo(349816);
        softly.assertThat(result.getTotalDrugsSpeed()).isEqualTo(197366);
        softly.assertThat(result.getTotalDrugsPcp()).isEqualTo(226674);
        softly.assertThat(result.getTotalDrugsXanax()).isEqualTo(43899224);
        softly.assertThat(result.getTotalDrugsVicodin()).isEqualTo(4157288);
        softly.assertThat(result.getTotalMeritsBought()).isEqualTo(554064);
        softly.assertThat(result.getTotalRefillsBought()).isEqualTo(21603909);
        softly.assertThat(result.getTotalCompanyTrains()).isEqualTo(36236575);
        softly.assertThat(result.getTotalStatenhancersUsed()).isEqualTo(111776);

        softly.assertAll();
    }

    @Test
    void ofShoplifting() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode json = objectMapper.readTree("{\"shoplifting\":{\"sallys_sweet_shop\":[{\"title\":\"One camera\",\"disabled\":false}],\"Bits_n_bobs\":[{\"title\":\"Two cameras\",\"disabled\":false}],\"tc_clothing\":[{\"title\":\"One camera\",\"disabled\":false},{\"title\":\"Checkpoint\",\"disabled\":false}],\"super_store\":[{\"title\":\"Two cameras\",\"disabled\":false},{\"title\":\"Checkpoint\",\"disabled\":false}],\"big_als\":[{\"title\":\"Four cameras\",\"disabled\":false},{\"title\":\"Two guards\",\"disabled\":false}],\"jewelry_store\":[{\"title\":\"Three cameras\",\"disabled\":false},{\"title\":\"One guard\",\"disabled\":false}]}}");

        Map<String, List<ShopLiftingSecurity>> result = TornMapper.ofShoplifting(json);

        SoftAssertions softly = new SoftAssertions();

        List<ShopLiftingSecurity> sallysSweetShop = result.get("sallys_sweet_shop");
        softly.assertThat(sallysSweetShop).hasSize(1);
        softly.assertThat(sallysSweetShop.get(0).getTitle()).isEqualTo(ONE_CAMERA);
        softly.assertThat(sallysSweetShop.get(0).isDisabled()).isFalse();

        List<ShopLiftingSecurity> bitsNBobs = result.get("Bits_n_bobs");
        softly.assertThat(bitsNBobs).hasSize(1);
        softly.assertThat(bitsNBobs.get(0).getTitle()).isEqualTo(TWO_CAMERAS);
        softly.assertThat(bitsNBobs.get(0).isDisabled()).isFalse();

        softly.assertAll();
    }

    @Test
    void ofStocks() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode json = objectMapper.readTree("{\"stocks\":{\"1\":{\"stock_id\":1,\"name\":\"Torn & Shanghai Banking\",\"acronym\":\"TSB\",\"current_price\":898.76,\"market_cap\":10694309020871,\"total_shares\":11898959701,\"benefit\":{\"type\":\"active\",\"frequency\":31,\"requirement\":3000000,\"description\":\"$50,000,000\"}},\"2\":{\"stock_id\":2,\"name\":\"Torn City Investments\",\"acronym\":\"TCI\",\"current_price\":976.44,\"market_cap\":10588231251112,\"total_shares\":10843709036,\"benefit\":{\"type\":\"passive\",\"frequency\":7,\"requirement\":1500000,\"description\":\"a 10% Bank Interest Bonus\"}},\"3\":{\"stock_id\":3,\"name\":\"Syscore MFG\",\"acronym\":\"SYS\",\"current_price\":466.84,\"market_cap\":2952075247577,\"total_shares\":6323526792,\"benefit\":{\"type\":\"passive\",\"frequency\":7,\"requirement\":3000000,\"description\":\"an Advanced Firewall\"}},\"4\":{\"stock_id\":4,\"name\":\"Legal Authorities Group\",\"acronym\":\"LAG\",\"current_price\":316.55,\"market_cap\":1972180804098,\"total_shares\":6230234731,\"benefit\":{\"type\":\"active\",\"frequency\":7,\"requirement\":750000,\"description\":\"1x Lawyer Business Card\"}},\"5\":{\"stock_id\":5,\"name\":\"Insured On Us\",\"acronym\":\"IOU\",\"current_price\":128.79,\"market_cap\":20216373619059,\"total_shares\":156971609745,\"benefit\":{\"type\":\"active\",\"frequency\":31,\"requirement\":3000000,\"description\":\"$12,000,000\"}},\"6\":{\"stock_id\":6,\"name\":\"Grain\",\"acronym\":\"GRN\",\"current_price\":264.27,\"market_cap\":2379058232686,\"total_shares\":9002377238,\"benefit\":{\"type\":\"active\",\"frequency\":31,\"requirement\":500000,\"description\":\"$4,000,000\"}},\"7\":{\"stock_id\":7,\"name\":\"Torn City Health Service\",\"acronym\":\"THS\",\"current_price\":337.45,\"market_cap\":2189431479358,\"total_shares\":6488165593,\"benefit\":{\"type\":\"active\",\"frequency\":7,\"requirement\":150000,\"description\":\"1x Box of Medical Supplies\"}},\"8\":{\"stock_id\":8,\"name\":\"Yazoo\",\"acronym\":\"YAZ\",\"current_price\":40.49,\"market_cap\":1885454150238,\"total_shares\":46565921221,\"benefit\":{\"type\":\"passive\",\"frequency\":7,\"requirement\":1000000,\"description\":\"Free Banner Advertising\"}},\"9\":{\"stock_id\":9,\"name\":\"The Torn City Times\",\"acronym\":\"TCT\",\"current_price\":264.7,\"market_cap\":2577928227757,\"total_shares\":9739056395,\"benefit\":{\"type\":\"active\",\"frequency\":31,\"requirement\":100000,\"description\":\"$1,000,000\"}},\"10\":{\"stock_id\":10,\"name\":\"Crude & Co\",\"acronym\":\"CNC\",\"current_price\":690.68,\"market_cap\":4667991244513,\"total_shares\":6758544108,\"benefit\":{\"type\":\"active\",\"frequency\":31,\"requirement\":7500000,\"description\":\"$80,000,000\"}},\"11\":{\"stock_id\":11,\"name\":\"Messaging Inc.\",\"acronym\":\"MSG\",\"current_price\":215.17,\"market_cap\":426064713467,\"total_shares\":1980130657,\"benefit\":{\"type\":\"passive\",\"frequency\":7,\"requirement\":300000,\"description\":\"Free Classified Advertising\"}},\"12\":{\"stock_id\":12,\"name\":\"TC Music Industries\",\"acronym\":\"TMI\",\"current_price\":177.31,\"market_cap\":6122378816897,\"total_shares\":34529235897,\"benefit\":{\"type\":\"active\",\"frequency\":31,\"requirement\":6000000,\"description\":\"$25,000,000\"}},\"13\":{\"stock_id\":13,\"name\":\"TC Media Productions\",\"acronym\":\"TCP\",\"current_price\":376.07,\"market_cap\":2706827251838,\"total_shares\":7197668657,\"benefit\":{\"type\":\"passive\",\"frequency\":7,\"requirement\":1000000,\"description\":\"a Company Sales Boost\"}},\"14\":{\"stock_id\":14,\"name\":\"I Industries Ltd.\",\"acronym\":\"IIL\",\"current_price\":101.91,\"market_cap\":1123715080594,\"total_shares\":11026543819,\"benefit\":{\"type\":\"passive\",\"frequency\":7,\"requirement\":1000000,\"description\":\"50% Coding Time Reduction\"}},\"15\":{\"stock_id\":15,\"name\":\"Feathery Hotels Group\",\"acronym\":\"FHG\",\"current_price\":660.49,\"market_cap\":25580644034657,\"total_shares\":38729797627,\"benefit\":{\"type\":\"active\",\"frequency\":7,\"requirement\":2000000,\"description\":\"1x Feathery Hotel Coupon\"}},\"16\":{\"stock_id\":16,\"name\":\"Symbiotic Ltd.\",\"acronym\":\"SYM\",\"current_price\":717.78,\"market_cap\":13576394906290,\"total_shares\":18914423509,\"benefit\":{\"type\":\"active\",\"frequency\":7,\"requirement\":500000,\"description\":\"1x Drug Pack\"}},\"17\":{\"stock_id\":17,\"name\":\"Lucky Shots Casino\",\"acronym\":\"LSC\",\"current_price\":394.51,\"market_cap\":2665386436980,\"total_shares\":6756194867,\"benefit\":{\"type\":\"active\",\"frequency\":7,\"requirement\":500000,\"description\":\"1x Lottery Voucher\"}},\"18\":{\"stock_id\":18,\"name\":\"Performance Ribaldry\",\"acronym\":\"PRN\",\"current_price\":510.29,\"market_cap\":8792943201199,\"total_shares\":17231266929,\"benefit\":{\"type\":\"active\",\"frequency\":7,\"requirement\":1000000,\"description\":\"1x Erotic DVD\"}},\"19\":{\"stock_id\":19,\"name\":\"Eaglewood Mercenary\",\"acronym\":\"EWM\",\"current_price\":234.16,\"market_cap\":1972341347022,\"total_shares\":8423049825,\"benefit\":{\"type\":\"active\",\"frequency\":7,\"requirement\":1000000,\"description\":\"1x Box of Grenades\"}},\"20\":{\"stock_id\":20,\"name\":\"Torn City Motors\",\"acronym\":\"TCM\",\"current_price\":305.9,\"market_cap\":7947683693503,\"total_shares\":25981313153,\"benefit\":{\"type\":\"passive\",\"frequency\":7,\"requirement\":1000000,\"description\":\"10% Racing Skill Boost\"}},\"21\":{\"stock_id\":21,\"name\":\"Empty Lunchbox Traders\",\"acronym\":\"ELT\",\"current_price\":207.64,\"market_cap\":1129307772974,\"total_shares\":5438777562,\"benefit\":{\"type\":\"passive\",\"frequency\":7,\"requirement\":5000000,\"description\":\"10% Home Upgrade Discount\"}},\"22\":{\"stock_id\":22,\"name\":\"Home Retail Group\",\"acronym\":\"HRG\",\"current_price\":209.11,\"market_cap\":9296043298427,\"total_shares\":44455278554,\"benefit\":{\"type\":\"active\",\"frequency\":31,\"requirement\":10000000,\"description\":\"1x Random Property\"}},\"23\":{\"stock_id\":23,\"name\":\"Tell Group Plc.\",\"acronym\":\"TGP\",\"current_price\":90.09,\"market_cap\":1514689306751,\"total_shares\":16813068118,\"benefit\":{\"type\":\"passive\",\"frequency\":7,\"requirement\":2500000,\"description\":\"a Company Advertising Boost\"}},\"24\":{\"stock_id\":24,\"name\":\"Munster Beverage Corp.\",\"acronym\":\"MUN\",\"current_price\":448.76,\"market_cap\":8910340767012,\"total_shares\":19855470111,\"benefit\":{\"type\":\"active\",\"frequency\":7,\"requirement\":5000000,\"description\":\"1x Six Pack of Energy Drink\"}},\"25\":{\"stock_id\":25,\"name\":\"West Side University\",\"acronym\":\"WSU\",\"current_price\":81.19,\"market_cap\":3075612188686,\"total_shares\":37881662627,\"benefit\":{\"type\":\"passive\",\"frequency\":7,\"requirement\":1000000,\"description\":\"a 10% Education Course Time Reduction\"}},\"26\":{\"stock_id\":26,\"name\":\"International School TC\",\"acronym\":\"IST\",\"current_price\":377.94,\"market_cap\":300077610747,\"total_shares\":793982142,\"benefit\":{\"type\":\"passive\",\"frequency\":7,\"requirement\":100000,\"description\":\"Free Education Courses\"}},\"27\":{\"stock_id\":27,\"name\":\"Big Al's Gun Shop\",\"acronym\":\"BAG\",\"current_price\":377.91,\"market_cap\":3320976936295,\"total_shares\":8787745591,\"benefit\":{\"type\":\"active\",\"frequency\":7,\"requirement\":3000000,\"description\":\"1x Ammunition Pack\"}},\"28\":{\"stock_id\":28,\"name\":\"Evil Ducks Candy Corp\",\"acronym\":\"EVL\",\"current_price\":474.24,\"market_cap\":2969665225987,\"total_shares\":6261945905,\"benefit\":{\"type\":\"active\",\"frequency\":7,\"requirement\":100000,\"description\":\"1000 Happiness\"}},\"29\":{\"stock_id\":29,\"name\":\"Mc Smoogle Corp\",\"acronym\":\"MCS\",\"current_price\":629.45,\"market_cap\":10995376485976,\"total_shares\":17468228590,\"benefit\":{\"type\":\"active\",\"frequency\":7,\"requirement\":350000,\"description\":\"100 Energy\"}},\"30\":{\"stock_id\":30,\"name\":\"Wind Lines Travel\",\"acronym\":\"WLT\",\"current_price\":560.08,\"market_cap\":7105716726596,\"total_shares\":12686967445,\"benefit\":{\"type\":\"passive\",\"frequency\":7,\"requirement\":9000000,\"description\":\"Private Jet Access\"}},\"31\":{\"stock_id\":31,\"name\":\"Torn City Clothing\",\"acronym\":\"TCC\",\"current_price\":392.44,\"market_cap\":1900139286061,\"total_shares\":4841859357,\"benefit\":{\"type\":\"active\",\"frequency\":31,\"requirement\":7500000,\"description\":\"1x Clothing Cache\"}},\"32\":{\"stock_id\":32,\"name\":\"Alcoholics Synonymous\",\"acronym\":\"ASS\",\"current_price\":312.77,\"market_cap\":1047962802612,\"total_shares\":3350586062,\"benefit\":{\"type\":\"active\",\"frequency\":7,\"requirement\":1000000,\"description\":\"1x Six Pack of Alcohol\"}}}}");

        Map<Long, Stock> result = TornMapper.ofStocks(json);

        SoftAssertions softly = new SoftAssertions();

        Stock tornShanghaiBanking = result.get(1L);
        softly.assertThat(tornShanghaiBanking.getId()).isEqualTo(1);
        softly.assertThat(tornShanghaiBanking.getName()).isEqualTo("Torn & Shanghai Banking");
        softly.assertThat(tornShanghaiBanking.getAcronym()).isEqualTo("TSB");

        Benefit benefit = tornShanghaiBanking.getBenefit();
        softly.assertThat(benefit.getType()).isEqualTo(Type.ACTIVE);
        softly.assertThat(benefit.getFrequency()).isEqualTo(31);
        softly.assertThat(benefit.getRequirement()).isEqualTo(3000000);

        softly.assertAll();
    }

    @Disabled("Not yet implemented.")
    @Test
    void ofTerritory() {
    }

    @Disabled("Not yet implemented.")
    @Test
    void ofTerritoryWars() {
    }

}