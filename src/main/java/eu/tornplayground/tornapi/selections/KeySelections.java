package eu.tornplayground.tornapi.selections;

public enum KeySelections  implements Selection {

    INFO;

    @Override
    public String getSelection() {
        return name().toLowerCase();
    }

}
