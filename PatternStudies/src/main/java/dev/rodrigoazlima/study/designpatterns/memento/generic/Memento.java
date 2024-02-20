package dev.rodrigoazlima.study.designpatterns.memento.generic;

import java.util.ArrayDeque;
import java.util.Queue;

public class Memento<T> {
    private final Queue<T> queue = new ArrayDeque<>();

    private T currentValue;

    public void set(final T value) {
        currentValue = value;
    }

    public void persist() {
        queue.add(currentValue);
    }

    public T lastSaved() {
        return queue.element();
    }

    public T lastEntered() {
        return currentValue;
    }
}

