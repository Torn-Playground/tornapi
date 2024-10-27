package eu.tornplayground.tornapi;

import eu.tornplayground.tornapi.cache.DefaultResponseCache;
import eu.tornplayground.tornapi.cache.ResponseCache;
import eu.tornplayground.tornapi.connector.ApiConnector;
import eu.tornplayground.tornapi.keyprovider.KeyProvider;
import eu.tornplayground.tornapi.limiter.DefaultRequestLimiter;
import eu.tornplayground.tornapi.limiter.RequestLimiter;
import eu.tornplayground.tornapi.requestbuilder.*;

public class TornApi {

    private final ApiConnector connector;
    private final KeyProvider keyProvider;
    private RequestLimiter requestLimiter;
    private ResponseCache responseCache;
    private String comment;
    private boolean automaticKeyConsumption = false;

    public TornApi(ApiConnector connector, KeyProvider keyProvider) {
        this.connector = connector;
        this.keyProvider = keyProvider;
    }

    protected ApiConnector getConnector() {
        return connector;
    }

    protected KeyProvider getKeyProvider() {
        return keyProvider;
    }

    protected RequestLimiter getRequestLimiter() {
        return requestLimiter;
    }

    public TornApi withRequestLimiter(RequestLimiter requestLimiter) {
        this.requestLimiter = requestLimiter;
        return this;
    }

    protected ResponseCache getResponseCache() {
        return responseCache;
    }

    /**
     * Uses the default request limiter. {@link DefaultRequestLimiter}
     */
    public TornApi withDefaultRequestLimiter() {
        return withRequestLimiter(new DefaultRequestLimiter());
    }

    public TornApi withResponseCache(ResponseCache responseCache) {
        this.responseCache = responseCache;
        return this;
    }

    /**
     * Uses the default cache. {@link DefaultResponseCache}
     */
    public TornApi withDefaultResponseCache() {
        this.responseCache = new DefaultResponseCache();
        return this;
    }

    protected String getComment() {
        return comment;
    }

    public TornApi withComment(String comment) {
        this.comment = comment;
        return this;
    }

    protected boolean hasAutomaticKeyConsumption() {
        return automaticKeyConsumption;
    }

    public TornApi withAutomaticKeyConsumption(boolean enabled) {
        this.automaticKeyConsumption = enabled;
        return this;
    }

    public UserRequestBuilder forUser() {
        return new UserRequestBuilder(this);
    }

    public UserAsyncRequestBuilder forUserAsync() {
        return new UserAsyncRequestBuilder(this);
    }

    public UserRepeatingRequestBuilder forUserRepeating() {
        return new UserRepeatingRequestBuilder(this);
    }

    public PropertyRequestBuilder forProperties() {
        return new PropertyRequestBuilder(this);
    }

    public PropertyAsyncRequestBuilder forPropertiesAsync() {
        return new PropertyAsyncRequestBuilder(this);
    }

    public PropertyRepeatingRequestBuilder forPropertiesRepeating() {
        return new PropertyRepeatingRequestBuilder(this);
    }

    public FactionRequestBuilder forFaction() {
        return new FactionRequestBuilder(this);
    }

    public FactionAsyncRequestBuilder forFactionAsync() {
        return new FactionAsyncRequestBuilder(this);
    }

    public FactionRepeatingRequestBuilder forFactionRepeating() {
        return new FactionRepeatingRequestBuilder(this);
    }

    public CompanyRequestBuilder forCompany() {
        return new CompanyRequestBuilder(this);
    }

    public CompanyAsyncRequestBuilder forCompanyAsync() {
        return new CompanyAsyncRequestBuilder(this);
    }

    public CompanyRepeatingRequestBuilder forCompanyRepeating() {
        return new CompanyRepeatingRequestBuilder(this);
    }

    public MarketRequestBuilder forMarket() {
        return new MarketRequestBuilder(this);
    }

    public MarketAsyncRequestBuilder forMarketAsync() {
        return new MarketAsyncRequestBuilder(this);
    }

    public MarketRepeatingRequestBuilder forMarketRepeating() {
        return new MarketRepeatingRequestBuilder(this);
    }

    public TornRequestBuilder forTorn() {
        return new TornRequestBuilder(this);
    }

    public TornAsyncRequestBuilder forTornAsync() {
        return new TornAsyncRequestBuilder(this);
    }

    public TornRepeatingRequestBuilder forTornRepeating() {
        return new TornRepeatingRequestBuilder(this);
    }

    public KeyRequestBuilder forKey() {
        return new KeyRequestBuilder(this);
    }

    public KeyAsyncRequestBuilder forKeyAsync() {
        return new KeyAsyncRequestBuilder(this);
    }

    public KeyRepeatingRequestBuilder forKeyRepeating() {
        return new KeyRepeatingRequestBuilder(this);
    }

}
