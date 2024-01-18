package com.ofrancome;

import java.util.List;
import java.util.StringJoiner;

public class Printer {

    public Printer() {
    }

    // Pour une liste de départements donnée, renvoie une String concaténant les services,
    // séparés par une virgule
    static public String printDeptList(final List<String> departments) {
        StringJoiner joiner = new StringJoiner(", ");
        departments.forEach(joiner::add);
        return joiner.toString();
    }
}
