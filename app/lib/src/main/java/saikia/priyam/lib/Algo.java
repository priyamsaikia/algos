package saikia.priyam.lib;

public class Algo {
    public static void main(String args[]) {
        System.out.print("Hello World");
        LinkedList list = new LinkedList();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.insertFirst(0);
        list.deleteMidElement();
        list.print();
        list.detectLoop();
        //list.createLoop();
        list.detectLoop();
        //list.print();

    }

    public static void print(String msg) {
        System.out.println(msg);
    }
}