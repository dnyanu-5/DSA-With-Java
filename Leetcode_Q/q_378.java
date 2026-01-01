import java.util.*;

public class q_378 {

    public static int kSmallestElemet(int nums[][], int k) {
        PriorityQueue<Integer> p = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (p.size() < k) {
                    p.add(nums[i][j]);
                } else if (nums[i][j] < p.peek()) {
                    p.remove();
                    p.add(nums[i][j]);
                }
            }

        }
        return p.peek();
    }
    public static void main(String[] args) {
        int nums[][] = { { 1, 5, 9 }, { 10, 11, 13 }, { 12, 13, 15 } };
        int k = 8;
        int res = kSmallestElemet(nums, k);
        System.out.println("K largets elemet is:" + res);

    }

}
