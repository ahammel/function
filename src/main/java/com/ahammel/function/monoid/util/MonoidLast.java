package com.ahammel.function.monoid.util;

import com.ahammel.function.monoid.Monoid;

import java.util.Optional;

@SuppressWarnings("WeakerAccess")
public final class MonoidLast<T> implements Monoid<Optional<T>> {
    @Override
    public Optional<T> append(final Optional<T> xs, final Optional<T> ys) {
        return ys.isPresent() ? ys : xs;
    }

    @Override
    public Optional<T> empty() {
        return Optional.empty();
    }
}
