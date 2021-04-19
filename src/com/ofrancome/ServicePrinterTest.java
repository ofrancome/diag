package com.ofrancome;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ServicePrinterTest {

    final ServicePrinter underTest = new ServicePrinter();

    private static Stream<Arguments> provedArgsForPrintTest() {
        return Stream.of(
                Arguments.of(List.of("Cardiologie"), "Cardiologie"),
                Arguments.of(List.of("Traumatologie"), "Traumatologie"),
                Arguments.of(List.of("Cardiologie", "Traumatologie"), "Cardiologie, Traumatologie"),
                Arguments.of(List.of(), ""),
                Arguments.of(null, "")
        );
    }

    @ParameterizedTest
    @MethodSource("provedArgsForPrintTest")
    public void shouldPrintListOfDepts(final List<String> depts, final String expected) {
        assertEquals(expected, underTest.printDeptList(depts));
    }
}