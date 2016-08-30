package com.ahammel.function.monoid.javaslang;

import com.ahammel.function.monoid.Monoid;
import javaslang.collection.TreeMap;


public class MonoidTreeMap<K extends Comparable<K>, V>
        implements Monoid<TreeMap<K, V>> {
    @Override
    public TreeMap<K, V> append(final TreeMap<K, V> xs,
                                final TreeMap<K, V> ys) {
        return xs.merge(ys);
    }

    @Override
    public TreeMap<K, V> empty() {
        return TreeMap.empty();
    }
}
