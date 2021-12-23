package be.dekleinekobini.tornapi.models.user;

import be.dekleinekobini.tornapi.models.Model;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Crimes extends Model {

    @JsonProperty("selling_illegal_products")
    private int sellingIllegalProducts;
    private int theft;
    @JsonProperty("auto_theft")
    private int autoTheft;
    @JsonProperty("drug_deals")
    private int drugDeals;
    @JsonProperty("computer_crimes")
    private int computerCrimes;
    private int murder;
    @JsonProperty("fraud_crimes")
    private int fraudCrimes;
    private int other;
    private int total;

    public int getSellingIllegalProducts() {
        return sellingIllegalProducts;
    }

    public void setSellingIllegalProducts(int sellingIllegalProducts) {
        this.sellingIllegalProducts = sellingIllegalProducts;
    }

    public int getTheft() {
        return theft;
    }

    public void setTheft(int theft) {
        this.theft = theft;
    }

    public int getAutoTheft() {
        return autoTheft;
    }

    public void setAutoTheft(int autoTheft) {
        this.autoTheft = autoTheft;
    }

    public int getDrugDeals() {
        return drugDeals;
    }

    public void setDrugDeals(int drugDeals) {
        this.drugDeals = drugDeals;
    }

    public int getComputerCrimes() {
        return computerCrimes;
    }

    public void setComputerCrimes(int computerCrimes) {
        this.computerCrimes = computerCrimes;
    }

    public int getMurder() {
        return murder;
    }

    public void setMurder(int murder) {
        this.murder = murder;
    }

    public int getFraudCrimes() {
        return fraudCrimes;
    }

    public void setFraudCrimes(int fraudCrimes) {
        this.fraudCrimes = fraudCrimes;
    }

    public int getOther() {
        return other;
    }

    public void setOther(int other) {
        this.other = other;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Crimes crimes = (Crimes) o;
        return sellingIllegalProducts == crimes.sellingIllegalProducts && theft == crimes.theft && autoTheft == crimes.autoTheft && drugDeals == crimes.drugDeals && computerCrimes == crimes.computerCrimes && murder == crimes.murder && fraudCrimes == crimes.fraudCrimes && other == crimes.other && total == crimes.total;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sellingIllegalProducts, theft, autoTheft, drugDeals, computerCrimes, murder, fraudCrimes, other, total);
    }

}
