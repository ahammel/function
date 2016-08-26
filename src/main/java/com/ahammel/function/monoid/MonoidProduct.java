package com.ahammel.function.monoid;

public final class MonoidProduct implements Monoid<Integer> {
    @Override
    public Integer append(Integer x, Integer y) {
        return x * y;
    }

    @Override
    public Integer empty() {
        return 1;
    }

    @Override
    public Integer sconcatAll(Integer first, Iterable<Integer> rest) {
        Integer acc = first;
        for (Integer y : rest) {
            if (acc == 0) { break; }
            acc = acc * y;
        }
        return acc;
    }
}
