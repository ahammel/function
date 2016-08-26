package com.ahammel.function.semigroup;

import javaslang.control.Try;

public final class SemigroupTry<T> implements Semigroup<Try<T>> {
    @Override
    public Try<T> append(final Try<T> x, final Try<T> y) {
        return x.isSuccess() ? x : y;
    }

    @Override
    public Try<T> sconcatAll(final Try<T> first, final Iterable<Try<T>> rest) {
        Try<T> acc = first;
        for (final Try<T> y : rest) {
            acc = append(acc, y);
            if (acc.isSuccess()) { break; }
        }
        return acc;
    }
}
