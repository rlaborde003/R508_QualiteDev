package com.romain.calculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

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

    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0, 1, 1",
            "1, 2, 3",
            "-2, 2, 0",
            "0, 0, 0",
            "-1, -2, -3"
    })

    void add_devrait_renvoyer_addition(int opG, int opD, int expectResult) {
        // when
        var result = Calculator.add(opG, opD);

        //then
        assertThat(result).isEqualTo(expectResult);
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