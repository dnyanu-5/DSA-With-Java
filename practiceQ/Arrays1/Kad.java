package practiceQ.Arrays1;

public class Kad {

    public static void solution(int arr[]) {

        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int maxElement = Integer.MIN_VALUE;
        boolean isNegative = true;

        for (int i = 0; i < arr.length; i++) {
            
            //  for negative arr
            if (arr[i] >= 0) {
                isNegative = false;
            }
            maxElement = Math.max(maxElement, arr[i]);

            //  for positive _ negative arr
            curSum += arr[i];
            if (curSum < 0) {
                curSum = 0;
            }
            maxSum = Math.max(maxSum, curSum);
        }

        if(isNegative){
            System.out.println("maximim sum of subarray is:" + maxElement);
        }else{
            System.out.println("maximim sum of subarray is:" + maxSum);
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1,2,5,4 };
        solution(arr);

    }
}
