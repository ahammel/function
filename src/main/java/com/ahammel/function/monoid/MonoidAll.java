package com.ahammel.function.monoid;

public final class MonoidAll implements Monoid<Boolean> {
    @Override
    public Boolean append(final Boolean x, final Boolean y) {
        return x && y;
    }

    @Override
    public Boolean empty() {
        return true;
    }

    @Override
    public Boolean sconcatAll(final Boolean first,
                              final Iterable<Boolean> rest) {
        if (!first) { return false; }
        for (final Boolean y : rest) {
            if (!y) { return false; }
        }
        return true;
    }
}
