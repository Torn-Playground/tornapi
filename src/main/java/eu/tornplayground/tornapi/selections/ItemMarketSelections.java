package eu.tornplayground.tornapi.selections;

public enum ItemMarketSelections implements Selection {

    BAZAAR,
    ITEMMARKET,
    POINTSMARKET,
    TIMESTAMP;

    @Override
    public String getSelection() {
        return name().toLowerCase();
    }

}
