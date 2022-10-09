package eu.tornplayground.tornapi.models.torn;

import eu.tornplayground.tornapi.models.Model;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CompanyType extends Model {

    private String name;
    private long cost;
    @JsonProperty("default_employees")
    private int defaultEmployees;
    private Map<String, CompanyPosition> positions;
    private Map<String, CompanyStock> stock;
    private Map<String, CompanySpecial> specials;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCost() {
        return cost;
    }

    public void setCost(long cost) {
        this.cost = cost;
    }

    public int getDefaultEmployees() {
        return defaultEmployees;
    }

    public void setDefaultEmployees(int defaultEmployees) {
        this.defaultEmployees = defaultEmployees;
    }

    public Map<String, CompanyPosition> getPositions() {
        return positions;
    }

    public void setPositions(Map<String, CompanyPosition> positions) {
        this.positions = positions;
    }

    public Map<String, CompanyStock> getStock() {
        return stock;
    }

    public void setStock(Map<String, CompanyStock> stock) {
        this.stock = stock;
    }

    public Map<String, CompanySpecial> getSpecials() {
        return specials;
    }

    public void setSpecials(Map<String, CompanySpecial> specials) {
        this.specials = specials;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompanyType that = (CompanyType) o;
        return cost == that.cost && defaultEmployees == that.defaultEmployees && Objects.equals(name, that.name) && Objects.equals(positions, that.positions) && Objects.equals(stock, that.stock) && Objects.equals(specials, that.specials);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost, defaultEmployees, positions, stock, specials);
    }

    public static class CompanyPosition {

        @JsonProperty("man_required")
        private int manualRequired;
        @JsonProperty("int_required")
        private int intelligenceRequired;
        @JsonProperty("end_required")
        private int enduranceRequired;
        @JsonProperty("man_gain")
        private int manualGain;
        @JsonProperty("int_gain")
        private int intelligenceGain;
        @JsonProperty("end_gain")
        private int enduranceGain;
        @JsonProperty("special_ability")
        private SpecialPosition specialAbility;
        private String description;

        public int getManualRequired() {
            return manualRequired;
        }

        public void setManualRequired(int manualRequired) {
            this.manualRequired = manualRequired;
        }

        public int getIntelligenceRequired() {
            return intelligenceRequired;
        }

        public void setIntelligenceRequired(int intelligenceRequired) {
            this.intelligenceRequired = intelligenceRequired;
        }

        public int getEnduranceRequired() {
            return enduranceRequired;
        }

        public void setEnduranceRequired(int enduranceRequired) {
            this.enduranceRequired = enduranceRequired;
        }

        public int getManualGain() {
            return manualGain;
        }

        public void setManualGain(int manualGain) {
            this.manualGain = manualGain;
        }

        public int getIntelligenceGain() {
            return intelligenceGain;
        }

        public void setIntelligenceGain(int intelligenceGain) {
            this.intelligenceGain = intelligenceGain;
        }

        public int getEnduranceGain() {
            return enduranceGain;
        }

        public void setEnduranceGain(int enduranceGain) {
            this.enduranceGain = enduranceGain;
        }

        public SpecialPosition getSpecialAbility() {
            return specialAbility;
        }

        public void setSpecialAbility(SpecialPosition specialAbility) {
            this.specialAbility = specialAbility;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            CompanyPosition that = (CompanyPosition) o;
            return manualRequired == that.manualRequired && intelligenceRequired == that.intelligenceRequired && enduranceRequired == that.enduranceRequired && manualGain == that.manualGain && intelligenceGain == that.intelligenceGain && enduranceGain == that.enduranceGain && Objects.equals(specialAbility, that.specialAbility) && Objects.equals(description, that.description);
        }

        @Override
        public int hashCode() {
            return Objects.hash(manualRequired, intelligenceRequired, enduranceRequired, manualGain, intelligenceGain, enduranceGain, specialAbility, description);
        }

    }

    public enum SpecialPosition {

        NONE, TRAINER, SECRETARY, MANAGER, CLEANER;

        private static final Map<String, SpecialPosition> namesMap = new HashMap<>() {{
            put("none", NONE);
            put("trainer", TRAINER);
            put("secretary", SECRETARY);
            put("manager", MANAGER);
            put("cleaner", CLEANER);
        }};

        @JsonCreator
        public static SpecialPosition forValue(String value) {
            return namesMap.get(value.toLowerCase());
        }

    }

    public static class CompanyStock {

        // TODO - Get Torn to change this type.
        private Object cost;
        private long rrp;

        public Object getCost() {
            return cost;
        }

        public void setCost(Object cost) {
            this.cost = cost;
        }

        public long getRrp() {
            return rrp;
        }

        public void setRrp(long rrp) {
            this.rrp = rrp;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            CompanyStock that = (CompanyStock) o;
            return rrp == that.rrp && Objects.equals(cost, that.cost);
        }

        @Override
        public int hashCode() {
            return Objects.hash(cost, rrp);
        }

    }

    public static class CompanySpecial {

        private String effect;
        private int cost;
        @JsonProperty("rating_required")
        private int ratingRequired;

        public String getEffect() {
            return effect;
        }

        public void setEffect(String effect) {
            this.effect = effect;
        }

        public int getCost() {
            return cost;
        }

        public void setCost(int cost) {
            this.cost = cost;
        }

        public int getRatingRequired() {
            return ratingRequired;
        }

        public void setRatingRequired(int ratingRequired) {
            this.ratingRequired = ratingRequired;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            CompanySpecial that = (CompanySpecial) o;
            return cost == that.cost && ratingRequired == that.ratingRequired && Objects.equals(effect, that.effect);
        }

        @Override
        public int hashCode() {
            return Objects.hash(effect, cost, ratingRequired);
        }

    }

}
