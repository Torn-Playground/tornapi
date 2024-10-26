package eu.tornplayground.tornapi.models.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.converters.EpochZonedDateTimeConverter;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;
import java.util.Objects;

@Getter
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Networth)) return false;
        Networth networth = (Networth) o;
        return pending == networth.pending && wallet == networth.wallet && bank == networth.bank && points == networth.points && cayman == networth.cayman && vault == networth.vault && piggyBank == networth.piggyBank && items == networth.items && displayCase == networth.displayCase && bazaar == networth.bazaar && itemMarket == networth.itemMarket && properties == networth.properties && stockMarket == networth.stockMarket && auctionHouse == networth.auctionHouse && company == networth.company && bookie == networth.bookie && enlistedCars == networth.enlistedCars && loan == networth.loan && unpaidFees == networth.unpaidFees && total == networth.total && Double.compare(parseTime, networth.parseTime) == 0 && Objects.equals(timestamp, networth.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pending, wallet, bank, points, cayman, vault, piggyBank, items, displayCase, bazaar, itemMarket, properties, stockMarket, auctionHouse, company, bookie, enlistedCars, loan, unpaidFees, total, parseTime, timestamp);
    }
}
