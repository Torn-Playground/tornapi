package eu.tornplayground.tornapi.models.user;

import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.converters.EpochLocalDateTimeConverter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.time.LocalDateTime;
import java.util.Objects;

public class Report extends Model {

    private String id;
    @JsonProperty("user_id")
    private long userId;
    private long target;
    private ReportType type;
    private ReportDetails report;
    @JsonDeserialize(converter = EpochLocalDateTimeConverter.class)
    private LocalDateTime timestamp;

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

    public ReportDetails getReport() {
        return report;
    }

    public void setReport(ReportDetails reportDetails) {
        this.report = reportDetails;
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
        Report report = (Report) o;
        return userId == report.userId && target == report.target && id.equals(report.id) && type.equals(report.type) && this.report.equals(report.report) && timestamp.equals(report.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, target, type, report, timestamp);
    }

    public enum ReportType {

        STATS, MONEY
        // TODO - Implement other report types.

    }

    public static class ReportDetails {

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
            ReportDetails reportDetails = (ReportDetails) o;
            return strength == reportDetails.strength && speed == reportDetails.speed && dexterity == reportDetails.dexterity && defense == reportDetails.defense && totalBattleStats == reportDetails.totalBattleStats && money == reportDetails.money;
        }

        @Override
        public int hashCode() {
            return Objects.hash(strength, speed, dexterity, defense, totalBattleStats, money);
        }

    }

}
