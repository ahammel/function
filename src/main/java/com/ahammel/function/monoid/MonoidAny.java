package com.ahammel.function.monoid;

public final class MonoidAny implements Monoid<Boolean> {
    @Override
    public Boolean append(Boolean x, Boolean y) {
        return x || y;
    }

    @Override
    public Boolean empty() {
        return false;
    }

    @Override
    public Boolean sconcatAll(Boolean first, Iterable<Boolean> rest) {
        if (first) { return true; }
        for (Boolean x : rest) {
            if (x) { return true; }
        }
        return false;
    }
}
