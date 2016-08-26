package com.ahammel.function.semigroup;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SemigroupMinMaxTest {
    @Test
    public void appendMin() {
        final SemigroupMin<Integer> f   = new SemigroupMin<>();
        final int                   min = f.append(1, 2);
        assertEquals(min, 1);
    }

    @Test
    public void appendMax() {
        final Semigroup<Integer> f   = new SemigroupMax<>();
        final int                max = f.append(1, 2);
        assertEquals(max, 2);
    }
}