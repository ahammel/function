package com.ahammel.function.monoid;

import java.util.function.Function;

public final class MonoidFunction<A> implements Monoid<Function<A, A>> {
    @Override
    public Function<A, A> append(Function<A, A> f, Function<A, A> g) {
        return f.compose(g);
    }

    @Override
    public Function<A, A> empty() {
        return (x) -> x;
    }
}
