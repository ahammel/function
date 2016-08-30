package com.ahammel.function.monoid.example;

import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.Value;

import java.util.Optional;

@Value
@RequiredArgsConstructor
@Builder
class Record {
    private final Optional<String>  name;
    private final Optional<Integer> age;
}
