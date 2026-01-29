package eu.tornplayground.tornapi.models.converters;

import eu.tornplayground.tornapi.models.user.battlestats.StatInfoType;
import eu.tornplayground.tornapi.models.user.battlestats.statinfo.BattleStat;
import eu.tornplayground.tornapi.models.user.battlestats.statinfo.StatInfo;
import tools.jackson.databind.util.StdConverter;

public class StatInfoConverter extends StdConverter<String, StatInfo> {

    @Override
    public StatInfo convert(String message) {
        String[] percentageSplit = message.split(" to ");
        String[] statSplit = percentageSplit[1].split(" from ");

        final String percentage = percentageSplit[0].replace("%", "");
        final String type = statSplit[0];
        final String stat = statSplit[1];

        return StatInfo.builder()
                .message(message)
                .percentage(Short.parseShort(percentage))
                .type(StatInfoType.fromName(type))
                .stat(BattleStat.fromName(stat))
                .build();
    }

}
