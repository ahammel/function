package com.ahammel.function.monoid.javaslang;

import com.ahammel.function.monoid.Monoid;
import javaslang.collection.LinkedHashMap;


public class MonoidLinkedHashMap<K, V> implements Monoid<LinkedHashMap<K, V>> {
    @Override
    public LinkedHashMap<K, V> append(final LinkedHashMap<K, V> xs,
                                      final LinkedHashMap<K, V> ys) {
        return xs.merge(ys);
    }

    @Override
    public LinkedHashMap<K, V> empty() {
        return LinkedHashMap.empty();
    }
}
