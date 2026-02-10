import java.util.*;

public class q_287 {

    public static int solution(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static int solution1(int arr[]) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            if (map.get(arr[i]) > 1) {
                return arr[i];
            }
        }
        return -1;
    }

    public static int solution2(int nums[]) {

        int slow = nums[0];
        int fast = nums[0];

        while (slow == fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }

        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
    public static void main(String[] args) {

        int arr[] = { 1, 3, 4, 2, 2 };
        System.out.println(solution(arr));
        System.out.println(solution1(arr));
        System.out.println(solution2(arr));
    }
}
