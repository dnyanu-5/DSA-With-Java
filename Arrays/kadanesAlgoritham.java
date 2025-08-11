public class kadanesAlgoritham {
    public static void kadanesSum(int arr[]) {
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int maxElement = Integer.MIN_VALUE;
        boolean isNegative = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                isNegative = false;
            }
            maxElement = Math.max(maxElement, arr[i]);

            curSum = curSum + arr[i];
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
        int arr[] = { -2, 11, 4, -3 };
        kadanesSum(arr);

    }

}
