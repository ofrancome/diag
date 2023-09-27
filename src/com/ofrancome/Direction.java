package com.ofrancome;

import java.util.ArrayList;
import java.util.List;

public class Direction {

    private static final int CARDIO_MULTIPLIER = 3;
    private static final int FRACTURE_MULTIPLIER = 5;
    public static final String dept_cardio = "Cardiologie";
    private static final String DEPT_TRAUMA = "Traumatologie";


    // Pour un index donn�e, renvoie une liste de d�partements tri�e par ordre alphab�tique
    static public List<String> direct(final Integer healthIndex) {
        final List<String> departments = new ArrayList<String>();
        if (healthIndex != null && healthIndex > 0) {
            if (healthIndex != null && healthIndex % CARDIO_MULTIPLIER == 0 && healthIndex % FRACTURE_MULTIPLIER == 0) {
                departments.add(dept_cardio);
                departments.add(DEPT_TRAUMA);
            } else if (healthIndex != null && healthIndex % FRACTURE_MULTIPLIER == 0) {
                departments.add(DEPT_TRAUMA);
            } else if (healthIndex != null && healthIndex % CARDIO_MULTIPLIER == 0) {
                departments.add(dept_cardio);
            }
            departments.sort(String::compareTo);
        }
        return departments.size() > 0 ? departments : List.of("Accueil");
    }
}
