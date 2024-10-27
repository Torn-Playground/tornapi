package eu.tornplayground.tornapi.requestbuilder;

import eu.tornplayground.tornapi.RequestBuilder;
import eu.tornplayground.tornapi.TornApi;
import eu.tornplayground.tornapi.TornApiErrorException;
import eu.tornplayground.tornapi.connector.TornHttpException;
import eu.tornplayground.tornapi.limiter.RequestLimitReachedException;
import eu.tornplayground.tornapi.mappers.FactionMapper;
import eu.tornplayground.tornapi.models.faction.*;
import eu.tornplayground.tornapi.selections.FactionSelections;

import java.io.IOException;
import java.util.List;

public class FactionRequestBuilder extends RequestBuilder<FactionSelections> {
    public FactionRequestBuilder(TornApi tornApi) {
        super(tornApi, "faction");
    }

    @Override
    public FactionRequestBuilder throwTornError() {
        super.throwTornError();
        return this;
    }

    public FactionBasic fetchBasic() throws IOException, TornHttpException, InterruptedException, TornApiErrorException, RequestLimitReachedException {
        return fetch(FactionSelections.BASIC, FactionMapper::ofBasic);
    }

    public List<FactionAttacks> fetchAttacks() throws IOException, TornHttpException, InterruptedException, TornApiErrorException, RequestLimitReachedException {
        return fetch(FactionSelections.ATTACKS, FactionMapper::ofAttacks);
    }

    public List<FactionAttacksFull> fetchAttacksFull() throws IOException, TornHttpException, InterruptedException, TornApiErrorException, RequestLimitReachedException {
        return fetch(FactionSelections.ATTACKSFULL, FactionMapper::ofAttacksFull);
    }

    public List<RankedWar> fetchRankedWars() throws IOException, TornHttpException, InterruptedException, TornApiErrorException, RequestLimitReachedException {
        return fetch(FactionSelections.RANKEDWARS, FactionMapper::ofRankedWar);
    }

    public Chain fetchChain() throws IOException, TornHttpException, InterruptedException, TornApiErrorException, RequestLimitReachedException {
        return fetch(FactionSelections.CHAIN, FactionMapper::ofChain);
    }
}
