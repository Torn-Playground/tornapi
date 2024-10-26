package eu.tornplayground.tornapi.models.converters;

import com.fasterxml.jackson.databind.util.StdConverter;
import eu.tornplayground.tornapi.models.user.battlestats.StatInfoType;
import eu.tornplayground.tornapi.models.user.battlestats.statinfo.BattleStat;
import eu.tornplayground.tornapi.models.user.battlestats.statinfo.StatInfo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class StatInfoConverter extends StdConverter<String, StatInfo> {


    @Override
    public StatInfo convert(String value) {

        try {
            String[] percentageSplit = value.split(" to ");
            String[] statSplit = percentageSplit[1].split(" from ");

            final String message = value;
            final String percentage = percentageSplit[0].replace("%", "");
            final String type = statSplit[0];
            final String stat = statSplit[1];

            Constructor<StatInfo> statsInfoConstructor = StatInfo.class.getDeclaredConstructor();
            statsInfoConstructor.setAccessible(true);

            StatInfo statInfo = statsInfoConstructor.newInstance();

            Field messageField = StatInfo.class.getDeclaredField("message");
            messageField.setAccessible(true);
            messageField.set(statInfo, message);

            Field percentageField = StatInfo.class.getDeclaredField("percentage");
            percentageField.setAccessible(true);
            percentageField.setShort(statInfo, Short.parseShort(percentage));

            Field typeField = StatInfo.class.getDeclaredField("type");
            typeField.setAccessible(true);
            typeField.set(statInfo, StatInfoType.fromName(type));

            Field statField = StatInfo.class.getDeclaredField("stat");
            statField.setAccessible(true);
            statField.set(statInfo, BattleStat.fromName(stat));

            return statInfo;
        } catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException |
                 NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }
}
