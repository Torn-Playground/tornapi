package eu.tornplayground.tornapi.requestbuilder;

import eu.tornplayground.tornapi.RequestBuilder;
import eu.tornplayground.tornapi.TornApi;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Set;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.mock;

class RequestBuilderChainingTest {

    public static Set<Arguments> chain() {
        TornApi tornApi = new TornApi(null, mock());

        return Set.of(
                Arguments.of(tornApi.forCompanyAsync(), CompanyAsyncRequestBuilder.class),
                Arguments.of(tornApi.forCompanyRepeating(), CompanyRepeatingRequestBuilder.class),
                Arguments.of(tornApi.forCompany(), CompanyRequestBuilder.class),
                Arguments.of(tornApi.forFactionAsync(), FactionAsyncRequestBuilder.class),
                Arguments.of(tornApi.forFactionRepeating(), FactionRepeatingRequestBuilder.class),
                Arguments.of(tornApi.forFaction(), FactionRequestBuilder.class),
                Arguments.of(tornApi.forKeyAsync(), KeyAsyncRequestBuilder.class),
                Arguments.of(tornApi.forKeyRepeating(), KeyRepeatingRequestBuilder.class),
                Arguments.of(tornApi.forKey(), KeyRequestBuilder.class),
                Arguments.of(tornApi.forMarketAsync(), MarketAsyncRequestBuilder.class),
                Arguments.of(tornApi.forMarketRepeating(), MarketRepeatingRequestBuilder.class),
                Arguments.of(tornApi.forMarket(), MarketRequestBuilder.class),
                Arguments.of(tornApi.forPropertiesAsync(), PropertyAsyncRequestBuilder.class),
                Arguments.of(tornApi.forPropertiesRepeating(), PropertyRepeatingRequestBuilder.class),
                Arguments.of(tornApi.forProperties(), PropertyRequestBuilder.class),
                Arguments.of(tornApi.forTornAsync(), TornAsyncRequestBuilder.class),
                Arguments.of(tornApi.forTornRepeating(), TornRepeatingRequestBuilder.class),
                Arguments.of(tornApi.forTorn(), TornRequestBuilder.class),
                Arguments.of(tornApi.forUserAsync(), UserAsyncRequestBuilder.class),
                Arguments.of(tornApi.forUserRepeating(), UserRepeatingRequestBuilder.class),
                Arguments.of(tornApi.forUser(), UserRequestBuilder.class)
        );
    }

    @MethodSource
    @ParameterizedTest(name = "{1} works properly with chaining")
    <T extends RequestBuilder<T, ?>> void chain(RequestBuilder<T, ?> builder, Class<T> builderClazz) {
        T x = builder.id(1)
                .withTornErrorException(false)
                .id(2114440)
                .withKey("some-key")
                .withComment("some-comment")
                .withSelections("string-selections", "another-selection")
                .withParameter("some-param", "value")
                .withParameter("another-param", "anothervalue")
                .consumeKey();

        assertThat(x).isInstanceOf(builderClazz);
    }

}
