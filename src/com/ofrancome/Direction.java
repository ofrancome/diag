package com.ofrancome;

import java.util.*;

public class Direction {

    private static final int cardio_multiplier = 3;
    private static final int fracture_multiplier = 5;
    private static final String dept_cardio = "Cardiologie";
    private static final String dept_trauma = "Traumatologie";
    private static final Map<Integer, String> referenceMap = Map.of(
            cardio_multiplier, dept_cardio,
            fracture_multiplier, dept_trauma
    );

    // Pour un index donn�e, renvoie une liste de d�partements tri�e par ordre alphab�tique
    static public List<String> direct(final Integer healthIndex) {
        final List<String> departments = new ArrayList<String>();
        if (healthIndex != null && healthIndex >= 3) {
            referenceMap.forEach((key, value) -> {
                if (healthIndex % key == 0) departments.add(value);
            });
            departments.sort(String::compareTo);
        }
        return departments.size() > 0 ? departments : List.of("Accueil");
    }
}
