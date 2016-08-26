package com.ahammel.function.monoid;

import com.ahammel.function.semigroup.SemigroupMax;
import javaslang.collection.List;
import org.junit.Test;

import java.util.Optional;

import static junit.framework.TestCase.assertEquals;

public class MonoidOptionalTest {
    @Test
    public void concatOptionalString() {
        MonoidOptional<String> f = new MonoidOptional<>(new MonoidString());

        @SuppressWarnings("unchecked")
        Optional<String> str = f.concat(
                Optional.of("monkey"),
                Optional.empty(),
                Optional.of("zombie"),
                Optional.of("pirate"),
                Optional.of("ninja"),
                Optional.empty());

        assertEquals(str, Optional.of("monkeyzombiepirateninja"));

    }

    @Test
    public void concatOptionalListOfInteger() {
        MonoidList<Integer> semigroup = new MonoidList<>();
        MonoidOptional<List<Integer>> f = new MonoidOptional<>(semigroup);

        @SuppressWarnings("unchecked")
        Optional<List<Integer>> ints = f.concat(
                Optional.of(List.of(1, 2, 3)),
                Optional.empty(),
                Optional.of(List.of(4, 5, 6)));

        assertEquals(ints, Optional.of(List.of(1, 2, 3, 4, 5, 6)));
    }

    @Test
    public void concatOptionalMax() {
        SemigroupMax<String> maxF = new SemigroupMax<>();
        MonoidOptional<String> f = new MonoidOptional<>(maxF);

        @SuppressWarnings("unchecked")
        Optional<String> max = f.concat(
                Optional.of("aardvark"),
                Optional.of("zebra"),
                Optional.of("bear"),
                Optional.empty());

        assertEquals(max, Optional.of("zebra"));
    }

    @Test
    public void monoidFirst() {
        MonoidFirst<String> f = new MonoidFirst<>();
        @SuppressWarnings("unchecked")
        Optional<String> first = f.concat(
                Optional.empty(),
                Optional.of("banana"),
                Optional.of("aardvark"),
                Optional.of("cadaver"));
        assertEquals(first, Optional.of("banana"));
    }

    @Test
    public void monoidLast() {
        MonoidLast<String> f = new MonoidLast<>();

        @SuppressWarnings("unchecked")
        Optional<String> last = f.concat(
                Optional.empty(),
                Optional.of("banana"),
                Optional.of("cadaver"),
                Optional.of("aardvark"));
        assertEquals(last, Optional.of("aardvark"));
    }
}