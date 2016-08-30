package com.ahammel.function.monoid.javaslang;

import com.ahammel.function.monoid.Monoid;
import javaslang.collection.Vector;

public class MonoidVector<T> implements Monoid<Vector<T>> {
    @Override
    public Vector<T> append(final Vector<T> xs, final Vector<T> ys) {
        return xs.appendAll(ys);
    }

    @Override
    public Vector<T> empty() {
        return Vector.empty();
    }
}
