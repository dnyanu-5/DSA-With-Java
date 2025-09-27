package Divide_Conquer;

public class Sorted_RotatedArray {
    public static int solution(int arr[], int si, int ei, int target) {

        if(si>ei){
            return -1;
        }
        int mid = si + ((ei - si) / 2);
        if (target == arr[mid]) {
            return mid;
        }
        // mid lies on L1

        if (arr[si] <= arr[mid]) {
            if (arr[si] <= target && target <= arr[mid]) {
                return solution(arr, si, mid - 1, target);
            } else {
                return solution(arr, mid + 1, ei, target);
            }
        }
        //mid lies on L2
        else{
            if (arr[mid] <= target && target <= arr[ei]) {
                return solution(arr, mid+1, ei, target);
            } else {
                return solution(arr,si + 1, mid-1, target);
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = { 4,5,6,7,0,1,2};
        int target = 0;
        int result = solution(arr, 0, arr.length - 1, target);
        System.out.println(result);

    }

}
