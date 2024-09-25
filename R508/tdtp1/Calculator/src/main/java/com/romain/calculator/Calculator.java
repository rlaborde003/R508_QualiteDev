package calculator;

import java.util.HashSet;
import java.util.Set;

public class Calculator {

    public static int add(int opG, int opD) {return opG + opD;}
    public static int divide(int opG, int opD) {return opG/opD;}

    public static Set<Integer> ensembleChiffres(int pNombre) {
        Set<Integer> entiers = new HashSet<Integer>();
        String chaineDuNombre = String.valueOf(pNombre);

        if ((chaineDuNombre.charAt(0) != '-') && (chaineDuNombre.charAt(0) != '+')) {
            entiers.add(Integer.parseInt(chaineDuNombre, 0, 0 + 1, 10));
        }

        for (int i = 1; i < chaineDuNombre.length(); i++) {
            {
                entiers.add(Integer.parseInt(chaineDuNombre, i, i + 1, 10));
            }
        }
        return entiers;
    }
}