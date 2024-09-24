package com.romain.calculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void add_devrait_calculer_la_somme_de_deux_int() {
        // GIVEN

        // WHEN
        int somme = Calculator.add(1,2);

        //THEN
        assertThat(somme).isEqualTo(3);
    }

    @DisplayName("Plusieurs exécutions de sommes simples de 2 int " )
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "-2,   2,   0",
            "0,    0,   0",
            "-1,   -2,  -3"
    })

    void add_parametre_devrait_calculer_la_somme_de_deux_int(int first, int second, int expectedResult)  {
        // GIVEN

        // WHEN
        int somme = Calculator.add(first, second);

        // THEN  -- SI on ne s'occupe pas de l'exception levée

        //assertEquals(expectedResult, calculatorEnTest.add(first, second),
        //		() -> first + " + " + second + " should equal " + expectedResult);	// JUnit
        assertThat(somme).isEqualTo(expectedResult);	                            // assertJ
    }

    @Test
    void divide_devrait_retourner_quotient_nul_quand_diviseur_plus_grand_que_dividende()
    {
        // GIVEN

        // WHEN
        int quotient = Calculator.divide(1,2);

        //THEN
        assertThat(quotient).isEqualTo(0);
    }

    @Test
    void divide_devrait_retourner_quotient_non_nul_quand_diviseur_plus_petit_que_dividende()
    {
        // GIVEN

        // WHEN
        int quotient = Calculator.divide(7,2);

        //THEN
        assertThat(quotient).isEqualTo(3);
    }

    @Test
    void digitsSet_devrait_retourner_les_chiffres_d_un_entier_positif() {
        //GIVEN
        int entierPositif = 97689;

        //WHEN
        Set<Integer> ensembleChiffres = Calculator.ensembleChiffres(entierPositif);

        //THEN
        assertThat(ensembleChiffres).containsExactlyInAnyOrder(6, 7, 8, 9);
    }

    @Test
    void digitsSet_devrait_retourner_les_chiffres_d_un_entier_negatif() {
        //GIVEN
        int entierNegatif = -1;

        //WHEN
        Set<Integer> ensembleChiffres = Calculator.ensembleChiffres(entierNegatif);

        //THEN
        assertThat(ensembleChiffres).containsExactlyInAnyOrder(1);
    }
    @Test
    void digitsSet_devrait_retourner_le_chiffre_0_d_un_entier_nul() {
        //GIVEN
        int entierNul = 0000;

        //WHEN
        Set<Integer> ensembleChiffres = Calculator.ensembleChiffres(entierNul);

        //THEN
        assertThat(ensembleChiffres).containsExactlyInAnyOrder(0);
    }
}