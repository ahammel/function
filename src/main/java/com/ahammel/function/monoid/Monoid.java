package com.ahammel.function.monoid;

import com.ahammel.function.semigroup.Semigroup;

import java.util.Arrays;

/**
 * # Monoid
 *
 * A monoid is a type class that has both an associative operation (inherited
 * from `Semigroup`) and an "empty" element. The empty element must fulfill the
 * contract:
 *
 * ```
 * append(x, empty()) == x
 * ```
 *
 */
@SuppressWarnings("WeakerAccess")
public interface Monoid<T> extends Semigroup<T> {
    /**
     * The empty element
     */
    T empty();

    /**
     * Concatenate up an iterable of monoid instances using repeated calls to
     * `append`.
     *
     * ```
     * concatAll(List.empty()) == empty()
     * ```
     */
    default T concatAll(Iterable<T> xs) {
        return sconcatAll(empty(), xs);
    }

    /**
     * Variadic version of `concatAll`
     */
    @SuppressWarnings("unchecked")
    default T concat(T... args) {
        return sconcatAll(empty(), Arrays.asList(args));
    }
}
