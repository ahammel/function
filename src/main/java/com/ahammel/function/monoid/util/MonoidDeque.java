package com.ahammel.function.monoid.util;

import com.ahammel.function.monoid.Monoid;

import java.util.ArrayDeque;

public class MonoidDeque<T> implements Monoid<ArrayDeque<T>> {
    @Override
    public ArrayDeque<T> append(final ArrayDeque<T> xs,
                                final ArrayDeque<T> ys) {
        final ArrayDeque<T> ret = empty();
        ret.addAll(xs);
        ret.addAll(ys);
        return ret;
    }

    @Override
    public ArrayDeque<T> sconcatAll(final ArrayDeque<T> first,
                                    final Iterable<ArrayDeque<T>> rest) {
        final ArrayDeque<T> ret = new ArrayDeque<>(first);
        for (final ArrayDeque<T> xs : rest) {
            ret.addAll(xs);
        }
        return ret;
    }

    @Override
    public ArrayDeque<T> empty() {
        return new ArrayDeque<>();
    }
}
