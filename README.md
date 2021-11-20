```Java
ApiConnector connector = new HttpClientConnector();
KeyProvider keyProvider = new SingleKeyProvider("YOUR-API-KEY");

TornApi api = new TornApi(connector, keyProvider);

JsonNode json = api.forUsers()
        .withSelections(UserSelections.PROFILE)
        .consumeKey()
        .fetch();

Profile profile = Profile.of(json);
```