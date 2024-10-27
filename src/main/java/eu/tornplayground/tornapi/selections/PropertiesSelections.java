package eu.tornplayground.tornapi.selections;

public enum PropertiesSelections implements Selection {

    PROPERTY,
    TIMESTAMP;

    @Override
    public String getSelection() {
        return name().toLowerCase();
    }

}
