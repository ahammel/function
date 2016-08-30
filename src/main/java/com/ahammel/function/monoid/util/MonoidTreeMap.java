package com.ahammel.function.monoid.util;

import com.ahammel.function.monoid.Monoid;

import java.util.Comparator;
import java.util.TreeMap;

public class MonoidTreeMap<K, V> implements Monoid<TreeMap<K, V>> {
    private Comparator<? super K> comparator;

    @Override
    public TreeMap<K, V> append(final TreeMap<K, V> xs, final TreeMap<K, V> ys) {
        final TreeMap<K, V> ret = empty();
        ret.putAll(xs);
        ret.putAll(ys);
        return ret;
    }

    @Override
    public TreeMap<K, V> sconcatAll(final TreeMap<K, V> first,
                                    final Iterable<TreeMap<K, V>> rest) {
        final TreeMap<K, V> ret = empty();
        ret.putAll(first);
        for (final TreeMap<K, V> x: rest) {
            ret.putAll(x);
        }
        return ret;
    }

    @Override
    public TreeMap<K, V> empty() {
       return comparator == null ? new TreeMap<>() : new TreeMap<>(comparator);
    }

    public MonoidTreeMap() { }

    public MonoidTreeMap(final Comparator<? super K> comparator) {
        this.comparator = comparator;
    }
}
