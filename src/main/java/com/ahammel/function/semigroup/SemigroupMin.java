package com.ahammel.function.semigroup;

@SuppressWarnings("WeakerAccess")
public final class SemigroupMin<T extends Comparable<T>>
        implements Semigroup<T> {
    @Override
    public T append(final T xs, final T ys) {
        return xs.compareTo(ys) < 0 ? xs : ys;
    }
}
