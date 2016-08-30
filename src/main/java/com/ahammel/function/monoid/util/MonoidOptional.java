package com.ahammel.function.monoid.util;

import com.ahammel.function.monoid.Monoid;
import com.ahammel.function.semigroup.Semigroup;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@SuppressWarnings("WeakerAccess")
@RequiredArgsConstructor
public final class MonoidOptional<T> implements Monoid<Optional<T>> {
    private final Semigroup<T> semigroup;

    @Override
    public Optional<T> append(final Optional<T> xs, final Optional<T> ys) {
        return !xs.isPresent() ? ys :
               !ys.isPresent() ? xs :
               Optional.of(semigroup.append(xs.get(), ys.get()));
    }

    @Override
    public Optional<T> empty() { return Optional.empty(); }
}
