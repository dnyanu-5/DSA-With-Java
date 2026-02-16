package Heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class HalveArraySum {
    public static void main(String[] args) {
        int nums[] = { 1, 5, 19, 8 };
        int sum = 0;
        PriorityQueue<Integer> p = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            p.add(nums[i]);
        }
        int target = sum / 2;
        int count=0;

        while (sum > target) {
            count++;
            int highest=p.poll();
            highest=highest/2;
            sum-=highest;

            p.add(highest);

        }
        System.out.println("Minimum operation to Halve an array sum is:"+count);
    }

}
