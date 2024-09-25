package com.romain.calculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    // given
    int opG;
    int opD;

    @BeforeEach
    void set_up() {
        // given
        opG = 10;
        opD = 2;
    }

    @Test
    void add_devrait_renvoyer_addition() {
        // when
        var result = Calculator.add(opG, opD);

        //then
        assertThat(result).isEqualTo(opG+opD);
    }

    @Test
    void divide_devrait_renvoyer_erreur() {
        // given
        int opD = 0;

        // when
        Throwable err = Assertions.catchThrowable(() -> Calculator.divide(opG, opD));

        //then
        assertThat(err).hasMessage("Division par 0 impossible");
    }

    @Test
    void divide_devrait_renvoyer_diviseur() {
        // when
        var result = Calculator.divide(opG, opD);

        //then
        assertThat(result).isEqualTo(opG/opD);
    }

    @AfterEach
    void tear_down() {
        System.out.println("test ok");
    }

}