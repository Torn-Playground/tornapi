package be.dekleinekobini.tornapi.models.user;

import be.dekleinekobini.tornapi.models.Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

import java.util.Objects;

public class WorkStats extends Model {

    @JsonProperty("manual_labor")
    private long manualLabor;
    private long intelligence;
    private long endurance;

    public static WorkStats of(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json, WorkStats.class);
    }

    public long getManualLabor() {
        return manualLabor;
    }

    public void setManualLabor(long manualLabor) {
        this.manualLabor = manualLabor;
    }

    public long getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(long intelligence) {
        this.intelligence = intelligence;
    }

    public long getEndurance() {
        return endurance;
    }

    public void setEndurance(long endurance) {
        this.endurance = endurance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkStats workStats = (WorkStats) o;
        return manualLabor == workStats.manualLabor && intelligence == workStats.intelligence && endurance == workStats.endurance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(manualLabor, intelligence, endurance);
    }
}
