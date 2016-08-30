package com.ahammel.function.monoid.util;

import com.ahammel.function.monoid.Monoid;

import java.util.ArrayList;

public class MonoidArrayList<T> implements Monoid<ArrayList<T>> {
    @Override
    public ArrayList<T> append(final ArrayList<T> xs, final ArrayList<T> ys) {
        final ArrayList<T> ret = empty();
        ret.addAll(xs);
        ret.addAll(ys);
        return ret;
    }

    @Override
    public ArrayList<T> empty() {
        return new ArrayList<>();
    }

    @Override
    public ArrayList<T> sconcatAll(final ArrayList<T> first,
                                   final Iterable<ArrayList<T>> rest) {
        final ArrayList<T> ret = new ArrayList<>(first);
        for (final ArrayList<T> xs: rest) {
            ret.addAll(xs);
        }
        return ret;
    }
}
