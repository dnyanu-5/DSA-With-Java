package Stack;
import java.util.ArrayList;

public class StackAL {
    static class Stack {
        ArrayList<Integer> list = new ArrayList<>();

        public boolean isEmpty() {
            return list.size() == 0;
        }
        public void push(int data) {
            list.add(data);
        }
        public int pop() {
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }
        public int peek() {
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }
        public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.push(1);
        s1.push(2);
        s1.push(3);

        while (!s1.isEmpty()) {
            System.out.println(s1.peek());
            s1.pop();
        }
    }
}
