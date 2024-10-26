package eu.tornplayground.tornapi.models.user;

import eu.tornplayground.tornapi.models.Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Getter
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
public class Discord extends Model {

    @JsonProperty("userID")
    private long userId;

    @JsonProperty("discordID")
    private String discordId;

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
