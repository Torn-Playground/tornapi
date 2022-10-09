package eu.tornplayground.tornapi.models.user;

import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.converters.EpochLocalDateTimeConverter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.Objects;

public class Stock extends Model {

    @JsonProperty("stock_id")
    private long stockId;
    @JsonProperty("total_shares")
    private long totalShares;
    private Dividend dividend;
    private Benefit benefit;
    private Map<Long, Transaction> transactions;

    public long getStockId() {
        return stockId;
    }

    public void setStockId(long stockId) {
        this.stockId = stockId;
    }

    public long getTotalShares() {
        return totalShares;
    }

    public void setTotalShares(long totalShares) {
        this.totalShares = totalShares;
    }

    public Dividend getDividend() {
        return dividend;
    }

    public void setDividend(Dividend dividend) {
        this.dividend = dividend;
    }

    public Benefit getBenefit() {
        return benefit;
    }

    public void setBenefit(Benefit benefit) {
        this.benefit = benefit;
    }

    public Map<Long, Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(Map<Long, Transaction> transactions) {
        this.transactions = transactions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stock stocks = (Stock) o;
        return stockId == stocks.stockId && totalShares == stocks.totalShares && Objects.equals(dividend, stocks.dividend) && Objects.equals(benefit, stocks.benefit) && transactions.equals(stocks.transactions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stockId, totalShares, dividend, benefit, transactions);
    }

    public static class Dividend {

        private boolean ready;
        private int increment;
        private int progress;
        private int frequency;

        public boolean isReady() {
            return ready;
        }

        public void setReady(boolean ready) {
            this.ready = ready;
        }

        public int getIncrement() {
            return increment;
        }

        public void setIncrement(int increment) {
            this.increment = increment;
        }

        public int getProgress() {
            return progress;
        }

        public void setProgress(int progress) {
            this.progress = progress;
        }

        public int getFrequency() {
            return frequency;
        }

        public void setFrequency(int frequency) {
            this.frequency = frequency;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Dividend dividend = (Dividend) o;
            return ready == dividend.ready && increment == dividend.increment && progress == dividend.progress && frequency == dividend.frequency;
        }

        @Override
        public int hashCode() {
            return Objects.hash(ready, increment, progress, frequency);
        }

    }

    public static class Benefit {

        private boolean ready;
        private int increment;
        private int progress;
        private int frequency;

        public boolean isReady() {
            return ready;
        }

        public void setReady(boolean ready) {
            this.ready = ready;
        }

        public int getIncrement() {
            return increment;
        }

        public void setIncrement(int increment) {
            this.increment = increment;
        }

        public int getProgress() {
            return progress;
        }

        public void setProgress(int progress) {
            this.progress = progress;
        }

        public int getFrequency() {
            return frequency;
        }

        public void setFrequency(int frequency) {
            this.frequency = frequency;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Benefit dividend = (Benefit) o;
            return ready == dividend.ready && increment == dividend.increment && progress == dividend.progress && frequency == dividend.frequency;
        }

        @Override
        public int hashCode() {
            return Objects.hash(ready, increment, progress, frequency);
        }

    }

    public static class Transaction {

        private long shares;
        @JsonProperty("bought_price")
        private float boughtPrice;
        @JsonDeserialize(converter = EpochLocalDateTimeConverter.class)
        @JsonProperty("time_bought")
        private LocalDateTime timeBought;

        public long getShares() {
            return shares;
        }

        public void setShares(long shares) {
            this.shares = shares;
        }

        public float getBoughtPrice() {
            return boughtPrice;
        }

        public void setBoughtPrice(float boughtPrice) {
            this.boughtPrice = boughtPrice;
        }

        public LocalDateTime getTimeBought() {
            return timeBought;
        }

        public void setTimeBought(LocalDateTime timeBought) {
            this.timeBought = timeBought;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Transaction that = (Transaction) o;
            return shares == that.shares && Float.compare(that.boughtPrice, boughtPrice) == 0 && timeBought.equals(that.timeBought);
        }

        @Override
        public int hashCode() {
            return Objects.hash(shares, boughtPrice, timeBought);
        }

    }

}
