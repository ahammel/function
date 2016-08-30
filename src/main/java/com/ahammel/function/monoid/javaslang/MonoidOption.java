package com.ahammel.function.monoid.javaslang;

import com.ahammel.function.monoid.Monoid;
import com.ahammel.function.semigroup.Semigroup;
import javaslang.control.Option;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MonoidOption<T> implements Monoid<Option<T>> {
    private final Semigroup<T> semigroup;

    @Override
    public Option<T> append(final Option<T> x, final Option<T> y) {
        return x.isEmpty() ? y :
               y.isEmpty() ? x :
               Option.of(semigroup.append(x.get(), y.get()));
    }

    @Override
    public Option<T> empty() {
        return Option.none();
    }
}
