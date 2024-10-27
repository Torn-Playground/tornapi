package eu.tornplayground.tornapi.mappers;

import eu.tornplayground.tornapi.models.market.MarketItem;
import eu.tornplayground.tornapi.models.market.PointOrder;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class MarketMapperTest {

    @Test
    void ofBazaar() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode json = objectMapper.readTree("{\"bazaar\":[{\"ID\":53010894,\"cost\":50,\"quantity\":1},{\"ID\":53010895,\"cost\":50,\"quantity\":1},{\"ID\":52988991,\"cost\":53,\"quantity\":1},{\"ID\":52988992,\"cost\":53,\"quantity\":1},{\"ID\":52988993,\"cost\":53,\"quantity\":1},{\"ID\":52988994,\"cost\":53,\"quantity\":1},{\"ID\":52988995,\"cost\":53,\"quantity\":1},{\"ID\":52989032,\"cost\":53,\"quantity\":1},{\"ID\":53006670,\"cost\":53,\"quantity\":1},{\"ID\":53007600,\"cost\":53,\"quantity\":1},{\"ID\":53007601,\"cost\":53,\"quantity\":1},{\"ID\":53007602,\"cost\":53,\"quantity\":1},{\"ID\":53007603,\"cost\":53,\"quantity\":1},{\"ID\":53007604,\"cost\":53,\"quantity\":1},{\"ID\":53007605,\"cost\":53,\"quantity\":1},{\"ID\":53007606,\"cost\":53,\"quantity\":1},{\"ID\":53009177,\"cost\":53,\"quantity\":1},{\"ID\":53009178,\"cost\":53,\"quantity\":1},{\"ID\":53010036,\"cost\":53,\"quantity\":1},{\"ID\":53010945,\"cost\":53,\"quantity\":1},{\"ID\":53010946,\"cost\":53,\"quantity\":1},{\"ID\":53011239,\"cost\":53,\"quantity\":1},{\"ID\":53011240,\"cost\":53,\"quantity\":1},{\"ID\":53011241,\"cost\":53,\"quantity\":1},{\"ID\":53011242,\"cost\":53,\"quantity\":1},{\"ID\":53011243,\"cost\":53,\"quantity\":1},{\"ID\":53011244,\"cost\":53,\"quantity\":1},{\"ID\":53011245,\"cost\":53,\"quantity\":1},{\"ID\":53011617,\"cost\":53,\"quantity\":1},{\"ID\":53003268,\"cost\":55,\"quantity\":1},{\"ID\":53003269,\"cost\":55,\"quantity\":1},{\"ID\":53003270,\"cost\":55,\"quantity\":1},{\"ID\":53003271,\"cost\":55,\"quantity\":1},{\"ID\":53007033,\"cost\":55,\"quantity\":1},{\"ID\":53009326,\"cost\":55,\"quantity\":1},{\"ID\":53009327,\"cost\":55,\"quantity\":1},{\"ID\":53009328,\"cost\":55,\"quantity\":1},{\"ID\":53009329,\"cost\":55,\"quantity\":1},{\"ID\":53009330,\"cost\":55,\"quantity\":1},{\"ID\":53009511,\"cost\":55,\"quantity\":1},{\"ID\":53003263,\"cost\":60,\"quantity\":1},{\"ID\":53003264,\"cost\":60,\"quantity\":1},{\"ID\":53003265,\"cost\":60,\"quantity\":1},{\"ID\":53003266,\"cost\":60,\"quantity\":1},{\"ID\":53003267,\"cost\":60,\"quantity\":1},{\"ID\":53010470,\"cost\":60,\"quantity\":1},{\"ID\":53004801,\"cost\":66,\"quantity\":1},{\"ID\":53003257,\"cost\":70,\"quantity\":1},{\"ID\":53003258,\"cost\":70,\"quantity\":1},{\"ID\":53003259,\"cost\":70,\"quantity\":1},{\"ID\":53003260,\"cost\":70,\"quantity\":1},{\"ID\":53003261,\"cost\":70,\"quantity\":1},{\"ID\":53003262,\"cost\":70,\"quantity\":1},{\"ID\":53002414,\"cost\":75,\"quantity\":1},{\"ID\":53009306,\"cost\":75,\"quantity\":1},{\"ID\":53009307,\"cost\":75,\"quantity\":1},{\"ID\":53009308,\"cost\":75,\"quantity\":1},{\"ID\":53009309,\"cost\":75,\"quantity\":1},{\"ID\":53004259,\"cost\":80,\"quantity\":1},{\"ID\":53004260,\"cost\":80,\"quantity\":1},{\"ID\":53004261,\"cost\":80,\"quantity\":1},{\"ID\":53004262,\"cost\":80,\"quantity\":1},{\"ID\":52951095,\"cost\":99,\"quantity\":1},{\"ID\":52996898,\"cost\":99,\"quantity\":1},{\"ID\":52996900,\"cost\":99,\"quantity\":1},{\"ID\":52996901,\"cost\":99,\"quantity\":1},{\"ID\":52997360,\"cost\":100,\"quantity\":1},{\"ID\":53001894,\"cost\":100,\"quantity\":1},{\"ID\":53001895,\"cost\":100,\"quantity\":1},{\"ID\":53001896,\"cost\":100,\"quantity\":1},{\"ID\":53001897,\"cost\":100,\"quantity\":1},{\"ID\":53001898,\"cost\":100,\"quantity\":1},{\"ID\":53001899,\"cost\":100,\"quantity\":1},{\"ID\":53001900,\"cost\":100,\"quantity\":1},{\"ID\":53003753,\"cost\":100,\"quantity\":1},{\"ID\":53010275,\"cost\":100,\"quantity\":1},{\"ID\":53011400,\"cost\":100,\"quantity\":1},{\"ID\":52899387,\"cost\":120,\"quantity\":1},{\"ID\":52899395,\"cost\":120,\"quantity\":1},{\"ID\":52899396,\"cost\":120,\"quantity\":1},{\"ID\":52899397,\"cost\":120,\"quantity\":1},{\"ID\":52899398,\"cost\":120,\"quantity\":1},{\"ID\":52899399,\"cost\":120,\"quantity\":1},{\"ID\":52899400,\"cost\":120,\"quantity\":1},{\"ID\":52899401,\"cost\":120,\"quantity\":1},{\"ID\":52899402,\"cost\":120,\"quantity\":1},{\"ID\":52899403,\"cost\":120,\"quantity\":1},{\"ID\":52899404,\"cost\":120,\"quantity\":1},{\"ID\":52899405,\"cost\":120,\"quantity\":1},{\"ID\":52919421,\"cost\":120,\"quantity\":1},{\"ID\":52919422,\"cost\":120,\"quantity\":1},{\"ID\":52919423,\"cost\":120,\"quantity\":1},{\"ID\":52919424,\"cost\":120,\"quantity\":1},{\"ID\":52919425,\"cost\":120,\"quantity\":1},{\"ID\":52919426,\"cost\":120,\"quantity\":1},{\"ID\":52919427,\"cost\":120,\"quantity\":1},{\"ID\":52919428,\"cost\":120,\"quantity\":1},{\"ID\":52920513,\"cost\":120,\"quantity\":1},{\"ID\":52946535,\"cost\":120,\"quantity\":1},{\"ID\":52946536,\"cost\":120,\"quantity\":1}]}");

        List<MarketItem> result = MarketMapper.ofBazaar(json);

        SoftAssertions softly = new SoftAssertions();

        MarketItem marketItem = result.get(0);
        softly.assertThat(marketItem.getId()).isEqualTo(53010894);
        softly.assertThat(marketItem.getCost()).isEqualTo(50);
        softly.assertThat(marketItem.getQuantity()).isEqualTo(1);

        softly.assertAll();
    }

    @Test
    void ofItemMarket() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode json = objectMapper.readTree("{\"itemmarket\":[{\"ID\":139901185,\"cost\":200,\"quantity\":1},{\"ID\":139901186,\"cost\":200,\"quantity\":1},{\"ID\":139901184,\"cost\":200,\"quantity\":1},{\"ID\":139886642,\"cost\":299,\"quantity\":1},{\"ID\":139886653,\"cost\":299,\"quantity\":1},{\"ID\":139886640,\"cost\":299,\"quantity\":1},{\"ID\":139886656,\"cost\":299,\"quantity\":1},{\"ID\":139886654,\"cost\":299,\"quantity\":1},{\"ID\":139886643,\"cost\":299,\"quantity\":1},{\"ID\":139886644,\"cost\":299,\"quantity\":1},{\"ID\":139886657,\"cost\":299,\"quantity\":1},{\"ID\":139886655,\"cost\":299,\"quantity\":1},{\"ID\":139886641,\"cost\":299,\"quantity\":1},{\"ID\":139892176,\"cost\":300,\"quantity\":1},{\"ID\":139886650,\"cost\":399,\"quantity\":1},{\"ID\":139886666,\"cost\":399,\"quantity\":1},{\"ID\":139886664,\"cost\":399,\"quantity\":1},{\"ID\":139886659,\"cost\":399,\"quantity\":1},{\"ID\":139886667,\"cost\":399,\"quantity\":1},{\"ID\":139886660,\"cost\":399,\"quantity\":1},{\"ID\":139886662,\"cost\":399,\"quantity\":1},{\"ID\":139886658,\"cost\":399,\"quantity\":1},{\"ID\":139886663,\"cost\":399,\"quantity\":1},{\"ID\":139886661,\"cost\":399,\"quantity\":1},{\"ID\":139886665,\"cost\":399,\"quantity\":1},{\"ID\":139886647,\"cost\":499,\"quantity\":1},{\"ID\":139886646,\"cost\":499,\"quantity\":1},{\"ID\":139886645,\"cost\":499,\"quantity\":1},{\"ID\":139886649,\"cost\":499,\"quantity\":1},{\"ID\":139886648,\"cost\":499,\"quantity\":1},{\"ID\":140003894,\"cost\":500,\"quantity\":1},{\"ID\":138705548,\"cost\":990,\"quantity\":1},{\"ID\":138705550,\"cost\":990,\"quantity\":1},{\"ID\":138705552,\"cost\":990,\"quantity\":1},{\"ID\":138705551,\"cost\":990,\"quantity\":1},{\"ID\":138705549,\"cost\":990,\"quantity\":1},{\"ID\":138786419,\"cost\":996,\"quantity\":1},{\"ID\":138786416,\"cost\":996,\"quantity\":1},{\"ID\":138786418,\"cost\":996,\"quantity\":1},{\"ID\":138786421,\"cost\":996,\"quantity\":1},{\"ID\":138786415,\"cost\":996,\"quantity\":1},{\"ID\":138786417,\"cost\":996,\"quantity\":1},{\"ID\":138786420,\"cost\":996,\"quantity\":1},{\"ID\":138705537,\"cost\":999,\"quantity\":1},{\"ID\":138705547,\"cost\":999,\"quantity\":1},{\"ID\":139280678,\"cost\":1000,\"quantity\":1},{\"ID\":138660694,\"cost\":1000,\"quantity\":1},{\"ID\":139639789,\"cost\":1000,\"quantity\":1},{\"ID\":139990812,\"cost\":1000,\"quantity\":1},{\"ID\":139595629,\"cost\":1999,\"quantity\":1},{\"ID\":139595628,\"cost\":1999,\"quantity\":1},{\"ID\":139189558,\"cost\":2000,\"quantity\":1},{\"ID\":139189561,\"cost\":2000,\"quantity\":1},{\"ID\":139189560,\"cost\":2000,\"quantity\":1},{\"ID\":139189554,\"cost\":2000,\"quantity\":1},{\"ID\":139189555,\"cost\":2000,\"quantity\":1},{\"ID\":139189556,\"cost\":2000,\"quantity\":1},{\"ID\":139189557,\"cost\":2000,\"quantity\":1},{\"ID\":139189562,\"cost\":2000,\"quantity\":1},{\"ID\":139189559,\"cost\":2000,\"quantity\":1},{\"ID\":139226634,\"cost\":3333,\"quantity\":1},{\"ID\":139765653,\"cost\":4000,\"quantity\":1},{\"ID\":139595632,\"cost\":4999,\"quantity\":1},{\"ID\":139595633,\"cost\":4999,\"quantity\":1},{\"ID\":138622697,\"cost\":5432,\"quantity\":1},{\"ID\":138410808,\"cost\":5555,\"quantity\":1},{\"ID\":138410811,\"cost\":5555,\"quantity\":1},{\"ID\":138606497,\"cost\":5555,\"quantity\":1},{\"ID\":127729373,\"cost\":8000,\"quantity\":1},{\"ID\":127683136,\"cost\":9997,\"quantity\":1},{\"ID\":127683135,\"cost\":9997,\"quantity\":1},{\"ID\":127683137,\"cost\":9997,\"quantity\":1},{\"ID\":127677969,\"cost\":9998,\"quantity\":1},{\"ID\":127677973,\"cost\":9998,\"quantity\":1},{\"ID\":127677972,\"cost\":9998,\"quantity\":1},{\"ID\":127677975,\"cost\":9998,\"quantity\":1},{\"ID\":127677974,\"cost\":9998,\"quantity\":1},{\"ID\":127677976,\"cost\":9998,\"quantity\":1},{\"ID\":128430163,\"cost\":9999,\"quantity\":1},{\"ID\":139595634,\"cost\":9999,\"quantity\":1},{\"ID\":128430164,\"cost\":9999,\"quantity\":1},{\"ID\":128430156,\"cost\":9999,\"quantity\":1},{\"ID\":128430165,\"cost\":9999,\"quantity\":1},{\"ID\":128430162,\"cost\":9999,\"quantity\":1},{\"ID\":135233457,\"cost\":10000,\"quantity\":1},{\"ID\":135233456,\"cost\":10000,\"quantity\":1},{\"ID\":138857874,\"cost\":10000,\"quantity\":1},{\"ID\":138050011,\"cost\":13000,\"quantity\":1},{\"ID\":135233455,\"cost\":15000,\"quantity\":1},{\"ID\":134395375,\"cost\":29897,\"quantity\":1},{\"ID\":127671788,\"cost\":30000,\"quantity\":1},{\"ID\":127669050,\"cost\":55555,\"quantity\":1},{\"ID\":135584916,\"cost\":70000,\"quantity\":1},{\"ID\":127664421,\"cost\":99999,\"quantity\":1},{\"ID\":127664422,\"cost\":99999,\"quantity\":1},{\"ID\":127664432,\"cost\":99999,\"quantity\":1},{\"ID\":127664407,\"cost\":99999,\"quantity\":1},{\"ID\":127664402,\"cost\":99999,\"quantity\":1},{\"ID\":127664430,\"cost\":99999,\"quantity\":1},{\"ID\":127664431,\"cost\":99999,\"quantity\":1}]}\n");

        List<MarketItem> result = MarketMapper.ofItemMarket(json);

        SoftAssertions softly = new SoftAssertions();

        MarketItem marketItem = result.get(0);
        softly.assertThat(marketItem.getId()).isEqualTo(139901185);
        softly.assertThat(marketItem.getCost()).isEqualTo(200);
        softly.assertThat(marketItem.getQuantity()).isEqualTo(1);

        softly.assertAll();
    }

    @Test
    void ofPointsMarket() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode json = objectMapper.readTree("{\"pointsmarket\":{\"11543487\":{\"cost\":46650,\"quantity\":10,\"total_cost\":466500},\"11543489\":{\"cost\":46650,\"quantity\":10,\"total_cost\":466500},\"11627117\":{\"cost\":46490,\"quantity\":3760,\"total_cost\":174802400},\"11627118\":{\"cost\":46490,\"quantity\":3760,\"total_cost\":174802400},\"11627119\":{\"cost\":46490,\"quantity\":3760,\"total_cost\":174802400},\"11627120\":{\"cost\":46490,\"quantity\":3760,\"total_cost\":174802400},\"11627121\":{\"cost\":46490,\"quantity\":3760,\"total_cost\":174802400},\"11627178\":{\"cost\":46600,\"quantity\":25,\"total_cost\":1165000},\"11627179\":{\"cost\":46600,\"quantity\":25,\"total_cost\":1165000},\"11627180\":{\"cost\":46600,\"quantity\":25,\"total_cost\":1165000},\"11627182\":{\"cost\":46600,\"quantity\":25,\"total_cost\":1165000},\"11627184\":{\"cost\":46600,\"quantity\":25,\"total_cost\":1165000},\"11627192\":{\"cost\":46600,\"quantity\":25,\"total_cost\":1165000},\"11627193\":{\"cost\":46600,\"quantity\":25,\"total_cost\":1165000},\"11627194\":{\"cost\":46600,\"quantity\":25,\"total_cost\":1165000},\"11627195\":{\"cost\":46600,\"quantity\":25,\"total_cost\":1165000},\"11627196\":{\"cost\":46600,\"quantity\":25,\"total_cost\":1165000},\"11627204\":{\"cost\":46650,\"quantity\":5,\"total_cost\":233250},\"11627220\":{\"cost\":46600,\"quantity\":160,\"total_cost\":7456000},\"11627222\":{\"cost\":46600,\"quantity\":25,\"total_cost\":1165000},\"11627223\":{\"cost\":46569,\"quantity\":100,\"total_cost\":4656900},\"11627225\":{\"cost\":46400,\"quantity\":985,\"total_cost\":45704000},\"11627226\":{\"cost\":46500,\"quantity\":25,\"total_cost\":1162500},\"11627229\":{\"cost\":46500,\"quantity\":25,\"total_cost\":1162500},\"11627231\":{\"cost\":46490,\"quantity\":125,\"total_cost\":5811250}}}\n");

        Map<Long, PointOrder> result = MarketMapper.ofPointsMarket(json);

        SoftAssertions softly = new SoftAssertions();

        PointOrder pointOrder = result.get(11543487L);
        softly.assertThat(pointOrder.getCost()).isEqualTo(46650);
        softly.assertThat(pointOrder.getQuantity()).isEqualTo(10);
        softly.assertThat(pointOrder.getTotalCost()).isEqualTo(466500);

        softly.assertAll();
    }

}