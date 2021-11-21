package be.dekleinekobini.tornapi.models.user;

import be.dekleinekobini.tornapi.models.user.partial.Gender;
import be.dekleinekobini.tornapi.models.user.partial.Status;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

import static org.assertj.core.data.MapEntry.entry;

@SuppressWarnings("HttpUrlsUsage")
class ProfileTest {

    @Test
    void of() throws JsonProcessingException {
        // Arrange
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode json = objectMapper.readTree("{\"rank\":\"Heroic Trader\",\"level\":94,\"gender\":\"Male\",\"property\":\"Private Island\",\"signup\":\"2018-04-18 16:26:12\",\"awards\":442,\"friends\":251,\"enemies\":31,\"forum_posts\":2681,\"karma\":3614,\"age\":1311,\"role\":\"Committee\",\"donator\":1,\"player_id\":2114440,\"name\":\"DeKleineKobini\",\"property_id\":3150854,\"competition\":null,\"life\":{\"current\":6633,\"maximum\":6633,\"increment\":397,\"interval\":300,\"ticktime\":278,\"fulltime\":0},\"status\":{\"description\":\"Okay\",\"details\":\"\",\"state\":\"Okay\",\"color\":\"green\",\"until\":0},\"job\":{\"position\":\"Employee\",\"company_id\":86818,\"company_name\":\"Jux @ Law\",\"company_type\":2},\"faction\":{\"position\":\"Thunderbird\",\"faction_id\":33007,\"days_in_faction\":17,\"faction_name\":\"HAKA\",\"faction_tag\":\"HAKA\"},\"married\":{\"spouse_id\":2122347,\"spouse_name\":\"ExKioz\",\"duration\":1280},\"basicicons\":{\"icon6\":\"Male\",\"icon4\":\"Subscriber\",\"icon10\":\"Player Committee - Member\",\"icon8\":\"Married - To ExKioz\",\"icon27\":\"Company - Attorney of Jux @ Law (Law Firm)\",\"icon9\":\"Faction - Thunderbird of HAKA\",\"icon35\":\"Bazaar - This person has items in their bazaar for sale\"},\"states\":{\"hospital_timestamp\":0,\"jail_timestamp\":0},\"last_action\":{\"status\":\"Idle\",\"timestamp\":1637362180,\"relative\":\"1 hour ago\"}}");

        // Act
        Profile profile = Profile.of(json);

        // Assert
        SoftAssertions softly = new SoftAssertions();

        softly.assertThat(profile.getRank()).isEqualTo("Heroic Trader");
        softly.assertThat(profile.getLevel()).isEqualTo(94);
        softly.assertThat(profile.getGender()).isEqualTo(Gender.Male);
        softly.assertThat(profile.getProperty()).isEqualTo("Private Island");
        softly.assertThat(profile.getSignup()).isEqualTo(LocalDateTime.of(2018, 4, 18, 16, 26, 12));
        softly.assertThat(profile.getAwards()).isEqualTo(442);
        softly.assertThat(profile.getFriends()).isEqualTo(251);
        softly.assertThat(profile.getEnemies()).isEqualTo(31);
        softly.assertThat(profile.getForumPosts()).isEqualTo(2681);
        softly.assertThat(profile.getKarma()).isEqualTo(3614);
        softly.assertThat(profile.getAge()).isEqualTo(1311);
        softly.assertThat(profile.getRole()).isEqualTo("Committee");
        softly.assertThat(profile.isDonator()).isEqualTo(true);
        softly.assertThat(profile.getPlayerId()).isEqualTo(2114440);
        softly.assertThat(profile.getName()).isEqualTo("DeKleineKobini");
        softly.assertThat(profile.getPropertyId()).isEqualTo(3150854);

        softly.assertThat(profile.getLife()).isNotNull();
        softly.assertThat(profile.getLife().getCurrent()).isEqualTo(6633);
        softly.assertThat(profile.getLife().getMaximum()).isEqualTo(6633);
        softly.assertThat(profile.getLife().getIncrement()).isEqualTo(397);
        softly.assertThat(profile.getLife().getInterval()).hasMinutes(5);
        softly.assertThat(profile.getLife().getTicktime()).hasSeconds(278);
        softly.assertThat(profile.getLife().getFulltime()).hasSeconds(0);

        softly.assertThat(profile.getStatus()).isNotNull();
        softly.assertThat(profile.getStatus().getDescription()).isEqualTo("Okay");
        softly.assertThat(profile.getStatus().getDetails()).isEqualTo("");
        softly.assertThat(profile.getStatus().getState()).isEqualTo(Status.State.Okay);
        softly.assertThat(profile.getStatus().getColor()).isEqualTo("green");
        softly.assertThat(profile.getStatus().getUntil()).isEqualTo(Instant.ofEpochSecond(0).atOffset(ZoneOffset.UTC).toLocalDateTime());

        softly.assertThat(profile.getJob()).isNotNull();
        softly.assertThat(profile.getJob().getPosition()).isEqualTo("Employee");
        softly.assertThat(profile.getJob().getCompanyId()).isEqualTo(86818);
        softly.assertThat(profile.getJob().getCompanyName()).isEqualTo("Jux @ Law");
        softly.assertThat(profile.getJob().getCompanyType()).isEqualTo(2);

        softly.assertThat(profile.getFaction()).isNotNull();
        softly.assertThat(profile.getFaction().getPosition()).isEqualTo("Thunderbird");
        softly.assertThat(profile.getFaction().getFactionId()).isEqualTo(33007);
        softly.assertThat(profile.getFaction().getDaysInFaction()).hasDays(17);
        softly.assertThat(profile.getFaction().getFactionName()).isEqualTo("HAKA");
        softly.assertThat(profile.getFaction().getFactionTag()).isEqualTo("HAKA");

        softly.assertThat(profile.getMarriage()).isNotNull();
        softly.assertThat(profile.getMarriage().getSpouseId()).isEqualTo(2122347);
        softly.assertThat(profile.getMarriage().getSpouseName()).isEqualTo("ExKioz");
        softly.assertThat(profile.getMarriage().getDuration()).hasDays(1280);

        softly.assertThat(profile.getBasicIcons())
                .isNotNull()
                .contains(
                        entry("icon6", "Male"),
                        entry("icon4", "Subscriber"),
                        entry("icon10", "Player Committee - Member"),
                        entry("icon8", "Married - To ExKioz"),
                        entry("icon27", "Company - Attorney of Jux @ Law (Law Firm)"),
                        entry("icon9", "Faction - Thunderbird of HAKA"),
                        entry("icon35", "Bazaar - This person has items in their bazaar for sale")
                );

        softly.assertThat(profile.getStates()).isNotNull();
        softly.assertThat(profile.getStates().getHospitalTimestamp()).isEqualTo(0);
        softly.assertThat(profile.getStates().getJailTimestamp()).isEqualTo(0);

        softly.assertThat(profile.getLastAction()).isNotNull();
        softly.assertThat(profile.getLastAction().getStatus()).isEqualTo(Profile.LastAction.Status.Idle);
        softly.assertThat(profile.getLastAction().getTimestamp()).isEqualTo(LocalDateTime.of(2021, 11, 19, 22, 49, 40));
        softly.assertThat(profile.getLastAction().getRelative()).isEqualTo("1 hour ago");

        softly.assertAll();
    }

    @Test
    void ofJailed() throws JsonProcessingException {
        // Arrange
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode json = objectMapper.readTree("{\"rank\":\"Heroic Trader\",\"level\":94,\"gender\":\"Male\",\"property\":\"Private Island\",\"signup\":\"2018-04-18 16:26:12\",\"awards\":442,\"friends\":251,\"enemies\":31,\"forum_posts\":2681,\"karma\":3614,\"age\":1311,\"role\":\"Committee\",\"donator\":1,\"player_id\":2114440,\"name\":\"DeKleineKobini\",\"property_id\":3150854,\"competition\":null,\"life\":{\"current\":6633,\"maximum\":6633,\"increment\":397,\"interval\":300,\"ticktime\":278,\"fulltime\":0},\"status\":{\"description\":\"In jail for 2 hrs 5 mins \",\"details\":\"Was caught trying to break out <a class='t-blue' href = http://www.torn.com/profiles.php?XID=1043531>Warrior</a>.\",\"state\":\"Jail\",\"color\":\"red\",\"until\":1637446695},\"job\":{\"position\":\"Employee\",\"company_id\":86818,\"company_name\":\"Jux @ Law\",\"company_type\":2},\"faction\":{\"position\":\"Thunderbird\",\"faction_id\":33007,\"days_in_faction\":17,\"faction_name\":\"HAKA\",\"faction_tag\":\"HAKA\"},\"married\":{\"spouse_id\":2122347,\"spouse_name\":\"ExKioz\",\"duration\":1280},\"basicicons\":{\"icon6\":\"Male\",\"icon4\":\"Subscriber\",\"icon10\":\"Player Committee - Member\",\"icon8\":\"Married - To ExKioz\",\"icon27\":\"Company - Attorney of Jux @ Law (Law Firm)\",\"icon9\":\"Faction - Thunderbird of HAKA\",\"icon35\":\"Bazaar - This person has items in their bazaar for sale\"},\"states\":{\"hospital_timestamp\":0,\"jail_timestamp\":0},\"last_action\":{\"status\":\"Idle\",\"timestamp\":1637362180,\"relative\":\"1 hour ago\"}}");

        // Act
        Profile profile = Profile.of(json);

        // Assert
        SoftAssertions softly = new SoftAssertions();

        softly.assertThat(profile.getRank()).isEqualTo("Heroic Trader");
        softly.assertThat(profile.getLevel()).isEqualTo(94);
        softly.assertThat(profile.getGender()).isEqualTo(Gender.Male);
        softly.assertThat(profile.getProperty()).isEqualTo("Private Island");
        softly.assertThat(profile.getSignup()).isEqualTo(LocalDateTime.of(2018, 4, 18, 16, 26, 12));
        softly.assertThat(profile.getAwards()).isEqualTo(442);
        softly.assertThat(profile.getFriends()).isEqualTo(251);
        softly.assertThat(profile.getEnemies()).isEqualTo(31);
        softly.assertThat(profile.getForumPosts()).isEqualTo(2681);
        softly.assertThat(profile.getKarma()).isEqualTo(3614);
        softly.assertThat(profile.getAge()).isEqualTo(1311);
        softly.assertThat(profile.getRole()).isEqualTo("Committee");
        softly.assertThat(profile.isDonator()).isEqualTo(true);
        softly.assertThat(profile.getPlayerId()).isEqualTo(2114440);
        softly.assertThat(profile.getName()).isEqualTo("DeKleineKobini");
        softly.assertThat(profile.getPropertyId()).isEqualTo(3150854);

        softly.assertThat(profile.getLife()).isNotNull();
        softly.assertThat(profile.getLife().getCurrent()).isEqualTo(6633);
        softly.assertThat(profile.getLife().getMaximum()).isEqualTo(6633);
        softly.assertThat(profile.getLife().getIncrement()).isEqualTo(397);
        softly.assertThat(profile.getLife().getInterval()).hasMinutes(5);
        softly.assertThat(profile.getLife().getTicktime()).hasSeconds(278);
        softly.assertThat(profile.getLife().getFulltime()).hasSeconds(0);

        softly.assertThat(profile.getStatus()).isNotNull();
        softly.assertThat(profile.getStatus().getDescription()).isEqualTo("In jail for 2 hrs 5 mins ");
        softly.assertThat(profile.getStatus().getDetails()).isEqualTo("Was caught trying to break out <a class='t-blue' href = http://www.torn.com/profiles.php?XID=1043531>Warrior</a>.");
        softly.assertThat(profile.getStatus().getState()).isEqualTo(Status.State.Jail);
        softly.assertThat(profile.getStatus().getColor()).isEqualTo("red");
        softly.assertThat(profile.getStatus().getUntil()).isEqualTo(LocalDateTime.of(2021, 11, 20, 22, 18, 15));

        softly.assertThat(profile.getJob()).isNotNull();
        softly.assertThat(profile.getJob().getPosition()).isEqualTo("Employee");
        softly.assertThat(profile.getJob().getCompanyId()).isEqualTo(86818);
        softly.assertThat(profile.getJob().getCompanyName()).isEqualTo("Jux @ Law");
        softly.assertThat(profile.getJob().getCompanyType()).isEqualTo(2);

        softly.assertThat(profile.getFaction()).isNotNull();
        softly.assertThat(profile.getFaction().getPosition()).isEqualTo("Thunderbird");
        softly.assertThat(profile.getFaction().getFactionId()).isEqualTo(33007);
        softly.assertThat(profile.getFaction().getDaysInFaction()).hasDays(17);
        softly.assertThat(profile.getFaction().getFactionName()).isEqualTo("HAKA");
        softly.assertThat(profile.getFaction().getFactionTag()).isEqualTo("HAKA");

        softly.assertThat(profile.getMarriage()).isNotNull();
        softly.assertThat(profile.getMarriage().getSpouseId()).isEqualTo(2122347);
        softly.assertThat(profile.getMarriage().getSpouseName()).isEqualTo("ExKioz");
        softly.assertThat(profile.getMarriage().getDuration()).hasDays(1280);

        softly.assertThat(profile.getBasicIcons())
                .isNotNull()
                .contains(
                        entry("icon6", "Male"),
                        entry("icon4", "Subscriber"),
                        entry("icon10", "Player Committee - Member"),
                        entry("icon8", "Married - To ExKioz"),
                        entry("icon27", "Company - Attorney of Jux @ Law (Law Firm)"),
                        entry("icon9", "Faction - Thunderbird of HAKA"),
                        entry("icon35", "Bazaar - This person has items in their bazaar for sale")
                );

        softly.assertThat(profile.getStates()).isNotNull();
        softly.assertThat(profile.getStates().getHospitalTimestamp()).isEqualTo(0);
        softly.assertThat(profile.getStates().getJailTimestamp()).isEqualTo(0);

        softly.assertThat(profile.getLastAction()).isNotNull();
        softly.assertThat(profile.getLastAction().getStatus()).isEqualTo(Profile.LastAction.Status.Idle);
        softly.assertThat(profile.getLastAction().getTimestamp()).isEqualTo(LocalDateTime.of(2021, 11, 19, 22, 49, 40));
        softly.assertThat(profile.getLastAction().getRelative()).isEqualTo("1 hour ago");

        softly.assertAll();
    }

}