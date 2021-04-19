package com.ofrancome;

import java.util.List;
import java.util.StringJoiner;

public class ServicePrinter {

    public ServicePrinter() {
    }

    // Pour une liste de d�partements donn�e, renvoie une String concat�nant les services,
    // s�par�s par une virgule
    public String printDeptList(final List<String> departments) {
        final StringJoiner joiner = new StringJoiner(", ");
        if (departments != null) {
            departments.forEach(joiner::add);
        }
        return joiner.toString();
    }
}
