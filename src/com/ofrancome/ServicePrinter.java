package com.ofrancome;

import java.util.List;
import java.util.StringJoiner;

public class ServicePrinter {

    public ServicePrinter() {
    }

    // Pour une liste de d�partements donn�e, renvoie une String concat�nant les services,
    // s�par�s par une virgule
    static public String printDeptList(final List<String> departments) {
        StringJoiner joiner = new StringJoiner(", ");
        departments.forEach(joiner::add);
        return joiner.toString();
    }
}
