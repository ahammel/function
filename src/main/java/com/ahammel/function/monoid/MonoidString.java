package com.ahammel.function.monoid;

@SuppressWarnings("WeakerAccess")
public class MonoidString implements Monoid<String> {
    @Override
    public String append(final String xs, final String ys) {
        return xs + ys;
    }

    @Override
    public String empty() {
        return "";
    }
}
