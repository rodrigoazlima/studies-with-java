package dev.rodrigoazlima.study.designpatterns.memento.generic;

public class TestMemento {

    public static void main(final String... args) {
        final Memento<String> memento = new Memento<>();
        memento.set("state1");
        System.out.println(memento.lastEntered());
        memento.persist();
        memento.set("state2");
        System.out.println(memento.lastEntered());
        System.out.println(memento.lastSaved());
    }
}
