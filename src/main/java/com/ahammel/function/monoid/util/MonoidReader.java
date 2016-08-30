package com.ahammel.function.monoid.util;

import com.ahammel.function.monoid.Monoid;
import lombok.RequiredArgsConstructor;

import java.util.function.Function;

@RequiredArgsConstructor
public final class MonoidReader<A, B> implements Monoid<Function<A, B>> {
    private final Monoid<B> monoid;

    @Override
    public Function<A, B> append(final Function<A, B> f,
                                 final Function<A, B> g) {
        return (x) -> monoid.append(f.apply(x), g.apply(x));
    }

    @Override
    public Function<A, B> empty() {
        return (_x) -> monoid.empty();
    }
}
