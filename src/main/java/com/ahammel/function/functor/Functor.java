package com.ahammel.function.functor;

public interface Functor<F> {
    // I need this, but Java might be fundamentally unable to express it:
    //
    // <A, B> F<B> map(F<A> functor, Function<A, B> f);
}

