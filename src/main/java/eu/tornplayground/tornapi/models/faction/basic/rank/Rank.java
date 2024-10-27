package eu.tornplayground.tornapi.models.faction.basic.rank;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;

@Getter
public enum Rank {

    BRONZE("Bronze"),
    DIAMOND("Diamond"),
    GOLD("Gold"),
    PLATINUM("Platinum"),
    SILVER("Silver"),
    UNRANKED("Unranked");

    private final String rank;

    Rank(String rank) {
        this.rank = rank;
    }

    @JsonCreator
    public static Rank fromString(String rank) {
        for (Rank r : Rank.values()) {
            if (r.rank.equalsIgnoreCase(rank)) {
                return r;
            }
        }
        return null;
    }

}
