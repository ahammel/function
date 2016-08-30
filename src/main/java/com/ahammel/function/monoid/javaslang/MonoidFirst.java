package com.ahammel.function.monoid.javaslang;

import com.ahammel.function.monoid.Monoid;
import javaslang.control.Option;

public class MonoidFirst<T> implements Monoid<Option<T>> {
    @Override
    public Option<T> append(final Option<T> x, final Option<T> y) {
        return x.isEmpty() ? y : x;
    }

    @Override
    public Option<T> empty() {
        return Option.none();
    }
}
