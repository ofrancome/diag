package com.ofrancome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Direction {

    public List<String> direct(final Integer pathology) {
        final List<String> departments = new ArrayList<>();
        if (pathology != null && pathology > 0) {
            if (pathology % 3 == 0) {
                departments.add("Cardiologie");
            }
            if (pathology % 5 == 0) {
                departments.add("Traumatologie");
            }
        }
        return !departments.isEmpty() ? departments : List.of("Accueil");
    }
}
