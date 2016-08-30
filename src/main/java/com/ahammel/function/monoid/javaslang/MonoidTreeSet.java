package com.ahammel.function.monoid.javaslang;

import com.ahammel.function.monoid.Monoid;
import javaslang.collection.TreeSet;
import lombok.RequiredArgsConstructor;

import java.util.Comparator;


@RequiredArgsConstructor
public class MonoidTreeSet<T> implements Monoid<TreeSet<T>> {
    private final Comparator<? super T> comparator;

    @Override
    public TreeSet<T> append(final TreeSet<T> xs, final TreeSet<T> ys) {
        return xs.addAll(ys);
    }

    @Override
    public TreeSet<T> empty() {
        return TreeSet.empty(this.comparator);
    }
}
