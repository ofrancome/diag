package com.ofrancome;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DirectionTest {

    Direction direction;

    @BeforeEach
    void setUp() {
        direction = new Direction();
    }

    @Test
    public void shouldReturnCardioAndTraumaForIndex15() {
        final List<String> expected = List.of("Cardiologie", "Traumatologie");
        assertEquals(expected, direction.direct(15));
    }

    @Test
    public void shouldReturnAccueilForIndex0() {
        final List<String> expected = List.of("Accueil");
        assertEquals(expected, direction.direct(0));
    }

    @Test
    public void shouldReturnAccueilForIndexNull() {
        final List<String> expected = List.of("Accueil");
        assertEquals(expected, direction.direct(null));
    }
}