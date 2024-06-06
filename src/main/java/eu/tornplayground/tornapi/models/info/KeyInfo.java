package eu.tornplayground.tornapi.models.info;

import eu.tornplayground.tornapi.models.Model;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.*;

public class KeyInfo extends Model {

    @JsonProperty("access_level")
    private int accessLevel;
    @JsonProperty("access_type")
    private AccessType accessType;
    private Selections selections;

    public int getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(int accessLevel) {
        this.accessLevel = accessLevel;
    }

    public AccessType getAccessType() {
        return accessType;
    }

    public void setAccessType(AccessType accessType) {
        this.accessType = accessType;
    }

    public Selections getSelections() {
        return selections;
    }

    public void setSelections(Selections selections) {
        this.selections = selections;
    }

    public enum AccessType {

        CUSTOM,
        FULL_ACCESS,
        LIMITED_ACCESS,
        MINIMAL_ACCESS,
        PUBLIC_ONLY;

        private static final Map<String, AccessType> namesMap = new HashMap<>() {{
            put("custom", CUSTOM);
            put("full access", FULL_ACCESS);
            put("limited access", LIMITED_ACCESS);
            put("minimal access", MINIMAL_ACCESS);
            put("public only", PUBLIC_ONLY);
        }};

        @JsonCreator
        public static AccessType forValue(String value) {
            return namesMap.get(value.toLowerCase());
        }

    }

    public static class Selections {

        private Set<String> user;
        private Set<String> property;
        private Set<String> faction;
        private Set<String> company;
        private Set<String> market;
        private Set<String> torn;
        private Set<String> key;

        public Set<String> getUser() {
            return user;
        }

        public void setUser(Set<String> user) {
            this.user = user;
        }

        public Set<String> getProperty() {
            return property;
        }

        public void setProperty(Set<String> property) {
            this.property = property;
        }

        public Set<String> getFaction() {
            return faction;
        }

        public void setFaction(Set<String> faction) {
            this.faction = faction;
        }

        public Set<String> getCompany() {
            return company;
        }

        public void setCompany(Set<String> company) {
            this.company = company;
        }

        public Set<String> getMarket() {
            return market;
        }

        public void setMarket(Set<String> market) {
            this.market = market;
        }

        public Set<String> getTorn() {
            return torn;
        }

        public void setTorn(Set<String> torn) {
            this.torn = torn;
        }

        public Set<String> getKey() {
            return key;
        }

        public void setKey(Set<String> key) {
            this.key = key;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Selections that = (Selections) o;
            return Objects.equals(user, that.user) && Objects.equals(property, that.property) && Objects.equals(faction, that.faction) && Objects.equals(company, that.company) && Objects.equals(market, that.market) && Objects.equals(torn, that.torn) && Objects.equals(key, that.key);
        }

        @Override
        public int hashCode() {
            return Objects.hash(user, property, faction, company, market, torn, key);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KeyInfo keyInfo = (KeyInfo) o;
        return accessLevel == keyInfo.accessLevel && accessType == keyInfo.accessType && Objects.equals(selections, keyInfo.selections);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessLevel, accessType, selections);
    }

}
