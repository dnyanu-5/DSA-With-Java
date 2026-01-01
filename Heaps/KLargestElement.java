package Heaps;
import java.util.PriorityQueue;

public class KLargestElement {

    //  same for smallest but with max heap and condition is revrse <

    public static int findKLargestElement(int nums[], int k) {
        PriorityQueue<Integer> p = new PriorityQueue<>(k);
        for (int i = 0; i < nums.length; i++) {
            if (p.size() < k) {
                p.add(nums[i]);
            } else if (nums[i] > p.peek()) {
                p.remove();
                p.add(nums[i]);
            }
        }
        return p.peek();
    }

    public static void main(String[] args) {
        int nums[] = { 3, 2, 3, 1, 2, 4, 5, 5, 6 };
        int k = 4;
        PriorityQueue<Integer> p = new PriorityQueue<>(k);

        for (int i = 0; i < nums.length; i++) {
            p.add(nums[i]);
            if (p.size() > k) {
                p.remove();
            }
        }
        System.out.println(p.peek());

         int res=findKLargestElement(nums, k);
         System.out.println("K largets elemet is:"+res);
    
    }

}
