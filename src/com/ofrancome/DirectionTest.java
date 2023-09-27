package com.ofrancome;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static com.ofrancome.Direction.dept_cardio;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class DirectionTest {


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
        final List<String> expected = List.of(dept_cardio);
        assertEquals(expected, Direction.direct(3));
    }

    @Test
    public void shouldReturnTraumaForIndex5() {
        assertNotNull(Direction.direct(5));
    }

    @ParameterizedTest
    @MethodSource("provideArgsForDirectTest")
    public void shouldReturnXonIndexX(final Integer healthIndex, final List<String> expected ) {
        assertEquals(expected, Direction.direct(healthIndex));
    }
}