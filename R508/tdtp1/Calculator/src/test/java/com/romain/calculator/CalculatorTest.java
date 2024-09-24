package com.romain.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add_devrait_calculer_la_somme_de_deux_int() {
        // GIVEN
        int opG = 2;
        int opD = 3;

        // WHEN
        int somme = Calculator.add(opG,opD);

        //THEN
        assertEquals(5, somme);
    }
}