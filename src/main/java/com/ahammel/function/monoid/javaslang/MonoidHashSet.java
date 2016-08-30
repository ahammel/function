package com.ahammel.function.monoid.javaslang;

import com.ahammel.function.monoid.Monoid;
import javaslang.collection.HashSet;

public class MonoidHashSet<T> implements Monoid<HashSet<T>> {
    @Override
    public HashSet<T> append(final HashSet<T> xs, final HashSet<T> ys) {
        return xs.addAll(ys);
    }

    @Override
    public HashSet<T> empty() {
        return HashSet.empty();
    }
}
