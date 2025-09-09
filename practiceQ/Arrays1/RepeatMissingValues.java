package practiceQ.Arrays1;

import java.util.Arrays;

// 2965. Find Missing and Repeated Values
public class RepeatMissingValues {

    public static int[] solution(int arr[][]) {
        int n = arr.length;
        int size = n * n;
        int frq[] = new int[size + 1];
        int result[] = new int[2];

        // Count frequency of each number
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                frq[arr[i][j]]++;
            }
        }

        // Find repeated and missing numbers
        for (int i = 1; i <= size; i++) { // from 1 to size
            if (frq[i] == 2) {
                result[0] = i; // repeated
            }
            if (frq[i] == 0) {
                result[1] = i; // missing
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[][] = {{9,1,7}, {8,9,2},{3,4,6}};
        int[] result = solution(arr);
        System.out.println(Arrays.toString(result)); // prints [2, 4]
    }
}
