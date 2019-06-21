package ru.geekbrain.HW.HW4;

import java.util.Iterator;

public interface LinkIterator<E> extends Iterator<E> {

    void insertAfter(E value);
    void insertBefore(E value);
    E next();
    void reset();

    E deleteCurrent();
    E getCurrent();

    boolean atEnd();
}
