package com.ahammel.function.monoid;

import java.util.Optional;

@SuppressWarnings("WeakerAccess")
public final class MonoidLast<T> implements Monoid<Optional<T>> {
    @Override
    public Optional<T> append(final Optional<T> x, final Optional<T> y) {
        return y.isPresent() ? y : x;
    }

    @Override
    public Optional<T> empty() {
        return Optional.empty();
    }
}
