package be.dekleinekobini.tornapi.models.user;

import be.dekleinekobini.tornapi.models.Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

import java.util.Objects;

public class Discord extends Model {

    @JsonProperty("userID")
    private long userId;
    @JsonProperty("discordID")
    private String discordId;

    public static Discord of(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("discord"), Discord.class);
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getDiscordId() {
        return discordId;
    }

    public void setDiscordId(String discordId) {
        this.discordId = discordId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Discord discord = (Discord) o;
        return userId == discord.userId && Objects.equals(discordId, discord.discordId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, discordId);
    }

}
