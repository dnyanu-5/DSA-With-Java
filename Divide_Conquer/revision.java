package Divide_Conquer;

public class revision {

    public static int solution(int arr[], int s, int e, int target) {

        if (s > e) {
            return -1;
        }
        int mid = s + ((e - s) / 2);
        if (target == arr[mid]) {
            return mid;
        }
        if (arr[s] <= arr[mid]) {
            if (arr[s] <= target && target <= arr[mid]) {
                return solution(arr, s, mid - 1, target);
            } else {
                return solution(arr, mid + 1, e, target);
            }
        } else {
            if (arr[mid] <= target && target <= arr[e]) {
                return solution(arr, mid + 1, e, target);
            } else {
                return solution(arr, s + 1, mid - 1, target);
            }

        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2, 3 };
        int target = 7;
        int result = solution(arr, 0, arr.length - 1, target);
        System.out.println(result);
    }
}
