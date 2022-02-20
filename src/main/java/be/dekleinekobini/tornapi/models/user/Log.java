package be.dekleinekobini.tornapi.models.user;

import be.dekleinekobini.tornapi.models.Model;
import be.dekleinekobini.tornapi.models.converters.EpochLocalDateTimeConverter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.Objects;

public class Log extends Model {

    private long log;
    private String title;
    @JsonDeserialize(converter = EpochLocalDateTimeConverter.class)
    private LocalDateTime timestamp;
    private String category;
    private Map<String, Object> data;
    @JsonIgnore // FIXME - Implement after Torn solves the type.
    private Map<String, String> params;

    public long getLog() {
        return log;
    }

    public void setLog(long log) {
        this.log = log;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    public Map<String, String> getParams() {
        return params;
    }

    public void setParams(Map<String, String> params) {
        this.params = params;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Log log1 = (Log) o;
        return log == log1.log && Objects.equals(title, log1.title) && Objects.equals(timestamp, log1.timestamp) && Objects.equals(category, log1.category) && Objects.equals(data, log1.data) && Objects.equals(params, log1.params);
    }

    @Override
    public int hashCode() {
        return Objects.hash(log, title, timestamp, category, data, params);
    }

}
