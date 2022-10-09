package eu.tornplayground.tornapi.models.user;

import eu.tornplayground.tornapi.models.Model;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Networth extends Model {

    private long pending;
    private long wallet;
    private long bank;
    private long points;
    private long cayman;
    private long vault;
    @JsonProperty("piggybank")
    private long piggyBank;
    private long items;
    @JsonProperty("displaycase")
    private long displayCase;
    private long bazaar;
    @JsonProperty("itemmarket")
    private long itemMarket;
    private long properties;
    @JsonProperty("stockmarket")
    private long stockMarket;
    @JsonProperty("auctionhouse")
    private long auctionHouse;
    private long company;
    private long bookie;
    @JsonProperty("enlistedcars")
    private long enlistedCars;
    private long loan;
    @JsonProperty("unpaidfees")
    private long unpaidFees;
    private long total;
    @JsonProperty("parsetime")
    private double parseTime;

    public long getPending() {
        return pending;
    }

    public void setPending(long pending) {
        this.pending = pending;
    }

    public long getWallet() {
        return wallet;
    }

    public void setWallet(long wallet) {
        this.wallet = wallet;
    }

    public long getBank() {
        return bank;
    }

    public void setBank(long bank) {
        this.bank = bank;
    }

    public long getPoints() {
        return points;
    }

    public void setPoints(long points) {
        this.points = points;
    }

    public long getCayman() {
        return cayman;
    }

    public void setCayman(long cayman) {
        this.cayman = cayman;
    }

    public long getVault() {
        return vault;
    }

    public void setVault(long vault) {
        this.vault = vault;
    }

    public long getPiggyBank() {
        return piggyBank;
    }

    public void setPiggyBank(long piggyBank) {
        this.piggyBank = piggyBank;
    }

    public long getItems() {
        return items;
    }

    public void setItems(long items) {
        this.items = items;
    }

    public long getDisplayCase() {
        return displayCase;
    }

    public void setDisplayCase(long displayCase) {
        this.displayCase = displayCase;
    }

    public long getBazaar() {
        return bazaar;
    }

    public void setBazaar(long bazaar) {
        this.bazaar = bazaar;
    }

    public long getItemMarket() {
        return itemMarket;
    }

    public void setItemMarket(long itemMarket) {
        this.itemMarket = itemMarket;
    }

    public long getProperties() {
        return properties;
    }

    public void setProperties(long properties) {
        this.properties = properties;
    }

    public long getStockMarket() {
        return stockMarket;
    }

    public void setStockMarket(long stockMarket) {
        this.stockMarket = stockMarket;
    }

    public long getAuctionHouse() {
        return auctionHouse;
    }

    public void setAuctionHouse(long auctionHouse) {
        this.auctionHouse = auctionHouse;
    }

    public long getCompany() {
        return company;
    }

    public void setCompany(long company) {
        this.company = company;
    }

    public long getBookie() {
        return bookie;
    }

    public void setBookie(long bookie) {
        this.bookie = bookie;
    }

    public long getEnlistedCars() {
        return enlistedCars;
    }

    public void setEnlistedCars(long enlistedCars) {
        this.enlistedCars = enlistedCars;
    }

    public long getLoan() {
        return loan;
    }

    public void setLoan(long loan) {
        this.loan = loan;
    }

    public long getUnpaidFees() {
        return unpaidFees;
    }

    public void setUnpaidFees(long unpaidFees) {
        this.unpaidFees = unpaidFees;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public double getParseTime() {
        return parseTime;
    }

    public void setParseTime(double parseTime) {
        this.parseTime = parseTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Networth networth = (Networth) o;
        return pending == networth.pending && wallet == networth.wallet && bank == networth.bank && points == networth.points && cayman == networth.cayman && vault == networth.vault && piggyBank == networth.piggyBank && items == networth.items && displayCase == networth.displayCase && bazaar == networth.bazaar && itemMarket == networth.itemMarket && properties == networth.properties && stockMarket == networth.stockMarket && auctionHouse == networth.auctionHouse && company == networth.company && bookie == networth.bookie && enlistedCars == networth.enlistedCars && loan == networth.loan && unpaidFees == networth.unpaidFees && total == networth.total && Double.compare(networth.parseTime, parseTime) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pending, wallet, bank, points, cayman, vault, piggyBank, items, displayCase, bazaar, itemMarket, properties, stockMarket, auctionHouse, company, bookie, enlistedCars, loan, unpaidFees, total, parseTime);
    }

}
