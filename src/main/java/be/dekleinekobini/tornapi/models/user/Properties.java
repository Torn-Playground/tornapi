package be.dekleinekobini.tornapi.models.user;

import be.dekleinekobini.tornapi.models.Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;

import java.util.Map;
import java.util.Objects;

public class Properties extends Model {

    @JsonProperty("owner_id")
    private long ownerId;
    @JsonProperty("property_type")
    private int propertyType;
    private String property;
    private String status;
    private int happy;
    private int upkeep;
    @JsonProperty("staff_cost")
    private int staffCost;
    private long cost;
    @JsonProperty("marketprice")
    private long marketPrice;
    private Modifications modifications;
    private Staff staff;

    public static Map<Long, Properties> of(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("properties"), new TypeReference<>() {
        });
    }

    public long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(long ownerId) {
        this.ownerId = ownerId;
    }

    public int getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(int propertyType) {
        this.propertyType = propertyType;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getHappy() {
        return happy;
    }

    public void setHappy(int happy) {
        this.happy = happy;
    }

    public int getUpkeep() {
        return upkeep;
    }

    public void setUpkeep(int upkeep) {
        this.upkeep = upkeep;
    }

    public int getStaffCost() {
        return staffCost;
    }

    public void setStaffCost(int staffCost) {
        this.staffCost = staffCost;
    }

    public long getCost() {
        return cost;
    }

    public void setCost(long cost) {
        this.cost = cost;
    }

    public long getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(long marketPrice) {
        this.marketPrice = marketPrice;
    }

    public Modifications getModifications() {
        return modifications;
    }

    public void setModifications(Modifications modifications) {
        this.modifications = modifications;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Properties that = (Properties) o;
        return ownerId == that.ownerId && propertyType == that.propertyType && happy == that.happy && upkeep == that.upkeep && staffCost == that.staffCost && cost == that.cost && marketPrice == that.marketPrice && property.equals(that.property) && status.equals(that.status) && modifications.equals(that.modifications) && staff.equals(that.staff);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ownerId, propertyType, property, status, happy, upkeep, staffCost, cost, marketPrice, modifications, staff);
    }

    public static class Modifications {

        private int interior;
        @JsonProperty("hot_tub")
        private boolean hotTub;
        private boolean sauna;
        private int pool;
        @JsonProperty("open_bar")
        private boolean openBar;
        @JsonProperty("shooting_range")
        private boolean shootingRange;
        private int vault;
        @JsonProperty("medical_facility")
        private boolean medicalFacility;
        private boolean airstrip;
        private boolean yacht;

        public int getInterior() {
            return interior;
        }

        public void setInterior(int interior) {
            this.interior = interior;
        }

        public boolean hasHotTub() {
            return hotTub;
        }

        public void setHotTub(boolean hotTub) {
            this.hotTub = hotTub;
        }

        public boolean hasSauna() {
            return sauna;
        }

        public void setSauna(boolean sauna) {
            this.sauna = sauna;
        }

        public int getPool() {
            return pool;
        }

        public void setPool(int pool) {
            this.pool = pool;
        }

        public boolean hasOpenBar() {
            return openBar;
        }

        public void setOpenBar(boolean openBar) {
            this.openBar = openBar;
        }

        public boolean hasShootingRange() {
            return shootingRange;
        }

        public void setShootingRange(boolean shootingRange) {
            this.shootingRange = shootingRange;
        }

        public int getVault() {
            return vault;
        }

        public void setVault(int vault) {
            this.vault = vault;
        }

        public boolean hasMedicalFacility() {
            return medicalFacility;
        }

        public void setMedicalFacility(boolean medicalFacility) {
            this.medicalFacility = medicalFacility;
        }

        public boolean hasAirstrip() {
            return airstrip;
        }

        public void setAirstrip(boolean airstrip) {
            this.airstrip = airstrip;
        }

        public boolean hasYacht() {
            return yacht;
        }

        public void setYacht(boolean yacht) {
            this.yacht = yacht;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Modifications that = (Modifications) o;
            return interior == that.interior && hotTub == that.hotTub && sauna == that.sauna && pool == that.pool && openBar == that.openBar && shootingRange == that.shootingRange && vault == that.vault && medicalFacility == that.medicalFacility && airstrip == that.airstrip && yacht == that.yacht;
        }

        @Override
        public int hashCode() {
            return Objects.hash(interior, hotTub, sauna, pool, openBar, shootingRange, vault, medicalFacility, airstrip, yacht);
        }

    }

    public static class Staff {

        private int maid;
        private int guard;
        private boolean pilot;
        private int butler;
        private boolean doctor;

        public int getMaid() {
            return maid;
        }

        public void setMaid(int maid) {
            this.maid = maid;
        }

        public int getGuard() {
            return guard;
        }

        public void setGuard(int guard) {
            this.guard = guard;
        }

        public boolean hasPilot() {
            return pilot;
        }

        public void setPilot(boolean pilot) {
            this.pilot = pilot;
        }

        public int getButler() {
            return butler;
        }

        public void setButler(int butler) {
            this.butler = butler;
        }

        public boolean hasDoctor() {
            return doctor;
        }

        public void setDoctor(boolean doctor) {
            this.doctor = doctor;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Staff staff = (Staff) o;
            return maid == staff.maid && guard == staff.guard && pilot == staff.pilot && butler == staff.butler && doctor == staff.doctor;
        }

        @Override
        public int hashCode() {
            return Objects.hash(maid, guard, pilot, butler, doctor);
        }

    }

}
