package com.ahammel.function.monoid.javaslang;

import com.ahammel.function.monoid.Monoid;
import javaslang.collection.HashMap;

public class MonoidHashMap<K, V> implements Monoid<HashMap<K, V>> {
    @Override
    public HashMap<K, V> append(final HashMap<K, V> xs,
                                final HashMap<K, V> ys) {
        return xs.merge(ys);
    }

    @Override
    public HashMap<K, V> empty() {
        return HashMap.empty();
    }
}
