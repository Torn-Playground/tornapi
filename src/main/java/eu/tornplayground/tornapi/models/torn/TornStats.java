package eu.tornplayground.tornapi.models.torn;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.converters.EpochLocalDateTimeConverter;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import tools.jackson.databind.annotation.JsonDeserialize;

import java.time.LocalDateTime;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = false)
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

}
