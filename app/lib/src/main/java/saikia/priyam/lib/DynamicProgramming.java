package saikia.priyam.lib;

import static saikia.priyam.lib.Algo.print;

public class DynamicProgramming {
    static public int findEquilibriumIndex(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int upperSum = 0;
            int lowerSum = 0;
            int j = i - 1;
            while (j >= 0) {
                lowerSum += array[j];
                j--;
            }
            j = i + 1;
            while (j < array.length) {
                upperSum += array[j];
                j++;
            }

            if (lowerSum == upperSum) {
                print("Equilibrium index = " + i);
                return i;
            }
        }
        return -1;
    }
}
