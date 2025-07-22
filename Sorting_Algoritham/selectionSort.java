package Sorting_Algoritham;

public class selectionSort {
    public static void selection(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minVal = i; 
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minVal]) {
                    minVal = j;
                }
            }
            // Swap
            int temp = arr[minVal];
            arr[minVal] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 5, 1, 4 };
        selection(arr);
        printArr(arr);  // Output: 1 2 3 4 5
    }
}
