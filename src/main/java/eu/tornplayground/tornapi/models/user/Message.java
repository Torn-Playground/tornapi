package eu.tornplayground.tornapi.models.user;

import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.converters.EpochLocalDateTimeConverter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Message extends Model {

    @JsonProperty("timestamp")
    @JsonDeserialize(converter = EpochLocalDateTimeConverter.class)
    private LocalDateTime timestamp;

    @JsonProperty("ID")
    private long id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("type")
    private String type;

    @JsonProperty("title")
    private String title;

    @JsonProperty("seen")
    @Getter(value = lombok.AccessLevel.NONE)
    private boolean seen;

    @JsonProperty("read")
    @Getter(value = lombok.AccessLevel.NONE)
    private boolean read;

    public boolean hasBeenSeen() {
        return seen;
    }

    public boolean hasBeenRead() {
        return read;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Message)) return false;
        Message message = (Message) o;
        return id == message.id && seen == message.seen && read == message.read && Objects.equals(timestamp, message.timestamp) && Objects.equals(name, message.name) && Objects.equals(type, message.type) && Objects.equals(title, message.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestamp, id, name, type, title, seen, read);
    }
}
