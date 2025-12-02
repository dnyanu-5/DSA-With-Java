package Queue;

public class QueueLL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static class Queue {
        static Node head;
        static Node tail;

        public boolean isEmpty() {
            return head == null && tail == null;
        }

        public void add(int data) {
            Node nn = new Node(data);
            if (head == null) {
                head = tail = nn;
                return;
            }
            tail.next = nn;
            tail = nn;
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int el = head.data;

            if (tail == head) {
                head = tail = null;
            } else {
                head = head.next;
            }
            return el;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }
    }
        public static void main(String[] args) {
        System.out.println("Queue using LL");
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
