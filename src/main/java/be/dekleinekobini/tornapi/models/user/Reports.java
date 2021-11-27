package be.dekleinekobini.tornapi.models.user;

import be.dekleinekobini.tornapi.models.Model;
import be.dekleinekobini.tornapi.models.converters.EpochLocalDateTimeConverter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class Reports extends Model {

    private String id;
    @JsonProperty("user_id")
    private long userId;
    private long target;
    private ReportType type;
    private Report report;
    @JsonDeserialize(converter = EpochLocalDateTimeConverter.class)
    private LocalDateTime timestamp;

    public static List<Reports> of(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("reports"), new TypeReference<>() {
        });
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getTarget() {
        return target;
    }

    public void setTarget(long target) {
        this.target = target;
    }

    public ReportType getType() {
        return type;
    }

    public void setType(ReportType type) {
        this.type = type;
    }

    public Object getReport() {
        return report;
    }

    public void setReport(Report report) {
        this.report = report;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reports reports = (Reports) o;
        return userId == reports.userId && target == reports.target && id.equals(reports.id) && type.equals(reports.type) && report.equals(reports.report) && timestamp.equals(reports.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, target, type, report, timestamp);
    }

    public enum ReportType {

        STATS, MONEY
        // TODO - Implement other report types.

    }

    public static class Report {

        private long strength;
        private long speed;
        private long dexterity;
        private long defense;
        @JsonProperty("total_battlestats")
        private long totalBattleStats;
        private long money;
        // TODO - Implement other report types.

        public long getStrength() {
            return strength;
        }

        public void setStrength(long strength) {
            this.strength = strength;
        }

        public long getSpeed() {
            return speed;
        }

        public void setSpeed(long speed) {
            this.speed = speed;
        }

        public long getDexterity() {
            return dexterity;
        }

        public void setDexterity(long dexterity) {
            this.dexterity = dexterity;
        }

        public long getDefense() {
            return defense;
        }

        public void setDefense(long defense) {
            this.defense = defense;
        }

        public long getTotalBattleStats() {
            return totalBattleStats;
        }

        public void setTotalBattleStats(long totalBattleStats) {
            this.totalBattleStats = totalBattleStats;
        }

        public long getMoney() {
            return money;
        }

        public void setMoney(long money) {
            this.money = money;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Report report = (Report) o;
            return strength == report.strength && speed == report.speed && dexterity == report.dexterity && defense == report.defense && totalBattleStats == report.totalBattleStats && money == report.money;
        }

        @Override
        public int hashCode() {
            return Objects.hash(strength, speed, dexterity, defense, totalBattleStats, money);
        }

    }

}
