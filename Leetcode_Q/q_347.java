import java.util.*;

public class q_347 {
    public static int[] TopKElement(int nums[], int k) {
        Arrays.sort(nums);

        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[1] - b[1]);

        int i = 0;
        while (i < nums.length) {
            int current = nums[i];
            int count = 0;

            while (i < nums.length && nums[i] == current) {
                count++;
                i++;
            }

            heap.add(new int[] { current, count });
            if (heap.size() > k)
                heap.poll();
        }

        int[] result = new int[k];
        for (int j = k - 1; j >= 0; j--) {
            result[j] = heap.poll()[0];
        }

        return result;
    }
    public static void main(String[] args) {

        int[] nums = {1,2,1,2,1,2,3,1,3,2 };
        int k = 2;

        int[] result = TopKElement(nums, k);

        System.out.println(Arrays.toString(result));
    }

}
