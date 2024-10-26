package eu.tornplayground.tornapi.models.user;

import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.converters.EpochLocalDateTimeConverter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import eu.tornplayground.tornapi.models.user.report.ReportData;
import eu.tornplayground.tornapi.models.user.report.ReportType;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
public class Report extends Model {

    @JsonProperty("id")
    private String id;

    @JsonProperty("user_id")
    private long userId;

    @JsonProperty("target")
    private long target;

    @JsonProperty("type")
    private ReportType type;

    @JsonProperty("report")
    private ReportData report;

    @JsonProperty("timestamp")
    @JsonDeserialize(converter = EpochLocalDateTimeConverter.class)
    private LocalDateTime timestamp;

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
}
