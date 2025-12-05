package Queue.Questions;

import java.util.*;

// maximum of all subarrays of size k
public class SlidingWindow {
    public static void MaximumSubarray(int arr[], int n, int k) {
        Deque<Integer> dq = new LinkedList<>();

        // Process first window
        for (int i = 0; i < k; i++) {
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) {
                dq.removeLast();
            }
            dq.addLast(i);
        }
        // Print maximum of first window
        System.out.print(arr[dq.peek()] + " ");

        // Process rest of the array
        for(int i = k; i < n; i++){
            
            // Remove elements out of this window
            while (!dq.isEmpty() && dq.peek() <= i - k) {
                dq.removeFirst();
            }
            // Remove smaller elements
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) {
                dq.removeLast();
            }
            dq.addLast(i);
            // Print maximum of current window
            System.out.print(arr[dq.peek()] + " ");
        }
    }

    public static void printSlidingWindowMaximumBruteForce(int arr[], int N, int K) {

        for (int i = 0; i < N - K + 1; i++) {
            int currMax = arr[i];
            for (int j = 0; j < K; j++) {
                if (arr[i + j] > currMax)
                    currMax = arr[i + j];
            }
            System.out.print(currMax + " ");
        }
    }
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
        int n = 9; 
        int k = 3;

        MaximumSubarray(arr, n, k);
        System.out.println();
        printSlidingWindowMaximumBruteForce(arr, n, k);
    }
}
