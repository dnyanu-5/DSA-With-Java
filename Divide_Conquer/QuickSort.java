package Divide_Conquer;
public class QuickSort {

    public static void solution(int arr[], int si, int ei) {

        if (si >= ei) {
            return;
        }
        int pIndex = partition(arr, si, ei);
        solution(arr, si, pIndex - 1);
        solution(arr, pIndex + 1, ei);
    }

    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i= si-1;
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;

        return i;
            
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 6, 9, 2, 1, 3, 5 };
        solution(arr, 0, arr.length-1);
        printArr(arr);
    }

}