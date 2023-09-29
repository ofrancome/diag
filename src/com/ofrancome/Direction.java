package com.ofrancome;

import java.util.ArrayList;
import java.util.List;

public class Direction {

    private static final int CARDIO_MULTIPLIER = 3;
    private static final int FRACTURE_MULTIPLIER = 5;
    private static final String DEPT_CARDIO = "Cardiologie";
    private static final String DEPT_TRAUMA = "Traumatologie";


    // Pour un index donnée, renvoie une liste de départements triée par ordre alphabétique
    static public List<String> direct(final Integer healthIndex) {
        final List<String> departments = new ArrayList<String>();
        if (healthIndex != null && healthIndex > 0) {
            if (healthIndex % CARDIO_MULTIPLIER == 0) {
                departments.add(DEPT_CARDIO);
            }
            if (healthIndex % FRACTURE_MULTIPLIER == 0) {
                departments.add(DEPT_TRAUMA);
            }
            departments.sort(String::compareTo);
        }
        return !departments.isEmpty() ? departments : List.of("Accueil");
    }
}
