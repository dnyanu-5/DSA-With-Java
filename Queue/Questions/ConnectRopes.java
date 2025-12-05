package Queue.Questions;
import java.util.PriorityQueue;

public class ConnectRopes {
    public static int minimumCost(int arr[] ,int size){
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int i=0;i<size;i++){
            pq.add(arr[i]);
        }
        int cost=0;
        while(pq.size()>1){
            int firstR=pq.poll();
            int secoundR=pq.poll();
            int sum=firstR+secoundR;
            cost+=sum;
            pq.add(sum);
        }
        return cost;  
    }
    public static void main(String[] args) {
        int arr[]={2,5,4,8,6,9};
        int size=arr.length;
        System.out.println("Total minimum cost is:"+ minimumCost(arr, size));
    }
}
