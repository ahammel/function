package com.ahammel.function.semigroup;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SemigroupMinMaxTest {
    @Test
    public void appendMin() {
        SemigroupMin<Integer> f = new SemigroupMin<>();
        int min = f.append(1, 2);
        assertEquals(min, 1);
    }

    @Test
    public void appendMax() {
        Semigroup<Integer> f = new SemigroupMax<>();
        int max = f.append(1, 2);
        assertEquals(max, 2);
    }
}