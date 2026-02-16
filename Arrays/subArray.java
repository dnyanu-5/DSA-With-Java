// how many pairs in the array
public class subArray{
    public static void pairsInArray(int arr[]) {
        int totalPair = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
                totalPair++;
            }
            System.out.println();
        }
        System.out.println("Total pairs in an array is:" + totalPair);
    }
    // pairs in array FORMULA = n(n-1)/2

     //subarray in array FORMULA = n(n+1)/2
     public static void subArrays(int arr[]) {
        int totalArr = 0;
        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int totalSum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    totalSum += arr[k];
                }
                totalArr++;
                System.out.println("=> Sum: " + totalSum);

                if (totalSum < minSum) minSum = totalSum;
                if (totalSum > maxSum) maxSum = totalSum;
            }
            System.out.println(); // spacing between starting index i
        }

        System.out.println("Minimum subarray sum: " + minSum);
        System.out.println("Maximum subarray sum: " + maxSum);
        System.out.println("Total subarrays: " + totalArr);
    }

    // subarray sum equals to k 
//  
//     public int subarraySum(int[] nums, int k) {
//         int count=0;
//         for(int i=0;i<nums.length;i++){
//             int sum=0;
//             for(int j=i;j<nums.length;j++){
//                 sum+=nums[j];
//                 if(sum==k){
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
    public static void main(String[] args) {
        int arr[] = { 1,-2,6,-1,3};
        pairsInArray(arr);
        subArrays(arr);
    }
}
