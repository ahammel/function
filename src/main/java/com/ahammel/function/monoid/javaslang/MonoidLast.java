package com.ahammel.function.monoid.javaslang;

import com.ahammel.function.monoid.Monoid;
import javaslang.control.Option;

public class MonoidLast<T> implements Monoid<Option<T>> {
    @Override
    public Option<T> append(final Option<T> x, final Option<T> y) {
        return y.isEmpty() ? x : y;
    }

    @Override
    public Option<T> empty() {
        return Option.none();
    }
}
