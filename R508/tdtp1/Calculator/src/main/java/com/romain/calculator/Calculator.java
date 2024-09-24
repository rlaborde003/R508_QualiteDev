package com.romain.calculator;

import java.util.HashSet;
import java.util.Set;

public class Calculator {
    public static int add(int opG, int opD) {

        double somme = (double) opG + (double) opD;
        return (int) somme;
    }

    public static int divide(int opG, int opD) {
        return opG / opD;
    }

    public static Set<Integer> ensembleChiffres(int pNombre) {
        Set<Integer> entiers = new HashSet<Integer>(); // ensemble d'entiers vide
        String chaineDuNombre = String.valueOf(pNombre);    // équivalent du nbre en chaîne de caractères

        // Traiter le 1er caractère de la chaîne
        if ((chaineDuNombre.charAt(0) != '-') && (chaineDuNombre.charAt(0) != '+')) {
            entiers.add(Integer.parseInt(chaineDuNombre, 0, 0 + 1, 10));
				/* retourne l'équivalent en entier de la portion de chaîne comprise dans l'intervalle [0, 0+1[.
				   Lève une exception si la conversion en entier n'est pas possible.
				*/
        }
        // Parcours du reste de la chaîne et ajout de chaque élément dans l'ensemble
        for (int i = 1; i < chaineDuNombre.length(); i++) {
            {
                entiers.add(Integer.parseInt(chaineDuNombre, i, i + 1, 10));
				/* retourne l'équivalent en entier de la portion de chaîne comprise dans l'intervalle [i, i+1[.
				   Lève une exception si la conversion en entier n'est pas possible.
				*/
            }
        }
        return entiers;
    }
}
