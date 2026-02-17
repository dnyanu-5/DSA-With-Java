public class SingleElement {

    public static int singleElementInArr(int arr[]) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;

        // case1;
        if (n == 1) {
            return arr[0];
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // case 2
            if (mid == 0 && arr[0] != arr[1]) {
                return arr[mid];
            }
            // case 3
            if (mid == n - 1 && arr[n - 1] != arr[n - 2]) {
                return arr[mid];
            }
            //mid is answer
            if (arr[mid - 1] != arr[mid] && arr[mid] != arr[mid + 1]) {
                return arr[mid];
            }
            if (mid % 2 == 0) { // even
                if (arr[mid - 1] == arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else { // odd
                if (arr[mid - 1] == arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = { 3,3,7,7,10,11,11};
        System.out.println(singleElementInArr(arr));
    }
}
