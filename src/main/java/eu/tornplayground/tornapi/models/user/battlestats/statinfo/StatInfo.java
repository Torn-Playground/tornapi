package eu.tornplayground.tornapi.models.user.battlestats.statinfo;

import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.user.battlestats.StatInfoType;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Getter
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
public class StatInfo extends Model {
    private String message;
    private short percentage;
    private StatInfoType type;
    private BattleStat stat;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StatInfo)) return false;
        StatInfo statInfo = (StatInfo) o;
        return percentage == statInfo.percentage && Objects.equals(message, statInfo.message) && type == statInfo.type && stat == statInfo.stat;
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, percentage, type, stat);
    }
}
