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

    static public void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Swapped " + a + " and " + b);
    }

    public static void sortToLargestNumber(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                //compare and swap - decreasing order
                if (compareToFormLargest(array[j], array[j + 1])) {
                    //swap
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        print(array);
    }
    private static boolean compareToFormLargest(int a, int b) {//3,4
        String ab = a + "" + b;
        int abInt = Integer.parseInt(ab);
        String ba = b + "" + a;
        int baInt = Integer.parseInt(ba);

        if (abInt < baInt) {//34 and 43
            return true;
        }
        return false;
    }
}
