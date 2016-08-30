package com.ahammel.function.monoid;

public final class MonoidSum implements Monoid<Integer> {
    @Override
    public Integer append(final Integer xs, final Integer ys) {
        return xs + ys;
    }

    @Override
    public Integer empty() {
        return 0;
    }
}
