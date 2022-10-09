package eu.tornplayground.tornapi.models.user;

import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.converters.EpochLocalDateTimeConverter;
import eu.tornplayground.tornapi.models.user.partial.LastActionStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.time.LocalDateTime;
import java.util.Objects;

public class Revive extends Model {

    @JsonDeserialize(converter = EpochLocalDateTimeConverter.class)
    private LocalDateTime timestamp;
    private Result result;
    private double chance;
    @JsonProperty("reviver_id")
    private long reviverId;
    @JsonProperty("reviver_name")
    private String reviverName;
    @JsonProperty("reviver_faction")
    private long reviverFaction;
    @JsonProperty("reviver_factionname")
    private String reviverFactionName;
    @JsonProperty("target_id")
    private long targetId;
    @JsonProperty("target_name")
    private String targetName;
    @JsonProperty("target_faction")
    private long targetFaction;
    @JsonProperty("target_factionname")
    private String targetFactionName;
    @JsonProperty("target_hospital_reason")
    private String targetHospitalReason;
    @JsonProperty("target_early_discharge")
    private boolean targetEarlyDischarge;
    @JsonProperty("target_last_action")
    private LastAction targetLastAction;

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public double getChance() {
        return chance;
    }

    public void setChance(double chance) {
        this.chance = chance;
    }

    public long getReviverId() {
        return reviverId;
    }

    public void setReviverId(long reviverId) {
        this.reviverId = reviverId;
    }

    public String getReviverName() {
        return reviverName;
    }

    public void setReviverName(String reviverName) {
        this.reviverName = reviverName;
    }

    public long getReviverFaction() {
        return reviverFaction;
    }

    public void setReviverFaction(long reviverFaction) {
        this.reviverFaction = reviverFaction;
    }

    public String getReviverFactionName() {
        return reviverFactionName;
    }

    public void setReviverFactionName(String reviverFactionName) {
        this.reviverFactionName = reviverFactionName;
    }

    public long getTargetId() {
        return targetId;
    }

    public void setTargetId(long targetId) {
        this.targetId = targetId;
    }

    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    public long getTargetFaction() {
        return targetFaction;
    }

    public void setTargetFaction(long targetFaction) {
        this.targetFaction = targetFaction;
    }

    public String getTargetFactionName() {
        return targetFactionName;
    }

    public void setTargetFactionName(String targetFactionName) {
        this.targetFactionName = targetFactionName;
    }

    public String getTargetHospitalReason() {
        return targetHospitalReason;
    }

    public void setTargetHospitalReason(String targetHospitalReason) {
        this.targetHospitalReason = targetHospitalReason;
    }

    public boolean isTargetEarlyDischarge() {
        return targetEarlyDischarge;
    }

    public void setTargetEarlyDischarge(boolean targetEarlyDischarge) {
        this.targetEarlyDischarge = targetEarlyDischarge;
    }

    public Object getTargetLastAction() {
        return targetLastAction;
    }

    public void setTargetLastAction(LastAction targetLastAction) {
        this.targetLastAction = targetLastAction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Revive revives = (Revive) o;
        return Double.compare(revives.chance, chance) == 0 && reviverId == revives.reviverId && reviverFaction == revives.reviverFaction && targetId == revives.targetId && targetFaction == revives.targetFaction && targetEarlyDischarge == revives.targetEarlyDischarge && timestamp.equals(revives.timestamp) && result.equals(revives.result) && Objects.equals(reviverName, revives.reviverName) && Objects.equals(reviverFactionName, revives.reviverFactionName) && Objects.equals(targetName, revives.targetName) && Objects.equals(targetFactionName, revives.targetFactionName) && targetHospitalReason.equals(revives.targetHospitalReason) && targetLastAction.equals(revives.targetLastAction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestamp, result, chance, reviverId, reviverName, reviverFaction, reviverFactionName, targetId, targetName, targetFaction, targetFactionName, targetHospitalReason, targetEarlyDischarge, targetLastAction);
    }

    public enum Result {

        SUCCESS, FAILURE

    }

    public static class LastAction {

        private LastActionStatus status;
        @JsonDeserialize(converter = EpochLocalDateTimeConverter.class)
        private LocalDateTime timestamp;

        public LastActionStatus getStatus() {
            return status;
        }

        public void setStatus(LastActionStatus status) {
            this.status = status;
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
            LastAction that = (LastAction) o;
            return status == that.status && timestamp.equals(that.timestamp);
        }

        @Override
        public int hashCode() {
            return Objects.hash(status, timestamp);
        }

    }

}
