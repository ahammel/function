package com.ahammel.function.monoid;

public final class MonoidProduct implements Monoid<Integer> {
    @Override
    public Integer append(final Integer x, final Integer y) {
        return x * y;
    }

    @Override
    public Integer empty() {
        return 1;
    }

    @Override
    public Integer sconcatAll(final Integer first, final Iterable<Integer> rest) {
        Integer acc = first;
        for (final Integer y : rest) {
            if (acc == 0) { break; }
            acc = acc * y;
        }
        return acc;
    }
}
