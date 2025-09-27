package Divide_Conquer;

public class MergeSort {

    public static void solution(int arr[], int start, int end) {
        // base case
        if (start >= end) {
            return;
        }
        // work
        int mid = start + ((end - start) / 2);
        solution(arr, start, mid);
        solution(arr, mid + 1, end);
        merge(arr, start, mid, end);

    }

    public static void merge(int arr[], int start, int mid, int end) {

        int tempArr[] = new int[(end - start) + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                tempArr[k] = arr[i];
                i++;
            } else {
                tempArr[k] = arr[j];
                j++;
            }
            k++;
        }

        // remaining element
        while (i<=mid){
            tempArr[k++]=arr[i++];  
        }
        while (j<=end){
            tempArr[k++]=arr[j++];  
        }
        //copy to original array 
        for(k=0,i=start;k<tempArr.length;k++,i++){
            arr[i]=tempArr[k];
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 3, 1, 8 ,0};
        printArr(arr);
        solution(arr, 0, arr.length - 1);
        printArr(arr);
    }

}
