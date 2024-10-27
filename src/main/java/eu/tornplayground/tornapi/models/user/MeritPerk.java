package eu.tornplayground.tornapi.models.user;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;

@Getter
public enum MeritPerk {

    NERVE_BAR("Nerve Bar"),
    CRITICAL_HIT_RATE("Critical Hit Rate"),
    LIFE_POINTS("Life Points"),
    CRIME_XP("Crime XP"),
    EDUCATION_LENGTH("Education Length"),
    AWARENESS("Awareness"),
    BANK_INTEREST("Bank Interest"),
    MASTERFUL_LOOTING("Masterful Looting"),
    STEALTH("Stealth"),
    HOSPITALIZING("Hospitalizing"),
    ADDICTION_MITIGATION("Addiction Mitigation"),
    EMPLOYEE_EFFECTIVENESS("Employee Effectiveness"),
    BRAWN("Brawn"),
    PROTECTION("Protection"),
    SHARPNESS("Sharpness"),
    EVASION("Evasion"),
    HEAVY_ARTILLERY_MASTERY("Heavy Artillery Mastery"),
    MACHINE_GUN_MASTERY("Machine Gun Mastery"),
    RIFLE_MASTERY("Rifle Mastery"),
    SMG_MASTERY("SMG Mastery"),
    SHOTGUN_MASTERY("Shotgun Mastery"),
    PISTOL_MASTERY("Pistol Mastery"),
    CLUB_MASTERY("Club Mastery"),
    PIERCING_MASTERY("Piercing Mastery"),
    SLASHING_MASTERY("Slashing Mastery"),
    MECHANICAL_MASTERY("Mechanical Mastery"),
    TEMPORARY_MASTERY("Temporary Mastery");

    private final String name;

    MeritPerk(String name) {
        this.name = name;
    }

    @JsonCreator
    public static MeritPerk fromName(String name) {
        for (MeritPerk skill : values()) {
            if (skill.getName().equalsIgnoreCase(name)) {
                return skill;
            }
        }
        return null;
    }
    
}
