package practiceQ.Arrays1;

import java.util.Arrays;
//88. Merge Sorted Array   --Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
// Output: [1,2,2,3,5,6]
public class MegreSortedArr {

    public static void solution(int[] num1, int[] num2, int m, int n) {

        // n1=1,2,3 n2= 2,5,6

        int i = m - 1; // 2 index
        int j = n - 1; // 2 index
        int k = m + n - 1; // 5 index

        while (j >= 0) {

            if (i >= 0 && num1[i] > num2[j]) {
                num1[k] = num1[i];
                i--;
            } else {
                num1[k] = num2[j];
                j--;

            }
            k--;
        }
    }
    public static void main(String[] args) {
    int m = 3, n = 3;
    int[] num1 = new int[m + n];
    num1[0] = 1;
    num1[1] = 2;
    num1[2] = 3;
    int[] num2 = {2, 5, 6};

    solution(num1, num2, m, n);
    System.out.println(Arrays.toString(num1));
}

}
