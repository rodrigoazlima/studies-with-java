package dev.rodrigoazlima.study.designpatterns.memento.history;

public class RunMemento {

    public static void main(final String... args) {
        final Memento<String> memento = new Memento<>();
        memento.add("state1");
        System.out.println(memento.get());
        memento.add("state2");
        System.out.println(memento.undo());
        System.out.println(memento.redo());
    }
}
