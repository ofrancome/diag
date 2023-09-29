package com.ofrancome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Direction {

    public List<String> direct(final Integer pathology) {
        final List<String> departments = new ArrayList<>();
        if (pathology != null && pathology > 0) {
            Arrays.stream(Department.values())
                    .filter(department -> department.handle(pathology))
                    .map(department -> department.name)
                    .forEach(departments::add);
            departments.sort(String::compareTo);
        }
        return !departments.isEmpty() ? departments : List.of("Accueil");
    }
}
