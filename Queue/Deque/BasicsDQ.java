package Queue.Deque;
import java.util.*;

public class BasicsDQ {
    public static void main(String[] args) {
        Deque<Integer> dq= new LinkedList<>();
        dq.addFirst(1);
        dq.addLast(2);
        dq.addLast(3);
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);
        dq.removeFirst();
        System.out.println(dq);
        dq.addLast(4);
        dq.addLast(5);
        System.out.println("first el="+dq.getFirst()+"\t last el="+dq.getLast());

    }
    
}
