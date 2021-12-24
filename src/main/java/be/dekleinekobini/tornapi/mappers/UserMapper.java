package be.dekleinekobini.tornapi.mappers;

import be.dekleinekobini.tornapi.models.user.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UserMapper extends ModelMapper {

    private UserMapper() {
    }

    public static List<Ammo> ofAmmo(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("ammo"), new TypeReference<>() {
        });
    }

    public static Map<Long, Attacks> ofAttacks(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("attacks"), new TypeReference<>() {
        });
    }

    public static Bars ofBars(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json, Bars.class);
    }

    public static Basic ofBasic(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json, Basic.class);
    }

    public static BattleStats ofBattleStats(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json, BattleStats.class);
    }

    public static List<Bazaar> ofBazaar(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("bazaar"), new TypeReference<>() {
        });
    }

    public static Cooldowns ofCooldowns(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("cooldowns"), Cooldowns.class);
    }

    public static Crimes ofCrimes(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("criminalrecord"), Crimes.class);
    }

    public static Discord ofDiscord(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("discord"), Discord.class);
    }

    public static List<Display> ofDisplay(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("display"), new TypeReference<>() {
        });
    }

    public static Education ofEducation(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json, Education.class);
    }

    public static Map<Long, Events> ofEvents(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("events"), new TypeReference<>() {
        });
    }

    public static Gym ofGym(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json, Gym.class);
    }

    public static List<Honors> ofHonors(JsonNode json) {
        List<Long> awarded = OBJECT_MAPPER.convertValue(json.get("honors_awarded"), new TypeReference<>() {
        });
        List<LocalDateTime> times = OBJECT_MAPPER
                .copy()
                .convertValue(json.get("honors_time"), new TypeReference<List<Long>>() {
                })
                .stream()
                .map((epoch) -> Instant.ofEpochSecond(epoch).atOffset(ZoneOffset.UTC).toLocalDateTime())
                .collect(Collectors.toList());
        if (awarded.size() != times.size())
            throw new IllegalStateException("Awarded honors and times should always be the same size!");

        List<Honors> honors = new ArrayList<>();
        for (int i = 0; i < awarded.size(); i++) {
            Honors honor = new Honors();
            honor.setId(awarded.get(i));
            honor.setAwarded(times.get(i));

            honors.add(honor);
        }

        return honors;
    }

    public static Map<String, HOF> ofHOF(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("halloffame"), new TypeReference<>() {
        });
    }

    public static Map<String, String> ofIcons(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("icons"), new TypeReference<>() {
        });
    }

    public static List<Inventory> ofInventory(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("inventory"), new TypeReference<>() {
        });
    }

    public static JobPoints ofJobPoints(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("jobpoints"), JobPoints.class);
    }

    public static Map<String, Log> ofLog(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("log"), new TypeReference<>() {
        });
    }

    public static Object ofMedals(JsonNode json) {
        if (true) throw new UnsupportedOperationException("Not yet implemented");
        return OBJECT_MAPPER.convertValue(json, new TypeReference<>() {
        });
    }

    public static Object ofMerits(JsonNode json) {
        if (true) throw new UnsupportedOperationException("Not yet implemented");
        return OBJECT_MAPPER.convertValue(json, new TypeReference<>() {
        });
    }

    public static Map<String, Messages> ofMessages(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("messages"), new TypeReference<>() {
        });
    }

    public static Missions ofMissions(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("missions"), Missions.class);
    }

    public static Money ofMoney(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json, Money.class);
    }

    public static Object ofNewEvents(JsonNode json) {
        if (true) throw new UnsupportedOperationException("Not yet implemented");
        return OBJECT_MAPPER.convertValue(json, new TypeReference<>() {
        });
    }

    public static Object ofNewMessages(JsonNode json) {
        if (true) throw new UnsupportedOperationException("Not yet implemented");
        return OBJECT_MAPPER.convertValue(json, new TypeReference<>() {
        });
    }

    public static Notifications ofNotifications(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("notifications"), Notifications.class);
    }

    public static Networth ofNetworth(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("networth"), Networth.class);
    }

    public static Perks ofPerks(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json, Perks.class);
    }

    public static PersonalStats ofPersonalStats(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("personalstats"), PersonalStats.class);
    }

    public static Profile ofProfile(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json, Profile.class);
    }

    public static Map<Long, Properties> ofProperties(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("properties"), new TypeReference<>() {
        });
    }

    public static Map<Long, ReceivedEvents> ofReceivedEvents(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("receivedevents"), new TypeReference<>() {
        });
    }

    public static Refills ofRefills(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("refills"), Refills.class);
    }

    public static List<Reports> ofReports(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("reports"), new TypeReference<>() {
        });
    }

    public static Map<Long, Revives> ofRevives(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("revives"), new TypeReference<>() {
        });
    }

    public static Skills ofSkills(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json, Skills.class);
    }

    public static Map<Long, Stocks> ofStocks(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("stocks"), new TypeReference<>() {
        });
    }

    public static Travel ofTravel(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("travel"), Travel.class);
    }

    public static List<WeaponExp> ofWeaponExp(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("weaponexp"), new TypeReference<>() {
        });
    }

    public static WorkStats ofWorkStats(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json, WorkStats.class);
    }

}
