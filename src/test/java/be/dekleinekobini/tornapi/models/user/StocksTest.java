package be.dekleinekobini.tornapi.models.user;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class StocksTest {

    @Test
    void of() throws JsonProcessingException {
        // Arrange
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode json = objectMapper.readTree("{\"stocks\":{\"1\":{\"stock_id\":1,\"total_shares\":3000000,\"dividend\":{\"ready\":0,\"increment\":1,\"progress\":25,\"frequency\":31},\"transactions\":{\"1680534\":{\"shares\":3000000,\"bought_price\":885.61,\"time_bought\":1633181321}}},\"2\":{\"stock_id\":2,\"total_shares\":1500000,\"benefit\":{\"ready\":1,\"increment\":1,\"progress\":7,\"frequency\":7},\"transactions\":{\"1910085\":{\"shares\":1500000,\"bought_price\":985.95,\"time_bought\":1636324898}}},\"5\":{\"stock_id\":5,\"total_shares\":3000000,\"dividend\":{\"ready\":0,\"increment\":1,\"progress\":18,\"frequency\":31},\"transactions\":{\"223959\":{\"shares\":3000000,\"bought_price\":147.88,\"time_bought\":1617714000}}},\"6\":{\"stock_id\":6,\"total_shares\":1500000,\"dividend\":{\"ready\":0,\"increment\":2,\"progress\":18,\"frequency\":31},\"transactions\":{\"338059\":{\"shares\":1500000,\"bought_price\":213.35,\"time_bought\":1617737352}}},\"7\":{\"stock_id\":7,\"total_shares\":150000,\"dividend\":{\"ready\":0,\"increment\":1,\"progress\":4,\"frequency\":7},\"transactions\":{\"223951\":{\"shares\":150000,\"bought_price\":327.5,\"time_bought\":1617714000}}},\"9\":{\"stock_id\":9,\"total_shares\":300000,\"dividend\":{\"ready\":0,\"increment\":2,\"progress\":18,\"frequency\":31},\"transactions\":{\"338151\":{\"shares\":300000,\"bought_price\":209.64,\"time_bought\":1617737467}}},\"12\":{\"stock_id\":12,\"total_shares\":6000000,\"dividend\":{\"ready\":0,\"increment\":1,\"progress\":18,\"frequency\":31},\"transactions\":{\"682860\":{\"shares\":6000000,\"bought_price\":150.36,\"time_bought\":1620390529}}},\"15\":{\"stock_id\":15,\"total_shares\":6000000,\"dividend\":{\"ready\":0,\"increment\":2,\"progress\":4,\"frequency\":7},\"transactions\":{\"1114160\":{\"shares\":6000000,\"bought_price\":662.33,\"time_bought\":1625576887}}},\"16\":{\"stock_id\":16,\"total_shares\":1500000,\"dividend\":{\"ready\":0,\"increment\":2,\"progress\":4,\"frequency\":7},\"transactions\":{\"335645\":{\"shares\":1500000,\"bought_price\":732.01,\"time_bought\":1617734396}}},\"17\":{\"stock_id\":17,\"total_shares\":500000,\"dividend\":{\"ready\":0,\"increment\":1,\"progress\":4,\"frequency\":7},\"transactions\":{\"315588\":{\"shares\":500000,\"bought_price\":340.61,\"time_bought\":1617716605}}},\"18\":{\"stock_id\":18,\"total_shares\":1000000,\"dividend\":{\"ready\":0,\"increment\":1,\"progress\":4,\"frequency\":7},\"transactions\":{\"338994\":{\"shares\":1000000,\"bought_price\":479.17,\"time_bought\":1617738452}}},\"19\":{\"stock_id\":19,\"total_shares\":1000000,\"dividend\":{\"ready\":0,\"increment\":1,\"progress\":4,\"frequency\":7},\"transactions\":{\"1680536\":{\"shares\":1000000,\"bought_price\":235.63,\"time_bought\":1633181389}}},\"24\":{\"stock_id\":24,\"total_shares\":5000000,\"dividend\":{\"ready\":0,\"increment\":1,\"progress\":4,\"frequency\":7},\"transactions\":{\"1117412\":{\"shares\":5000000,\"bought_price\":421.43,\"time_bought\":1625604531}}},\"29\":{\"stock_id\":29,\"total_shares\":2450000,\"dividend\":{\"ready\":0,\"increment\":3,\"progress\":4,\"frequency\":7},\"transactions\":{\"489139\":{\"shares\":2450000,\"bought_price\":568.48,\"time_bought\":1618315615}}},\"32\":{\"stock_id\":32,\"total_shares\":1000000,\"dividend\":{\"ready\":0,\"increment\":1,\"progress\":4,\"frequency\":7},\"transactions\":{\"1117624\":{\"shares\":1000000,\"bought_price\":261.17,\"time_bought\":1625606287}}}}}");

        // Act
        Map<Long, Stocks> result = Stocks.of(json);

        // Assert
        Stocks.Dividend tsbDividend = new Stocks.Dividend();
        tsbDividend.setReady(false);
        tsbDividend.setIncrement(1);
        tsbDividend.setProgress(25);
        tsbDividend.setFrequency(31);

        Stocks.Transaction tsbTransaction = new Stocks.Transaction();
        tsbTransaction.setShares(3000000);
        tsbTransaction.setBoughtPrice(885.61f);
        tsbTransaction.setTimeBought(LocalDateTime.of(2021, 10, 2, 13, 28, 41));

        Stocks tsb = new Stocks();
        tsb.setStockId(1);
        tsb.setTotalShares(3000000);
        tsb.setDividend(tsbDividend);
        tsb.setTransactions(new HashMap<>() {{
            put(1680534L, tsbTransaction);
        }});

        Stocks.Dividend tmiDividend = new Stocks.Dividend();
        tmiDividend.setReady(false);
        tmiDividend.setIncrement(1);
        tmiDividend.setProgress(18);
        tmiDividend.setFrequency(31);

        Stocks.Transaction tmiTransaction = new Stocks.Transaction();
        tmiTransaction.setShares(6000000);
        tmiTransaction.setBoughtPrice(150.36f);
        tmiTransaction.setTimeBought(LocalDateTime.of(2021, 5, 7, 12, 28, 49));

        Stocks tmi = new Stocks();
        tmi.setStockId(12);
        tmi.setTotalShares(6000000);
        tmi.setDividend(tmiDividend);
        tmi.setTransactions(new HashMap<>() {{
            put(682860L, tmiTransaction);
        }});

        assertThat(result)
                .hasSize(15)
                .containsEntry(1L, tsb)
                .containsEntry(12L, tmi);
    }

}