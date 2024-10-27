package eu.tornplayground.tornapi.models.user.report;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import eu.tornplayground.tornapi.models.Model;
import eu.tornplayground.tornapi.models.converters.StringDateTimeConverter;
import eu.tornplayground.tornapi.models.user.report.reportdata.FriendOrFoeUser;
import eu.tornplayground.tornapi.models.user.report.reportdata.Reference;
import eu.tornplayground.tornapi.models.user.report.reportdata.Warrant;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = false)
public class ReportData extends Model {

    @JsonProperty("bounties")
    private List<String> bounties;

    @JsonProperty("company_history")
    private List<Reference> companyHistory;

    @JsonProperty("defense")
    private long defense;

    @JsonProperty("dexterity")
    private long dexterity;

    @JsonProperty("enemylist")
    private List<FriendOrFoeUser> enemyList;

    @JsonProperty("faction_history")
    private List<Reference> factionHistory;

    @JsonProperty("friendlist")
    private List<FriendOrFoeUser> friendList;

    @JsonProperty("invested_amount")
    private int investedAmount;

    @JsonProperty("invested_completion")
    @JsonDeserialize(converter = StringDateTimeConverter.class)
    private LocalDateTime investedCompletion;

    @JsonProperty("money")
    private long money;

    @JsonProperty("otherlist")
    private List<Warrant> otherList;

    @JsonProperty("speed")
    private long speed;

    @JsonProperty("strength")
    private long strength;

    @JsonProperty("toplist")
    private List<Warrant> topList;

    @JsonProperty("total_battlestats")
    private String totalBattleStats;

    @JsonProperty("true_level")
    private short trueLevel;

}
