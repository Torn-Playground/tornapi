package be.dekleinekobini.tornapi.models.user;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class PerksTest {

    @Test
    void of() throws JsonProcessingException {
        // Arrange
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode json = objectMapper.readTree("{\"job_perks\":[\"+ Ability to revive\",\"- 10% Education length\"],\"property_perks\":[\"+ Access to airstrip\",\"+ 1% Life regeneration\",\"+ 2% Damage\",\"+ 2% Gym gains\"],\"stock_perks\":[\"10% Bank Interest Bonus (TCB)\"],\"merit_perks\":[\"+ 10 Maximum nerve\",\"+ 4% Critical hit rate\",\"+ 200% Awareness\",\"+ Bank interest rate\",\"+ 30% Strength\",\"+ 30% Speed\",\"+ 30% Dexterity\",\"+ 30% Defense\",\"+ 45% Life\",\"+ Rifle dmg/acc\"],\"education_perks\":[\"+ 10% Japanese blade damage\",\"+ 2% Melee damage\",\"+ Ability to find medieval coins\",\"+ Ability to find sculptures and Quran pages\",\"+ Ability to find senet board and amulets\",\"+ Museum unlocked\",\"+ 1% Damage\",\"+ 10% Neck hit damage\",\"- 25% Opponent stealth\",\"+ 3% Critical hit chance\",\"+ Medical booster equipping\",\"+ Pharmacy unlocked\",\"+ 1% Strength gym gains\",\"+ 1% Speed gym gains\",\"+ 1% Defense gym gains\",\"+ 1% Dexterity gym gains\",\"+ 10% Temporary booster effectiveness\",\"+ 1% Gym gains\",\"+ Coding of simple virus unlocked\",\"+ Coding of polymorphic and tunneling virus\",\"+ Hacking unlocked\",\"+ Coding of armored and stealth virus\",\"+ 10% Hacking success rate\",\"+ Anonymous mailing unlocked\",\"+ 10% Awareness\",\"+ 10% crime success rate\",\"+ Kick attack unlocked\",\"+ 100% Fist damage\",\"+ 1.00 Machine gun accuracy\",\"+ 1.00 SMG accuracy\",\"+ 1.00 Pistol accuracy\",\"+ 1.00 Rifle accuracy\",\"+ 1.00 Heavy artillery accuracy\",\"+ Weapon experience unlocked\",\"+ Jail escape chance\",\"+ Self bailing unlocked\",\"- 5% Estate agent cost\",\"- Escape jail nerve cost\",\"+ Company advertising effectiveness\",\"+ Driving crimes unlocked\",\"+ 1.00 Temporary weapon accuracy\",\"+ 5% Temporary weapon damage\",\"+ 15% Hunting bonus\",\"+ 1.00 Shotgun accuracy\",\"+ Sports shop unlocked\",\"+ Withdraw and deliver blood\",\"+ 1% Company productivity\",\"+ 5% Strength\",\"+ 14% Speed\",\"+ 19% Dexterity\",\"+ 11% Defense\",\"+ 20% Medical item effectiveness\",\"- 30% Virus coding time\",\"+ 65% Busting skill\",\"- 57.25% Bail cost\"],\"enhancer_perks\":[\"+ Search for cash success rate (Pair of Glasses)\",\"+ Bootlegging success rate (High-Speed DVD Drive)\",\"+ Shoplifting success rate (Mountain Bike)\",\"+ Pickpocketing success rate (Cut-Throat Razor)\",\"+ Larceny success rate (Slim Crowbar)\",\"+ Armed robbery success rate (Balaclava)\",\"+ Transport drugs success rate (Advanced Driving Tactics)\",\"+ Computer virus success rate (Ergonomic Keyboard)\",\"+ Assassination success rate (Tracking Device)\",\"+ Grand theft auto success rate (Screwdriver)\",\"+ Pawn shop success rate (Fanny Pack)\",\"+ Counterfeiting success rate (Tumble Dryer)\",\"+ Kidnapping success rate (Chloroform)\",\"+ Arms Trafficking success rate (Heavy Duty Padlock)\",\"+ Bombing success rate (Duct Tape)\",\"+ Hacking success rate (Wireless Dongle)\",\"+ 10% Church praying bonus (Rosary Beads)\",\"+ 4 Travel items (Large Suitcase)\"],\"company_perks\":[\"+ 50% decreased bail costs\",\"+ Easier to bust more people at once\",\"+ 20% organised crime skill\",\"+ View success chance of potential busts\"],\"faction_perks\":[\"+ Increases maximum nerve by 40\",\"+ Provides a 25% passive bonus to crime EXP\",\"+ Decreases all jail time by 28%\",\"+ Decreases bust nerve cost by 2\",\"+ Increase bust success chance by 50%\",\"+ Increases happy gain from candy by 50%\",\"+ Increases energy gain from energy drinks by 50%\",\"+ Adds 24 hours of maximum booster cooldown\",\"+ Increases nerve gain from alcohol by 50%\",\"+ Reduces the side effects of drugs and increases addiction mitigation by 30%\",\"+ Decreases risk of overdose by 30%\",\"+ Reduces drug addiction gain by 50%\",\"+ Increases maximum traveling capacity by 10\",\"+ Reduces rehabilitation costs by 12%\",\"+ Increases strength gym gains by 15%\",\"+ Increases speed gym gains by 10%\",\"+ Increases defense gym gains by 15%\",\"+ Increases dexterity gym gains by 10%\",\"+ Increases strength passively by 1%\",\"+ Increases speed passively by 1%\"],\"book_perks\":[\"+ Doubles candy effects for 31 days\"]}\n");

        // Act
        Perks result = Perks.of(json);

        // Assert
        SoftAssertions softly = new SoftAssertions();

        softly.assertThat(result.getJobPerks())
                .hasSize(2)
                .containsExactlyInAnyOrderElementsOf(List.of(
                        "+ Ability to revive",
                        "- 10% Education length"
                ));
        softly.assertThat(result.getPropertyPerks())
                .hasSize(4)
                .containsExactlyInAnyOrderElementsOf(List.of(
                        "+ Access to airstrip",
                        "+ 1% Life regeneration",
                        "+ 2% Damage",
                        "+ 2% Gym gains"
                ));
        softly.assertThat(result.getStockPerks())
                .hasSize(1)
                .containsExactlyInAnyOrderElementsOf(List.of(
                        "10% Bank Interest Bonus (TCB)"
                ));
        softly.assertThat(result.getMeritPerks())
                .hasSize(10)
                .containsExactlyInAnyOrderElementsOf(List.of(
                        "+ 10 Maximum nerve",
                        "+ 4% Critical hit rate",
                        "+ 200% Awareness",
                        "+ Bank interest rate",
                        "+ 30% Strength",
                        "+ 30% Speed",
                        "+ 30% Dexterity",
                        "+ 30% Defense",
                        "+ 45% Life",
                        "+ Rifle dmg/acc"
                ));
        softly.assertThat(result.getEducationPerks())
                .hasSize(55)
                .containsExactlyInAnyOrderElementsOf(List.of(
                        "+ 10% Japanese blade damage",
                        "+ 2% Melee damage",
                        "+ Ability to find medieval coins",
                        "+ Ability to find sculptures and Quran pages",
                        "+ Ability to find senet board and amulets",
                        "+ Museum unlocked",
                        "+ 1% Damage",
                        "+ 10% Neck hit damage",
                        "- 25% Opponent stealth",
                        "+ 3% Critical hit chance",
                        "+ Medical booster equipping",
                        "+ Pharmacy unlocked",
                        "+ 1% Strength gym gains",
                        "+ 1% Speed gym gains",
                        "+ 1% Defense gym gains",
                        "+ 1% Dexterity gym gains",
                        "+ 10% Temporary booster effectiveness",
                        "+ 1% Gym gains",
                        "+ Coding of simple virus unlocked",
                        "+ Coding of polymorphic and tunneling virus",
                        "+ Hacking unlocked",
                        "+ Coding of armored and stealth virus",
                        "+ 10% Hacking success rate",
                        "+ Anonymous mailing unlocked",
                        "+ 10% Awareness",
                        "+ 10% crime success rate",
                        "+ Kick attack unlocked",
                        "+ 100% Fist damage",
                        "+ 1.00 Machine gun accuracy",
                        "+ 1.00 SMG accuracy",
                        "+ 1.00 Pistol accuracy",
                        "+ 1.00 Rifle accuracy",
                        "+ 1.00 Heavy artillery accuracy",
                        "+ Weapon experience unlocked",
                        "+ Jail escape chance",
                        "+ Self bailing unlocked",
                        "- 5% Estate agent cost",
                        "- Escape jail nerve cost",
                        "+ Company advertising effectiveness",
                        "+ Driving crimes unlocked",
                        "+ 1.00 Temporary weapon accuracy",
                        "+ 5% Temporary weapon damage",
                        "+ 15% Hunting bonus",
                        "+ 1.00 Shotgun accuracy",
                        "+ Sports shop unlocked",
                        "+ Withdraw and deliver blood",
                        "+ 1% Company productivity",
                        "+ 5% Strength",
                        "+ 14% Speed",
                        "+ 19% Dexterity",
                        "+ 11% Defense",
                        "+ 20% Medical item effectiveness",
                        "- 30% Virus coding time",
                        "+ 65% Busting skill",
                        "- 57.25% Bail cost"
                ));
        softly.assertThat(result.getEnhancerPerks())
                .hasSize(18)
                .containsExactlyInAnyOrderElementsOf(List.of(
                        "+ Search for cash success rate (Pair of Glasses)",
                        "+ Bootlegging success rate (High-Speed DVD Drive)",
                        "+ Shoplifting success rate (Mountain Bike)",
                        "+ Pickpocketing success rate (Cut-Throat Razor)",
                        "+ Larceny success rate (Slim Crowbar)",
                        "+ Armed robbery success rate (Balaclava)",
                        "+ Transport drugs success rate (Advanced Driving Tactics)",
                        "+ Computer virus success rate (Ergonomic Keyboard)",
                        "+ Assassination success rate (Tracking Device)",
                        "+ Grand theft auto success rate (Screwdriver)",
                        "+ Pawn shop success rate (Fanny Pack)",
                        "+ Counterfeiting success rate (Tumble Dryer)",
                        "+ Kidnapping success rate (Chloroform)",
                        "+ Arms Trafficking success rate (Heavy Duty Padlock)",
                        "+ Bombing success rate (Duct Tape)",
                        "+ Hacking success rate (Wireless Dongle)",
                        "+ 10% Church praying bonus (Rosary Beads)",
                        "+ 4 Travel items (Large Suitcase)"
                ));
        softly.assertThat(result.getCompanyPerks())
                .hasSize(4)
                .containsExactlyInAnyOrderElementsOf(List.of(
                        "+ 50% decreased bail costs",
                        "+ Easier to bust more people at once",
                        "+ 20% organised crime skill",
                        "+ View success chance of potential busts"
                ));
        softly.assertThat(result.getFactionPerks())
                .hasSize(20)
                .containsExactlyInAnyOrderElementsOf(List.of(
                        "+ Increases maximum nerve by 40",
                        "+ Provides a 25% passive bonus to crime EXP",
                        "+ Decreases all jail time by 28%",
                        "+ Decreases bust nerve cost by 2",
                        "+ Increase bust success chance by 50%",
                        "+ Increases happy gain from candy by 50%",
                        "+ Increases energy gain from energy drinks by 50%",
                        "+ Adds 24 hours of maximum booster cooldown",
                        "+ Increases nerve gain from alcohol by 50%",
                        "+ Reduces the side effects of drugs and increases addiction mitigation by 30%",
                        "+ Decreases risk of overdose by 30%",
                        "+ Reduces drug addiction gain by 50%",
                        "+ Increases maximum traveling capacity by 10",
                        "+ Reduces rehabilitation costs by 12%",
                        "+ Increases strength gym gains by 15%",
                        "+ Increases speed gym gains by 10%",
                        "+ Increases defense gym gains by 15%",
                        "+ Increases dexterity gym gains by 10%",
                        "+ Increases strength passively by 1%",
                        "+ Increases speed passively by 1%"
                ));
        softly.assertThat(result.getBookPerks())
                .hasSize(1)
                .containsExactlyInAnyOrderElementsOf(List.of(
                        "+ Doubles candy effects for 31 days"
                ));

        softly.assertAll();
    }

}