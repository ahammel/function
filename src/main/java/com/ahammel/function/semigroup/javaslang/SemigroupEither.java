package com.ahammel.function.semigroup.javaslang;

import com.ahammel.function.semigroup.Semigroup;
import javaslang.control.Either;

public final class SemigroupEither<L, R> implements Semigroup<Either<L, R>> {
    @Override
    public Either<L, R> append(final Either<L, R> xs, final Either<L, R> ys) {
        return xs.isRight() ? xs : ys;
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
