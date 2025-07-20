public class maxSubArraySum {

    public static void sumOfSubarray(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];

        // Construct prefix array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // Brute-force to find maximum subarray sum using prefix array
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currSum = (i == 0) ? prefix[j] : prefix[j] - prefix[i - 1];
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("The max sum is: " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        sumOfSubarray(arr);
    }
}
