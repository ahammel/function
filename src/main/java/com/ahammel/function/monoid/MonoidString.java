package com.ahammel.function.monoid;

@SuppressWarnings("WeakerAccess")
public class MonoidString implements Monoid<String> {
    @Override
    public String append(final String x, final String y) {
        return x + y;
    }

    @Override
    public String empty() {
        return "";
    }
}
