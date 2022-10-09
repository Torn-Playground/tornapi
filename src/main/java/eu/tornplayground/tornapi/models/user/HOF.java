package eu.tornplayground.tornapi.models.user;

import eu.tornplayground.tornapi.models.Model;

import java.util.Objects;

public class HOF extends Model {

    public static final String ATTACKS = "attacks";
    public static final String BATTLESTATS = "battlestats";
    public static final String BUSTS = "busts";
    public static final String DEFENDS = "defends";
    public static final String NETWORTH = "networth";
    public static final String OFFENCES = "offences";
    public static final String REVIVES = "revives";
    public static final String TRAVELED = "traveled";
    public static final String WORKSTATS = "workstats";
    public static final String LEVEL = "level";
    public static final String RANK = "rank";
    public static final String RESPECT = "respect";

    private long value;
    private long rank;

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }

    public long getRank() {
        return rank;
    }

    public void setRank(long rank) {
        this.rank = rank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HOF hof = (HOF) o;
        return value == hof.value && rank == hof.rank;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, rank);
    }

}
