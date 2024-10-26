package eu.tornplayground.tornapi;

import eu.tornplayground.tornapi.connector.ApiConnector;
import eu.tornplayground.tornapi.connector.TornHttpException;
import eu.tornplayground.tornapi.keyprovider.KeyProvider;
import eu.tornplayground.tornapi.limiter.RequestLimitReachedException;
import eu.tornplayground.tornapi.selections.*;
import org.assertj.core.api.AbstractUriAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.IOException;
import java.net.URI;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TornApiTest {

    @Mock
    private ApiConnector connector;

    private TornApi api;

    private URI captureUri() throws IOException, InterruptedException, TornHttpException, TornApiErrorException, RequestLimitReachedException {
        ArgumentCaptor<String> argumentCaptorUrl = ArgumentCaptor.forClass(String.class);

        verify(connector).connect(argumentCaptorUrl.capture());

        String url = argumentCaptorUrl.getValue();

        return URI.create(url);
    }

    private AbstractUriAssert<?> assertUri(URI uri, String key) {
        return assertThat(uri)
                .hasScheme("https")
                .hasHost("api.torn.com")
                .hasParameter("key", key)
                .hasParameter("selections");
    }

    private AbstractUriAssert<?> assertUri(URI uri) {
        return assertUri(uri, "test-key");
    }

    private String[] getSelections(URI uri) {
        return Arrays.stream(uri.getQuery().split("&"))
                .filter(query -> query.startsWith("selections="))
                .map(query -> query.substring("selections=".length()))
                .findFirst()
                .orElseThrow()
                .split(",");
    }

    @BeforeEach
    void setUp() {
        this.api = new TornApi(connector, null);
    }

    @Test
    void fetchCurrentUser() throws IOException, InterruptedException, TornHttpException, TornApiErrorException, RequestLimitReachedException {
        api
                .forUser()
                .withSelections(UserSelections.PROFILE, UserSelections.PERSONALSTATS)
                .withSelections("anything")
                .withKey("test-key")
                .fetch();

        URI uri = captureUri();

        assertUri(uri)
                .hasPath("/user");

        assertThat(getSelections(uri))
                .hasSize(3)
                .contains("profile", "personalstats", "anything");
    }


    @Test
    void fetchCurrentUserWithKeyProvider() throws IOException, InterruptedException, TornHttpException, TornApiErrorException, RequestLimitReachedException {
        KeyProvider keyProvider = Mockito.mock(KeyProvider.class);

        TornApi api = new TornApi(connector, keyProvider);

        when(keyProvider.next()).thenReturn("key-provider");
        api
                .forUser()
                .withSelections(UserSelections.PROFILE, UserSelections.PERSONALSTATS)
                .withSelections("anything")
                .consumeKey()
                .fetch();

        URI uri = captureUri();

        assertUri(uri, "key-provider")
                .hasPath("/user");

        assertThat(getSelections(uri))
                .hasSize(3)
                .contains("profile", "personalstats", "anything");
    }

    @Test
    void fetchCurrentUserWithParameters() throws IOException, InterruptedException, TornHttpException, TornApiErrorException, RequestLimitReachedException {
        api
                .forUser()
                .withSelections(UserSelections.PROFILE, UserSelections.PERSONALSTATS)
                .withSelections("anything")
                .withParameter("from", 1577836800)
                .withParameter("to", 1609459199)
                .withKey("test-key")
                .fetch();

        URI uri = captureUri();

        assertUri(uri)
                .hasPath("/user")
                .hasParameter("from", "1577836800")
                .hasParameter("to", "1609459199");

        assertThat(getSelections(uri))
                .hasSize(3)
                .contains("profile", "personalstats", "anything");
    }

    @Test
    void fetchUser() throws IOException, InterruptedException, TornHttpException, TornApiErrorException, RequestLimitReachedException {
        api
                .forUser()
                .id(1)
                .withSelections(UserSelections.PROFILE, UserSelections.PERSONALSTATS)
                .withSelections("anything")
                .withKey("test-key")
                .fetch();

        URI uri = captureUri();

        assertUri(uri)
                .hasPath("/user/1");

        assertThat(getSelections(uri))
                .hasSize(3)
                .contains("profile", "personalstats", "anything");
    }

    @Test
    void fetchUserWithStringId() throws IOException, InterruptedException, TornHttpException, TornApiErrorException, RequestLimitReachedException {
        api
                .forUser()
                .id("discord-id")
                .withSelections(UserSelections.DISCORD)
                .withKey("test-key")
                .fetch();

        URI uri = captureUri();

        assertUri(uri)
                .hasPath("/user/discord-id");

        assertThat(getSelections(uri))
                .hasSize(1)
                .contains("discord");
    }

    @Test
    void fetchUserWithParameters() throws IOException, InterruptedException, TornHttpException, TornApiErrorException, RequestLimitReachedException {
        api
                .forUser()
                .id(1)
                .withSelections(UserSelections.PROFILE, UserSelections.PERSONALSTATS)
                .withSelections("anything")
                .withParameter("from", 1577836800)
                .withParameter("to", 1609459199)
                .withKey("test-key")
                .fetch();

        URI uri = captureUri();

        assertUri(uri)
                .hasPath("/user/1")
                .hasParameter("from", "1577836800")
                .hasParameter("to", "1609459199");

        assertThat(getSelections(uri))
                .hasSize(3)
                .contains("profile", "personalstats", "anything");
    }

    @Test
    void fetchUserWithParametersAndStringId() throws IOException, InterruptedException, TornHttpException, TornApiErrorException, RequestLimitReachedException {
        api
                .forUser()
                .id("discord-id")
                .withSelections(UserSelections.DISCORD)
                .withParameter("from", 1577836800)
                .withParameter("to", 1609459199)
                .withKey("test-key")
                .fetch();

        URI uri = captureUri();

        assertUri(uri)
                .hasPath("/user/discord-id")
                .hasParameter("from", "1577836800")
                .hasParameter("to", "1609459199");

        assertThat(getSelections(uri))
                .hasSize(1)
                .contains("discord");
    }

    @Test
    void fetchCurrentProperty() throws IOException, InterruptedException, TornHttpException, TornApiErrorException, RequestLimitReachedException {
        api
                .forProperties()
                .withSelections(PropertiesSelections.PROPERTY)
                .withKey("test-key")
                .fetch();

        URI uri = captureUri();

        assertUri(uri)
                .hasPath("/property");

        assertThat(getSelections(uri))
                .hasSize(1)
                .contains("property");
    }

    @Test
    void fetchCurrentFaction() throws IOException, InterruptedException, TornHttpException, TornApiErrorException, RequestLimitReachedException {
        api
                .forFaction()
                .withSelections(FactionSelections.BASIC, FactionSelections.TERRITORY)
                .withKey("test-key")
                .fetch();

        URI uri = captureUri();

        assertUri(uri)
                .hasPath("/faction");

        assertThat(getSelections(uri))
                .hasSize(2)
                .contains("basic", "territory");
    }

    @Test
    void fetchCurrentCompany() throws IOException, InterruptedException, TornHttpException, TornApiErrorException, RequestLimitReachedException {
        api
                .forCompany()
                .withSelections(CompanySelections.PROFILE, CompanySelections.EMPLOYEES)
                .withKey("test-key")
                .fetch();

        URI uri = captureUri();

        assertUri(uri)
                .hasPath("/company");

        assertThat(getSelections(uri))
                .hasSize(2)
                .contains("profile", "employees");
    }

    @Test
    void fetchMultipleItems() throws IOException, InterruptedException, TornHttpException, TornApiErrorException, RequestLimitReachedException {
        api
                .forMarket()
                .id("1,2,3")
                .withSelections(ItemMarketSelections.BAZAAR, ItemMarketSelections.ITEMMARKET)
                .withKey("test-key")
                .fetch();

        URI uri = captureUri();

        assertUri(uri)
                .hasPath("/market/1,2,3");

        assertThat(getSelections(uri))
                .hasSize(2)
                .contains("bazaar", "itemmarket");
    }

    @Test
    void fetchAllEducations() throws IOException, InterruptedException, TornHttpException, TornApiErrorException, RequestLimitReachedException {
        api
                .forTorn()
                .withSelections(TornSelections.EDUCATION)
                .withKey("test-key")
                .fetch();

        URI uri = captureUri();

        assertUri(uri)
                .hasPath("/torn");

        assertThat(getSelections(uri))
                .hasSize(1)
                .contains("education");
    }

    @Test
    void fetchKeyInformation() throws IOException, InterruptedException, TornHttpException, TornApiErrorException, RequestLimitReachedException {
        api
                .forKey()
                .withSelections(KeySelections.INFO)
                .withKey("test-key")
                .fetch();

        URI uri = captureUri();

        assertUri(uri)
                .hasPath("/key");

        assertThat(getSelections(uri))
                .hasSize(1)
                .contains("info");
    }

    @Test
    void givenNoDefaultComment_whenFetchWithoutComment_thenNoComment() throws IOException, InterruptedException, TornHttpException, TornApiErrorException, RequestLimitReachedException {
        api
                .forUser()
                .withKey("test-key")
                .fetch();

        URI uri = captureUri();

        assertUri(uri)
                .hasNoParameter("comment");
    }

    @Test
    void givenDefaultComment_whenFetchWithoutComment_thenDefaultComment() throws IOException, InterruptedException, TornHttpException, TornApiErrorException, RequestLimitReachedException {
        api.withComment("testing-default");
        api
                .forUser()
                .withKey("test-key")
                .fetch();

        URI uri = captureUri();

        assertUri(uri)
                .hasParameter("comment", "testing-default");
    }

    @Test
    void givenDefaultComment_whenFetchWithComment_thenComment() throws IOException, InterruptedException, TornHttpException, TornApiErrorException, RequestLimitReachedException {
        api.withComment("testing-default");
        api
                .forUser()
                .withKey("test-key")
                .withComment("testing")
                .fetch();

        URI uri = captureUri();

        assertUri(uri)
                .hasParameter("comment", "testing");
    }

    @Test
    void givenNoDefaultComment_whenFetchWithComment_thenComment() throws IOException, InterruptedException, TornHttpException, TornApiErrorException, RequestLimitReachedException {
        api
                .forUser()
                .withKey("test-key")
                .withComment("testing")
                .fetch();

        URI uri = captureUri();

        assertUri(uri)
                .hasParameter("comment", "testing");
    }

}