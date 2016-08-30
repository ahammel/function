package com.ahammel.function.monoid.util;

import com.ahammel.function.monoid.Monoid;

import java.util.Vector;

public class MonoidVector<T> implements Monoid<Vector<T>> {
    @Override
    public Vector<T> append(final Vector<T> xs, final Vector<T> ys) {
        final Vector<T> ret = empty();
        ret.addAll(xs);
        ret.addAll(ys);
        return ret;
    }

    @Override
    public Vector<T> empty() {
        return new Vector<>();
    }

    @Override
    public Vector<T> sconcatAll(final Vector<T> first,
                                final Iterable<Vector<T>> rest) {
        final Vector<T> ret = new Vector<>(first);
        for (final Vector<T> xs : rest) {
            ret.addAll(xs);
        }
        return ret;
    }
}
