package Queue;

// o(1) for all operations
public class CircularQueue {
    public static class Queue {
        static int arr[];
        static int rear;
        static int front;
        static int size;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        public void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            // first element
            if (front == -1) {
                front = 0;
            }
            rear=(rear+1)%size;
            arr[rear] = data;
        }

        public int remove() {
            int result = arr[front];
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        public int peek() {
            return arr[front];
        }
    }
    public static void main(String[] args) {
        System.out.println("Circular Queue");
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }

}
