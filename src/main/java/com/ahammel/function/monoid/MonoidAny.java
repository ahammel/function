package com.ahammel.function.monoid;

public final class MonoidAny implements Monoid<Boolean> {
    @Override
    public Boolean append(final Boolean x, final Boolean y) {
        return x || y;
    }

    @Override
    public Boolean empty() {
        return false;
    }

    @Override
    public Boolean sconcatAll(final Boolean first,
                              final Iterable<Boolean> rest) {
        if (first) { return true; }
        for (final Boolean x : rest) {
            if (x) { return true; }
        }
        return false;
    }
}
