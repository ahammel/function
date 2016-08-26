package com.ahammel.function.semigroup;

import javaslang.control.Either;

public final class SemigroupEither<L, R> implements Semigroup<Either<L, R>> {
    @Override
    public Either<L, R> append(Either<L, R> x, Either<L, R> y) {
        return x.isRight() ? x: y;
    }
}
