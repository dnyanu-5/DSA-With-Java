import java.util.HashMap;

public abstract class q_560 {

    public static int subarraySum(int nums[], int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[i];
                if (sum == k)
                    count++;
            }
        }
        return count;
    }

    public static int solution2(int nums[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int count = 0;
        map.put(0, 1);
        // nums = [3] ;k = 3 ; sum = 3, then sum - k = 0
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
    public static void main(String[] args) {

        int arr[] = { 1, 1, 1 };
        int k = 2;
        System.out.println(subarraySum(arr, k));
        System.out.println(solution2(arr, k));
    }
}
