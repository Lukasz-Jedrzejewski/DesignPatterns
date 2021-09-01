package com.legion.iterator;

public interface Iterator<T> {
    boolean hasNext();
    T current();
    void next();
}
