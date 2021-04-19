package com.ofrancome;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Direction {

    private static final int CARDIO_MULTIPLIER = 3;
    private static final int FRACTURE_MULTIPLIER = 5;
    private static final String DEPT_CARDIO = "Cardiologie";
    private static final String DEPT_TRAUMA = "Traumatologie";
    private static final Map<Integer, String> referenceMap = Map.of(
            CARDIO_MULTIPLIER, DEPT_CARDIO,
            FRACTURE_MULTIPLIER, DEPT_TRAUMA
    );

    // On pourrait en faire un singleton si besoin
    public Direction() {
    }

    // Pour un index donnée, renvoie une liste de départements triée par ordre alphabétique
    public List<String> direct(final Integer healthIndex) {
        final List<String> departments = new ArrayList<>();
        if (healthIndex != null && healthIndex >= 3) {
            referenceMap.forEach((key, value) -> {
                if (healthIndex % key == 0) departments.add(value);
            });
            departments.sort(String::compareTo);
        }
        return departments.size() > 0 ? departments : List.of("Accueil");
    }
}
