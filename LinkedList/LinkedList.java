package LinkedList;

public class LinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // add first
    public void addFirst(int data) {
        // create newnode
        Node newnode = new Node(data);
        size++;
        // if ll is empty then head == tail == newnode
        if (head == null) {
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    // add last
    public void addLast(int data) {
        // create newnode
        Node newnode = new Node(data);
        size++;
        // if ll is empty then head == tail == newnode
        if (head == null) {
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }

    // add in the middle
    public void addInMiddle(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node prevNode = head;
        int i = 0;
        while (i < idx - 1) {
            prevNode = prevNode.next;
            i++;
        }
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    // print ll
    public void printLL() {
        if (head == null) {
            System.err.println("LL is empty");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // remove first node
    public void removeFirst() {
        int val = head.data;
        // if ll is empty
        if (size == 0) {
            System.out.println("LL is empty");
        } else if (size == 1) { // only one node
            head = tail = null;
            size = 0;
            System.out.println("removed " + val);
            return;
        }
        head = head.next;
        size--;
        System.out.println("removed " + val);
    }

    // remove last
    public void removeLast() {
        // if ll is empty
        if (size == 0) {
            System.out.println("LL is empty");
        } else if (size == 1) { // only one node
            int val = head.data;
            head = tail = null;
            size = 0;
            System.out.println("removed " + val);
            return;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        System.out.println("removed " + val);
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addInMiddle(4, 7);
        ll.printLL();

        System.out.println("Size of LL:" + size);

        ll.removeFirst();
        ll.printLL();
        ll.removeLast();
        ll.printLL();

        System.out.println("Size of LL:" + size);
    }

}
