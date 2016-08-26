package com.ahammel.function.monoid;

import com.ahammel.function.semigroup.Semigroup;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@SuppressWarnings("WeakerAccess")
@RequiredArgsConstructor
public final class MonoidOptional<T> implements Monoid<Optional<T>> {
    private final Semigroup<T> semigroup;

    @Override
    public Optional<T> append(final Optional<T> x, final Optional<T> y) {
        return !x.isPresent() ? y :
               !y.isPresent() ? x :
               Optional.of(semigroup.append(x.get(), y.get()));
    }

    @Override
    public Optional<T> empty() { return Optional.empty(); }
}
