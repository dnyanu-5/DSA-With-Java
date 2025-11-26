package Stack;
public class StackLL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    static class Stack {

        public static boolean isEmpty() {
            if (head == null) {
                return true;
            }
            return false;
        }

        public static void push(int data) {
            Node nn = new Node(data);
            if (isEmpty()) {
                head = nn;
                return;
            }
            nn.next = head;
            head = nn;
        }

        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        public static int peek(){
             if (isEmpty()) {
                return -1;
            }
            return head.data;
        }

    }
    public static void main(String[] args) {
        // Stack sl= new Stack();
        Stack.push(5);
        Stack.push(6);
        Stack.push(7);

        while (!Stack.isEmpty()) {
            System.out.println(Stack.peek());
            Stack.pop();
        }
        

    }

}
