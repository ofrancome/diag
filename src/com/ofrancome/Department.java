package com.ofrancome;

public enum Department {

    CARDIOLOGY(3, "Cardiologie"),
    TRAUMATOLOGY(5, "Traumatologie");

    final int multiplier;
    final String name;


    Department(int multiplier, String name) {
        this.multiplier = multiplier;
        this.name = name;
    }

    public boolean handle(Integer pathology) {
        return pathology % multiplier == 0;
    }
}
