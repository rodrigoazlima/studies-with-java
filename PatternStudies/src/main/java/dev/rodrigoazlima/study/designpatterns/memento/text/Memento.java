package dev.rodrigoazlima.study.designpatterns.memento.text;

public class Memento {
    private final String state;

    public Memento(String stateToSave) {
        state = stateToSave;
    }

    // accessible by outer class only
    public String getSavedState() {
        return state;
    }
}
