package ArrayList;

import java.util.*;

public class MonotoneAl {

    public static boolean solution(ArrayList<Integer> nums) {
        return inc(nums) || dec(nums);
    }

    public static boolean inc(ArrayList<Integer> nums) {
        int n = nums.size();
        for (int i = 0; i < n - 1; i++) {
            if (nums.get(i) > nums.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean dec(ArrayList<Integer> nums) {
        int n = nums.size();
        for (int i = 0; i < n - 1; i++) {
            if (nums.get(i) < nums.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
   // O(n)
    public static boolean isMonotonic(ArrayList<Integer> nums) {
        int n = nums.size();
        boolean isInc = true;
        boolean isDec = true;

        for (int i = 0; i < n - 1; i++) {

            if (nums.get(i) > nums.get(i + 1)) {
                isInc = false;
            }
            if (nums.get(i) < nums.get(i + 1)) {
                isDec = false;
            }
        }
        return isInc || isDec;

    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(4);
        nums.add(4);
        // System.out.println(solution(nums));
        System.out.println(isMonotonic(nums));   
    }
}
