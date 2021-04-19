package com.ofrancome;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DirectionTest {

    private final Direction underTest = new Direction();

    private static Stream<Arguments> provideArgsForDirectTest() {
        return Stream.of(
                Arguments.of(3, List.of("Cardiologie")),
                Arguments.of(5, List.of("Traumatologie")),
                Arguments.of(15, List.of("Cardiologie", "Traumatologie")),
                Arguments.of(0, List.of("Accueil")),
                Arguments.of(null, List.of("Accueil")),
                Arguments.of(55, List.of("Traumatologie")),
                Arguments.of(33, List.of("Cardiologie"))
        );
    }

    @Test
    public void shouldReturnCardioForIndex3() {
        final List<String> expected = List.of("Cardiologie");
        assertEquals(expected, underTest.direct(3));
    }

    @Test
    public void shouldReturnTraumaForIndex5() {
        final List<String> expected = List.of("Traumatologie");
        assertEquals(expected, underTest.direct(5));
    }

    @ParameterizedTest
    @MethodSource("provideArgsForDirectTest")
    public void shouldReturnXonIndexX(final Integer healthIndex, final List<String> expected ) {
        assertEquals(expected, underTest.direct(healthIndex));
    }
}