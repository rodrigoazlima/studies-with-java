package dev.rodrigoazlima.study.designpatterns.memento.history;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.LinkedBlockingQueue;

public final class Memento<T> {
    private final Queue<T> history = new ConcurrentLinkedDeque<>();

    private T current;

    public T get() {
        return current;
    }

    public T current() {
        return this.get();
    }

    public T getCurrent() {
        return this.get();
    }

    public void add(final T value) {
        current = value;
        history.add(current);
    }

    public T undo() {
        return history.element();
    }

    public T redo() {
        return current;
    }
}

