package eu.tornplayground.tornapi.models.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.converters.EpochLocalDateTimeConverter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.Objects;

@Getter
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
public class Log extends Model {

    @JsonProperty("log")
    private long logType;

    @JsonProperty("title")
    private String title;

    @JsonProperty("timestamp")
    @JsonDeserialize(converter = EpochLocalDateTimeConverter.class)
    private LocalDateTime timestamp;

    @JsonProperty("category")
    private String category;

    @JsonProperty("data")
    private Map<String, Object> data;

    @JsonProperty("params")
    @JsonIgnore // TODO add when torn fixed their s**t
    private Map<String, String> params;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Log)) return false;
        Log log = (Log) o;
        return logType == log.logType && Objects.equals(title, log.title) && Objects.equals(timestamp, log.timestamp) && Objects.equals(category, log.category) && Objects.equals(data, log.data) && Objects.equals(params, log.params);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logType, title, timestamp, category, data, params);
    }
}
