
public class PeakIndex {

    public static int peakIndexInArray(int arr[]) { // o(n)
        int max = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }

        return index;
    }

    public static int peakIndexInArrayBinary(int arr[]) { // o(logn)
        int n = arr.length;
        int st = 1;
        int end = n - 2;

        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid - 1] < arr[mid]) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 2, 1, 0 };
        System.out.println(peakIndexInArray(arr));
        System.out.println(peakIndexInArrayBinary(arr));
    }

}
