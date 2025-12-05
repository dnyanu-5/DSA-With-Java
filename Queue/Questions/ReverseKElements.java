package Queue.Questions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseKElements {
    public static void ReverseFirstKElements(Queue<Integer> q, int size) {
        if (q.isEmpty() || size > q.size()) {
            return;
        }
        if (size <= 0) {
            return;
        }

        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < size; i++) {
            s.push(q.peek());
            q.remove();
        }
        while (!s.isEmpty()) {
            q.add(s.peek());
            s.pop();
        }

        for(int i=0;i<q.size()-size;i++){
            q.add(q.peek());
            q.remove();
        }  
    }

    public static void ReverseElementsUsingRecursion(Queue<Integer> q ,int k){
        helper(q, k);
        int size=q.size()-k;
        while(size-->0){
            q.add(q.poll());
        }

    }
    public static void helper(Queue<Integer> q ,int k){
        if(k==0){
            return;
        }
        int el=q.poll();
        helper(q, k-1);
        q.add(el);
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 10; i <= 100; i += 10) {
            q.add(i);
        }
        int k = 5;
        //approch 1
        ReverseFirstKElements(q, k);
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
        System.out.println("\nusing recursion");
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        int k1=3;
        ReverseElementsUsingRecursion(q1,k1);
        while(!q1.isEmpty()){
            System.out.print(q1.peek()+" ");
            q1.remove();
        }
    }

}
