public class PaintersPartition {

    public static boolean isValid(int arr[], int p, int maxtime) {
        int painter = 1;
        int time = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[0] > maxtime) {
                return false;
            }
            if (time + arr[i] <= maxtime) {
                time += arr[i];
            } else {
                painter++;              //O(logSum * n)
                time = arr[i];
            }
        }
        return (painter <= p);
    }

    public static int painters(int arr[], int p) {
        int min = arr[0];
        int max = 0;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            min = Math.max(min, arr[i]);
            max += arr[i];
        }

        while (min <= max) {
            int mid = min + (max - min) / 2;
            if (isValid(arr, p, mid)) {
                ans = mid;
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 40, 30, 10, 20 };
        int p = 2;
        int result = painters(arr, p);
        System.out.println(result);
    }

}
