package eu.tornplayground.tornapi.mappers;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import eu.tornplayground.tornapi.models.user.*;

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

    public static Map<Long, Attack> ofAttacks(JsonNode json) {
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

    public static List<BazaarItem> ofBazaar(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("bazaar"), new TypeReference<>() {
        });
    }

    public static Cooldowns ofCooldowns(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("cooldowns"), Cooldowns.class);
    }

    public static CriminalRecord ofCrimes(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("criminalrecord"), CriminalRecord.class);
    }

    public static Discord ofDiscord(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("discord"), Discord.class);
    }

    public static List<DisplayItem> ofDisplay(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("display"), new TypeReference<>() {
        });
    }

    public static Education ofEducation(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json, Education.class);
    }

    public static Map<Long, Event> ofEvents(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("events"), new TypeReference<>() {
        });
    }

    public static Gym ofGym(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json, Gym.class);
    }

    public static List<Honor> ofHonors(JsonNode json) {
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

        List<Honor> honors = new ArrayList<>();
        for (int i = 0; i < awarded.size(); i++) {
            Honor honor = new Honor();
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

    public static List<InventoryItem> ofInventory(JsonNode json) {
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

    public static Map<String, Message> ofMessages(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("messages"), new TypeReference<>() {
        });
    }

    public static Missions ofMissions(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("missions"), Missions.class);
    }

    public static Money ofMoney(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json, Money.class);
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

    public static Map<Long, Property> ofProperties(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("properties"), new TypeReference<>() {
        });
    }

    public static Refills ofRefills(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("refills"), Refills.class);
    }

    public static List<Report> ofReports(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("reports"), new TypeReference<>() {
        });
    }

    public static Map<Long, Revive> ofRevives(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("revives"), new TypeReference<>() {
        });
    }

    public static Skills ofSkills(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json, Skills.class);
    }

    public static Map<Long, Stock> ofStocks(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("stocks"), new TypeReference<>() {
        });
    }

    public static Travel ofTravel(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("travel"), Travel.class);
    }

    public static List<WeaponExperience> ofWeaponExp(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json.get("weaponexp"), new TypeReference<>() {
        });
    }

    public static WorkStats ofWorkStats(JsonNode json) {
        return OBJECT_MAPPER.convertValue(json, WorkStats.class);
    }

}
