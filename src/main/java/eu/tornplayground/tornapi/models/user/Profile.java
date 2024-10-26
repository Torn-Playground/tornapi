package eu.tornplayground.tornapi.models.user;

import eu.tornplayground.tornapi.models.common.OnlineStatus;
import eu.tornplayground.tornapi.models.converters.DayDurationConverter;
import eu.tornplayground.tornapi.models.converters.EpochLocalDateTimeConverter;
import eu.tornplayground.tornapi.models.converters.SignupLocalDateTimeConverter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.Objects;

public class Profile extends Basic {

    private String rank;
    private String property;
    @JsonDeserialize(converter = SignupLocalDateTimeConverter.class)
    private LocalDateTime signup;
    private int awards;
    private int friends;
    private int enemies;
    @JsonProperty("forum_posts")
    private int forumPosts;
    private int karma;
    private int age;
    private String role;
    private boolean donator;
    @JsonProperty("property_id")
    private long propertyId;
    private Life life;
    private Job job;
    private Faction faction;
    @JsonProperty("married")
    private Marriage marriage;
    @JsonProperty("basicicons")
    private Map<String, String> basicIcons;
    private States states;
    @JsonProperty("last_action")
    private LastAction lastAction;

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public LocalDateTime getSignup() {
        return signup;
    }

    public void setSignup(LocalDateTime signup) {
        this.signup = signup;
    }

    public int getAwards() {
        return awards;
    }

    public void setAwards(int awards) {
        this.awards = awards;
    }

    public int getFriends() {
        return friends;
    }

    public void setFriends(int friends) {
        this.friends = friends;
    }

    public int getEnemies() {
        return enemies;
    }

    public void setEnemies(int enemies) {
        this.enemies = enemies;
    }

    public int getForumPosts() {
        return forumPosts;
    }

    public void setForumPosts(int forumPosts) {
        this.forumPosts = forumPosts;
    }

    public int getKarma() {
        return karma;
    }

    public void setKarma(int karma) {
        this.karma = karma;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isDonator() {
        return donator;
    }

    public void setDonator(boolean donator) {
        this.donator = donator;
    }

    public long getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(long propertyId) {
        this.propertyId = propertyId;
    }

    public Life getLife() {
        return life;
    }

    public void setLife(Life life) {
        this.life = life;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Faction getFaction() {
        return faction;
    }

    public void setFaction(Faction faction) {
        this.faction = faction;
    }

    public Marriage getMarriage() {
        return marriage;
    }

    public void setMarriage(Marriage marriage) {
        this.marriage = marriage;
    }

    public Map<String, String> getBasicIcons() {
        return basicIcons;
    }

    public void setBasicIcons(Map<String, String> basicIcons) {
        this.basicIcons = basicIcons;
    }

    public States getStates() {
        return states;
    }

    public void setStates(States states) {
        this.states = states;
    }

    public LastAction getLastAction() {
        return lastAction;
    }

    public void setLastAction(LastAction lastAction) {
        this.lastAction = lastAction;
    }

    public static class Life {

        private int current;
        private int maximum;
        private int increment;
        private Duration interval;
        private Duration ticktime;
        private Duration fulltime;

        public int getCurrent() {
            return current;
        }

        public void setCurrent(int current) {
            this.current = current;
        }

        public int getMaximum() {
            return maximum;
        }

        public void setMaximum(int maximum) {
            this.maximum = maximum;
        }

        public int getIncrement() {
            return increment;
        }

        public void setIncrement(int increment) {
            this.increment = increment;
        }

        public Duration getInterval() {
            return interval;
        }

        public void setInterval(Duration interval) {
            this.interval = interval;
        }

        public Duration getTicktime() {
            return ticktime;
        }

        public void setTicktime(Duration ticktime) {
            this.ticktime = ticktime;
        }

        public Duration getFulltime() {
            return fulltime;
        }

        public void setFulltime(Duration fulltime) {
            this.fulltime = fulltime;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Life life = (Life) o;
            return current == life.current && maximum == life.maximum && increment == life.increment && Objects.equals(interval, life.interval) && Objects.equals(ticktime, life.ticktime) && Objects.equals(fulltime, life.fulltime);
        }

        @Override
        public int hashCode() {
            return Objects.hash(current, maximum, increment, interval, ticktime, fulltime);
        }
    }

    public static class Job {

        private String position;
        @JsonProperty("company_id")
        private long companyId;
        @JsonProperty("company_name")
        private String companyName;
        @JsonProperty("company_type")
        private long companyType;

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public long getCompanyId() {
            return companyId;
        }

        public void setCompanyId(long companyId) {
            this.companyId = companyId;
        }

        public String getCompanyName() {
            return companyName;
        }

        public void setCompanyName(String companyName) {
            this.companyName = companyName;
        }

        public long getCompanyType() {
            return companyType;
        }

        public void setCompanyType(long companyType) {
            this.companyType = companyType;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Job job = (Job) o;
            return companyId == job.companyId && companyType == job.companyType && Objects.equals(position, job.position) && Objects.equals(companyName, job.companyName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(position, companyId, companyName, companyType);
        }
    }

    public static class Faction {

        private String position;
        @JsonProperty("faction_id")
        private long factionId;
        @JsonProperty("days_in_faction")
        @JsonDeserialize(converter = DayDurationConverter.class)
        private Duration daysInFaction;
        @JsonProperty("faction_name")
        private String factionName;
        @JsonProperty("faction_tag")
        private String factionTag;

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public long getFactionId() {
            return factionId;
        }

        public void setFactionId(long factionId) {
            this.factionId = factionId;
        }

        public Duration getDaysInFaction() {
            return daysInFaction;
        }

        public void setDaysInFaction(Duration daysInFaction) {
            this.daysInFaction = daysInFaction;
        }

        public String getFactionName() {
            return factionName;
        }

        public void setFactionName(String factionName) {
            this.factionName = factionName;
        }

        public String getFactionTag() {
            return factionTag;
        }

        public void setFactionTag(String factionTag) {
            this.factionTag = factionTag;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Faction faction = (Faction) o;
            return factionId == faction.factionId && Objects.equals(position, faction.position) && Objects.equals(daysInFaction, faction.daysInFaction) && Objects.equals(factionName, faction.factionName) && Objects.equals(factionTag, faction.factionTag);
        }

        @Override
        public int hashCode() {
            return Objects.hash(position, factionId, daysInFaction, factionName, factionTag);
        }
    }

    public static class Marriage {

        @JsonProperty("spouse_id")
        private long spouseId;
        @JsonProperty("spouse_name")
        private String spouseName;
        @JsonDeserialize(converter = DayDurationConverter.class)
        private Duration duration;

        public long getSpouseId() {
            return spouseId;
        }

        public void setSpouseId(long spouseId) {
            this.spouseId = spouseId;
        }

        public String getSpouseName() {
            return spouseName;
        }

        public void setSpouseName(String spouseName) {
            this.spouseName = spouseName;
        }

        public Duration getDuration() {
            return duration;
        }

        public void setDuration(Duration duration) {
            this.duration = duration;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Marriage marriage = (Marriage) o;
            return spouseId == marriage.spouseId && Objects.equals(spouseName, marriage.spouseName) && Objects.equals(duration, marriage.duration);
        }

        @Override
        public int hashCode() {
            return Objects.hash(spouseId, spouseName, duration);
        }
    }

    public static class States {

        @JsonProperty("hospital_timestamp")
        private long hospitalTimestamp;
        @JsonProperty("jail_timestamp")
        private long jailTimestamp;

        public long getHospitalTimestamp() {
            return hospitalTimestamp;
        }

        public void setHospitalTimestamp(long hospitalTimestamp) {
            this.hospitalTimestamp = hospitalTimestamp;
        }

        public long getJailTimestamp() {
            return jailTimestamp;
        }

        public void setJailTimestamp(long jailTimestamp) {
            this.jailTimestamp = jailTimestamp;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            States states = (States) o;
            return hospitalTimestamp == states.hospitalTimestamp && jailTimestamp == states.jailTimestamp;
        }

        @Override
        public int hashCode() {
            return Objects.hash(hospitalTimestamp, jailTimestamp);
        }
    }

    public static class LastAction {

        private OnlineStatus status;
        @JsonDeserialize(converter = EpochLocalDateTimeConverter.class)
        private LocalDateTime timestamp;
        private String relative;

        public OnlineStatus getStatus() {
            return status;
        }

        public void setStatus(OnlineStatus status) {
            this.status = status;
        }

        public LocalDateTime getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(LocalDateTime timestamp) {
            this.timestamp = timestamp;
        }

        public String getRelative() {
            return relative;
        }

        public void setRelative(String relative) {
            this.relative = relative;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            LastAction that = (LastAction) o;
            return status == that.status && Objects.equals(timestamp, that.timestamp) && Objects.equals(relative, that.relative);
        }

        @Override
        public int hashCode() {
            return Objects.hash(status, timestamp, relative);
        }

    }

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
