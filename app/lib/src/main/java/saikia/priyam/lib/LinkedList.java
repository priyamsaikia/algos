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
}
