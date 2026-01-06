import java.util.*;
class q_46 {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(0, nums, res);
        return res;
    }
    static void backtrack(int idx, int[] nums, List<List<Integer>> res) {
        if (idx == nums.length) {
            List<Integer> temp = new ArrayList<>();
            for (int n : nums)
                temp.add(n);
            res.add(temp);
            return;
        }

        for (int i = idx; i < nums.length; i++) {
            swap(nums, idx, i);
            backtrack(idx + 1, nums, res);
            swap(nums, idx, i); // backtrack
        }
    }
    static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        List<List<Integer>> l1 = permute(arr);
        System.out.println(l1);
    }
}
