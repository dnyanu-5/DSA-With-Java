package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public static List<List<Integer>> combinationSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        backtrack(nums, target, 0, curr, result);
        return result;
    }

    public static void backtrack(int[] nums, int target, int start, List<Integer> curr, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(curr));
            return;
        }
        for (int i = start; i < nums.length; i++) {
            if (nums[i] > target) {
                break;
            }
            curr.add(nums[i]);
            backtrack(nums, target - nums[i], i, curr, result);
            curr.remove(curr.size() - 1);
        }
    }
    public static void main(String[] args) {
        int nums[] = { 2, 3, 5 };
        int target = 8;
        System.out.println(combinationSum(nums, target));
    }
}
