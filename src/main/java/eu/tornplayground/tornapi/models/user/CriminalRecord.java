package eu.tornplayground.tornapi.models.user;

import eu.tornplayground.tornapi.models.Model;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class CriminalRecord extends Model {

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
        CriminalRecord criminalRecord = (CriminalRecord) o;
        return sellingIllegalProducts == criminalRecord.sellingIllegalProducts && theft == criminalRecord.theft && autoTheft == criminalRecord.autoTheft && drugDeals == criminalRecord.drugDeals && computerCrimes == criminalRecord.computerCrimes && murder == criminalRecord.murder && fraudCrimes == criminalRecord.fraudCrimes && other == criminalRecord.other && total == criminalRecord.total;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sellingIllegalProducts, theft, autoTheft, drugDeals, computerCrimes, murder, fraudCrimes, other, total);
    }

}
