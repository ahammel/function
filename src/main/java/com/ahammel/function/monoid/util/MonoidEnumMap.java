package com.ahammel.function.monoid.util;

import com.ahammel.function.monoid.Monoid;
import lombok.RequiredArgsConstructor;

import java.util.EnumMap;

@RequiredArgsConstructor
public class MonoidEnumMap<K extends Enum<K>, V>
        implements Monoid<EnumMap<K, V>> {

    private final Class<K> keyType;

    @Override
    public EnumMap<K, V> append(final EnumMap<K, V> xs,
                                final EnumMap<K, V> ys) {
        final EnumMap<K, V> ret = empty();
        ret.putAll(xs);
        ret.putAll(ys);
        return ret;
    }

    @Override
    public EnumMap<K, V> sconcatAll(final EnumMap<K, V> first,
                                    final Iterable<EnumMap<K, V>> rest) {
        final EnumMap<K, V> ret = new EnumMap<>(first);
        for (final EnumMap<K, V> m : rest) {
            ret.putAll(m);
        }
        return ret;
    }

    @Override
    public EnumMap<K, V> empty() {
        return new EnumMap<>(this.keyType);
    }
}
