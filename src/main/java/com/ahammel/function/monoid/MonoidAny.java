package com.ahammel.function.monoid;

public final class MonoidAny implements Monoid<Boolean> {
    @Override
    public Boolean append(final Boolean xs, final Boolean ys) {
        return xs || ys;
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
