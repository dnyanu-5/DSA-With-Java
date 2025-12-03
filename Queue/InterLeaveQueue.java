package Queue;
import java.util.*;

public class InterLeaveQueue {
    public static void interLeave( Queue<Integer> q){
        int size = q.size();
        Queue<Integer> firstQ= new LinkedList<>();

        for(int i=0;i<size/2;i++){
            firstQ.add(q.remove());
        }
        while(!firstQ.isEmpty()){
            q.add(firstQ.remove());
            q.add(q.remove());
        }
    }
    public static void main(String[] args) {
        System.out.println("InterLeave of two queue");
        Queue<Integer> q= new LinkedList<>();
        for(int i=1;i<=10;i++){
            q.add(i);
        }
        System.out.println(q);
        interLeave(q);
        while (!q.isEmpty()){
            System.out.print(q.remove()+" ");
        } 
    }
    
}
