package com.ahammel.function.monoid.javaslang;

import com.ahammel.function.monoid.Monoid;
import javaslang.collection.List;

@SuppressWarnings("WeakerAccess")
public final class MonoidList<T> implements Monoid<List<T>> {
    @Override
    public List<T> append(final List<T> xs, final List<T> ys) {
        return xs.appendAll(ys);
    }

    @Override
    public List<T> empty() {
        return List.empty();
    }
}
