package com.ahammel.function.monoid;

import java.util.Optional;

@SuppressWarnings("WeakerAccess")
public final class MonoidFirst<T> implements Monoid<Optional<T>> {
    @Override
    public Optional<T> append(Optional<T> x, Optional<T> y) {
        return x.isPresent() ? x : y;
    }

    @Override
    public Optional<T> empty() {
        return Optional.empty();
    }

    @Override
    public Optional<T> sconcatAll(Optional<T> first,
                                  Iterable<Optional<T>> rest) {
        if (first.isPresent()) { return first; }
        for (Optional<T> x : rest) {
            if (x.isPresent()) { return x; }
        }
        return empty();
    }
}
