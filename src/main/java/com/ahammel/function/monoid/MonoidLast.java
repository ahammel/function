package com.ahammel.function.monoid;

import java.util.Optional;

@SuppressWarnings("WeakerAccess")
public final class MonoidLast<T> implements Monoid<Optional<T>> {
    @Override
    public Optional<T> append(Optional<T> x, Optional<T> y) {
        return y.isPresent() ? y : x;
    }

    @Override
    public Optional<T> empty() {
        return Optional.empty();
    }
}
