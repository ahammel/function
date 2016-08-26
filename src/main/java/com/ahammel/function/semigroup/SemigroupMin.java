package com.ahammel.function.semigroup;

@SuppressWarnings("WeakerAccess")
public final class SemigroupMin<T extends Comparable<T>>
        implements Semigroup<T> {
    @Override
    public T append(T x, T y) {
        return x.compareTo(y) < 0 ? x : y;
    }
}
