package com.ahammel.function.monoid;

public final class MonoidSum implements Monoid<Integer> {
    @Override
    public Integer append(Integer x, Integer y) {
        return x + y;
    }

    @Override
    public Integer empty() {
        return 0;
    }
}
