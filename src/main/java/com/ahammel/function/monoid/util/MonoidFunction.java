package com.ahammel.function.monoid.util;

import com.ahammel.function.monoid.Monoid;

import java.util.function.Function;

public final class MonoidFunction<A> implements Monoid<Function<A, A>> {
    @Override
    public Function<A, A> append(final Function<A, A> f,
                                 final Function<A, A> g) {
        return f.compose(g);
    }

    @Override
    public Function<A, A> empty() {
        return (x) -> x;
    }
}
