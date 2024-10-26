package eu.tornplayground.tornapi.models.user;

import eu.tornplayground.tornapi.models.common.LastAction;
import eu.tornplayground.tornapi.models.converters.DayDurationConverter;
import eu.tornplayground.tornapi.models.converters.EpochLocalDateTimeConverter;
import eu.tornplayground.tornapi.models.converters.SignupLocalDateTimeConverter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import eu.tornplayground.tornapi.models.user.profile.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.Objects;

@Getter
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
public class Profile extends Basic {

    @JsonProperty("rank")
    private String rank;

    @JsonProperty("property")
    private String property;

    @JsonDeserialize(converter = SignupLocalDateTimeConverter.class)
    private LocalDateTime signup;

    @JsonProperty("awards")
    private int awards;

    @JsonProperty("friends")
    private int friends;

    @JsonProperty("enemies")
    private int enemies;

    @JsonProperty("forum_posts")
    private int forumPosts;

    @JsonProperty("karma")
    private int karma;

    @JsonProperty("age")
    private int age;

    @JsonProperty("role")
    private String role;

    @JsonProperty("donator")
    private boolean donator;

    @JsonProperty("property_id")
    private long propertyId;

    @JsonProperty("life")
    private Life life;

    @JsonProperty("job")
    private Job job;

    @JsonProperty("faction")
    private Faction faction;

    @JsonProperty("married")
    private Marriage marriage;

    @JsonProperty("basicicons")
    private Map<String, String> basicIcons;

    @JsonProperty("states")
    private States states;

    @JsonProperty("last_action")
    private LastAction lastAction;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Profile profile = (Profile) o;
        return awards == profile.awards && friends == profile.friends && enemies == profile.enemies && forumPosts == profile.forumPosts && karma == profile.karma && age == profile.age && donator == profile.donator && propertyId == profile.propertyId && Objects.equals(rank, profile.rank) && Objects.equals(property, profile.property) && Objects.equals(signup, profile.signup) && Objects.equals(role, profile.role) && Objects.equals(life, profile.life) && Objects.equals(job, profile.job) && Objects.equals(faction, profile.faction) && Objects.equals(marriage, profile.marriage) && Objects.equals(basicIcons, profile.basicIcons) && Objects.equals(states, profile.states) && Objects.equals(lastAction, profile.lastAction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), rank, property, signup, awards, friends, enemies, forumPosts, karma, age, role, donator, propertyId, life, job, faction, marriage, basicIcons, states, lastAction);
    }
}
