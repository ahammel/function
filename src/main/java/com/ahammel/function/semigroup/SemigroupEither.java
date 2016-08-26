package com.ahammel.function.semigroup;

import javaslang.control.Either;

public final class SemigroupEither<L, R> implements Semigroup<Either<L, R>> {
    @Override
    public Either<L, R> append(final Either<L, R> x, final Either<L, R> y) {
        return x.isRight() ? x: y;
    }

    @Override
    public Either<L, R> sconcatAll(final Either<L, R> first,
                                   final Iterable<Either<L, R>> rest) {
        if (first.isRight()) { return first; }
        Either<L, R> acc = first;
        for (final Either<L, R> y: rest) {
            acc = append(acc, y);
            if (acc.isRight()) { break; }
        }
        return acc;
    }
}
