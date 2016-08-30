package com.ahammel.function.semigroup;

public final class SemigroupMax<T extends Comparable<T>>
        implements Semigroup<T> {
    @Override
    public T append(final T xs, final T ys) {
        return xs.compareTo(ys) > 0 ? xs : ys;
    }
}
