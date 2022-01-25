package saikia.priyam.lib;

import static saikia.priyam.lib.DynamicProgramming.findEquilibriumIndex;

public class Algo {
    public static void main(String args[]) {
        System.out.println("Hello World");
        LinkedList list = new LinkedList();
        list.insertLast(0);
        list.insertLast(0);
        list.insertLast(1);
        list.insertLast(1);
        list.insertLast(9);
        list.insertLast(9);
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(9);
        list.insertFirst(0);
        //list.deleteMidElement();
        list.print();
        //list.removeDuplicatesFromSortedLinkedList();
        //list.print();
        //list.detectLoop();
        //list.createLoop();
        //list.detectLoop();
        //list.swapInPairs();
        //list.print();
         int[] arr = {-7, 2, 5, 2, -4, 3, 1};
         findEquilibriumIndex(arr);
       // list.addOneToLinkedListNumber();
        list.reverseLinkedList();
        list.print();
    }

    public static void print(String msg) {
        System.out.println(msg);
    }
}