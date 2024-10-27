package eu.tornplayground.tornapi.models.user.battlestats.statinfo;

import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.user.battlestats.StatInfoType;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = false)
public class StatInfo extends Model {

    private String message;
    private short percentage;
    private StatInfoType type;
    private BattleStat stat;

}
