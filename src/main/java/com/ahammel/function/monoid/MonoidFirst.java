package com.ahammel.function.monoid;

import java.util.Optional;

@SuppressWarnings("WeakerAccess")
public final class MonoidFirst<T> implements Monoid<Optional<T>> {
    @Override
    public Optional<T> append(final Optional<T> x, final Optional<T> y) {
        return x.isPresent() ? x : y;
    }

    @Override
    public Optional<T> empty() {
        return Optional.empty();
    }

    @Override
    public Optional<T> sconcatAll(final Optional<T> first,
                                  final Iterable<Optional<T>> rest) {
        if (first.isPresent()) { return first; }
        for (final Optional<T> x : rest) {
            if (x.isPresent()) { return x; }
        }
        return empty();
    }
}
