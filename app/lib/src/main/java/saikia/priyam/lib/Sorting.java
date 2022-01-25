package saikia.priyam.lib;

import static saikia.priyam.lib.Algo.print;

public class Sorting {
    public static void bubbleSort(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    //swap
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        print(array);
    }

    static public void quickSort(int[] array, int start, int end) {
        if (array == null || array.length == 0)
            return;

        if (start >= end)
            return;

        int p = (end - start) / 2 + start;
        int startIndex = start;
        int endIndex = end;
        while (startIndex <= endIndex) {
            while (array[startIndex] < array[p]) {
                startIndex++;
            }
            while (array[endIndex] > array[p]) {
                endIndex--;
            }

            //swap array startIndex and array endIndex
            int temp = array[startIndex];
            array[startIndex] = array[endIndex];
            array[endIndex] = temp;

            startIndex++;
            endIndex--;
        }


        if (start < startIndex) {
            quickSort(array, start, startIndex - 1);
        }

        if (startIndex < end) {
            quickSort(array, startIndex, end);
        }
        print(array);
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;//j = unsorted array index
            while (j >= 0 && array[j] > key) {
                //shift right
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
        print(array);
    }
}
