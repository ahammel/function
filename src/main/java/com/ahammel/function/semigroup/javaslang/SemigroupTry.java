package com.ahammel.function.semigroup.javaslang;

import com.ahammel.function.semigroup.Semigroup;
import javaslang.control.Try;

public final class SemigroupTry<T> implements Semigroup<Try<T>> {
    @Override
    public Try<T> append(final Try<T> xs, final Try<T> ys) {
        return xs.isSuccess() ? xs : ys;
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
