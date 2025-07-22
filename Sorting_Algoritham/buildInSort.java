package Sorting_Algoritham;
import java.util.Arrays;

public class buildInSort {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[]={2,5,1,3,4,6};
        // Arrays.sort(arr);
        // printArr(arr);
        Arrays.sort(arr,0,3);
        printArr(arr);
    }   
}
