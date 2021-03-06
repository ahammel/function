package com.ahammel.function.monoid;

import com.ahammel.function.monoid.javaslang.MonoidList;
import javaslang.collection.List;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MonoidListTest {
    @Test
    public void concatDeeplyNestedLists() {
        final MonoidList<List<List<List<String>>>> f = new MonoidList<>();
        final List<List<List<List<String>>>> ls =
                f.concatAll(List.of(List.of(List.of(List.of(List.of("foo"))))));
        assertEquals(ls, List.of(List.of(List.of(List.of("foo")))));
    }

}