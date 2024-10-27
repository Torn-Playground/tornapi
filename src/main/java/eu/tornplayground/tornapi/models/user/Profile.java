package eu.tornplayground.tornapi.models.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import eu.tornplayground.tornapi.models.common.LastAction;
import eu.tornplayground.tornapi.models.converters.SignupLocalDateTimeConverter;
import eu.tornplayground.tornapi.models.user.profile.*;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.Map;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = false)
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

}
