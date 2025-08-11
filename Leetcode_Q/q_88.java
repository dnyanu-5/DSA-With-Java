public class q_88 {

    public static void mergeSortedArray(int arr[], int arr2[], int m, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && arr[i] > arr2[j]) {
                arr[k] = arr[i];
                i--;
            } else {
                arr[k] = arr2[j];
                j--;
            }
            k--;
        }
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 0, 0, 0 };
        int arr2[] = { 2, 5, 6 };
        int m = 3;
        int n = 3;

        mergeSortedArray(arr, arr2, m, n);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

}