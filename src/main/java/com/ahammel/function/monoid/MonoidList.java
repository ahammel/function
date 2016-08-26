package com.ahammel.function.monoid;

import javaslang.collection.List;

@SuppressWarnings("WeakerAccess")
public final class MonoidList<T> implements Monoid<List<T>> {
    @Override
    public List<T> append(List<T> xs, List<T> ys) {
        return xs.appendAll(ys);
    }

    @Override
    public List<T> empty() {
        return List.empty();
    }
}
