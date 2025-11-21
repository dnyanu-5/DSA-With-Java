public class Search {

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

    public void printLL() {
        if (head == null) {
            System.err.println("LL is empty");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // iteratively serach for key
    public int searchIterative(int key) {
        int idx = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return idx;
            }
            temp = temp.next;
            idx++;
        }
        return -1;
    }

    // search using recursion
    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int searchRecursive(int key) {
        return helper(head, key);
    }

    //Reverse a LL 
    public void reverseLL() {
        Node curr = tail= head;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // Remove N th node from End 
    //****** n th node from === size-n+1 node from start ********
    public void removeNthNodeFromEnd(int n){
        // calculate size 
        int size =0;
        Node temp=head;
        while(temp != null){
            temp=temp.next;
            size++;
        }
        // if we want to remove head 
        if(size == 0){
            head= head.next;
            return;
        }
        // remove nth node , reached n-1 node 
        int i=1;
        Node prev = head;
        while(i< size-n){
            prev=prev.next;
            i++;
        }
        prev.next= prev.next.next;
        return;
    }

    public static void main(String[] args) {

        Search sl = new Search();

        sl.addFirst(1);
        sl.addLast(2);
        sl.addLast(3);
        sl.addLast(4);
        sl.addLast(5);
        sl.printLL();

        // System.out.println(sl.searchIterative(5));
        // System.out.println(sl.searchIterative(15));

        // System.out.println(sl.searchRecursive(5));
        // System.out.println(sl.searchRecursive(15));

        sl.reverseLL();
        sl.printLL();

        sl.removeNthNodeFromEnd(3);
        sl.printLL();

    }

}
