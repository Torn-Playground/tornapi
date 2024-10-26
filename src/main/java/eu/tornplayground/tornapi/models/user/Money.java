package eu.tornplayground.tornapi.models.user;

import eu.tornplayground.tornapi.models.Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.user.money.Bank;

import java.time.Duration;
import java.util.Objects;

public class Money extends Model {

    private long points;
    @JsonProperty("cayman_bank")
    private long caymanBank;
    @JsonProperty("vault_amount")
    private long vault;
    @JsonProperty("company_funds")
    private long companyFunds;
    @JsonProperty("daily_networth")
    private long dailyNetworth;
    @JsonProperty("money_onhand")
    private long moneyOnHand;
    @JsonProperty("city_bank")
    private Bank cityBank;

    public long getPoints() {
        return points;
    }

    public void setPoints(long points) {
        this.points = points;
    }

    public long getCaymanBank() {
        return caymanBank;
    }

    public void setCaymanBank(long caymanBank) {
        this.caymanBank = caymanBank;
    }

    public long getVault() {
        return vault;
    }

    public void setVault(long vault) {
        this.vault = vault;
    }

    public long getCompanyFunds() {
        return companyFunds;
    }

    public void setCompanyFunds(long companyFunds) {
        this.companyFunds = companyFunds;
    }

    public long getDailyNetworth() {
        return dailyNetworth;
    }

    public void setDailyNetworth(long dailyNetworth) {
        this.dailyNetworth = dailyNetworth;
    }

    public long getMoneyOnHand() {
        return moneyOnHand;
    }

    public void setMoneyOnHand(long moneyOnHand) {
        this.moneyOnHand = moneyOnHand;
    }

    public Bank getCityBank() {
        return cityBank;
    }

    public void setCityBank(Bank cityBank) {
        this.cityBank = cityBank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return points == money.points && caymanBank == money.caymanBank && vault == money.vault && companyFunds == money.companyFunds && moneyOnHand == money.moneyOnHand && Objects.equals(cityBank, money.cityBank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(points, caymanBank, vault, companyFunds, moneyOnHand, cityBank);
    }
}
