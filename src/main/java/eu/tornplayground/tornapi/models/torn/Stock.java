package eu.tornplayground.tornapi.models.torn;

import eu.tornplayground.tornapi.models.Model;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Stock extends Model {

    @JsonProperty("stock_id")
    private long id;
    private String name;
    private String acronym;
    @JsonProperty("current_price")
    private float currentPrice;
    @JsonProperty("market_cap")
    private long marketCap;
    @JsonProperty("total_shares")
    private long totalShares;
    private Benefit benefit;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    public float getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(float currentPrice) {
        this.currentPrice = currentPrice;
    }

    public long getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(long marketCap) {
        this.marketCap = marketCap;
    }

    public long getTotalShares() {
        return totalShares;
    }

    public void setTotalShares(long totalShares) {
        this.totalShares = totalShares;
    }

    public Benefit getBenefit() {
        return benefit;
    }

    public void setBenefit(Benefit benefit) {
        this.benefit = benefit;
    }

    public static class Benefit {

        private Type type;
        private int frequency;
        private long requirement;
        private String description;

        public Type getType() {
            return type;
        }

        public void setType(Type type) {
            this.type = type;
        }

        public int getFrequency() {
            return frequency;
        }

        public void setFrequency(int frequency) {
            this.frequency = frequency;
        }

        public long getRequirement() {
            return requirement;
        }

        public void setRequirement(long requirement) {
            this.requirement = requirement;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public enum Type {

            ACTIVE, PASSIVE;

            @JsonCreator
            public static Type forValue(String value) {
                return valueOf(value.toUpperCase());
            }

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Benefit benefit = (Benefit) o;
            return frequency == benefit.frequency && requirement == benefit.requirement && type == benefit.type && Objects.equals(description, benefit.description);
        }

        @Override
        public int hashCode() {
            return Objects.hash(type, frequency, requirement, description);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stock stock = (Stock) o;
        return id == stock.id && Float.compare(stock.currentPrice, currentPrice) == 0 && marketCap == stock.marketCap && totalShares == stock.totalShares && Objects.equals(name, stock.name) && Objects.equals(acronym, stock.acronym) && Objects.equals(benefit, stock.benefit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, acronym, currentPrice, marketCap, totalShares, benefit);
    }

}
