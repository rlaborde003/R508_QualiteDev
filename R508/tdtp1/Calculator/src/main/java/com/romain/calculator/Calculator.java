package com.romain.calculator;

import java.util.HashSet;
import java.util.Set;

public class Calculator {

    public static int add(int opG, int opD) {
        return opG + opD;
    }

    public static int divide(int opG, int opD) {
        if (opD != 0) {
            return opG / opD;
        }
        else {
            throw new RuntimeException("Division par 0 impossible");
        }
    }

    public static Set<Integer>ensembleChiffres(int pNombre) {
        String nbStr = Integer.toString(pNombre).replace("-", "").replace("+","");
        Set<Integer> nb = new HashSet<Integer>();
        StringBuilder newStr = new StringBuilder();
        char[] charArray = nbStr.toCharArray();

        for (char c : charArray)
            newStr.
            if (!newStr.contains(Character.toString(c))) {
                newStr.append(Character.toString(c));
            }

        char[] char2Array = newStr.toString().toCharArray();
        for (char c: char2Array) {
            boolean add = nb.add(Integer.parseInt(Character.toString(c)));
        }

        return nb;
    }
}
