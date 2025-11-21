
public class PallindromLL {

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

    public void addFirst(int data) {
        // create newnode
        Node newnode = new Node(data);
        // if ll is empty then head == tail == newnode
        if (head == null) {
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

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

    // step 1
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Boolean checkPallindrom() {
        // base case
        if (head == null || head.next == null) {
            return true;
        }
        // find mid
        Node midNode = findMid(head);
        // reverse 2nd Half
        Node curr = midNode;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; // right half head
        Node left = head;

        // check ll
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
        public static void main(String[] args) {

        PallindromLL pl = new PallindromLL();
        pl.addFirst(1);
        pl.addFirst(2);
        pl.addFirst(3);
        pl.addFirst(4);
        pl.printLL();
        System.out.println(pl.checkPallindrom());

    }
}