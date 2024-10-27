package eu.tornplayground.tornapi.models.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.converters.EpochZonedDateTimeConverter;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.ZonedDateTime;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = false)
public class Networth extends Model {

    @JsonProperty("pending")
    private long pending;

    @JsonProperty("wallet")
    private long wallet;

    @JsonProperty("bank")
    private long bank;

    @JsonProperty("points")
    private long points;

    @JsonProperty("cayman")
    private long cayman;

    @JsonProperty("vault")
    private long vault;

    @JsonProperty("piggybank")
    private long piggyBank;

    @JsonProperty("items")
    private long items;

    @JsonProperty("displaycase")
    private long displayCase;

    @JsonProperty("bazaar")
    private long bazaar;

    @JsonProperty("itemmarket")
    private long itemMarket;

    @JsonProperty("properties")
    private long properties;

    @JsonProperty("stockmarket")
    private long stockMarket;

    @JsonProperty("auctionhouse")
    private long auctionHouse;

    @JsonProperty("company")
    private long company;

    @JsonProperty("bookie")
    private long bookie;

    @JsonProperty("enlistedcars")
    private long enlistedCars;

    @JsonProperty("loan")
    private long loan;

    @JsonProperty("unpaidfees")
    private long unpaidFees;

    @JsonProperty("total")
    private long total;

    @JsonProperty("parsetime")
    private double parseTime;

    @JsonProperty("timestamp")
    @JsonDeserialize(converter = EpochZonedDateTimeConverter.class)
    private ZonedDateTime timestamp;

}
