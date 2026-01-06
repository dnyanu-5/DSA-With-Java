public class q_31 {

    public static void nextPermutation(int arr[]) {
        int n = arr.length;
        int pivot = -1;

        // 1. find pivot
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                pivot = i;
                break;
            }
        }

        // 2. if no pivot → reverse whole array
        if (pivot == -1) {
            reverse(arr, 0, n - 1);
            return;
        }

        // 3. swap with just larger element
        for (int i = n - 1; i > pivot; i--) {
            if (arr[i] > arr[pivot]) {
                swap(arr, i, pivot);
                break;
            }
        }
        // 4. reverse suffix
        reverse(arr, pivot + 1, n - 1);
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int arr[], int l, int r) {
        while (l < r) {
            swap(arr, l++, r--);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,4};
        nextPermutation(arr);
        for (int x : arr) System.out.print(x + " ");
    }
}
