package saikia.priyam.lib;

import static saikia.priyam.lib.DynamicProgramming.findEquilibriumIndex;

public class Algo {
    public static void main(String args[]) {
        System.out.println("Hello World");
       /* LinkedList list = new LinkedList();
        list.insertLast(0);
        list.insertLast(0);
        list.insertLast(1);
        list.insertLast(1);
        list.insertLast(9);
        list.insertLast(9);
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(9);
        list.insertFirst(0);*/
        int[] arr = {-7, 2, 5, 2, -4, 3, 1};

        //Sorting.insertionSort(arr);
        //Sorting.quickSort(arr, 0, arr.length - 1);

        StringProblems.checkAnagram("mra", "ram");
        StringProblems.isPalindrome("madam");
        StringProblems.reverseString("papaya");
        StringProblems.printDuplicates("papaya");

    }

    public static void print(String msg) {
        System.out.println(msg);
    }

    public static void print(int[] a) {
        print("The array is = ");
        for (int i = 0; i < a.length; i++) {
            System.out.println("#" + i + " = " + a[i]);
        }
    }
}