package be.dekleinekobini.tornapi.models.user;

import be.dekleinekobini.tornapi.models.Model;

import java.util.Objects;

public class Notifications extends Model {

    private long messages;
    private long events;
    private long awards;
    private long competition;

    public long getMessages() {
        return messages;
    }

    public void setMessages(long messages) {
        this.messages = messages;
    }

    public long getEvents() {
        return events;
    }

    public void setEvents(long events) {
        this.events = events;
    }

    public long getAwards() {
        return awards;
    }

    public void setAwards(long awards) {
        this.awards = awards;
    }

    public long getCompetition() {
        return competition;
    }

    public void setCompetition(long competition) {
        this.competition = competition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notifications that = (Notifications) o;
        return messages == that.messages && events == that.events && awards == that.awards && competition == that.competition;
    }

    @Override
    public int hashCode() {
        return Objects.hash(messages, events, awards, competition);
    }

}
