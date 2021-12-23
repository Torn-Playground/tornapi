package be.dekleinekobini.tornapi.models.user;

import be.dekleinekobini.tornapi.models.Model;
import be.dekleinekobini.tornapi.models.converters.EpochLocalDateTimeConverter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.time.LocalDateTime;
import java.util.Objects;

public class Events extends Model {

    @JsonDeserialize(converter = EpochLocalDateTimeConverter.class)
    private LocalDateTime timestamp;
    private String event;
    private boolean seen;

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public boolean isSeen() {
        return seen;
    }

    public void setSeen(boolean seen) {
        this.seen = seen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Events events = (Events) o;
        return seen == events.seen && timestamp.equals(events.timestamp) && event.equals(events.event);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestamp, event, seen);
    }

}
