package saikia.priyam.lib;

public class LinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        public Node(int num) {
            this.data = num;
            this.next = null;
        }
    }

    public void insertLast(int num) {
        Algo.print("Inserting " + num);
        Node node = new Node(num);
        if (this.head == null) {
            head = node;
        } else {
            Node currentNode = this.head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = node;
        }
    }

    public void print() {
        Node currentNode = this.head;
        int i = 1;
        while (currentNode != null) {
            Algo.print("#" + i + " " + currentNode.data + "");
            currentNode = currentNode.next;
            i++;
        }
    }

    public void insertFirst(int num) {
        Node node = new Node(num);
        if (this.head == null) {
            this.head = node;
            return;
        }

        node.next = head;
        head = node;
    }

    public void deleteMidElement() {
        if (this.head == null) {
            return;
        }
        Node currentNode = this.head;
        Node midNode = this.head;
        Node prevNode = this.head;
        while (currentNode.next != null) {
            prevNode = midNode;
            currentNode = currentNode.next;
            midNode = midNode.next;
            if (currentNode.next != null) {
                currentNode = currentNode.next;
            }
        }
        Algo.print("Mid element " + midNode.data);
        prevNode.next = midNode.next;
    }

    public void createLoop() {
        Node current = this.head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = this.head;
    }

    public boolean detectLoop() {
        Node slow = this.head;
        Node fast = this.head;
        while (fast.next != null) {
            fast = fast.next;
            if (fast == slow) {
                Algo.print("There is a loop here");
                return true;
            }
            slow = slow.next;
            if (fast.next != null) {
                fast = fast.next;
            }
        }
        Algo.print("There is no loop here");
        return false;
    }

    public void removeDuplicatesFromSortedLinkedList() {
        //the linked list must be sorted
        if (this.head == null) {
            return;
        }
        Node prev = this.head;
        Node current = this.head;

        int temp;
        while (current.next != null) {
            prev = current;
            current = current.next;
            if (prev.data == current.data) {
                Algo.print("found duplicates " + prev.data + " and " + current.data);
                //remove current
                prev.next = current.next;
                if (current.next != null) {
                    current = current.next;
                }
            }
        }
    }

    public void swapInPairs() {//123456 becomes 214365
        if (this.head == null) {
            return;
        }
        Node current = this.head;
        Node prev = this.head;
        int temp;
        while (current.next != null) {
            prev = current;
            current = current.next;
            Algo.print("swapping " + prev.data + " and " + current.data);
            temp = prev.data;
            prev.data = current.data;
            current.data = temp;
            if (current.next != null) {
                current = current.next;
            }
        }
    }

    public void addOneToLinkedListNumber() {//1991 + 1 => 2-0-0-0 as a linkedList
        if (this.head == null) {
            return;
        }
        Node current = this.head;
        String numberString = "";
        while (current != null) {
            numberString += current.data;
            current = current.next;
        }
        Algo.print("The number string is = " + numberString);
        int number = Integer.parseInt(numberString);
        number += 1;
        Algo.print("Sum = " + number);
        char[] chars = (number + "").toCharArray();
        current = this.head;
        Node prev = this.head;
        for (int i = 0; i < chars.length; i++) {
            current.data = Integer.parseInt(chars[i] + "");
            prev = current;
            current = current.next;
        }
        prev.next = null;
        print();
    }

    public void reverseLinkedList() {//123456
        if (this.head == null) {
            return;
        }
        Node currentNode = this.head;
        Node prev = null;
        Node next = null;
        while (next != null) {
            next = currentNode.next;
            currentNode.next = prev;
            prev = currentNode;
            currentNode = next;
        }
        this.head = prev;
    }
}
