package com.ahammel.function.semigroup;

import java.util.Arrays;

/**
 * # Semigroup: anything that associates
 *
 * The Semigroup interface represents anything that has an associative
 * operation. The contract is:
 *
 * ```
 * append(append(x, y), z) == append(x, append(y, z))
 * ```
 */
public interface Semigroup<T> {
    /**
     * An associative operation.
     */
    T append(T x, T y);

    /**
     * Concatenate together one or more semigroup instances using consecutive
     * calls to `append`.
     *
     * If it makes sense to define a similar operation for zero or more
     * arguments, you probably have a monoid.
     *
     * Overrides can be provided for short-circuit evaluation when possible
     * (c.f., `SemigroupTry`).
     */
    default T sconcatAll(final T first, final Iterable<T> rest) {
        T acc = first;
        for (final T y: rest) {
            acc = append(acc, y);
        }
        return acc;
    }

    @SuppressWarnings("unchecked")
    default T sconcat(final T first, final T... rest) {
        return sconcatAll(first, Arrays.asList(rest));
    }
}
