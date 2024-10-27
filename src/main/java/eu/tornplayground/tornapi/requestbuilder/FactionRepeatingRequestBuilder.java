package eu.tornplayground.tornapi.requestbuilder;

import eu.tornplayground.tornapi.RepeatingRequestTask;
import eu.tornplayground.tornapi.RequestBuilder;
import eu.tornplayground.tornapi.TornApi;
import eu.tornplayground.tornapi.mappers.FactionMapper;
import eu.tornplayground.tornapi.models.faction.*;
import eu.tornplayground.tornapi.selections.FactionSelections;

import java.util.List;
import java.util.function.Consumer;

public class FactionRepeatingRequestBuilder extends RequestBuilder<FactionSelections> {
    public FactionRepeatingRequestBuilder(TornApi tornApi) {
        super(tornApi, "faction");
    }

    @Override
    public FactionRepeatingRequestBuilder throwTornError() {
        super.throwTornError();
        return this;
    }

     public RepeatingRequestTask<FactionBasic> repeatBasic(int intervalInSeconds, Consumer<FactionBasic> consumer) {
        return repeating(FactionSelections.BASIC, intervalInSeconds,FactionMapper::ofBasic, consumer);
    }

     public RepeatingRequestTask<List<FactionAttacks>> repeatAttacks(int intervalInSeconds, Consumer<List<FactionAttacks>> consumer) {
        return repeating(FactionSelections.ATTACKS, intervalInSeconds,FactionMapper::ofAttacks, consumer);
    }

     public RepeatingRequestTask<List<FactionAttacksFull>> repeatAttacksFull(int intervalInSeconds, Consumer<List<FactionAttacksFull>> consumer) {
        return repeating(FactionSelections.ATTACKSFULL, intervalInSeconds,FactionMapper::ofAttacksFull, consumer);
    }

     public RepeatingRequestTask<List<RankedWar>> repeatRankedWars(int intervalInSeconds, Consumer<List<RankedWar>> consumer) {
        return repeating(FactionSelections.RANKEDWARS, intervalInSeconds,FactionMapper::ofRankedWar, consumer);
    }

     public RepeatingRequestTask<Chain> repeatChain(int intervalInSeconds, Consumer<Chain> consumer) {
        return repeating(FactionSelections.CHAIN, intervalInSeconds,FactionMapper::ofChain, consumer);
    }
}
