package com.ahammel.function.monoid.util;

import com.ahammel.function.monoid.Monoid;

import java.util.HashMap;

public class MonoidHashMap<K, V> implements Monoid<HashMap<K, V>> {
    @Override
    public HashMap<K, V> append(final HashMap<K, V> xs,
                                final HashMap<K, V> ys) {
        final HashMap<K, V> ret = empty();
        ret.putAll(xs);
        ret.putAll(ys);
        return ret;
    }

    @Override
    public HashMap<K, V> sconcatAll(final HashMap<K, V> first,
                                    final Iterable<HashMap<K, V>> rest) {
        final HashMap<K, V> ret = new HashMap<>(first);
        for (final HashMap<K, V> x : rest) {
            ret.putAll(x);
        }
        return ret;
    }

    @Override
    public HashMap<K, V> empty() {
        return new HashMap<>();
    }
}
