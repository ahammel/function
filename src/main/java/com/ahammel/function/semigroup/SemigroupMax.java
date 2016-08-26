package com.ahammel.function.semigroup;

public final class SemigroupMax<T extends Comparable<T>>
        implements Semigroup<T> {
    @Override
    public T append(T x, T y) {
        return x.compareTo(y) > 0 ? x : y;
    }
}
