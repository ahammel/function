package com.ahammel.function.monoid.example;

import com.ahammel.function.monoid.Monoid;

import java.util.Optional;

public class MonoidRecord implements Monoid<Record> {
    @Override
    public Record append(final Record x, final Record y) {
        return Record.builder()
                .name(x.getName().isPresent() ? x.getName() : y.getName())
                .age(x.getAge().isPresent() ? x.getAge() : y.getAge())
                .build();
    }

    @Override
    public Record empty() {
        return Record.builder()
                .name(Optional.empty())
                .age(Optional.empty())
                .build();
    }

    @Override
    public Record sconcatAll(final Record first, final Iterable<Record> rest) {
        if (isComplete(first)) { return first; }
        Record acc = first;
        for (final Record r : rest) {
            acc = append(first, r);
            if (isComplete(r)) { break; }
        }
        return acc;
    }

    private static Boolean isComplete(final Record r) {
        return r.getName().isPresent() && r.getAge().isPresent();
    }
}
