package com.ofrancome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepartmentTest {

    @Test
    void cardioShouldHandlePatho33 () {
        assertTrue(Department.CARDIOLOGY.handle(33));
    }

    @Test
    void cardioShouldNotHandlePatho32() {
        assertFalse(Department.CARDIOLOGY.handle(32));
    }

    @Test
    void traumaShouldHandlePatho25 () {
        assertTrue(Department.TRAUMATOLOGY.handle(25));
    }

    @Test
    void traumaShouldNotHandlePatho32() {
        assertFalse(Department.TRAUMATOLOGY.handle(32));
    }

}