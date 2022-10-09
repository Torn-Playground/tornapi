package eu.tornplayground.tornapi.models.user;

import eu.tornplayground.tornapi.models.Model;

import java.time.Duration;
import java.util.Objects;

public class Cooldowns extends Model {

    private Duration drug;
    private Duration medical;
    private Duration booster;

    public Duration getDrug() {
        return drug;
    }

    public void setDrug(Duration drug) {
        this.drug = drug;
    }

    public Duration getMedical() {
        return medical;
    }

    public void setMedical(Duration medical) {
        this.medical = medical;
    }

    public Duration getBooster() {
        return booster;
    }

    public void setBooster(Duration booster) {
        this.booster = booster;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cooldowns cooldowns = (Cooldowns) o;
        return Objects.equals(drug, cooldowns.drug) && Objects.equals(medical, cooldowns.medical) && Objects.equals(booster, cooldowns.booster);
    }

    @Override
    public int hashCode() {
        return Objects.hash(drug, medical, booster);
    }

}
