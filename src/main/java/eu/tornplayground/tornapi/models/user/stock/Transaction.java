package eu.tornplayground.tornapi.models.user.stock;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.converters.EpochLocalDateTimeConverter;

import java.time.LocalDateTime;
import java.util.Objects;

public class Transaction extends Model {

    @JsonProperty("shares")
    private long shares;

    @JsonProperty("bought_price")
    private float boughtPrice;

    @JsonProperty("time_bought")
    @JsonDeserialize(converter = EpochLocalDateTimeConverter.class)
    private LocalDateTime timeBought;

    protected Transaction() {
    }

    public long getShares() {
        return shares;
    }

    public float getBoughtPrice() {
        return boughtPrice;
    }

    public LocalDateTime getTimeBought() {
        return timeBought;
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
