import java.util.*;

public class threeAndFourSum {

    // brute force approach
    public static List<List<Integer>> threeSum1(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        Arrays.sort(nums);

        for (int i = 0; i < n - 2; i++) {

            for (int j = i + 1; j < n - 1; j++) {

                for (int k = j + 1; k < n; k++) {

                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);

                        if (!result.contains(triplet)) {
                            result.add(triplet);
                        }
                    }
                }
            }
        }
        return result;
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {

            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            for (int j = i + 1; j < n;) {
                int p = j + 1;
                int q = n - 1;

                while (p < q) {
                    sum = nums[i] + nums[j] + nums[p] + nums[q];

                    if (sum < target) {
                        p++;
                    } else if (sum > target) {
                        q--;
                    } else {
                        result.add(Arrays.asList(nums[i], nums[j], nums[p], nums[q]));
                        p++;
                        q--;

                        while (p < q && nums[p] == nums[p - 1]) {
                            p++;
                        }

                    }
                }
                j++;
                while (j < n && nums[j] == nums[j - 1]) {
                    j++;

                }
            }
        }

        return result;
    }

    public static List<List<Integer>> solution(int nums[]) {
        List<List<Integer>> result = new ArrayList<>();

        // array sort
        Arrays.sort(nums);
        int sum = 0;
        // loop
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            // optimization if i value is repeated
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            // while loop
            while (j < k) {
                sum = nums[i] + nums[j] + nums[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    // optimization if j and k has same repeated values multiple time

                    while (j < k && nums[j] == nums[j + 1]) {
                        j++;
                    }
                    while (j < k && nums[k] == nums[k - 1]) {
                        k--;
                    }
                    j++;
                    k--;
                }

            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Three sum");
        int[] nums = { 1,0,-1,0,-2,2 };
        int target=0;

        // List<List<Integer>> result = threeSum1(nums);
        // System.out.println(result);

        // List<List<Integer>> result1 = solution(nums);
        // System.out.println(result1);

        List<List<Integer>> result2 = fourSum(nums,target);
        System.out.println(result2);

    }
}
