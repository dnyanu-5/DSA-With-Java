package Heaps;
import java.util.PriorityQueue;

public class ConnectRopes {
    public static void main(String[] args) {
        int ropes[] = { 2, 3, 3, 4,6};

        PriorityQueue<Integer> p = new PriorityQueue<>();
        for (int i = 0; i < ropes.length; i++) {
            p.add(ropes[i]); // 2,3,4,6
        }

        int cost=0;
        while(p.size()>1){
            int min=p.remove();
            int min2=p.remove();
            cost+=min+min2;
            p.add(min+min2);
        }
        System.out.println("Minimum cost is:"+cost);
    }

}
