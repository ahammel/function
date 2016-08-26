package com.ahammel.function.semigroup;

@SuppressWarnings("WeakerAccess")
public final class SemigroupMin<T extends Comparable<T>>
        implements Semigroup<T> {
    @Override
    public T append(final T x, final T y) {
        return x.compareTo(y) < 0 ? x : y;
    }
}
