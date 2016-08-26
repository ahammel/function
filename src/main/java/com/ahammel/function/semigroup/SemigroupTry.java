package com.ahammel.function.semigroup;

import javaslang.control.Try;

public final class SemigroupTry<T> implements Semigroup<Try<T>> {
    @Override
    public Try<T> append(Try<T> x, Try<T> y) {
        return x.isSuccess() ? x : y;
    }

    @Override
    public Try<T> sconcatAll(Try<T> first, Iterable<Try<T>> rest) {
        Try<T> acc = first;
        for (Try<T> y : rest) {
            acc = append(acc, y);
            if (acc.isSuccess()) { break; }
        }
        return acc;
    }
}
