package com.ahammel.function.monoid;

public final class MonoidAll implements Monoid<Boolean> {
    @Override
    public Boolean append(Boolean x, Boolean y) {
        return x && y;
    }

    @Override
    public Boolean empty() {
        return true;
    }

    @Override
    public Boolean sconcatAll(Boolean first, Iterable<Boolean> rest) {
        if (!first) { return false; }
        for (Boolean y : rest) {
            if (!y) { return false; }
        }
        return true;
    }
}
