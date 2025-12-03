package Queue;
import java.util.*;

public class ReverseQueue {
    public static void Reverse(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }
    public static void main(String[] args) {
        System.out.println("Reverse Queue");
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<=7;i++){
            q.add(i);
        }
        Reverse(q);
        while (!q.isEmpty()) {
            System.out.print(q.remove()+" ");   
        }
    }
}
